package tjava.sql;

import java.io.StringBufferInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

@SuppressWarnings("all")
public class App {

	public static void main(String[] args) throws Exception {

		
		Class.forName(Driver.class.getName());
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql", "root", "123");
		System.out.println(connection);
		System.out.println(connection.isClosed());

		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery("select * from mysql.user;");
		System.out.println(resultSet);
		System.out.println(resultSet.getRow());
		System.out.println(resultSet.next());
		System.out.println(resultSet.getRow());
		
		System.out.println(resultSet.getType());
		System.out.println(resultSet.getString("host"));
		
		
		
		

		connection.close();
		System.out.println(connection.isClosed());

	}

}
