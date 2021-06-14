//Java Dersi #98

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setSize(200,200);
		
		JPanel panel = new JPanel();
		
		//Button ekleme
		JButton btn = new JButton("Button");
		panel.add(btn);
		
		//
		
		
		frame.add(panel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}
