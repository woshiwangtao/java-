package wt.s7.BLL;

import java.sql.ResultSet;

import wt.s7.DAL.database_DAL;
import wt.s7.MODEL.computer;
import wt.s7.MODEL.student;

public class update_BLL {

	public void update(student stu) 
	{
		String sql="update student set name='"+stu.name+"',seat='"+stu.seat+"' where number = '"+stu.number+"'";
		database_DAL a= new database_DAL();
		try {
			a.insert(sql);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void update(computer com) 
	{
		String sql="update computer set user_name='"+com.user_name+"',user_number='"+com.user_number+"' where seat = '"+com.seat+"'";
		database_DAL a= new database_DAL();
		try {
			a.insert(sql);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
