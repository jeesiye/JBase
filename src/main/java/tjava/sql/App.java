package tjava.sql;

import java.io.StringBufferInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class App {

    public static void main(String[] args) throws Exception {

	DriverManager.registerDriver(new Driver());
	Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql", "root", "");
	System.out.println(connection);
	System.out.println(connection.isClosed());
	
	Statement statement = connection.createStatement();
	ResultSet resultSet = statement.executeQuery("select * from mysql.user;");
	System.out.println(resultSet);
	
	connection.close();
	System.out.println(connection.isClosed());

    }

}
