package wt.s7.BLL;

import wt.s7.DAL.database_DAL;
import wt.s7.MODEL.computer;
import wt.s7.MODEL.student;

public class add_BLL {

	public void add_message(student stu) throws Exception {
		String sql="";
		if(stu.seat==null)
			sql="insert into student (number,name) values ('"+stu.number+"','"+stu.name+"')";
		else
			sql="insert into student (number,name,seat) values ('"+stu.number+"','"+stu.name+"','"+stu.seat+"')";
		database_DAL a = new database_DAL();
		a.insert(sql);
	}
	public void add_message(computer com) throws Exception {
		String sql="";
		if(com.user_number==null)
			sql="insert into computer (seat) values ('"+com.seat+"')";
		else
			sql="insert into student (seat,user_number,user_name) values ('"+com.seat+"','"+com.user_number+"','"+com.user_name+"')";
		database_DAL a = new database_DAL();
		a.insert(sql);
	}
}
