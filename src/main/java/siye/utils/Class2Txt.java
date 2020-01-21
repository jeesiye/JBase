package siye.utils;

import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Parameter;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Set;
import java.util.TreeSet;

public final class Class2Txt {

	// public static void main(String[] args) {
	// Path path = Paths.get("test.txt");
	// boolean bool = toTxt(path, Object.class);
	// System.out.println(bool);
	//
	// }

	public static boolean toTxt(Path path, Class<?> cl) {
		Path newpath = path.resolve(fileName(cl));
		FileChannel fileChannel = null;
		try {
			Path abs = newpath.toAbsolutePath();
			fileChannel = FileChannel.open(abs, StandardOpenOption.WRITE, StandardOpenOption.CREATE);
			byte[] bytes = handlerCls(cl).toString().getBytes();
			ByteBuffer byteBuffer = ByteBuffer.allocate(bytes.length);
			byteBuffer.put(bytes);
			byteBuffer.clear();
			fileChannel.write(byteBuffer);
			System.out.println(newpath.toString());
			return true;

		} catch (Exception ex) {
			System.out.println(ex.toString() + "  path error");
		} finally {
			if (fileChannel != null) {
				try {
					fileChannel.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

		return false;
	}

	public static StringBuilder handlerCls(Class<?> cl) {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append(handlerCons(cl)).append("\n\n").append(handlerFields(cl)).append("\n\n")
				.append(handlerFunc(cl)).append("\n\n");

		return stringBuilder;
	}

	private static StringBuilder handlerCons(Class<?> cl) {

		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append(modifier(cl));
		stringBuilder.append(append45());

		Constructor<?>[] constructors = cl.getDeclaredConstructors();
		if (constructors.length == 0) {
			stringBuilder.append("\\\n");
			stringBuilder.append(append45());
			return stringBuilder;
		}
		for (Constructor<?> constructor : constructors) {
			stringBuilder.append(constructor.toString() + "\n");
		}

		stringBuilder.append(append45());
		return stringBuilder;
	}

	private static StringBuilder handlerFields(Class<?> cl) {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append(modifier(cl));
		stringBuilder.append(append45());
		Field[] fields = cl.getFields();
		if (fields.length == 0) {
			stringBuilder.append("\\\n");
			stringBuilder.append(append45());
			return stringBuilder;
		}
		for (Field field : fields) {
			if (field.getDeclaringClass().toString().equals(cl.toString())) {
				stringBuilder.append(append32(field.getName()));
			}
		}
		stringBuilder.append(append45());
		return stringBuilder;
	}

	private static StringBuilder handlerFunc(Class<?> cl) {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append(modifier(cl));
		stringBuilder.append(append45());
		Method[] methods = cl.getDeclaredMethods();
		if (methods.length == 0) {
			stringBuilder.append("\\\n");
			stringBuilder.append(append45());
			return stringBuilder;
		}

		// sort of functions's names
		Set<String> sets = new TreeSet<>();
		for (Method method : methods) {
			if (!method.isSynthetic() && Modifier.isPublic(method.getModifiers())) { // user's write code
				StringBuilder methodBuilder = new StringBuilder();// store method's full names;
				methodBuilder.append(method.getName());
				methodBuilder.append(" <");
				// handler param type
				Parameter[] parameters = method.getParameters();
				for (int index = 0; index < parameters.length; index++) {
					methodBuilder.append(parameters[index].getType().getSimpleName());
					if (index < parameters.length - 1) {
						methodBuilder.append(",");
					}
				}
				//
				methodBuilder.append("> : ");
				methodBuilder.append(method.getReturnType().getSimpleName());
				StringBuilder append32 = append32(methodBuilder.toString());
				sets.add(append32.toString());
//				stringBuilder.append(append32);
			}
		}
		sets.forEach(funcname -> stringBuilder.append(funcname));
		stringBuilder.append(append45());
		return stringBuilder;
	}

	private static String fileName(Class<?> cl) {
		int modifiers = cl.getModifiers();
		if (cl.isEnum()) {
//			return cl.getSimpleName() + "[E].txt";
			return "[E]" + cl.getSimpleName() + ".txt";
		}
		if (Modifier.isFinal(modifiers)) {
			return "[FL]" + cl.getSimpleName() + ".txt";
		}
		if (Modifier.isInterface(modifiers)) {
//			return cl.getSimpleName() + "[I].txt";
			return "[I]" + cl.getSimpleName() + ".txt";
		}
		if (Modifier.isAbstract(modifiers)) {
			return "[A]" + cl.getSimpleName() + ".txt";
//			return cl.getSimpleName() + "[A].txt";
		}
		return "[L]" + cl.getSimpleName() + ".txt";
//		return cl.getSimpleName() + "[L].txt";
	}

	private static StringBuilder modifier(Class<?> cl) {
		StringBuilder stringBuilder = new StringBuilder();
		int modifiers = cl.getModifiers();
		if (cl.isEnum()) {
			return stringBuilder.append("E:").append(cl.getName()).append("\n");
		}
		if (Modifier.isFinal(modifiers)) {
			return stringBuilder.append("FL:").append(cl.getName()).append("\n");
		}
		if (Modifier.isInterface(modifiers)) {
			return stringBuilder.append("I:").append(cl.getName()).append("\n");
		}
		if (Modifier.isAbstract(modifiers)) {
			return stringBuilder.append("A:").append(cl.getName()).append("\n");
		}
		return stringBuilder.append("L:").append(cl.getName()).append("\n");
	}

	private static StringBuilder append32(String content) {
		if (content.length() >= 68) {
			System.out.println("handler method's full name faild , cause length");
			return new StringBuilder(content).append("\n");
		}
		int num32 = 68 - content.length() - 1;
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append(content);
		int index = num32;
		while (index > 0) {
			stringBuilder.append((char) 32);
			index--;
		}
		stringBuilder.append("\\\n");
		return stringBuilder;
	}

	private static StringBuilder append45() {
		return append45(126);
	}

	private static StringBuilder append45(int size) {
		StringBuilder stringBuilder = new StringBuilder();
		int index = size;
		while (index > 0) {
			stringBuilder.append('-');
			index--;
		}
		stringBuilder.append("\n");
		return stringBuilder;
	}

}
