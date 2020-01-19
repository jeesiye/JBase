package basic.net.url;

import java.net.FileNameMap;
import java.net.URI;
import java.net.URLConnection;

import org.junit.Assert;
import org.junit.Test;

public class Turi {

	public static void main(String[] args) {
		
		
		FileNameMap fileNameMap = URLConnection.getFileNameMap();
		Assert.assertNotNull(fileNameMap);
		printl(fileNameMap);
		printl(fileNameMap instanceof FileNameMap);
		printl(fileNameMap instanceof URLConnection);
		String mime = fileNameMap.getContentTypeFor("files.txt");
		printl(mime);
		
		
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
