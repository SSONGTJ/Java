package test.main;

import java.awt.FlowLayout;
import java.io.File;
import java.io.FileWriter;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class MyFrame extends JFrame {
	JTextField inputMsg;
	public MyFrame(String title) {
		super(title);
		setLayout(new FlowLayout());
		setVisible(true);
		
		inputMsg = new JTextField(10);
		JButton send = new JButton("전송");
		
		add(inputMsg);
		add(send);
		
		send.addActionListener((e)->{
			String msg = inputMsg.getText();
			System.out.println("입력한 문자는 : "+msg+"입니다.");
			
			// 파일 생성 어쩌고
			
			File file = new File("c:/Acorn 202310/myFolder/test.txt");
			try {
				if(!file.exists()) {
					file.createNewFile();
					System.out.println("파일을 만들었어요.");
				}
				// 파일에 입력한 문자열 추가
				FileWriter fw = new FileWriter(file, true);
				fw.write(msg);
				fw.write("\r\n");
				fw.flush();
				fw.close();
				System.out.println("파일에 문자열을 기록했음");
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			JOptionPane.showMessageDialog(this, "저장됨");
		});
	}
	public static void main(String[] args) {
		MyFrame f = new MyFrame("몰까");
		f.setBounds(1000,100,500,500);
	}
}
