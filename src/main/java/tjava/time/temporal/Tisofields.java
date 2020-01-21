package tjava.time.temporal;

import java.time.LocalDateTime;
import java.time.temporal.IsoFields;

@SuppressWarnings("all")
public class Tisofields {

	// java.time.temporal.IsoFields
	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();

//		TemporalField weekBasedYear = IsoFields.WEEK_BASED_YEAR;
//		int num = LocalDateTime.now().get(weekBasedYear);
//		System.out.println(num);

//		LocalDateTime plusMonths = LocalDateTime.now().plusMonths(1);
//		System.out.println(plusMonths);
//		
//		System.out.println(plusMonths.get(IsoFields.WEEK_OF_WEEK_BASED_YEAR));
//		System.out.println(plusMonths.get(IsoFields.WEEK_BASED_YEAR));;
//		System.out.println(plusMonths.plusWeeks(10).get(IsoFields.WEEK_BASED_YEAR));
//		

//		LocalDateTime plusYears = LocalDateTime.now().plusYears(40);
//		System.out.println(plusYears);
//		System.out.println(plusYears.get(IsoFields.WEEK_BASED_YEAR));

//		System.out.println(now.get(IsoFields.DAY_OF_QUARTER));
//		System.out.println(now.plusDays(100).get(IsoFields.DAY_OF_QUARTER));

//		System.out.println(now.get(IsoFields.QUARTER_OF_YEAR));
//		System.out.println(now.plusDays(100).get(IsoFields.QUARTER_OF_YEAR));

		System.out.println(now);
		LocalDateTime plus = now.plus(2, IsoFields.WEEK_BASED_YEARS);
		System.out.println(plus);

//		System.out.println(now);
//		LocalDateTime plus = now.plus(2, IsoFields.QUARTER_YEARS);
//		System.out.println(plus);

	}

}
