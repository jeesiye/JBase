package tjava.time.temporal;

import java.time.ZonedDateTime;
import java.time.temporal.ChronoField;

// java.time.temporal.ChronoField
public class ETchronoField {

    @SuppressWarnings("unused")
    public static void main(String[] args) {
	// 当前日期月份中的天数,重新排列周期,算是星期几;比如03/20,结果是星期六
	ChronoField alignedDayOfWeekInMonth = ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH;
	// 当前日期当年的天数,重新排列周期,算是星期几;比如02/19,结果是星期一;
	ChronoField alignedDayOfWeekInYear = ChronoField.ALIGNED_DAY_OF_WEEK_IN_YEAR;
	// 当前日期月份中的天数;重新排列,能排列几个整周(向上舍入);比如03/20,结果是3个整周;
	ChronoField alignedWeekOfMonth = ChronoField.ALIGNED_WEEK_OF_MONTH;
	// 当前日期年份中的天数;重新排列,能排列几个整周(向上舍入);比如02/19,结果是8个整周;
	ChronoField alignedWeekOfYear = ChronoField.ALIGNED_WEEK_OF_YEAR;

	ChronoField dayOfYear = ChronoField.DAY_OF_YEAR;// 当年的天数;
	ChronoField dayOfMonth = ChronoField.DAY_OF_MONTH;// 当月的天数;
	ChronoField dayOfWeek = ChronoField.DAY_OF_WEEK;// 当周的天数;(星期几)

	ChronoField ampmOfDay = ChronoField.AMPM_OF_DAY;// 上午还是下午;0表示上午AM;1表示下午PM;
	ChronoField clockHourOfAmpm = ChronoField.CLOCK_HOUR_OF_AMPM;// 上午或下午有多少个小时;
	ChronoField clockHourOfDay = ChronoField.CLOCK_HOUR_OF_DAY;// 一天有多少个小时;

	ChronoField epochDay = ChronoField.EPOCH_DAY;// 从1970/01/01至今有多少天;
	ChronoField era = ChronoField.ERA;// 时代;

	ChronoField hourOfAmpm = ChronoField.HOUR_OF_AMPM;// 上午或下午的第几个小时;
	ChronoField hourOfDay = ChronoField.HOUR_OF_DAY;// 一天的第几个小时;

	System.out.println(ZonedDateTime.now().getLong(ChronoField.INSTANT_SECONDS) / 60 / 60 / 24 / 365);

    }

}
