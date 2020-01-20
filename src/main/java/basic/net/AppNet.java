package basic.net;

import java.net.CookieHandler;
import java.net.HttpCookie;
import java.security.Principal;
import java.time.Clock;
import java.util.logging.Logger;

import org.junit.Assert;

@SuppressWarnings("all")
public class AppNet {

    private final static Logger log = Logger.getGlobal();

    public static void main(String[] args) {
	
	Clock clock = Clock.systemUTC();
	System.out.println(clock);

    }

}
