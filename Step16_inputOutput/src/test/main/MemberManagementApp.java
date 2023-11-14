package test.main;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

import test.dto.MemberDto;

public class MemberManagementApp {
    private List<MemberDto> memberList;
    private DefaultTableModel tableModel;

    public MemberManagementApp() {
        // 회원 목록을 저장할 List 초기화
        memberList = new ArrayList<>();

        // 프레임 생성
        JFrame frame = new JFrame("Member Management App");
        frame.setLayout(new BorderLayout());
        frame.setSize(500, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // JTable 및 DefaultTableModel 초기화
        tableModel = new DefaultTableModel();
        JTable table = new JTable(tableModel);

        // 컬럼 설정
        tableModel.addColumn("번호");
        tableModel.addColumn("이름");
        tableModel.addColumn("주소");

        // 파일에서 회원 정보 불러오기
        loadMembersFromFile();

        // 불러온 회원 정보를 JTable에 추가
        for (MemberDto member : memberList) {
            Object[] rowData = {member.getNum(), member.getName(), member.getAddr()};
            tableModel.addRow(rowData);
        }

        // JScrollPane을 사용하여 JTable을 감싸기
        JScrollPane scrollPane = new JScrollPane(table);
        frame.add(scrollPane, BorderLayout.CENTER);

        // 회원 추가 버튼 및 이벤트 처리
        JButton addButton = new JButton("회원 추가");
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addMember();
            }
        });

        // 회원 목록 보기 버튼 및 이벤트 처리
        JButton viewButton = new JButton("목록 보기");
        viewButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                viewMembers();
            }
        });

        // 하단 버튼 패널 생성
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(addButton);
        buttonPanel.add(viewButton);

        // 프레임에 버튼 패널 추가
        frame.add(buttonPanel, BorderLayout.SOUTH);

        // 프레임 표시
        frame.setVisible(true);
    }

    private void addMember() {
        // 회원 정보 입력 다이얼로그 생성
        JTextField numberField = new JTextField();
        JTextField nameField = new JTextField();
        JTextField addressField = new JTextField();

        Object[] fields = {"번호:", numberField, "이름:", nameField, "주소:", addressField};

        int result = JOptionPane.showConfirmDialog(null, fields, "회원 추가", JOptionPane.OK_CANCEL_OPTION);

        if (result == JOptionPane.OK_OPTION) {
            // 입력된 정보로 MemberDto 객체 생성
            int number = Integer.parseInt(numberField.getText());
            String name = nameField.getText();
            String address = addressField.getText();

            MemberDto newMember = new MemberDto(number, name, address);

            // JTable에 추가
            Object[] rowData = {newMember.getNum(), newMember.getName(), newMember.getAddr()};
            tableModel.addRow(rowData);

            // List에 회원 정보 추가
            memberList.add(newMember);

            // 파일에 저장
            saveMembersToFile();
        }
    }

    private void viewMembers() {
        // 현재 List에 있는 회원 정보를 JTable에 모두 출력
        tableModel.setRowCount(0);

        for (MemberDto member : memberList) {
            Object[] rowData = {member.getNum(), member.getName(), member.getAddr()};
            tableModel.addRow(rowData);
        }
        searchMembers("");
    }

    private void searchMembers(String keyword) {
        // 특정 키워드로 회원을 검색하여 JTable에 출력
        tableModel.setRowCount(0);

        for (MemberDto member : memberList) {
            if (member.getName().toLowerCase().contains(keyword.toLowerCase()) ||
                String.valueOf(member.getNum()).contains(keyword) ||
                member.getAddr().toLowerCase().contains(keyword.toLowerCase())) {
                Object[] rowData = {member.getNum(), member.getName(), member.getAddr()};
                tableModel.addRow(rowData);
            }
        }

    }
    
    private void editMember(int rowIndex) {
        // 선택한 행의 회원 정보를 편집
        MemberDto selectedMember = memberList.get(rowIndex);

        JTextField numberField = new JTextField(String.valueOf(selectedMember.getNum()));
        JTextField nameField = new JTextField(selectedMember.getName());
        JTextField addressField = new JTextField(selectedMember.getAddr());

        Object[] fields = {"번호:", numberField, "이름:", nameField, "주소:", addressField};

        int result = JOptionPane.showConfirmDialog(null, fields, "회원 편집", JOptionPane.OK_CANCEL_OPTION);

        if (result == JOptionPane.OK_OPTION) {
            // 수정된 정보로 회원 정보 업데이트
            selectedMember.setNum(Integer.parseInt(numberField.getText()));
            selectedMember.setName(nameField.getText());
            selectedMember.setAddr(addressField.getText());

            // JTable 업데이트
            tableModel.setValueAt(selectedMember.getNum(), rowIndex, 0);
            tableModel.setValueAt(selectedMember.getName(), rowIndex, 1);
            tableModel.setValueAt(selectedMember.getAddr(), rowIndex, 2);

            // 파일에 저장
            saveMembersToFile();
        }
    }
    
    private void saveMembersToFile() {
        // 파일에 회원 정보 저장
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("my_members.dat"))) {
            oos.writeObject(memberList);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void loadMembersFromFile() {
        // 파일에서 회원 정보 불러오기
        File file = new File("my_members.dat");
        if (file.exists()) {
            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
                memberList = (List<MemberDto>) ois.readObject();
            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
    	SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                MemberManagementApp app = new MemberManagementApp();
                app.loadMembersFromFile(); // 프로그램 실행 시 파일에서 데이터 불러오기
                app.viewMembers(); // 초기 목록 출력
            }
        });
    }
}
