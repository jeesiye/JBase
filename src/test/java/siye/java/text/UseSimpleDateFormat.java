package siye.java.text;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

// 日期时间格式化的处理方式
// 是老旧的,在项目使用中,不建议使用;
// 使用java.time.format中的新增格式化类;

// 详细相关格式化匹配参数的定义,参考该类的doc说明;
// 特别注意,在表示年份的时候使用字符`y`,而不是字符`Y`

// 简易常用的格式化形式为  yyyy-MM-dd HH:mm:ss
public class UseSimpleDateFormat {

	private final Logger log = LogManager.getLogger();

	@Test
	public void simpleRuning() {
		String pattern = "yyyy-MM-dd HH:mm:ss -- z";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		String result = simpleDateFormat.format(new Date(Instant.now().toEpochMilli()));
		log.info(result);
	}

}
