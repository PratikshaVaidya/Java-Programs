package Swing;

import java.awt.Color;

import javax.swing.JFrame;

public class SwingByUsingAssociation {

	public static void main(String[] args) {
		JFrame f=new JFrame("This is second frame");
		
		f.setSize(500, 500);
		f.setVisible(true);
		f.setLayout(null);
		
		f.getContentPane().setBackground(Color.DARK_GRAY);

	}

}
