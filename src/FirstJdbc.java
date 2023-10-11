import java.sql.*;
public class FirstJdbc {

	public static void main(String[] args) 
	{
		try
		{
			//Load the driver 
			Class.forName("com.mysql.jdbc.Driver");
			
			
			String url ="jdbc:mysql://localhost:3306/Test";
			String username = "root";
			String password = "root";
			//Create connection 
			//Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Test","root","root");
			
			Connection con =  DriverManager.getConnection(url,username,password);
			
			if(con.isClosed())
			{
				System.out.println("Connection is closed");
			}
			else
			{
				System.out.println("Connection Created...");
			}
			
			con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		
		

	}

}
