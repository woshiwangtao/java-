package wt.s7.BLL;

import java.sql.ResultSet;

import wt.s7.DAL.database_DAL;
import wt.s7.MODEL.student;

public class login_BLL {

	public String[] login(String id) {
		String sql="SELECT password,type FROM login where id =  '"+id+"'";
		String[] password= new String[2];
		database_DAL a= new database_DAL();

		try {
			ResultSet rs =a.select(sql);
			while(rs.next()) {
				password[0] = rs.getString("password");
				password[1] = rs.getString("type");
			}
			
		}catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return password;
	}
}
