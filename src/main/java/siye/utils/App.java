package siye.utils;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Array;
import java.sql.Blob;
import java.sql.CallableStatement;
import java.sql.ClientInfoStatus;
import java.sql.Clob;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.Driver;
import java.sql.DriverAction;
import java.sql.NClob;
import java.text.DecimalFormat;
import java.time.chrono.AbstractChronology;
import java.time.chrono.ChronoLocalDate;
import java.time.chrono.ChronoLocalDateTime;
import java.time.chrono.ChronoPeriod;
import java.time.chrono.ChronoZonedDateTime;
import java.time.chrono.Chronology;
import java.time.chrono.Era;
import java.time.chrono.HijrahChronology;
import java.time.chrono.HijrahDate;
import java.time.chrono.HijrahEra;
import java.time.chrono.IsoChronology;
import java.time.chrono.IsoEra;
import java.time.chrono.JapaneseChronology;
import java.time.chrono.JapaneseDate;
import java.time.chrono.JapaneseEra;
import java.time.chrono.MinguoChronology;
import java.time.chrono.MinguoDate;
import java.time.chrono.MinguoEra;
import java.time.chrono.ThaiBuddhistChronology;
import java.time.chrono.ThaiBuddhistDate;
import java.time.chrono.ThaiBuddhistEra;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.format.FormatStyle;
import java.time.format.ResolverStyle;
import java.time.format.SignStyle;
import java.time.format.TextStyle;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjusters;
import java.time.temporal.TemporalQueries;
import java.time.temporal.TemporalQuery;
import java.time.temporal.ValueRange;
import java.time.zone.ZoneOffsetTransition;
import java.time.zone.ZoneOffsetTransitionRule;
import java.time.zone.ZoneRules;
import java.time.zone.ZoneRulesProvider;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Timer;
import java.util.TimerTask;
import java.time.zone.ZoneOffsetTransitionRule.TimeDefinition;

import javax.swing.text.Highlighter;

@SuppressWarnings("all")
public class App {

	public static void main(String[] args) {

		/*
		 * handler package's classes
		 */
//		String prefixStore = "/home/coder/RefreshMemory/J$2basic/$2text/java.txt.spi";
//		String prefixPack = "java/text/spi";
//		Packclass2Txt.pack2txt(prefixPack, Paths.get(prefixStore));

		/*
		 * handler once classes
		 */

//
//		String prefixStore = "/media/coder/43859743-b167-4f2a-a4eb-0897b0ccb159/svlution/RefreshMemory/J$2basic/$1time/java.util";
//		Class2Txt.toTxt(Paths.get(prefixStore), GregorianCalendar.class);

		/*
		 * test unit
		 */

		StringBuilder stringBuilder = Class2Txt.handlerCls(TimerTask.class);
		System.out.println(stringBuilder.toString());

	}

}
