package wt.s7.UI;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class text {



	
	
		 public static void main( String[] args )
		    { 
			
			    	FileWriter writer = null;
			        try {   
			            // ��һ��д�ļ��������캯���еĵڶ�������true��ʾ��׷����ʽд�ļ�   
			            writer = new FileWriter("list\\student_list.txt", true);   
			            writer.write("1213\r\n");     
			        } catch (IOException e) {   
			            e.printStackTrace();   
			        } finally {   
			            try {   
			            	if(writer != null){
			            		writer.close();   
			            	}
			            } catch (IOException e) {   
			                e.printStackTrace();   
			            }   
			        
			    }
		    }
}

