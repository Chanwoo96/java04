package 클래스사용하기;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 일기장 {
	private static JTextField t1;
	private static JTextField t2;

	public static void main(String[] args) {
		JFrame d = new JFrame();
		d.getContentPane().setBackground(Color.GREEN);
		d.setSize(544, 535);
		d.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\java workspace\\java04\\일기1.jpg"));
		lblNewLabel.setBounds(12, 0, 504, 247);
		d.getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("아이디");
		lblNewLabel_1.setFont(new Font("굴림", Font.BOLD, 20));
		lblNewLabel_1.setBounds(121, 257, 114, 21);
		d.getContentPane().add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("비밀번호");
		lblNewLabel_2.setFont(new Font("굴림", Font.BOLD, 20));
		lblNewLabel_2.setBounds(121, 321, 114, 18);
		d.getContentPane().add(lblNewLabel_2);

		t1 = new JTextField();
		t1.setBounds(275, 257, 116, 21);
		d.getContentPane().add(t1);
		t1.setColumns(10);

		t2 = new JTextField();
		t2.setColumns(10);
		t2.setBounds(275, 321, 116, 21);
		d.getContentPane().add(t2);

		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String id = t1.getText();
				String pw = t2.getText();
				// id = "root", pw="1234"이면 일기쓰는 화면
				// 아니면 joptionpane 로그인실패
				if (id.equals("root") && pw.equals("1234")) {
					일기쓰기 write = new 일기쓰기();
					write.open();
				} else {
					JOptionPane.showMessageDialog(d, "로그인에 실패하셨습니다.");
				}
			}
		});
		btnNewButton.setIcon(new ImageIcon("D:\\java workspace\\java04\\log1.png"));
		btnNewButton.setBounds(96, 349, 114, 137);
		d.getContentPane().add(btnNewButton);

		JButton btnNewButton_1 = new JButton("초기화");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				t1.setText("");
				t2.setText("");
			}
		});
		btnNewButton_1.setIcon(new ImageIcon("D:\\java workspace\\java04\\del.png"));
		btnNewButton_1.setBounds(295, 368, 96, 105);
		d.getContentPane().add(btnNewButton_1);

		d.setVisible(true);
	}
}
