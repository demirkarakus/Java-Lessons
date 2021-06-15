import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Label;

import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Test extends JFrame {

	private JPanel contentPane;
	private JTextField metin;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Test frame = new Test();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Test() {
		setTitle("Kodlama");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 208, 197);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		metin = new JTextField();
		metin.setToolTipText("Bu bir metin kutusu");
		metin.setFont(new Font("Tahoma", Font.PLAIN, 12));
		metin.setBounds(53, 60, 86, 20);
		contentPane.add(metin);
		metin.setColumns(10);
		
		JLabel lblLabel = new JLabel("Label");
		lblLabel.setBounds(53, 35, 46, 14);
		contentPane.add(lblLabel);
		
		JButton btnNewButton = new JButton("Gönder");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblLabel.setText(metin.getText());
			}
		});
		
		btnNewButton.setBounds(53, 91, 89, 23);
		contentPane.add(btnNewButton);
	}
}
