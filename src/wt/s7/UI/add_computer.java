package wt.s7.UI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import wt.s7.BLL.add_BLL;
import wt.s7.BLL.add_file_message_BLL;
import wt.s7.MODEL.computer;

import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.awt.event.ActionEvent;

public class add_computer extends JFrame {

	private JPanel contentPane;
	private JTextField computer_seat;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					add_computer frame = new add_computer();
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
	public add_computer() {
		setTitle("\u65B0\u589E\u8BA1\u7B97\u673A");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(5, 1, 0, 0));
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1);
		
		JLabel label = new JLabel("\u6DFB\u52A0\u8BA1\u7B97\u673A");
		panel_1.add(label);
		
		JPanel panel_2 = new JPanel();
		contentPane.add(panel_2);
		
		JPanel panel_3 = new JPanel();
		contentPane.add(panel_3);
		
		JLabel label_1 = new JLabel("\u8BA1\u7B97\u673A\u5EA7\u4F4D\u53F7");
		panel_3.add(label_1);
		
		computer_seat = new JTextField();
		panel_3.add(computer_seat);
		computer_seat.setColumns(20);
		
		JPanel panel_4 = new JPanel();
		contentPane.add(panel_4);
		
		JPanel panel = new JPanel();
		contentPane.add(panel);
		panel.setLayout(new GridLayout(0, 2, 0, 0));
		
		JPanel panel_5 = new JPanel();
		panel.add(panel_5);
		
		JButton button = new JButton("\u786E\u8BA4\u6DFB\u52A0");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				computer com = new computer();
				com.seat= computer_seat.getText();
				
				/*add_file_message_BLL a= new add_file_message_BLL();
				a.add_file_message1(com);
				succeed_dialog();*/
				add_BLL a =new add_BLL();
				try {
					a.add_message(com);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		panel_5.add(button);
		
		JPanel panel_6 = new JPanel();
		panel.add(panel_6);
		
		JButton button_1 = new JButton("\u53D6\u6D88");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				teacher_charge_com a =new teacher_charge_com();
				a.main(null);;
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
			 JOptionPane.showMessageDialog(null,"添加成功");
	}
}
