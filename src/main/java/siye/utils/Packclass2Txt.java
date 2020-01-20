package siye.utils;

import java.nio.file.Path;

public final class Packclass2Txt {

	public static void pack2txt(String prefixPackageName, Path prefixStoreSite) {
		ReadSrcJars.readPackClasses(prefixPackageName).forEach(cls -> {
			try {
				Class2Txt.toTxt(prefixStoreSite, Class.forName(cls));
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		});
	}

}
