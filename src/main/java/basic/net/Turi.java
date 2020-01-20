package basic.net;

import java.net.URI;

public class Turi {

    public static void main(String[] args) throws Exception {
	String uricontent = "mysql://root:123@localhost:3306/mysql?usertable#userid";
	URI uri = URI.create(uricontent);

	print(uri.normalize());
	print(uri.parseServerAuthority());

	newline();
	print(uri.relativize(URI.create("usertable2"))); // lookup code
	print(uri.resolve("usertable3")); // lookup code

	newline();
	print(uri.isOpaque()); // false
	print(uri.isAbsolute()); // true

	newline();
	print(uri.toASCIIString()); // mysql://root:123@localhost:3306/mysql?usertable#userid
	print(uri.toString()); // mysql://root:123@localhost:3306/mysql?usertable#userid

	//
	//
	newline();
	print(uri.getScheme()); // mysql
	print(uri.getHost()); // localhost
	print(uri.getPort()); // 3306
	newline();

	print(uri.getSchemeSpecificPart()); // //root:123@localhost:3306/mysql
	print(uri.getRawSchemeSpecificPart()); // //root:123@localhost:3306/mysql
	print(uri.getUserInfo()); // root:123
	print(uri.getRawUserInfo());// root:123
	print(uri.getAuthority()); // root:123@localhost:3306
	print(uri.getRawAuthority()); // root:123@localhost:3306
	print(uri.getPath()); // mysql
	print(uri.getRawPath()); // mysql
	print(uri.getQuery()); // usertable
	print(uri.getRawQuery()); // usertable
	print(uri.getFragment()); // userid
	print(uri.getRawFragment()); // userid

    }

    public static void print(Object obj) {
	System.out.println(obj);
    }

    public static void newline() {
	System.out.println();
    }

}
