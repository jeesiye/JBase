package siye.java.text;

import java.math.RoundingMode;
import java.text.DecimalFormat;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

// @see java.math.RoundingMode
public class UseDecimalFormat {

	private Logger log = LogManager.getLogger();

	@Test
	public void symbolDefined() {
		// test number of format

		// 0 表示阿拉伯数字,若不存在使用0来填充
		log.info(new DecimalFormat("0000").format(23));
		// # 表示阿拉伯数字,若不存在则不显示;
		log.info(new DecimalFormat("####").format(23));
		log.info(new DecimalFormat("###.###").format(23.3));
		log.info(new DecimalFormat("000.000").format(23.3));

		// . 表示小数点,用于浮点数
		log.info(new DecimalFormat("###.###").format(23.33));
		// - 表示负数
		log.info(new DecimalFormat("-####").format(23.33));

		// 科学计算表示法,表示10的多少次方;
		log.info(new DecimalFormat("###E0").format(1231231.12312312312));

		// ????
		log.info(new DecimalFormat("###;-###").format(3 - 2333333));

		// test symbol of format

		// 乘以100,可前缀或后缀,格式化后追加符号`%`
		log.info(new DecimalFormat("####%").format(23));
		log.info(new DecimalFormat("%####").format(23));

		// 乘以1000,可前缀或后缀,格式化后追加符号`‰`
		log.info(new DecimalFormat("###\u2030").format(23));
		log.info(new DecimalFormat("\u2030####").format(23));

		// 可前缀或后缀,追加本地化的货币符号
		log.info(new DecimalFormat("####\u00A4").format(23));
		log.info(new DecimalFormat("\u00A4####").format(23));

		// 符号`'`,用于引用不格式化处理的符号
		log.info(new DecimalFormat("'A'###").format(23));
		log.info(new DecimalFormat("###'A'").format(23));
		log.info(new DecimalFormat("###'Abc'").format(23));

	}

	// 对浮点数值舍入的处理方式选择
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
		decimalFormat.setRoundingMode(RoundingMode.HALF_EVEN);// 默认的舍入模式
		log.info(decimalFormat.format(23.4446));
		// 向上舍入模式
		decimalFormat.setRoundingMode(RoundingMode.UP);
		log.info(decimalFormat.format(23.4446));
		// 向下舍入模式
		decimalFormat.setRoundingMode(RoundingMode.DOWN);
		log.info(decimalFormat.format(23.4446));
		// 向上舍入模式
		decimalFormat.setRoundingMode(RoundingMode.CEILING);
		log.info(decimalFormat.format(23.4446));
		// 向下舍入模式
		decimalFormat.setRoundingMode(RoundingMode.FLOOR);
		log.info(decimalFormat.format(23.4446));
		// throwing exception
//		decimalFormat.setRoundingMode(RoundingMode.UNNECESSARY);
//		log.info(decimalFormat.format(23.4446));
	}

}
