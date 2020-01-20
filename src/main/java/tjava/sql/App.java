package tjava.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;

public class App {

    
    public static void main(String[] args) throws Exception {
	
	DriverManager.registerDriver(com.mysql.cj.jdbc.Driver.class);
	Connection connection = DriverManager.getConnection("jdbc:mysql//localhost:3306/mysql", "root", "");
	
	
	
    }
    
}
