

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class ConnectionDemo
{

	public static void main(String[] args)
	{
		String jdbcUrl = "jdbc:mysql://localhost:3306/test";
		String username = "root";
		String password ="root";
		
		try
		{
			//Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection(jdbcUrl,username,password);
			System.out.println("Connected to MySQL database ");
			connection.close();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}

	}
}

