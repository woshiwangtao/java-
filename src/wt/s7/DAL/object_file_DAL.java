package wt.s7.DAL;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import wt.s7.MODEL.student;

public class object_file_DAL {
	//���л�д��
	public static void ObjectWrite(student stu) {
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Student.txt"));
           oos.writeObject(stu);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
	//���л���ȡ
	public static void main(String[] args) {
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Student.txt"));
            student stu = (student) ois.readObject();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }


}
