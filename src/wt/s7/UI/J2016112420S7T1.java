package wt.s7.UI;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class J2016112420S7T1 {

	public static void main(String[] args)throws Exception
	{
		// TODO Auto-generated method stub
		/*String url = "jdbc:mysql://localhost:3306/computer_lab?" 
	            + "user=root&password=1111&useUnicode=true&characterEncoding=UTF8&serverTimezone=GMT";
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection conn = DriverManager.getConnection(url);*/
	
		login lo = new login();
		lo.ToLogin(null);
		/*Statement start = conn.createStatement();
		String sql="SELECT * FROM student";
		ResultSet rs = start.executeQuery(sql);
		String stu_name;
		String stu_num;
		System.out.println("1.原始表内容：");*/
		/*while(rs.next()) {
			
			if(rs.getBoolean("state")) {
			stu_name=rs.getString("number");
			stu_num=rs.getString("name");
			String stu_seat = rs.getString("seat");
			BigDecimal stu_balance = rs.getBigDecimal("balance");
			
			System.out.println(stu_name+"\t"+stu_num+"\t"+stu_seat+"\t"+stu_balance);}
		}*/
	}
}

