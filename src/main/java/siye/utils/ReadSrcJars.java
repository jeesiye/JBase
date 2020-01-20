package siye.utils;

import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.sql.SQLTransactionRollbackException;
import java.util.jar.JarEntry;
import java.util.jar.JarInputStream;

public class ReadSrcJars {

	private final static String way = "/home/coder/svlution/jdk/jdk1.8.0_211/src.zip";

	public static void main(String[] args) throws ClassNotFoundException {

		boolean bool = judgeException(SQLTransactionRollbackException.class);
		print(bool);

		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();

		Path path = Paths.get(way);
		try (InputStream in = Files.newInputStream(path, StandardOpenOption.READ);
				JarInputStream jarInputStream = new JarInputStream(in);) {
			int index = 0;
			boolean flag = true;
			while (flag) {
				JarEntry jarEntry = jarInputStream.getNextJarEntry();
				if (jarEntry == null) {
					flag = false;
					continue;
				}
				if (jarEntry.toString().contains("java/sql")) {
					String clName = jarEntry.toString().replaceAll("/", ".").replace(".java", "");
					Class<?> cl = Class.forName(clName);
					print(judgeException(cl));
					print(cl);

//					if (!judgeException(cl)) {
//						print(clName);
//						index++;
//					}
				}
			}
			print(index);

		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

	private static boolean judgeException(Class<?> cl) {
		boolean flag = false;
		Class<?> superclass = cl.getSuperclass();
//		print(superclass);
		if (superclass != null && superclass.toString().equals(Exception.class.toString())) {
			print(cl);
			flag = true;
			return flag;
		}
		judgeException(superclass);
		return flag;
	}

	private static void print(Object obj) {
		System.out.println(obj);
	}

}
