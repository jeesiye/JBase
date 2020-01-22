package siye.tjava.utils;

import java.util.Base64;
import java.util.Spliterator.OfInt;
import java.util.Spliterators;
import java.util.SplittableRandom;
import java.util.StringJoiner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.experimental.theories.internal.SpecificDataPointsSupplier;

@SuppressWarnings("all")
public class Apputils {

	private final static Logger log = LogManager.getLogger(Apputils.class.getName());

	public static void main(String[] args) {

//		String content = "a123";
//		String encode = Base64.getEncoder().encodeToString(content.getBytes());
//		log.info(encode);
//
//		String cipher = "YTEyMw==";
//		byte[] bytes = Base64.getDecoder().decode(cipher);
//		log.info(new String(bytes));

//		SplittableRandom splittableRandom = new SplittableRandom(112102121219121l);
//		log.info(splittableRandom.toString());
//		int i = splittableRandom.nextInt();
//		log.info(i);

		StringJoiner stringJoiner = new StringJoiner("abc");
		stringJoiner.add("123").add("456");
		log.info(stringJoiner.length());
		log.info(stringJoiner.toString());

	}

}
