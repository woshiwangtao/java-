package wt.s7.UI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.CardLayout;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Label;
import java.awt.Font;

public class teacher_main_menu extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					teacher_main_menu frame = new teacher_main_menu();
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
	public teacher_main_menu() {
		setTitle("\u6B22\u8FCE\u4F7F\u7528\u6559\u5E08\u7AEF\u673A\u623F\u7CFB\u7EDF");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(4, 1, 0, 0));
		
		Panel guanli = new Panel();
		contentPane.add(guanli);
		guanli.setLayout(new GridLayout(0, 1, 0, 0));
		
		Button stu_manage = new Button("1.\u5B66\u751F\u7BA1\u7406");
		stu_manage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				teacher_charge_stu a=new teacher_charge_stu();
				a.main(null);
				hide_frame();
			}
		});
		stu_manage.setFont(new Font("Candara", Font.PLAIN, 34));
		guanli.add(stu_manage);
		
		Panel panel_1 = new Panel();
		contentPane.add(panel_1);
		panel_1.setLayout(new GridLayout(0, 1, 0, 0));
		
		Button computer_manage = new Button("2.\u8BA1\u7B97\u673A\u7BA1\u7406");
		computer_manage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				teacher_charge_com b = new teacher_charge_com();
				b.main(null);
				hide_frame();
			}
		});
		computer_manage.setFont(new Font("Dialog", Font.PLAIN, 34));
		panel_1.add(computer_manage);
		
		Panel panel_2 = new Panel();
		contentPane.add(panel_2);
		panel_2.setLayout(new GridLayout(0, 1, 0, 0));
		
		Button export_list = new Button("3.\u6E05\u5355\u6253\u5370");
		export_list.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				list c = new list();
				c.main(null);
				hide_frame();
			}
		});
		export_list.setFont(new Font("Dialog", Font.PLAIN, 34));
		panel_2.add(export_list);
		
		Panel panel_4 = new Panel();
		contentPane.add(panel_4);
		panel_4.setLayout(new GridLayout(0, 1, 0, 0));
		
		Button exit = new Button("4.\u9000\u51FA");
		exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		exit.setFont(new Font("Dialog", Font.PLAIN, 34));
		panel_4.add(exit);
	
	}
	public void hide_frame() {
		this.setVisible(false);
	}
}
