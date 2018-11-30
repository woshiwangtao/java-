package wt.s7.UI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import wt.s7.BLL.add_BLL;
import wt.s7.BLL.add_file_message_BLL;
import wt.s7.MODEL.student;

import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.Label;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;
public class add_students extends JFrame {

	private JPanel contentPane;
	private JTextField name;
	private JTextField number;
	private JTextField seat;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					add_students frame = new add_students();
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
	public add_students() {
		setTitle("\u6DFB\u52A0\u5B66\u751F");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(5, 5, 0, 0));
		
		Panel panel_4 = new Panel();
		contentPane.add(panel_4);
		
		JLabel label_3 = new JLabel("\u6DFB\u52A0\u5B66\u751F");
		panel_4.add(label_3);
		
		Panel panel_1 = new Panel();
		contentPane.add(panel_1);
		
		Label label = new Label("\u59D3 \u540D");
		panel_1.add(label);
		
		name = new JTextField();
		panel_1.add(name);
		name.setColumns(30);
		
		Panel panel_2 = new Panel();
		contentPane.add(panel_2);
		
		JLabel label_1 = new JLabel("\u5B66 \u53F7");
		panel_2.add(label_1);
		
		number = new JTextField();
		panel_2.add(number);
		number.setColumns(30);
		
		Panel panel_3 = new Panel();
		contentPane.add(panel_3);
		
		JLabel label_2 = new JLabel("\u5EA7\u4F4D\u53F7");
		panel_3.add(label_2);
		
		seat = new JTextField();
		panel_3.add(seat);
		seat.setColumns(30);
		
		Panel panel = new Panel();
		contentPane.add(panel);
		panel.setLayout(new GridLayout(0, 2, 0, 0));
		
		Panel panel_5 = new Panel();
		panel.add(panel_5);
		
		JButton button = new JButton("\u786E\u8BA4");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				student stu= new student();
				stu.name=name.getText();
				stu.balance=0;
				stu.number=number.getText();
				stu.seat=seat.getText();
				/*add_file_message_BLL a= new add_file_message_BLL();
				a.add_file_message(stu);
				succeed_dialog() ;*/
				add_BLL a = new add_BLL();
				try {
					a.add_message(stu);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		panel_5.add(button);
		
		Panel panel_6 = new Panel();
		panel.add(panel_6);
		
		JButton button_1 = new JButton("\u53D6\u6D88");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				teacher_charge_stu a = new teacher_charge_stu();
				a.main(null);
				hide_frame();
			}
		});
		panel_6.add(button_1);
	}
	public void hide_frame() {
		this.setVisible(false);
	}
	
	public void succeed_dialog() {
		 JOptionPane.showMessageDialog(null,"Ìí¼Ó³É¹¦");
}
	
}
