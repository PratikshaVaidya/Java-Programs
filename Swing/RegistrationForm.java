package Swing;

import java.awt.Color;

import javax.swing.*;

public class RegistrationForm {

	public static void main(String[] args) {
	JFrame f=new JFrame("Registration form");
	ButtonGroup bg=new ButtonGroup();
	
	
	JLabel l1=new JLabel("FirstName:");
	JLabel l2=new JLabel("LastName:");
	JLabel l3=new JLabel("UserId:");
	JLabel l4=new JLabel("Password:");
	JLabel l5=new JLabel("Gender");
	JRadioButton rb1=new JRadioButton("Male");
	JRadioButton rb2=new JRadioButton("Female");
	
	JLabel l6=new JLabel("Languages Known:");
	JCheckBox c1=new JCheckBox("English");
	JCheckBox c2=new JCheckBox("Hindi");
	JCheckBox c3=new JCheckBox("Marathi");
	
	
	
	JTextField t1=new JTextField();
	JTextField t2=new JTextField();
	JTextField t3=new JTextField();
	JTextField t4=new JTextField();
	//JTextField t5=new JTextField();
	JButton b1=new JButton("Registration");
	JButton b2=new JButton("Cancel");
	JButton b3=new JButton("Reset");
	JLabel l7=new JLabel();
	
	l1.setBounds(50,100,200,20);
	l2.setBounds(50,200,200,20);
	l3.setBounds(50,300,200,20);
	l4.setBounds(50,400,200,20);
	l5.setBounds(50,500,200,20);
	l6.setBounds(50, 600,200,20);
	
	t1.setBounds(300,100,200,20);
	t2.setBounds(300,200,200,20);
	t3.setBounds(300,300,200,20);
	t4.setBounds(300,400,200,20);
	rb1.setBounds(300,500,100,20);
	rb2.setBounds(500,500,100,20);
	c1.setBounds(50,630, 100,20);
	c2.setBounds(200,630, 100,20);
	c3.setBounds(350,630, 100,20);
	
	
	b1.setBounds(50, 700, 150, 20);
	b2.setBounds(250, 700, 150, 20);
	b3.setBounds(450, 700, 150, 20);
	
	bg.add(rb1);
	bg.add(rb2);
	
	f.add(l1);
	f.add(l2);
	f.add(l3);
	f.add(l4);
	f.add(l5);
	f.add(l6);
	
	f.add(t1);
	f.add(t2);
	f.add(t3);
	f.add(t4);
	f.add(c1);
	f.add(c2);
	f.add(c3);
	
	f.add(b1);
	f.add(b2);
	f.add(b3);
	f.add(rb1);
	f.add(rb2);
	f.add(l7);
	
	f.setSize(800,800);
	f.setVisible(true);
	f.setLayout(null);
	f.getContentPane().setBackground(Color.CYAN);

	}

}
