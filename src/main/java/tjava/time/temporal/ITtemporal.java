package tjava.time.temporal;

import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalUnit;
import java.util.logging.Logger;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ITtemporal {

	private final static Logger log = Logger.getLogger(ITtemporal.class.getName());
	private Temporal temporal;

	@Test
	public void isSupported() {
		TemporalUnit temporalUnit = ChronoUnit.ERAS;
		Boolean bool = temporal.isSupported(temporalUnit);
		log.info(bool.toString());
	}
	
	@Test
	public void run() {
		
	}
	

	@Before
	public void prepare() {
		if (temporal == null) {
			temporal = Instant.now();
		}
	}

	@After
	public void destroy() {
		if (temporal != null) {
			temporal = null;
		}

	}

}
