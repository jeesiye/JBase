package basic.net;

import static java.lang.System.out;

import java.net.URL;
import java.net.URLConnection;

public class Turl {

    public static void main(String[] args) throws Exception {

	URL url = new URL("http://localhost:80/ttt?userid");
	out.println(url);

	URLConnection urlConnection = url.openConnection();
	out.println(urlConnection);

    }

}
