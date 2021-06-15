//Java Dersi #98

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Button Örneği");

		
		//Button ekleme
		JButton btn = new JButton("Gönder");
		
		btn.setBounds(100, 100, 100, 30);
		frame.add(btn);
		
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Butona basıldı.");
			}
		});
		
		
		//
		frame.setSize(400,400);
		frame.setLayout(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}
