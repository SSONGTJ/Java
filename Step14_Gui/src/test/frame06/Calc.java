package test.frame06;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Calc extends JFrame {
	JTextField value1, value2;
	JButton plusBtn,minBtn,multiBtn,diviBtn;
	JLabel equal, result;
	
	public Calc(String title) {
		super(title);
		
		setBounds (1000,100,500,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		setVisible(true);
		
		value1 = new JTextField(4);
		value2 = new JTextField(4);
		plusBtn = new JButton("+");
		minBtn = new JButton("-");
		multiBtn = new JButton("*");
		diviBtn = new JButton("/");
		equal = new JLabel("=");
		result = new JLabel("0");
		
		add(value1);
		add(plusBtn);
		add(minBtn);
		add(multiBtn);
		add(diviBtn);
		add(value2);
		add(equal);
		add(result);
		
		
		try {
				plusBtn.addActionListener((e)->{
					double v1 = Double.parseDouble(value1.getText());
					double v2 = Double.parseDouble(value2.getText());
					String pr = String.valueOf(v1+v2);
					result.setText(pr);
				});
				
				minBtn.addActionListener((e)->{
					double v1 = Double.parseDouble(value1.getText());
					double v2 = Double.parseDouble(value2.getText());
					String pr = String.valueOf(v1-v2);
					result.setText(pr);
				});
				
				multiBtn.addActionListener((e)->{
					double v1 = Double.parseDouble(value1.getText());
					double v2 = Double.parseDouble(value2.getText());
					String pr = String.valueOf(v1*v2);
					result.setText(pr);
				});
				
				diviBtn.addActionListener((e)->{
					double v1 = Double.parseDouble(value1.getText());
					double v2 = Double.parseDouble(value2.getText());
					String pr = String.valueOf(v1/v2);
					result.setText(pr);
				});
		} catch (Exception e) {

		}
	}
	
	public static void main(String[] args) {
		Calc c = new Calc("계산기");
	}
}
