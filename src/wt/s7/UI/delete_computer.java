package wt.s7.UI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import wt.s7.BLL.delete_BLL;
import wt.s7.BLL.delete_file_message_BLL;
import wt.s7.MODEL.computer;

import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Panel;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class delete_computer extends JFrame {

	private JPanel contentPane;
	private JTextField seat;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					delete_computer frame = new delete_computer();
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
	public delete_computer() {
		setTitle("\u5220\u9664\u8BA1\u7B97\u673A");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(4, 1, 0, 0));
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1);
		
		JLabel label = new JLabel("\u5220\u9664\u8BA1\u7B97\u673A");
		panel_1.add(label);
		
		JPanel panel_2 = new JPanel();
		contentPane.add(panel_2);
		
		JLabel label_1 = new JLabel("\u8BA1\u7B97\u673A\u5EA7\u4F4D\u53F7");
		panel_2.add(label_1);
		
		seat = new JTextField();
		panel_2.add(seat);
		seat.setColumns(10);
		
		Panel panel_3 = new Panel();
		contentPane.add(panel_3);
		
		JLabel label_2 = new JLabel("\u5220 \u9664 \u7C7B \u578B");
		panel_3.add(label_2);
		
		String str[]= {"软删除","硬删除"};
		JComboBox comboBox = new JComboBox(str);
		panel_3.add(comboBox);
		
		JPanel panel = new JPanel();
		contentPane.add(panel);
		panel.setLayout(new GridLayout(0, 2, 0, 0));
		
		JPanel panel_4 = new JPanel();
		panel.add(panel_4);
		
		JButton button = new JButton("\u786E\u8BA4\u5220\u9664");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/*delete_file_message_BLL a = new delete_file_message_BLL();
				a.delete_computer(seat.getText());
				succeed_dialog();*/
				computer com =new computer();
				com.seat=seat.getText();
				delete_BLL a = new delete_BLL();
				a.delete(com);
				succeed_dialog();
			}
		});
		panel_4.add(button);
		
		JPanel panel_5 = new JPanel();
		panel.add(panel_5);
		
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
			 JOptionPane.showMessageDialog(null,"删除成功");
	}
}
