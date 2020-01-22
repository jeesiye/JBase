package tjava.sql;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.mysql.jdbc.Driver;

@SuppressWarnings("all")
public class Tdriver {

	private final static Logger log = LogManager.getLogger(Tdriver.class.getName());

	public static void main(String[] args) throws SQLException {

		Driver driver = new Driver();
		log.info(driver);
		
		
		log.info(driver.getMajorVersion());
		log.info(driver.getMinorVersion());
		
		
		log.info(driver.jdbcCompliant());
		log.info(driver.acceptsURL("jdbc:mysql://localhost:3306"));
		
		
		String url = "jdbc:mysql://localhost:3306";
		Properties properties = new Properties();
		properties.put("username", "root");
		properties.put("password", "123");
		Connection connect = driver.connect(url, properties);
		log.info(connect);
//		connect.close();
		log.info(connect.isClosed());
		
		java.util.logging.Logger logger = driver.getParentLogger();
		log.info(logger);
		
		

	}

}
