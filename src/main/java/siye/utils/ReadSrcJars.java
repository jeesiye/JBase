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
import java.util.regex.Pattern;

public class ReadSrcJars {
	private static boolean exception = false;

	private final static String way = System.getProperty("java.home").replace("jre", "src.zip");

//	public static void main(String[] args) throws ClassNotFoundException {
//		List<String> list = readPackClasses("java/sql");
//		list.forEach(var -> print(var));
//	}

//	public static void main(String[] args) {
//		List<String> list = run();
//		list.forEach(var -> {
//			if (var.contains("java/time")) {
//				String regex = "^java/time" + "/[a-zA-Z]*.java$";
//				if (Pattern.matches(regex, var))
//					System.out.println(var);
//			}
//		});
//	}
	
	public static void main(String[] args) {
		System.out.println(way);
	}

	private static List<String> run() {
		List<String> list = new ArrayList<>();
		Path path = Paths.get(way);
		System.out.println(path);
		try (JarInputStream in = new JarInputStream(Files.newInputStream(path, StandardOpenOption.READ))) {
			boolean flag = true;
			while (flag) {
				JarEntry jarEntry = in.getNextJarEntry();
				if (jarEntry == null) {
					System.out.println("read all of ending");
					break;
				}
				list.add(jarEntry.toString());
			}
			return list;
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return null;
	}

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
				if (Pattern.matches(prefixPack + "/[a-zA-Z]*.java$", jarEntry.toString())) {// gte none subdir
					String clName = jarEntry.toString().replaceAll("/", ".").replace(".java", "");
					if (!clName.contains("package-info")) {
						Class<?> cl = Class.forName(clName);
						judgeException(cl);
						if (!exception) {
							if (Modifier.isPublic(cl.getModifiers())) {// get public
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
