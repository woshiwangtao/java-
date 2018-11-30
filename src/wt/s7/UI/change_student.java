package wt.s7.UI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import wt.s7.BLL.change_file_message_BLL;
import wt.s7.BLL.update_BLL;
import wt.s7.MODEL.student;

import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class change_student extends JFrame {

	private JPanel contentPane;
	private JTextField num;
	private JTextField name;
	private JTextField seat;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					change_student frame = new change_student();
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
	public change_student() {
		setTitle("\u4FEE\u6539\u5B66\u751F\u4FE1\u606F");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(5, 2, 0, 0));
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1);
		
		JLabel label = new JLabel("\u4FEE\u6539\u4FE1\u606F");
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
		
		JLabel label_2 = new JLabel("\u59D3\u540D");
		panel_3.add(label_2);
		
		name = new JTextField();
		panel_3.add(name);
		name.setColumns(30);
		
		JPanel panel_4 = new JPanel();
		contentPane.add(panel_4);
		
		JLabel label_3 = new JLabel("\u5EA7\u4F4D\u53F7");
		panel_4.add(label_3);
		
		seat = new JTextField();
		panel_4.add(seat);
		seat.setColumns(30);
		
		JPanel panel = new JPanel();
		contentPane.add(panel);
		panel.setLayout(new GridLayout(0, 2, 0, 0));
		
		JPanel panel_5 = new JPanel();
		panel.add(panel_5);
		
		JButton button = new JButton("\u786E\u8BA4\u4FEE\u6539");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				student stu = new student();
				stu.name=name.getText();stu.seat=seat.getText();stu.number=num.getText();
				/*change_file_message_BLL a = new change_file_message_BLL();
				a.change_studdent(stu);
				succeed_dialog();*/
				update_BLL a = new update_BLL();
				a.update(stu);
				succeed_dialog();
			}
		});
		panel_5.add(button);
		
		JPanel panel_6 = new JPanel();
		panel.add(panel_6);
		
		JButton button_1 = new JButton("\u53D6\u6D88");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				teacher_charge_stu a=new teacher_charge_stu();
				a.main(null);
				hide_frame();
			}
		});
		panel_6.add(button_1);
	}
	public void hide_frame() {
		this.setVisible(false);
	}
	//提示对话框
			public void succeed_dialog() {
					 JOptionPane.showMessageDialog(null,"修改成功");
			}
}
