package tjava.time;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoField;

@SuppressWarnings("all")
public class App {

    public static void main(String[] args) {

	System.out.println(OffsetDateTime.now().getLong(ChronoField.OFFSET_SECONDS) / 60 / 24);

    }

}
