package siye.java.text;

import java.math.RoundingMode;
import java.text.DecimalFormat;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

// @see java.math.RoundingMode
public class xDecimalFormat {

	private Logger log = LogManager.getLogger();

	@Test
	public void symbolDefined() {
		// test number of format

		log.info(new DecimalFormat("0000").format(23));
		log.info(new DecimalFormat("####").format(23));
		log.info(new DecimalFormat("###.###").format(23.3));
		log.info(new DecimalFormat("000.000").format(23.3));

		log.info(new DecimalFormat("###.###").format(23.33));
		log.info(new DecimalFormat("-####").format(23.33));

		log.info(new DecimalFormat("###E0").format(1231231.12312312312));

		// ????
		log.info(new DecimalFormat("###;-###").format(3 - 2333333));

		// test symbol of format

		log.info(new DecimalFormat("####%").format(23));
		log.info(new DecimalFormat("%####").format(23));

		log.info(new DecimalFormat("###\u2030").format(23));
		log.info(new DecimalFormat("\u2030####").format(23));

		log.info(new DecimalFormat("####\u00A4").format(23));
		log.info(new DecimalFormat("\u00A4####").format(23));

		log.info(new DecimalFormat("'A'###").format(23));
		log.info(new DecimalFormat("###'A'").format(23));

	}

	@Test
	public void roundoffDefine() {
		DecimalFormat decimalFormat = new DecimalFormat();
		log.info(decimalFormat.toPattern());
		log.info(decimalFormat.getRoundingMode());
		log.info(decimalFormat.format(23.4446));
		decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
		log.info(decimalFormat.format(23.4446));
		decimalFormat.setRoundingMode(RoundingMode.HALF_DOWN);
		log.info(decimalFormat.format(23.4446));
		decimalFormat.setRoundingMode(RoundingMode.HALF_EVEN);
		log.info(decimalFormat.format(23.4446));
		decimalFormat.setRoundingMode(RoundingMode.UP);
		log.info(decimalFormat.format(23.4446));
		decimalFormat.setRoundingMode(RoundingMode.DOWN);
		log.info(decimalFormat.format(23.4446));
		decimalFormat.setRoundingMode(RoundingMode.CEILING);
		log.info(decimalFormat.format(23.4446));
		decimalFormat.setRoundingMode(RoundingMode.FLOOR);
		log.info(decimalFormat.format(23.4446));
		// throwing exception
//		decimalFormat.setRoundingMode(RoundingMode.UNNECESSARY);
//		log.info(decimalFormat.format(23.4446));
	}

}
