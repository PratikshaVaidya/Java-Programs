package EventHandling;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

class ColorChooser extends JFrame implements ActionListener
{
	JColorChooser cc;
	JButton b;
	JLabel l1;
	ColorChooser()
	{
		cc=new JColorChooser();
		l1=new JLabel();
		b=new JButton("Change color");
		cc.setBounds(10, 10,330, 300);
		b.setBounds(20, 330, 150, 40);
		b.addActionListener(this);
		add(cc);
		add(b);
		add(l1);
		setSize(600,600);
		setVisible(true);
		setLayout(null);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		getContentPane().setBackground(cc.getColor());
		
	}
	
}
public class ColorChooserExa {

	public static void main(String[] args) {
		new ColorChooser();

	}

}
