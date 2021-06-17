package View;
//Java Dersleri #120

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import Helper.*;
import Model.Bashekim;

public class LoginGUI extends JFrame {

	private JPanel w_pane;
	private JTextField fld_patientId;
	private JTextField fld_patientPass;
	private JTextField fld_doctorTc;
	private JTextField fld_doctorPass;
	private DBConnection conn = new DBConnection();
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginGUI frame = new LoginGUI();
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
	public LoginGUI() {
		setResizable(false);
		setTitle("Hospital Automation");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 400);
		w_pane = new JPanel();
		w_pane.setBackground(Color.WHITE);
		w_pane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(w_pane);
		w_pane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Welcome to Hospital Management System");
		lblNewLabel.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 16));
		lblNewLabel.setBounds(75, 72, 326, 22);
		w_pane.add(lblNewLabel);
		
		JTabbedPane w_tabpane = new JTabbedPane(JTabbedPane.TOP);
		w_tabpane.setBounds(10, 102, 474, 258);
		w_pane.add(w_tabpane);
		
		JPanel w_patientLogin = new JPanel();
		w_patientLogin.setBackground(Color.WHITE);
		w_tabpane.addTab("Patient Entry", null, w_patientLogin, null);
		w_patientLogin.setLayout(null);
		
		JLabel lblIdNumber = new JLabel("ID Number");
		lblIdNumber.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 16));
		lblIdNumber.setBounds(10, 14, 99, 22);
		w_patientLogin.add(lblIdNumber);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 16));
		lblPassword.setBounds(10, 54, 99, 22);
		w_patientLogin.add(lblPassword);
		
		fld_patientId = new JTextField();
		fld_patientId.setFont(new Font("Yu Gothic Light", Font.PLAIN, 14));
		fld_patientId.setBounds(133, 11, 326, 29);
		w_patientLogin.add(fld_patientId);
		fld_patientId.setColumns(10);
		
		fld_patientPass = new JTextField();
		fld_patientPass.setFont(new Font("Yu Gothic Light", Font.PLAIN, 14));
		fld_patientPass.setColumns(10);
		fld_patientPass.setBounds(133, 51, 326, 29);
		w_patientLogin.add(fld_patientPass);
		
		JButton btn_register = new JButton("Register");
		btn_register.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 18));
		btn_register.setBounds(10, 118, 207, 64);
		w_patientLogin.add(btn_register);
		
		JButton btn_patientLogin = new JButton("Login");
		btn_patientLogin.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 18));
		btn_patientLogin.setBounds(252, 118, 207, 64);
		w_patientLogin.add(btn_patientLogin);
		
		JPanel w_doctorLogin = new JPanel();
		w_doctorLogin.setBackground(Color.WHITE);
		w_tabpane.addTab("Doctor Entry", null, w_doctorLogin, null);
		w_doctorLogin.setLayout(null);
		
		JLabel lblIdNumber_1 = new JLabel("ID Number");
		lblIdNumber_1.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 16));
		lblIdNumber_1.setBounds(10, 14, 99, 22);
		w_doctorLogin.add(lblIdNumber_1);
		
		fld_doctorTc = new JTextField();
		fld_doctorTc.setFont(new Font("Yu Gothic Light", Font.PLAIN, 14));
		fld_doctorTc.setColumns(10);
		fld_doctorTc.setBounds(133, 11, 326, 29);
		w_doctorLogin.add(fld_doctorTc);
		
		JLabel lblPassword_1 = new JLabel("Password");
		lblPassword_1.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 16));
		lblPassword_1.setBounds(10, 54, 99, 22);
		w_doctorLogin.add(lblPassword_1);
		
		fld_doctorPass = new JTextField();
		fld_doctorPass.setFont(new Font("Yu Gothic Light", Font.PLAIN, 14));
		fld_doctorPass.setColumns(10);
		fld_doctorPass.setBounds(133, 51, 326, 29);
		w_doctorLogin.add(fld_doctorPass);
		
		JButton btn_doctorLogin = new JButton("Login");
		btn_doctorLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(fld_doctorTc.getText().length() == 0 || fld_doctorPass.getText().length() == 0) {
					Helper.showMsg("fill");
				}else {
					try {
						Connection con = conn.connDB();
						Statement st = con.createStatement();
						ResultSet rs = st.executeQuery("SELECT * FROM user ");
						while(rs.next()) {
							if(fld_doctorTc.getText().equals(rs.getString("number")) && fld_doctorPass.getText().equals(rs.getString("password"))) {
								Bashekim bhekim = new Bashekim();
								bhekim.setId(rs.getInt("id"));
								bhekim.setPassword("password");
								bhekim.setNumber(rs.getString("number"));
								bhekim.setName(rs.getString("name"));
								bhekim.setType(rs.getString("type"));
								
								BashekimGUI bGUI = new BashekimGUI(bhekim);
								bGUI.setVisible(true);
								dispose();
								
							}
						}
					} catch (SQLException e1) {
						e1.printStackTrace();
					}
				}
			}
		});
		btn_doctorLogin.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 18));
		btn_doctorLogin.setBounds(10, 118, 449, 64);
		w_doctorLogin.add(btn_doctorLogin);
	}
}
