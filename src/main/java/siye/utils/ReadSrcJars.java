package siye.utils;

import java.io.InputStream;
import java.lang.reflect.Modifier;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.jar.JarEntry;
import java.util.jar.JarInputStream;

public class ReadSrcJars {
	private static boolean exception = false;

	private final static String way = "/media/coder/43859743-b167-4f2a-a4eb-0897b0ccb159/svlution/javaHome/jdk1.8.0_211/src.zip";

//	public static void main(String[] args) throws ClassNotFoundException {
//		List<String> list = readPackClasses("java/sql");
//		list.forEach(var -> print(var));
//	}

	public static List<String> readPackClasses(String prefixPack) {
		List<String> list = new ArrayList<>();
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
				if (jarEntry.toString().contains(prefixPack)) {
					String clName = jarEntry.toString().replaceAll("/", ".").replace(".java", "");
					if (!clName.contains("package-info")) {
						Class<?> cl = Class.forName(clName);
						judgeException(cl);
						if (!exception) {
							if (Modifier.isPublic(cl.getModifiers())) {
								list.add(clName);
								index++;
							}
						}
					}

				}
			}
			print("list#size:" + index);

		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return list;
	}

	private static void judgeException(Class<?> cl) {
		if (cl == null) {
			exception = false;
			return;
		}
		if (Modifier.isInterface(cl.getModifiers()) && cl.isEnum()) {
			exception = true;
			return;
		}
		if (cl.equals(Object.class)) {
			exception = false;
			return;
		}
		if (cl.isAssignableFrom(Exception.class)) {
			exception = true;
			return;
		}
		judgeException(cl.getSuperclass());
	}

	private static void print(Object obj) {
		System.out.println(obj);
	}

}
