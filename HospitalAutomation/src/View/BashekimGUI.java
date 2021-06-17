package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Model.Bashekim;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;

public class BashekimGUI extends JFrame {

	static Bashekim bashekim = new Bashekim();
	private JPanel w_pane;
	private JTextField fld_dName;
	private JTextField fld_dTcno;
	private JPasswordField fld_dPass;
	private JTextField fld_doctorID;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BashekimGUI frame = new BashekimGUI(bashekim);
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
	public BashekimGUI(Bashekim bashekim) {
		setTitle("Hospital Management System");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 500);
		w_pane = new JPanel();
		w_pane.setBackground(Color.WHITE);
		w_pane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(w_pane);
		w_pane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Welcome to Hospital! Dear " + bashekim.getName());
		lblNewLabel.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 16));
		lblNewLabel.setBounds(10, 11, 293, 26);
		w_pane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Logout");
		btnNewButton.setBounds(645, 11, 89, 23);
		w_pane.add(btnNewButton);
		
		JTabbedPane w_tab = new JTabbedPane(JTabbedPane.TOP);
		w_tab.setBounds(10, 87, 724, 373);
		w_pane.add(w_tab);
		
		JPanel w_doctor = new JPanel();
		w_doctor.setBackground(Color.WHITE);
		w_tab.addTab("Doctor Management", null, w_doctor, null);
		w_doctor.setLayout(null);
		
		JLabel label = new JLabel("Name Surname");
		label.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 12));
		label.setBounds(497, 11, 212, 22);
		w_doctor.add(label);
		
		fld_dName = new JTextField();
		fld_dName.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 12));
		fld_dName.setBounds(497, 44, 212, 22);
		w_doctor.add(fld_dName);
		fld_dName.setColumns(10);
		
		JLabel label_1 = new JLabel("ID Number");
		label_1.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 12));
		label_1.setBounds(497, 77, 212, 22);
		w_doctor.add(label_1);
		
		fld_dTcno = new JTextField();
		fld_dTcno.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 12));
		fld_dTcno.setColumns(10);
		fld_dTcno.setBounds(497, 110, 212, 22);
		w_doctor.add(fld_dTcno);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 12));
		lblPassword.setBounds(497, 143, 212, 22);
		w_doctor.add(lblPassword);
		
		fld_dPass = new JPasswordField();
		fld_dPass.setBounds(497, 176, 212, 22);
		w_doctor.add(fld_dPass);
		
		JButton btn_addDoctor = new JButton("Add Doctor");
		btn_addDoctor.setBounds(497, 209, 212, 23);
		w_doctor.add(btn_addDoctor);
		
		fld_doctorID = new JTextField();
		fld_doctorID.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 12));
		fld_doctorID.setColumns(10);
		fld_doctorID.setBounds(497, 276, 212, 22);
		w_doctor.add(fld_doctorID);
		
		JLabel label_3 = new JLabel("User ID");
		label_3.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 12));
		label_3.setBounds(497, 243, 212, 22);
		w_doctor.add(label_3);
		
		JButton btn_delDoctor = new JButton("Delete");
		btn_delDoctor.setBounds(497, 309, 212, 23);
		w_doctor.add(btn_delDoctor);
	}
}
