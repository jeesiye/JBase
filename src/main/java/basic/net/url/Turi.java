package basic.net.url;

import java.net.URI;

import org.junit.Test;

public class Turi {

	public static void main(String[] args) {
		String uricontent = "mysql://root:123@localhost:3306/mysql";
		URI uri = URI.create(uricontent);
		printl(uri.getAuthority());
		printl(uri.getRawAuthority());

	}

	@Test
	public void $1() {

		String uricontent = "mysql://root:123@localhost:3306/mysql";
		URI uri = URI.create(uricontent);
		print(uri.getAuthority());
		print(uri.getRawAuthority());
	}

	public static void printl(Object obj) {
		System.out.println(obj);
	}

	private void print(Object obj) {
		System.out.println(obj);
	}

}
