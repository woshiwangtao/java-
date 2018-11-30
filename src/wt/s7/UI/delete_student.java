package wt.s7.UI;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import wt.s7.BLL.delete_BLL;
import wt.s7.BLL.delete_file_message_BLL;
import wt.s7.MODEL.computer;
import wt.s7.MODEL.student;

import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class delete_student extends JFrame {

	private JPanel contentPane;
	private JTextField num;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					delete_student frame = new delete_student();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public delete_student() {
		setTitle("\u5220\u9664\u5B66\u751F");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1);
		
		JLabel label = new JLabel("\u5220\u9664\u5B66\u751F");
		panel_1.add(label);
		
		JPanel panel_2 = new JPanel();
		contentPane.add(panel_2);
		
		JLabel label_1 = new JLabel("\u5B66\u53F7");
		panel_2.add(label_1);
		
		num = new JTextField();
		panel_2.add(num);
		num.setColumns(30);
		
		JPanel panel_3 = new JPanel();
		contentPane.add(panel_3);
		
		JLabel label_2 = new JLabel("\u5220\u9664\u7C7B\u578B");
		panel_3.add(label_2);
		
		String str1[] = {"软删除","硬删除"}; 
		JComboBox select = new JComboBox(str1);
		panel_3.add(select);
		
		JPanel panel_4 = new JPanel();
		contentPane.add(panel_4);
		
		JLabel label_3 = new JLabel("\u5220\u9664\u539F\u56E0");
		panel_4.add(label_3);
		
		textField_1 = new JTextField();
		panel_4.add(textField_1);
		textField_1.setColumns(30);
		
		JPanel panel = new JPanel();
		contentPane.add(panel);
		panel.setLayout(new GridLayout(0, 2, 0, 0));
		
		JPanel panel_5 = new JPanel();
		panel.add(panel_5);
		
		JButton btnNewButton = new JButton("\u786E\u8BA4\u5220\u9664");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			/*	String number=num.getText();
				delete_file_message_BLL a= new delete_file_message_BLL();
				a.delete_student(number);*/
				student stu =new student();
				stu.number=num.getText();
				delete_BLL a = new delete_BLL();
				a.delete(stu);
				
				succeed_dialog();
			}
		});
		panel_5.add(btnNewButton);
		
		JPanel panel_6 = new JPanel();
		panel.add(panel_6);
		
		JButton btnNewButton_1 = new JButton("\u53D6\u6D88");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				teacher_charge_stu a=new teacher_charge_stu();
				a.main(null);
				hide_frame();
			}
		});
		panel_6.add(btnNewButton_1);
	}
	public void hide_frame() {
		this.setVisible(false);
	}
	//提示对话框
	public void succeed_dialog() {
			 JOptionPane.showMessageDialog(null,"删除成功");
	}
}
