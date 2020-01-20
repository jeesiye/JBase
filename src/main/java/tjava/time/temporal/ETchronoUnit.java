package tjava.time.temporal;

import java.time.temporal.ChronoUnit;

// java.time.temporal.ChronoUnit
public class ETchronoUnit {

	// TemporalUnit
	// | extends
	// |---------> ChronoUnit

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		ChronoUnit years = ChronoUnit.YEARS;// 年
		ChronoUnit months = ChronoUnit.MONTHS;// 月
		ChronoUnit days = ChronoUnit.DAYS; // 日
		ChronoUnit hours = ChronoUnit.HOURS;// 时
		ChronoUnit minutes = ChronoUnit.MINUTES; // 分
		ChronoUnit seconds = ChronoUnit.SECONDS;// 秒
		ChronoUnit millis = ChronoUnit.MILLIS; // 毫秒
		ChronoUnit micros = ChronoUnit.MICROS; // 微妙;
		ChronoUnit nanos = ChronoUnit.NANOS; // 纳秒

		ChronoUnit forever = ChronoUnit.FOREVER;// 永恒
		ChronoUnit eras = ChronoUnit.ERAS;// 时代
		ChronoUnit centuries = ChronoUnit.CENTURIES;// 世纪
		ChronoUnit millennia = ChronoUnit.MILLENNIA;// 千年
		ChronoUnit decades = ChronoUnit.DECADES;// 十年
		ChronoUnit halfDays = ChronoUnit.HALF_DAYS;// 半天
	}

}
