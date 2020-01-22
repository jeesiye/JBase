package siye.tjava.collector;

import java.sql.Date;
import java.util.Arrays;
import java.util.Base64;
import java.util.Enumeration;
import java.util.EventListener;
import java.util.EventListenerProxy;
import java.util.EventObject;
import java.util.Formattable;
import java.util.FormattableFlags;
import java.util.GregorianCalendar;
import java.util.ListResourceBundle;
import java.util.Locale;
import java.util.LongSummaryStatistics;
import java.util.Objects;
import java.util.Observable;
import java.util.Formatter.BigDecimalLayoutForm;
import java.util.Locale.Category;
import java.util.Locale.FilteringMode;
import java.util.Observer;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;
import java.util.PropertyResourceBundle;
import java.util.Random;
import java.util.ResourceBundle;
import java.util.Scanner;
import java.util.ServiceLoader;
import java.util.SimpleTimeZone;
import java.util.Spliterators;
import java.util.SplittableRandom;
import java.util.StringJoiner;
import java.util.StringTokenizer;
import java.util.TimeZone;
import java.util.Timer;
import java.util.TimerTask;
import java.util.UUID;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;
import java.util.Calendar;
import java.util.Currency;
import java.util.DoubleSummaryStatistics;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@SuppressWarnings("all")
public class Unsolved {

	private final static Logger log = LogManager.getLogger(Unsolved.class.getName());

	public static void main(String[] args) {

		// interfaces
		log.info(Enumeration.class.toString());
		log.info(EventListener.class.toString());
		log.info(Formattable.class.toString());
		log.info(Observer.class.toString());
		log.info("");

		// enums
		log.info(Category.class.toString());
		log.info(FilteringMode.class.toString());
		log.info(BigDecimalLayoutForm.class.toString());
		log.info("");

		// classes
		Arrays.class.toString();

//		Timer.class.toString(); // timer
//		TimerTask.class.toString();


		UUID.class.toString();

		Base64.class.toString();
		Base64.Decoder.class.toString();
		Base64.Encoder.class.toString();

		Date.class.toString();
		Calendar.class.toString();
		Calendar.Builder.class.toString();
		GregorianCalendar.class.toString();
		TimeZone.class.toString();
		SimpleTimeZone.class.toString();

		Currency.class.toString();
		FormattableFlags.class.toString();

		Locale.class.toString();
		Locale.Builder.class.toString();
		Locale.LanguageRange.class.toString();

		Objects.class.toString();
		Random.class.toString();
		Scanner.class.toString();

		StringJoiner.class.toString();
		StringTokenizer.class.toString();

		ServiceLoader.class.toString();

		ResourceBundle.class.toString();
		ResourceBundle.Control.class.toString();
		ListResourceBundle.class.toString();
		PropertyResourceBundle.class.toString();

		Observable.class.toString();

		Optional.class.toString();
		OptionalDouble.class.toString();
		OptionalInt.class.toString();
		OptionalLong.class.toString();

		DoubleSummaryStatistics.class.toString();
		LongSummaryStatistics.class.toString();

		EventListenerProxy.class.toString();
		EventObject.class.toString();

		Spliterators.class.toString();
		SplittableRandom.class.toString();
		Spliterators.AbstractSpliterator.class.toString();
		Spliterators.AbstractDoubleSpliterator.class.toString();
		Spliterators.AbstractIntSpliterator.class.toString();
		Spliterators.AbstractLongSpliterator.class.toString();
		
		

	}

}
