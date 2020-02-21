package tjava.time.temporal;

import java.time.LocalDateTime;
import java.time.temporal.JulianFields;
import java.util.Calendar;

@SuppressWarnings("all")
public class Tjulianfields {

	// java.time.temporal.JulianFields
	public static void main(String[] args) {

		// exception
//		LocalDateTime now = LocalDateTime.now();
//		System.out.println(now.get(JulianFields.JULIAN_DAY));
		
		
		/// exception --> getlong
//		Instant now = Instant.now();
//		System.out.println(now.get(JulianFields.JULIAN_DAY));
//		System.out.println(OffsetDateTime.now().get(JulianFields.JULIAN_DAY));
		
		
		LocalDateTime now = LocalDateTime.now();
		long nums = now.getLong(JulianFields.JULIAN_DAY);
		conv(nums);
		
		System.out.println(now.getLong(JulianFields.MODIFIED_JULIAN_DAY));
		
		System.out.println(now.getLong(JulianFields.RATA_DIE));
		

	}

	private static void conv(long nums) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTimeInMillis(nums);;
		System.out.println(calendar.toInstant());
	}

}
