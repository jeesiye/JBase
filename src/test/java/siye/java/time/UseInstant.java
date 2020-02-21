package siye.java.time;

import java.time.Instant;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

public class UseInstant {
	
	private final Logger log = LogManager.getLogger();
	
	@Test
	public void run() {
		log.info(Instant.now());
	}

}
