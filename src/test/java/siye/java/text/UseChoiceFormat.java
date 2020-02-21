package siye.java.text;

import java.text.ChoiceFormat;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

// 对复数格式化
// 通过 MessageFormat 处理复数
// 有两种格式化方式
public class UseChoiceFormat {

	private final Logger log = LogManager.getLogger();

	// 边界匹配的方式
	// 1) 其中符号`|`是必须的,用于分割格式化匹配的候选项
	// 2) 最大和最小的若无法匹配,则匹配最后一个或第一个匹配项
	// 3) 关于符号`<`,`>`,`#`,自行参考
	@Test
	public void formatPluralByPattern() {
		String pattern = "0# is min limits | 1# is one of number | 2# is two of number | 2< is max limits";
		ChoiceFormat choiceFormat = new ChoiceFormat(pattern);
		log.info(choiceFormat.format(-1));
		log.info(choiceFormat.format(0));
		log.info(choiceFormat.format(1));
		log.info(choiceFormat.format(2));
		log.info(choiceFormat.format(20));
	}

	// 数组匹配的方式
	// 超出边界,若无法匹配,则匹配临近的边界候选项;
	@Test
	public void formatPluralByLimitsAndFormats() {

		double[] limits = { 0, 1, 2 };
		String[] formats = { "a", "b", "c" };
		ChoiceFormat choiceFormat = new ChoiceFormat(limits, formats);

		log.info(choiceFormat.format(-1));
		log.info(choiceFormat.format(0));
		log.info(choiceFormat.format(1));
		log.info(choiceFormat.format(2));
		log.info(choiceFormat.format(20));

	}

}
