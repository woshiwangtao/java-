package wt.s7.BLL;

import java.io.File;

import wt.s7.DAL.File_DAL;

public class delete_file_message_BLL {

	public void delete_student(String num) {
		File file= new File("list\\student_list.txt");
		File_DAL a= new File_DAL();
		a.DeleteFromFile(file, num, false);
	}
	
	public void delete_computer(String seat) {
		File file= new File("list\\computer_list.txt");
		File_DAL a= new File_DAL();
		a.DeleteComFromFile(file, seat, false);
	}
}
