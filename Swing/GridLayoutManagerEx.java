package Swing;

import java.awt.FlowLayout;
import java.awt.GridLayout;

//import javax.swing.JButton;
import javax.swing.*;

public class GridLayoutManagerEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f=new JFrame("Flow Layout Manager");
		
		JButton b1=new JButton("first");
		JButton b2=new JButton("second");
		JButton b3=new JButton("third");
		JButton b4=new JButton("fourth");
		JButton b5=new JButton("fifth");
		f.add(b5);
		f.add(b3);
		f.add(b2);
		f.add(b4);
		f.add(b1);
		f.setSize(400,400);
		f.setVisible(true);
		f.setLayout(new GridLayout(3,3));

	}

}
