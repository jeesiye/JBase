package siye.tjava.collector;

import java.util.AbstractMap.SimpleEntry;
import java.util.AbstractMap.SimpleImmutableEntry;
import java.util.Map.Entry;
import java.util.PrimitiveIterator.OfDouble;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@SuppressWarnings("all")
public class AppCollector {
	private final static Logger log = LogManager.getLogger(AppCollector.class.getName());

	public static void main(String[] args) {

		log.info(OfDouble.class);
		log.info(SimpleImmutableEntry.class);

	}

}
