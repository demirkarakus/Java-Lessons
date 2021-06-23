package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;

import Model.Bashekim;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import Helper.Helper;

public class BashekimGUI extends JFrame {

	static Bashekim bashekim = new Bashekim();
	private JPanel w_pane;
	private JTextField fld_dName;
	private JTextField fld_dTcno;
	private JPasswordField fld_dPass;
	private JTextField fld_doctorID;
	private JTable table_doctor;
	private DefaultTableModel doctorModel = null;
	private Object[] doctorData = null;

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
	 * @throws SQLException 
	 */
	public BashekimGUI(Bashekim bashekim) throws SQLException {
		
		doctorModel = new DefaultTableModel();
		Object[] colDoctorName = new Object[4];
		colDoctorName[0] = "ID";
		colDoctorName[1] = "Name Surname";
		colDoctorName[2] = "ID Number";
		colDoctorName[3] = "Password";
		doctorModel.setColumnIdentifiers(colDoctorName);
		doctorData = new Object[4];
		for(int i=0; i < bashekim.getDoctorList().size(); i++) {
			doctorData[0] = bashekim.getDoctorList().get(i).getId();
			doctorData[1] = bashekim.getDoctorList().get(i).getName();
			doctorData[2] = bashekim.getDoctorList().get(i).getNumber();
			doctorData[3] = bashekim.getDoctorList().get(i).getPassword();
			doctorModel.addRow(doctorData);
		}
			
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
		btn_addDoctor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(fld_dName.getText().length() == 0 || fld_dPass.getText().length() == 0 || fld_dPass.getText().length() == 0) {
					Helper.showMsg("fill");
				}else {
					try {
						boolean control = bashekim.addDoctor(fld_dTcno.getText(), fld_dPass.getText(), fld_dName.getText());
						if(control) {
							Helper.showMsg("success");
							fld_dName.setText(null);
							fld_dPass.setText(null);
							fld_dTcno.setText(null);
							updateDoctorModel();
						}
					} catch (SQLException e1) {
						e1.printStackTrace();
					}
				}
			}
		});
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
		btn_delDoctor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(fld_doctorID.getText().length() == 0) {
					Helper.showMsg("Please, select an ID.");
				}else {
					if(Helper.confirm("sure")) {
						int selectID = Integer.parseInt(fld_doctorID.getText());
						try {
							boolean control = bashekim.deleteDoctor(selectID);
							if(control) {
								Helper.showMsg("success");
								fld_doctorID.setText(null);
								updateDoctorModel();
							}
						} catch (SQLException e1) {
							e1.printStackTrace();
						}
					}
				}
			}
		});
		btn_delDoctor.setBounds(497, 309, 212, 23);
		w_doctor.add(btn_delDoctor);
		
		JScrollPane w_scrollDoctor = new JScrollPane();
		w_scrollDoctor.setBounds(10, 11, 477, 323);
		w_doctor.add(w_scrollDoctor);
		
		table_doctor = new JTable(doctorModel);
		w_scrollDoctor.setViewportView(table_doctor);
		table_doctor.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
			
			@Override
			public void valueChanged(ListSelectionEvent e) {
				try {
					fld_doctorID.setText(table_doctor.getValueAt(table_doctor.getSelectedRow(), 0).toString());
				} catch (Exception ex) {
				}
			}
		});
		
		table_doctor.getModel().addTableModelListener(new TableModelListener() {
			
			@Override
			public void tableChanged(TableModelEvent e) {
				if(e.getType() == TableModelEvent.UPDATE) {
					int selectID = Integer.parseInt(table_doctor.getValueAt(table_doctor.getSelectedRow(), 0).toString());
					String selectNumber = table_doctor.getValueAt(table_doctor.getSelectedRow(), 1).toString();
					String selectPass = table_doctor.getValueAt(table_doctor.getSelectedRow(), 2).toString();
					String selectName = table_doctor.getValueAt(table_doctor.getSelectedRow(), 3).toString();
					
					try {
						boolean control = bashekim.updateDoctor(selectID, selectNumber, selectPass, selectName);
						if(control) {
							Helper.showMsg("success");
						}
					} catch (SQLException e1) {
						e1.printStackTrace();
					}
				}
			}
		});
	}
	
	public void updateDoctorModel() throws SQLException {
		DefaultTableModel clearModel = (DefaultTableModel) table_doctor.getModel();
		clearModel.setRowCount(0);
		
		for(int i=0; i < bashekim.getDoctorList().size(); i++) {
			doctorData[0] = bashekim.getDoctorList().get(i).getId();
			doctorData[1] = bashekim.getDoctorList().get(i).getName();
			doctorData[2] = bashekim.getDoctorList().get(i).getNumber();
			doctorData[3] = bashekim.getDoctorList().get(i).getPassword();
			doctorModel.addRow(doctorData);
		}
	}
}
