package Swing;

import javax.swing.*;

public class CalculatorUsingSwing {

	public static void main(String[] args) {
		JFrame f=new JFrame("Calculator");
		JLabel l1=new JLabel("FirstNo:");
		JLabel l2=new JLabel("SecondNo:");
		JLabel l4=new JLabel("Result:");
		
		JButton b1=new JButton("+");
		JButton b2=new JButton("-");
		JButton b3=new JButton("*");
		JButton b4=new JButton("/");
		JButton b5=new JButton("Reset");
		JButton b6=new JButton("Cancel");
		
		JLabel l3=new JLabel();
		
		JTextField t1=new JTextField();
		JTextField t2=new JTextField();
		JTextField t3=new JTextField();
		
		
		l1.setBounds(20, 20, 80, 20);
		l2.setBounds(20, 80, 80, 20);
		l4.setBounds(20,200,80,20); 
		
		t1.setBounds(100, 20, 80, 20);
		t2.setBounds(100,80, 80, 20);
		t3.setBounds(100,200,80,20);
		
		b1.setBounds(20, 150, 60, 20);
		b2.setBounds(100, 150, 60, 20);
		b3.setBounds(200, 150, 60, 20);
		b4.setBounds(300, 150, 60, 20);
		b5.setBounds(20, 240, 80, 20);
		b6.setBounds(150, 240, 80, 20);
		
		f.add(l1);
		f.add(l2);
		f.add(l4);
		
		f.add(t1);
		f.add(t2);
		f.add(t3);
		
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		f.add(b5);
		f.add(b6);
		
		
		f.add(l3);
		
		f.setSize(500, 500);
		f.setVisible(true);
		f.setLayout(null);

	}

}
