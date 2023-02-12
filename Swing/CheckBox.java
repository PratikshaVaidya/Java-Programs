package Swing;

import javax.swing.*;

public class CheckBox {

	public static void main(String[] args) {
		JFrame f=new JFrame("This is Checked Box");
		JLabel l1=new JLabel("Langauages Known");
		JCheckBox c1=new JCheckBox("Marathi");
		JCheckBox c2=new JCheckBox("Hindi");
		JCheckBox c3=new JCheckBox("English");
		JLabel l2=new JLabel();
		
		l1.setBounds(10,10,100,40);
		c1.setBounds(120,10,100,40);
		c2.setBounds(230,10,100,40);
		c3.setBounds(340,10,100,40);
		f.add(l1);
		
		f.add(c1);
		f.add(c2);
		f.add(c3);
		f.add(l2);
		f.setSize(500,500);
		f.setVisible(true);
		f.setLayout(null);

	}

}
