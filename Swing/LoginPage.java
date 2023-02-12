package Swing;

import javax.swing.*;

public class LoginPage {

	public static void main(String[] args) {
		JFrame f=new JFrame("This is login page");
		JLabel l1=new JLabel("Username:");
		JLabel l3=new JLabel();
		JLabel l2=new JLabel("Password");
		JTextField t1=new JTextField();
		JTextField t2=new JTextField();
		JButton b1=new JButton("Login");
		JButton b2=new JButton("Reset");
		
		l1.setBounds(10,10,100,40);
		t1.setBounds(120, 10, 100, 40);
		l2.setBounds(10, 60, 100, 40);
		t2.setBounds(120, 60, 100, 40);
		b1.setBounds(40, 160, 100, 40);
		b2.setBounds(170, 160, 100, 40);
		
		f.add(l1);
		f.add(t1);
		f.add(l2);
		f.add(t2);
		f.add(b1);
		f.add(b2);
		f.add(l3);
	
		f.setSize(700, 700);
		f.setVisible(true);
		f.setLayout(null);

	}

}
