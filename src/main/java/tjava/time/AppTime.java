package tjava.time;

import java.security.Principal;
import java.time.Clock;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.Year;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoField;
import java.time.temporal.IsoFields;
import java.time.temporal.TemporalField;
import java.util.Properties;

@SuppressWarnings("all")
public class AppTime {

	public static void main(String[] args) {
//    	
//    	TemporalField weekOfWeekBasedYear = IsoFields.WEEK_OF_WEEK_BASED_YEAR;
//    	System.out.println(weekOfWeekBasedYear);

//		Properties properties = System.getProperties();
//		properties.forEach((k, v) -> {
//			System.out.println(k + "     " + v);
//		});

//		System.out.println(System.getProperty("java.home").replace("jre", "src.zip"));

//		Clock utc = Clock.systemUTC();
//		System.out.println(utc);
//		System.out.println(utc.instant());

		// 中文字体测试

		System.out.println(Year.now());

	}

}
