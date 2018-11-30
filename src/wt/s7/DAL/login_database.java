package wt.s7.DAL;

import java.sql.Connection;
import java.sql.DriverManager;

public class login_database {
	public Connection login_database()  throws Exception
	{
		String url = "jdbc:mysql://localhost:3306/computer_lab?" 
	            + "user=root&password=1111&useUnicode=true&characterEncoding=UTF8&serverTimezone=GMT";
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection(url);
		return conn;
	}
}
