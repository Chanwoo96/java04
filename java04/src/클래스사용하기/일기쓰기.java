package 클래스사용하기;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.awt.event.ActionEvent;

public class 일기쓰기 {
	private static JTextField t1;
	private static JTextField t2;
	//public void open() {
	public void open() {
		
	
		JFrame w = new JFrame();
		w.getContentPane().setBackground(Color.YELLOW);
		w.setSize(416, 400);
		w.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("날짜");
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 18));
		lblNewLabel.setBounds(42, 53, 72, 21);
		w.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("제목");
		lblNewLabel_1.setFont(new Font("굴림", Font.BOLD, 18));
		lblNewLabel_1.setBounds(42, 113, 72, 18);
		w.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("내용");
		lblNewLabel_2.setFont(new Font("굴림", Font.BOLD, 18));
		lblNewLabel_2.setBounds(42, 215, 57, 29);
		w.getContentPane().add(lblNewLabel_2);
		
		t1 = new JTextField();
		t1.setBackground(Color.GREEN);
		t1.setBounds(126, 53, 157, 21);
		w.getContentPane().add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setBackground(Color.GREEN);
		t2.setColumns(10);
		t2.setBounds(126, 110, 157, 21);
		w.getContentPane().add(t2);
		
		JTextArea t3 = new JTextArea();
		t3.setBackground(Color.GREEN);
		t3.setBounds(126, 173, 157, 135);
		w.getContentPane().add(t3);
		
		JButton btnNewButton = new JButton("파일에 일기 저장");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s1 = t1.getText();
				String s2 = t2.getText();
				String s3 = t3.getText();
				//자바프로그램 밖에 있는 자원들 (네트워크, db프로그램, 파일, etc)을 연결할 때는
				//프로그램이 실행되지 못하는 위험한 상황으로 인식해서
				//반드시 위험한 상황이 발생하면 어떻게 처리할지를 명시해주어야 한다.
				//try~catch
				try {
					//file.txt와 자바프로그램간 스트림을 만듦
					FileWriter file = new FileWriter(s1+".txt");
					//스트림을 통해 데이터 보내기.
					file.write(s1 + "\n");
					file.write(s2 + "\n");
					file.write(s3 + "\n");
					//스트림 닫기
					file.close();
				} catch (Exception e1) {
					System.out.println("파일에 저장 중 에러발생함.");
				}
			}
		});
		btnNewButton.setBackground(Color.MAGENTA);
		btnNewButton.setBounds(53, 318, 282, 23);
		w.getContentPane().add(btnNewButton);
		
		
		
		
		
		
		
		w.setVisible(true);
	}
}
