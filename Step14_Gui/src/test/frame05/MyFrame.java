package test.frame05;

import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MyFrame extends JFrame implements ActionListener{ //ActionListener 인터페이스 구현
	JButton send, update, delete;

	//생성자
	public MyFrame () {	// 준비 작업
		// 프레임의 제목 설정
		setTitle("나의 프레임 5");
		
		// setBounds(x, y, width, height) 창의 위치와 크기 설정
		setBounds(100,100,500,500);
		
		// 이 프레임(MyFrame)의 x 버튼 (close 버튼) 을 눌렀을 때 프로세스도 같이 종료 되도록 설정
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// FlowLayout 매니저 사용해보기
		setLayout(new FlowLayout());
		
		//------------------------------------------------------------
		
		JButton sendBtn=new JButton("전송");
		JButton updateBtn=new JButton("수정");
		JButton deleteBtn=new JButton("삭제");
		
		sendBtn.addActionListener(this);
		updateBtn.addActionListener(this);
		deleteBtn.addActionListener(this);
		
		// this ( 바로 이 객체, MyFrame 객체) 의 type 다형성 확인
		Object					a=this;
		JFrame					b=this;
		MyFrame				c=this;
		ActionListener 	d=this;
		
		add(sendBtn);
		add(updateBtn);
		add(deleteBtn);
		
		//------------------------------------------------------------
		
		send = new JButton("전송!");
		update = new JButton("수정!");
		delete = new JButton("삭제!");
		
		send.addActionListener(this); // this 는 class 를 가리킨다....
		update.addActionListener(this);
		delete.addActionListener(this);
		
		add(send);
		add(update);
		add(delete);
		
		// 프레임을 화면상에 실제 보이게 하기 (false 하면 화면에 보이지 않는다.)
		setVisible(true);
	}
	
	public static void main(String[] args) {
		//MyFrame 객체 생성
		new MyFrame();
		System.out.println("main 메소드 종료됨");
	}

	// ActionListener 인터페이스를 implements 했기 때문에 강제로 오버라이드 된 메소드
	@Override
	public void actionPerformed(ActionEvent e) {
		// 눌러진 버튼의 액션 command 문자열을 읽어온다 ( 기본값은 버튼 text )
		String command = e.getActionCommand();
		if (command == "전송") {
			System.out.println("전송을 눌렀어?");
		} else if (command == "수정") {
			System.out.println("수정을 눌러?");
		} else if (command == "삭제") {
			System.out.println("삭제를 해?");
		}
		
		// 위와 동일한 동작을 아래의 메소드가 리턴해주는 Object 의 참조값 (JButton 의 참조값) 을 활용하는 구조로
		// MyFrame 클래스를 수정해 봐
		// hint : JButton 의 참조값을 필드에 저장
		Object obj = e.getSource();
		
		if (obj == this.send) {
			System.out.println("전송?");
		} else if (obj == this.update) {
			System.out.println("수정?");
		} else if (obj == this.delete) {
			System.out.println("삭제?");
		}

	}
}
