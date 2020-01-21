package tjava.time;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

@SuppressWarnings("all")
public class Tchronounit {

	public static void main(String[] args) {

		boolean bool = ChronoUnit.YEARS.isSupportedBy(Instant.now());
		System.out.println(bool);
		System.out.println(ChronoUnit.YEARS.isSupportedBy(LocalDateTime.now()));
		

	}

}
