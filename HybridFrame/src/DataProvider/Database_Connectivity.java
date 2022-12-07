package DataProvider;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

public class Database_Connectivity {
	@Test
	public void script() throws SQLException
	{
		String un="root";
		String pass="harini";
		String url="jdbc:mysql://localhost:3306/rasa14";
		Connection dm = DriverManager.getConnection(url, un, pass);
		Statement create = dm.createStatement();
	ResultSet	out=create.executeQuery("select * from user_cred");
	 out.next();
	System.out.println(out.getString("username"));
	System.out.println(out.getString("pass"));
		
	}

}
