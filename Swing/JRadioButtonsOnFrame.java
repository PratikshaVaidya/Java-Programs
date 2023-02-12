package Swing;

import javax.swing.*;

public class JRadioButtonsOnFrame {

	public static void main(String[] args) {
		JFrame f=new JFrame("This is Radio button");
		ButtonGroup bg=new ButtonGroup();
		JLabel l1=new JLabel();
		JRadioButton rb1=new JRadioButton("Male");
		JRadioButton rb2=new JRadioButton("Female");
		rb1.setBounds(20, 20, 100, 50);
		rb2.setBounds(130,20,100,50);
		bg.add(rb1);
		bg.add(rb2);
		f.add(rb1);
		f.add(rb2);
		f.add(l1);
		f.setSize(500, 500);
		f.setVisible(true);
		f.setLayout(null);

	}

}
