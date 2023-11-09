package test.frame06;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MyFrame extends JFrame implements ActionListener {
	JTextField inputMsg;
	JLabel label;
	// 프레임의 제목을 전달 받는 생성자
	public MyFrame (String title) {
		super(title);	// 부모 생성자에 프레임의 제목 전달하기
		
		//setBounds (100,100,500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		
		// 문자열을 한줄 입력 받을 수 있는 JTextField 객체 생성
		inputMsg = new JTextField(20);
		JButton sendBtn = new JButton("전송");
		JButton sendBtn2 = new JButton("전송2");
		label = new JLabel("...");
		/*
		 * 	JTextField 에 문자열을 입력하고 전송버튼을 누르면
		 * 	1. 입력한 문자열이 콘솔창에 출력되도록 해보슈
		 * 	2. 입력한 문자열이 알림창에 출력되도록 해보슈
		 * 
		 * 	hint => JTextField 객체의 .getxxx() 메소드를 이용하면 입력한 문자열을 읽어올 수 있다.
		 */
		
		sendBtn.addActionListener((e)->{
			// JTextField 에 입력한 문자열 읽어오기
			String msg = inputMsg.getText();
			// 콘솔창에 출력
			System.out.println(msg);
			// 알림창에 출력
			JOptionPane.showMessageDialog(this, msg);
			// label 문자열 출력
			label.setText(msg);
		});
		
		sendBtn2.addActionListener(this);
		
		add(inputMsg);
		add(sendBtn);
		add(sendBtn2);
		add(label);
	}
	
	public static void main(String[] args) {
		MyFrame f = new MyFrame("나의 프레임6");
		f.setBounds(100,100,700,400);
		f.setVisible(true);
	}
	
	// ActionListener 인터페이스를 implements 했기 때문에 강제로 구현된 메소드
	@Override
	public void actionPerformed(ActionEvent e) {
		// JTextField 에 입력한 문자열 읽어오기
		String msg = inputMsg.getText();
		// 콘솔창에 출력
		System.out.println("전송2) "+msg);
		// 알림창에 출력
		JOptionPane.showMessageDialog(this, msg);
		// label 문자열 출력
		label.setText(msg);
	}
}
