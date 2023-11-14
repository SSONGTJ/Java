package test.main;

import java.awt.BorderLayout;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Quiz extends JFrame {
	//필드
	File openedFile;
	JTextArea ta;
	
	public Quiz (String title) {
		super(title);
		
		setLayout(new BorderLayout());

		//메뉴바
		JMenuBar mb=new JMenuBar();
		//메뉴
		JMenu menu=new JMenu("File");
		//메뉴 추가
		JMenuItem addlist=new JMenuItem("회원정보 추가");
		JMenuItem viewlist=new JMenuItem("목록 보기");
		
		menu.add(addlist);
		menu.add(viewlist);
		
		//메뉴를 메뉴바에 추가 
		mb.add(menu);
		//프레임의 메소드를 이용해서 메뉴바를 추가하기 
		setJMenuBar(mb);
		ta=new JTextArea();
		
		add(ta, BorderLayout.CENTER);
		
		addlist.addActionListener((e)->{
			JFileChooser fc=new JFileChooser("c:/Acorn 202310/myFolder");
			int result=fc.showSaveDialog(this);
			if(result == JFileChooser.APPROVE_OPTION) {
				//저장될 예정인 파일을 제어 할수 있는 File 객체의 참조값 얻어오기 
				openedFile=fc.getSelectedFile();
				//title 출력
				setTitle(openedFile.getName());
				//새로운 파일을 실제로 만들기
				try {
					openedFile.createNewFile();
				}catch(Exception e2) {
					e2.printStackTrace();
				}
				//파일에 문자열을 저장하는 메소드를 호출!
				saveToFile();
			}
		});
		
		viewlist.addActionListener((e)->{
			//JTextArea 에 출력된 내용을 빈문자열로 덮어쓰기(삭제) 한다음
			ta.setText("");
			
			FileReader fr=null;
			BufferedReader br=null;
			try {
				//파일에서 문자열을 읽어들일 객체 
				fr=new FileReader("c:/Acorn 202310/myFolder/my_members.dat");
				//문자열을 좀더 편하게 읽어들이기 위해 FileReader 를 Buffered Reader 로 포장하기
				br=new BufferedReader(fr);
				while(true) {
					//문자열을 한줄씩 읽어낸다.
					String line=br.readLine();
					//만일 더이상 읽을 문자열이 없다면
					if(line==null)break;// 반복문 탈출 
					ta.append(line);
					ta.append("\r\n");
				}
				System.out.println("회원 정보를 불러왔");
			}catch(Exception e2) {
				e2.printStackTrace();
			}
		});
		
		
		
	}
	
	//JTextArea 에 입력한 문자열을 선택된 파일에 저장하는 메소드
		public void saveToFile() {
			//JTextArea 에 입력한 문자열 읽어오기 
			String content=ta.getText();
			
			FileWriter fw=null;
			BufferedWriter bw=null;
			try {
				//현재 선택된 File 객체를 이용해서 FileWriter 객체 생성 
				fw=new FileWriter(openedFile);
				bw=new BufferedWriter(fw);
				bw.write(content);
				bw.flush();
				JOptionPane.showMessageDialog(this, "저장 했습니다.");
			}catch(Exception e2) {
				e2.printStackTrace();
			}finally {
				try {
					if(bw!=null)bw.close();
					if(fw!=null)fw.close();
				}catch(Exception e2) {}
			}
		}
		
	public static void main(String[] args) {
		Quiz q = new Quiz ("제목없음");
		q.setDefaultCloseOperation(EXIT_ON_CLOSE);
		q.setBounds(1300,700,500,300);
		q.setVisible(true);
	}
}
