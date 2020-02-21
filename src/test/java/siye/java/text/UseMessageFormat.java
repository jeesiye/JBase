package siye.java.text;

import java.text.DecimalFormat;
import java.text.FieldPosition;
import java.text.MessageFormat;
import java.time.Instant;
import java.util.Date;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

// 消息数据的格式化
// 使用符号`{}`来表示一个元素,存在多个处理的元素,则使用多个该符号;
// 默认起始的索引是从0开始计数的

// 用FormatElement来表示一个需要格式化的元素;
// 有三种语法格式
// 1) { ArgumentIndex }
// 2) { ArgumentIndex , FormatType }
//    FormatType的候选项有 number date time choice
// 3) { ArgumentIndex , FormatType , FormatStyle }
//    FormatStyle的候选项有 short medium long full integer currency percent SubformatPattern

// 补充说明
// 支持使用符号`'`来表示不需要被格式化处理的字符,这点和DecimalFormat中的处理方式类似;
public class UseMessageFormat {

	private final Logger log = LogManager.getLogger();

	@Test
	public void testArgumentIndex() {
		String pattern = "use format units of MessageFormat :  {0} {1} {2} {3}";
		MessageFormat messageFormat = new MessageFormat(pattern);
		StringBuffer resultStringBuffer = new StringBuffer();
		StringBuffer result = messageFormat.format(new Object[] { "123" }, resultStringBuffer,
				new FieldPosition(DecimalFormat.INTEGER_FIELD));
		log.info(resultStringBuffer);
		log.info(result);
	}

	@Test
	public void testAddFormatType() {
		String pattern = "add formattype of MessageFormat : {0,date} {1}";
		String result = MessageFormat.format(pattern, new Object[] { new Date(Instant.now().toEpochMilli()) });
		log.info(result);
	}

	@Test
	public void testAddFormatStyle() {
		String pattern = "add formatstyle of MessageFormat : {0,date,long} {1}";
		String result = MessageFormat.format(pattern, new Object[] { new Date(Instant.now().toEpochMilli()) });
		log.info(result);

		String patternOfShort = "add formatstyle of MessageFormat : {0,date,short} {1}";
		String resultofShort = MessageFormat.format(patternOfShort,
				new Object[] { new Date(Instant.now().toEpochMilli()) });
		log.info(resultofShort);
	}

}
