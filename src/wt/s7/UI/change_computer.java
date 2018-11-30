package wt.s7.UI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import wt.s7.BLL.change_file_message_BLL;
import wt.s7.BLL.update_BLL;
import wt.s7.MODEL.computer;
import wt.s7.MODEL.student;

import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class change_computer extends JFrame {

	private JPanel contentPane;
	private JTextField seat;
	private JTextField user_num;
	private JTextField user_name;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					change_computer frame = new change_computer();
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
	public change_computer() {
		setTitle("\u4FEE\u6539\u8BA1\u7B97\u673A");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(5, 1, 2, 2));
		
		JPanel panel = new JPanel();
		contentPane.add(panel);
		
		JLabel label = new JLabel("\u4FEE\u6539\u8BA1\u7B97\u673A\u4FE1\u606F");
		panel.add(label);
		
		JPanel panel_2 = new JPanel();
		contentPane.add(panel_2);
		
		JLabel label_1 = new JLabel("\u8BA1\u7B97\u673A\u5EA7\u4F4D\u53F7");
		panel_2.add(label_1);
		
		seat = new JTextField();
		panel_2.add(seat);
		seat.setColumns(10);
		
		JPanel panel_3 = new JPanel();
		contentPane.add(panel_3);
		
		JLabel label_2 = new JLabel("\u4F7F\u7528\u8005\u5B66\u53F7");
		panel_3.add(label_2);
		
		user_num = new JTextField();
		panel_3.add(user_num);
		user_num.setColumns(10);
		
		JPanel panel_6 = new JPanel();
		contentPane.add(panel_6);
		
		JLabel label_3 = new JLabel("\u4F7F\u7528\u8005\u59D3\u540D");
		panel_6.add(label_3);
		
		user_name = new JTextField();
		panel_6.add(user_name);
		user_name.setColumns(10);
		
		JPanel panel_4 = new JPanel();
		contentPane.add(panel_4);
		panel_4.setLayout(new GridLayout(0, 2, 0, 0));
		
		JPanel panel_1 = new JPanel();
		panel_4.add(panel_1);
		
		JButton button = new JButton("\u786E\u8BA4\u4FEE\u6539");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				computer com = new computer();
				com.seat=seat.getText();
				com.user_name=user_name.getText();
				com.user_number=user_num.getText();
			/*	change_file_message_BLL a= new change_file_message_BLL();
				a.change_computer(com);*/
				
				update_BLL a = new update_BLL();
				a.update(com);
				succeed_dialog() ;
			}
		});
		panel_1.add(button);
		
		JPanel panel_5 = new JPanel();
		panel_4.add(panel_5);
		
		JButton button_1 = new JButton("\u53D6\u6D88");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				teacher_charge_com a=new teacher_charge_com();
				a.main(null);
				hide_frame();
			}
		});
		panel_5.add(button_1);
	}
	public void hide_frame() {
		this.setVisible(false);
	}
	//提示对话框
		public void succeed_dialog() {
				 JOptionPane.showMessageDialog(null,"修改成功");
		}
}
