package tjava.time.temporal;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;

import org.junit.Test;

// java.time.temporal.TemporalUnit
// 可用的实现类有:
// java.time.temporal.ChronoUnit
public class ITtemporalUnit {

	@Test
	public void addTo() {

		TemporalUnit temporalUnit = ChronoUnit.NANOS;
		Instant instant = Instant.now();
		Instant addTo = temporalUnit.addTo(instant, 10_000);
		System.out.println(instant);
		System.out.println(addTo);

	}

	@Test
	public void between() {
		TemporalUnit temporalUnit = ChronoUnit.HOURS;
		long between = temporalUnit.between(Instant.now(), Instant.now());
		System.out.println(between);
	}

	@Test
	public void getDuration() {
		TemporalUnit temporalUnit = ChronoUnit.SECONDS;
		Duration duration = temporalUnit.getDuration();
		System.out.println(duration);
	}

	@Test // 当前的部件,是否指示表示代表持续时间的部件;
	public void isDurationEstimated() {
		System.out.println(ChronoUnit.YEARS.isDurationEstimated());
		System.out.println(ChronoUnit.MONTHS.isDurationEstimated());
		System.out.println(ChronoUnit.DAYS.isDurationEstimated());

		System.out.println(ChronoUnit.HOURS.isDurationEstimated());
		System.out.println(ChronoUnit.MINUTES.isDurationEstimated());
		System.out.println(ChronoUnit.SECONDS.isDurationEstimated());

	}

	@Test // 当前的部件,是否指示指定的时态部件;
	public void isSupportedBy() {
		System.out.println(ChronoUnit.MONTHS.isSupportedBy(Instant.now()));
		System.out.println(ChronoUnit.MONTHS.isSupportedBy(LocalDate.now()));

		System.out.println(ChronoUnit.HOURS.isSupportedBy(Instant.now()));
		System.out.println(ChronoUnit.HOURS.isSupportedBy(LocalDateTime.now()));
	}

	@Test // 当前的部件,是否指示表示日期的部件;
	public void isDateBased() {
		System.out.println(ChronoUnit.MONTHS.isDateBased());
		System.out.println(ChronoUnit.HOURS.isDateBased());
	}

	@Test // 当前的部件,是否指示表示时间的时间;
	public void isTimeBased() {
		System.out.println(ChronoUnit.MONTHS.isTimeBased());
		System.out.println(ChronoUnit.HOURS.isTimeBased());
	}

	@Test
	public void _toString() {
		TemporalUnit temporalUnit = ChronoUnit.MONTHS;
		System.out.println(temporalUnit.toString());
	}

}
