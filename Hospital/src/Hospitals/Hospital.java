package Hospitals;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import Detail.Detail;
import Doctor.Doctor;
import Login.Login;

import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.print.PrinterException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Hospital extends JFrame {

	private JPanel contentPane;
	private JFrame frame1;
	private static Hospital frame;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_20;
	private JTextField textField_21;
	private JTable table;
	JComboBox comboBox;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					 frame = new Hospital();
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
	public Hospital() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100,1183 ,795);
		contentPane = new JPanel();
		contentPane.setBackground(Color.CYAN);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 1147, 72);
		panel.setBackground(Color.BLUE);
		panel.setForeground(Color.ORANGE);
		panel.setBorder(new LineBorder(Color.BLACK, 3));
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Hospital Management System");
		lblNewLabel.setBackground(Color.ORANGE);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("DejaVu Sans Condensed", Font.ITALIC, 55));
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setBounds(35, 0, 1102, 61);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(777, 85, 380, 536);
		panel_1.setBackground(Color.BLACK);
		panel_1.setForeground(Color.BLACK);
		panel_1.setBorder(new LineBorder(Color.BLACK, 3));
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBounds(10, 11, 360, 514);
		panel_1.add(textArea_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(10, 620, 1147, 65);
		panel_2.setBackground(Color.MAGENTA);
		panel_2.setBorder(new LineBorder(Color.GREEN, 3));
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JButton btnNewButton = new JButton("Update");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model=(DefaultTableModel)table.getModel();
				model.addRow(new Object[] {
					comboBox.getSelectedItem().toString(),textField_1.getText(),textField_2.getText(),textField_3.getText(),textField_4.getText(),textField_5.getText(),textField_6.getText(),
					textField_7.getText()+textField_8.getText()+textField_9.getText(),textField_10.getText(),textField_13.getText()+textField_11.getText(),
					textField_12.getText(),textField_14.getText(),textField_15.getText()+textField_16.getText(),textField_17.getText(),textField_18.getText(),
					textField_19.getText(),textField_20.getText(),textField_21.getText()
				});
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton.setBounds(10, 11, 99, 40);
		panel_2.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Delete");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				DefaultTableModel model=(DefaultTableModel)table.getModel();
				if(table.getSelectedRow()==-1) {
					if(table.getRowCount()==0) {
						JOptionPane.showMessageDialog(null, "No Row Available To Delete", "Hospital Mangemnet System", JOptionPane.OK_OPTION);
					}else {
						JOptionPane.showMessageDialog(null, "Select Row Available To Delete", "Hospital Mangemnet System", JOptionPane.OK_OPTION);

					}
				}else {
					model.removeRow(table.getSelectedRow());
				}
		}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_1.setBounds(119, 11, 99, 40);
		panel_2.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Doctor");
		btnNewButton_2.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
				Doctor doctor=new Doctor();
				doctor.setVisible(true);
			}
	});
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_2.setBounds(228, 11, 99, 40);
		panel_2.add(btnNewButton_2);
	
		JButton btnNewButton_4 = new JButton("Detail");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Detail d=new Detail();
  		d.setVisible(true);
			}
		});
		btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_4.setBounds(348, 11, 105, 40);
		panel_2.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("Reset");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				  textField_1.setText("");
		    	  textField_2.setText("");
		    	  textField_3.setText("");
		    	  textField_4.setText("");
		    	  textField_5.setText("");
		    	  textField_6.setText("");
		    	  textField_7.setText("");
		    	  textField_8.setText("");
		    	  textField_9.setText("");
		    	  textField_10.setText("");
		    	  textField_13.setText("");
		    	  textField_11.setText("");
		    	  textField_12.setText("");
		    	  textField_14.setText("");
		    	  textField_15.setText("");
		    	  textField_16.setText("");
		    	  textField_17.setText("");
		    	  textField_18.setText("");
		    	  textArea_1.setText("");
		    	  comboBox.getModel().setSelectedItem("Make A Selection");

			}
		});
		btnNewButton_5.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_5.setBounds(477, 11, 107, 40);
		panel_2.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("Prescription");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				  
				String qty1=textField_1.getText();
				String qty2=textField_2.getText();
				String qty3=textField_3.getText();
				String qty4=textField_4.getText();
				String qty5=textField_7.getText();
				String qty6=textField_8.getText();
				String qty7=textField_13.getText()+textField_11.getText();
				String qty8=textField_12.getText();
				String qty9=textField_14.getText();
				String qty10=textField_15.getText()+textField_16.getText();
				String qty11=textField_17.getText();
				String qty12=textField_19.getText();
				String qty13=textField_20.getText();
				String qty14=textField_21.getText();
				String qty15="";
				 if(comboBox.getSelectedItem().equals("Synthroid (levothyroxine)")) {
					   qty15="Synthroid (levothyroxine)";
				   }
				 else if(comboBox.getSelectedItem().equals("Crestor (rosuvastatin)")) {
					 qty15="Crestor (rosuvastatin)";
				  }
				 else  if(comboBox.getSelectedItem().equals("Ventolin HFA (albuterol)")) {
					 qty15="Ventolin HFA (albuterol)";
				  }
				 else  if(comboBox.getSelectedItem().equals("Ventolin HFA (albuterol)")) {
					 qty15="Ventolin HFA (albuterol)";
				  }
				
				textArea_1.setText("");
				textArea_1.append("\t\n\tHospital Management System\n"
						+ "\nPatient Name:\t\t"+qty12
						+"\nDate Of Birth:\t\t"+qty13
						+"\nPatient Address:\t"+qty14
						+"\nPrescription:\t\t"+qty15
						+"\n\nRefrence NO.:\t\t"+qty1
						+"\nDose:\t\t"+qty2
						+"\nNo. Of Tablet:\t"+qty3
						+"\nLOT:\t\t"+qty4
						+"\nDaily Dose:\t\t"+qty5
						+"\nPossible Side Effect\t"+qty6
						+"\nFurther Info.:\t"+qty7
						+"\nStrong Advice:\t"+qty8
						+"\nDriving And Using Machine:\t"+qty9
						+"\nHow To Use Mediciene:\t"+qty10
						+"\nPatient ID:\t\t"+qty11
						+"\n\nPatient instruction we have introduced a\n\tfree text information\n\t"
						+"TEXT REMAINDER FOR APPOINTMENT"
						);
				
			}
		});
		btnNewButton_6.setFont(new Font("Tahoma", Font.BOLD, 19));
		btnNewButton_6.setBounds(609, 9, 156, 40);
		panel_2.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("Login");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			//	frame.setVisible(false);
				Login Ilogin=new Login();
				Ilogin.setVisible(true);		}
		});
		btnNewButton_7.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_7.setBounds(787, 11, 105, 40);
		panel_2.add(btnNewButton_7);
	
		JButton btnNewButton_8 = new JButton("Print");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					boolean comp =textArea_1.print();
					if(comp) {
						JOptionPane.showConfirmDialog(null, "Done Printing", "Information", JOptionPane.INFORMATION_MESSAGE);
					}else {
						JOptionPane.showConfirmDialog(null, "Printing not possible or u doesnot want printing", "Information", JOptionPane.ERROR_MESSAGE);

					}
					
				}catch(Exception ex) {
					Logger.getLogger(Hospital.class.getName()).log(Level.SEVERE, null, ex);
				}
			}
		});
		btnNewButton_8.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_8.setBounds(902, 11, 107, 40);
		panel_2.add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("Exit");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame1 =new JFrame();
			if(JOptionPane.showConfirmDialog(frame, "Confirm if U Want To Exit" , "Hospital Management System", JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION) {
                System.exit(0);				
			}
				
			
			}
		});
		btnNewButton_9.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_9.setBounds(1019, 11, 107, 40);
		panel_2.add(btnNewButton_9);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(10, 85, 757, 58);
		panel_3.setBackground(Color.YELLOW);
		panel_3.setBorder(new LineBorder(Color.GREEN, 3));
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Patient Prescription");
		lblNewLabel_1.setBackground(Color.BLACK);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 40));
		lblNewLabel_1.setBounds(10, 0, 737, 58);
		panel_3.add(lblNewLabel_1);
		
		JLabel lblTypeOfMediciene = new JLabel("Name Of Tablets");
		lblTypeOfMediciene.setBounds(10, 156, 154, 27);
		lblTypeOfMediciene.setFont(new Font("Tahoma", Font.BOLD, 18));
		contentPane.add(lblTypeOfMediciene);
		
		 comboBox = new JComboBox();
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
		       if(comboBox.getSelectedItem().equals("Synthroid (levothyroxine)")) {
		    	  textField_1.setText("SYN0555524");
		    	  textField_2.setText("500mg");
		    	  textField_3.setText("30");
		    	  textField_4.setText("56425245");
		    	  textField_5.setText("18/8/2018");
		    	  textField_6.setText("20/8/2020");
		    	  textField_7.setText("2");
		    	  textField_8.setText("Nausea ,Headache");
		    	  textField_9.setText("Pain In The Body");
		    	  textField_10.setText("14");
		    	  textField_13.setText("Not Drink Coffee");
		    	  textField_11.setText("Avoid Soy Product");
		    	  textField_12.setText("Med TakEmpstomach ");
		    	  textField_14.setText("NO");
		    	  textField_15.setText("Use Water Not");
		    	  textField_16.setText("Alcohol/Wine");
		    	  textField_17.setText("Pg20902715");
		    	  textField_18.setText("025208075");

		    	  
			}
		       if(comboBox.getSelectedItem().equals("Synthroid (levothyroxine)")) {
			    	  textField_1.setText("SYN0555524");
			    	  textField_2.setText("500mg");
			    	  textField_3.setText("30");
			    	  textField_4.setText("56425245");
			    	  textField_5.setText("18/8/2018");
			    	  textField_6.setText("20/8/2020");
			    	  textField_7.setText("2");
			    	  textField_8.setText("Nausea ,Headache");
			    	  textField_9.setText("Pain In The Body");
			    	  textField_10.setText("14");
			    	  textField_13.setText("Not Drink Coffee");
			    	  textField_11.setText("Avoid Soy Product");
			    	  textField_12.setText("Med TakEmpstomach ");
			    	  textField_14.setText("NO");
			    	  textField_15.setText("Use Water Not");
			    	  textField_16.setText("Alcohol/Wine");
			    	  textField_17.setText("Pg20902715");
			    	  textField_18.setText("025208075");

			    	  
				}
		       else if(comboBox.getSelectedItem().equals("Crestor (rosuvastatin)")) {
			    	  textField_1.setText("CRE0555784");
			    	  textField_2.setText("1000mg");
			    	  textField_3.setText("35");
			    	  textField_4.setText("69845245");
			    	  textField_5.setText("19/8/2018");
			    	  textField_6.setText("20/8/2022");
			    	  textField_7.setText("3");
			    	  textField_8.setText("Bleeding ,Headache");
			    	  textField_9.setText("Pain In The Body");
			    	  textField_10.setText("17");
			    	  textField_13.setText("Not Drink Pepsi");
			    	  textField_11.setText("Avoid Milk Product");
			    	  textField_12.setText("Med TakEmpstomach ");
			    	  textField_14.setText("NO");
			    	  textField_15.setText("Use Water Not");
			    	  textField_16.setText("Alcohol/Wine");
			    	  textField_17.setText("Sk20892715");
			    	  textField_18.setText("039908075");

			    	  
				}
		       else  if(comboBox.getSelectedItem().equals("Ventolin HFA (albuterol)")) {
			    	  textField_1.setText("BEN0564524");
			    	  textField_2.setText("500mg");
			    	  textField_3.setText("20");
			    	  textField_4.setText("47525245");
			    	  textField_5.setText("15/8/2017");
			    	  textField_6.setText("20/8/2025");
			    	  textField_7.setText("4");
			    	  textField_8.setText("Bp high");
			    	  textField_9.setText("Pain In The Body");
			    	  textField_10.setText("8");
			    	  textField_13.setText("Drink h2o alot");
			    	  textField_11.setText("Avoid Vitamin");
			    	  textField_12.setText("Med Take Food ");
			    	  textField_14.setText("NO");
			    	  textField_15.setText("Use Milk Not");
			    	  textField_16.setText("Alcohol/h2o");
			    	  textField_17.setText("Nk64902715");
			    	  textField_18.setText("078008075");

			    	  
				}
		       else if(comboBox.getSelectedItem().equals("Nexium (esomeprazole)")) {
			    	  textField_1.setText("NEX0555524");
			    	  textField_2.setText("500mg");
			    	  textField_3.setText("30");
			    	  textField_4.setText("45425245");
			    	  textField_5.setText("18/8/2018");
			    	  textField_6.setText("20/8/2020");
			    	  textField_7.setText("3");
			    	  textField_8.setText("Muscle Fatigue");
			    	  textField_9.setText("Pain In The Body");
			    	  textField_10.setText("24");
			    	  textField_13.setText(" Not Eat choc.");
			    	  textField_11.setText("Avoid Salty Product");
			    	  textField_12.setText("Med TakEmpstomach ");
			    	  textField_14.setText("NO");
			    	  textField_15.setText("Use Water+sugar ");
			    	  textField_16.setText("Not Alcohol/Wine");
			    	  textField_17.setText("HM024502715");
			    	  textField_18.setText("0250245075");

			    	  
				}
		       else if(comboBox.getSelectedItem().equals("Make A Selection")) {
			    	  textField_1.setText("");
			    	  textField_2.setText("");
			    	  textField_3.setText("");
			    	  textField_4.setText("");
			    	  textField_5.setText("");
			    	  textField_6.setText("");
			    	  textField_7.setText("");
			    	  textField_8.setText("");
			    	  textField_9.setText("");
			    	  textField_10.setText("");
			    	  textField_13.setText("");
			    	  textField_11.setText("");
			    	  textField_12.setText("");
			    	  textField_14.setText("");
			    	  textField_15.setText("");
			    	  textField_16.setText("");
			    	  textField_17.setText("");
			    	  textField_18.setText("");

			    	  
				}
			}
		});
		comboBox.setBounds(186, 154, 232, 27);
		comboBox.setFont(new Font("Tahoma", Font.BOLD, 18));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Make A Selection", "Synthroid (levothyroxine)", "Crestor (rosuvastatin)", "Ventolin HFA (albuterol)", "Nexium (esomeprazole)"}));
		contentPane.add(comboBox);
		
		JLabel RefrenceNO = new JLabel("Reference No.");
		RefrenceNO.setBounds(10, 194, 154, 27);
		RefrenceNO.setFont(new Font("Tahoma", Font.BOLD, 18));
		contentPane.add(RefrenceNO);
		
		JLabel lblDoseMg = new JLabel("Dose (Mg):");
		lblDoseMg.setBounds(10, 232, 154, 27);
		lblDoseMg.setFont(new Font("Tahoma", Font.BOLD, 18));
		contentPane.add(lblDoseMg);
		
		JLabel lblNumberO = new JLabel("No.Of Tablet");
		lblNumberO.setBounds(10, 270, 154, 27);
		lblNumberO.setFont(new Font("Tahoma", Font.BOLD, 18));
		contentPane.add(lblNumberO);
		
		JLabel lblLot = new JLabel("LOT");
		lblLot.setBounds(10, 327, 154, 27);
		lblLot.setFont(new Font("Tahoma", Font.BOLD, 18));
		contentPane.add(lblLot);
		
		JLabel lblIssuedDate = new JLabel("Issued Date:");
		lblIssuedDate.setBounds(10, 365, 154, 27);
		lblIssuedDate.setFont(new Font("Tahoma", Font.BOLD, 18));
		contentPane.add(lblIssuedDate);
		
		JLabel lblExpDate = new JLabel("Exp Date:");
		lblExpDate.setBounds(10, 403, 154, 27);
		lblExpDate.setFont(new Font("Tahoma", Font.BOLD, 18));
		contentPane.add(lblExpDate);
		
		JLabel lblDailyDose = new JLabel("Daily Dose::");
		lblDailyDose.setBounds(10, 441, 154, 27);
		lblDailyDose.setBackground(Color.CYAN);
		lblDailyDose.setFont(new Font("Tahoma", Font.BOLD, 18));
		contentPane.add(lblDailyDose);
		
		JLabel lblPossibleSideEffect = new JLabel("Possible Side ");
		lblPossibleSideEffect.setBounds(10, 479, 154, 27);
		lblPossibleSideEffect.setFont(new Font("Tahoma", Font.BOLD, 18));
		contentPane.add(lblPossibleSideEffect);
		
		JLabel lblEffect = new JLabel("Effect:");
		lblEffect.setBounds(10, 506, 154, 27);
		lblEffect.setFont(new Font("Tahoma", Font.BOLD, 18));
		contentPane.add(lblEffect);
		
		JLabel lblWardNo = new JLabel("Ward No.");
		lblWardNo.setBounds(10, 564, 154, 27);
		lblWardNo.setFont(new Font("Tahoma", Font.BOLD, 18));
		contentPane.add(lblWardNo);
		
		JLabel lblFurtherInformation = new JLabel("Further ");
		lblFurtherInformation.setBounds(455, 154, 154, 27);
		lblFurtherInformation.setHorizontalAlignment(SwingConstants.LEFT);
		lblFurtherInformation.setFont(new Font("Tahoma", Font.BOLD, 18));
		contentPane.add(lblFurtherInformation);
		
		JLabel lblInformation = new JLabel("Information:");
		lblInformation.setBounds(428, 177, 154, 27);
		lblInformation.setFont(new Font("Tahoma", Font.BOLD, 18));
		contentPane.add(lblInformation);
		
		JLabel lblStrongAdvice = new JLabel("Strong Advice:");
		lblStrongAdvice.setBounds(379, 232, 154, 27);
		lblStrongAdvice.setFont(new Font("Tahoma", Font.BOLD, 18));
		contentPane.add(lblStrongAdvice);
		
		JLabel lblDrivingAndUsing = new JLabel("Driving And Using ");
		lblDrivingAndUsing.setBounds(379, 270, 165, 27);
		lblDrivingAndUsing.setFont(new Font("Tahoma", Font.BOLD, 18));
		contentPane.add(lblDrivingAndUsing);
		
		JLabel lblHowToUse = new JLabel("How To Use ");
		lblHowToUse.setBounds(379, 327, 154, 27);
		lblHowToUse.setFont(new Font("Tahoma", Font.BOLD, 18));
		contentPane.add(lblHowToUse);
		
		JLabel lblMedicine = new JLabel("Medicine:");
		lblMedicine.setBounds(379, 352, 154, 27);
		lblMedicine.setFont(new Font("Tahoma", Font.BOLD, 18));
		contentPane.add(lblMedicine);
		
		JLabel lblPatientId = new JLabel("Patient ID:");
		lblPatientId.setBounds(379, 403, 154, 27);
		lblPatientId.setFont(new Font("Tahoma", Font.BOLD, 18));
		contentPane.add(lblPatientId);
		
		JLabel lblNhsNo = new JLabel("NHS Number:");
		lblNhsNo.setBounds(379, 441, 154, 27);
		lblNhsNo.setFont(new Font("Tahoma", Font.BOLD, 18));
		contentPane.add(lblNhsNo);
		
		JLabel lblPatientName = new JLabel("Patient Name:");
		lblPatientName.setBounds(379, 479, 154, 27);
		lblPatientName.setFont(new Font("Tahoma", Font.BOLD, 18));
		contentPane.add(lblPatientName);
		
		JLabel lblDateOfBirth = new JLabel("Date Of Birth:");
		lblDateOfBirth.setBounds(379, 526, 154, 27);
		lblDateOfBirth.setFont(new Font("Tahoma", Font.BOLD, 18));
		contentPane.add(lblDateOfBirth);
		
		JLabel lblPatientAddress = new JLabel("Patient Address:");
		lblPatientAddress.setBounds(379, 564, 154, 27);
		lblPatientAddress.setFont(new Font("Tahoma", Font.BOLD, 18));
		contentPane.add(lblPatientAddress);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		textField_1.setBounds(186, 194, 183, 27);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		textField_2.setBounds(186, 232, 183, 27);
		textField_2.setColumns(10);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Tahoma", Font.BOLD, 16));
		textField_3.setBounds(186, 270, 183, 27);
		textField_3.setColumns(10);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Tahoma", Font.BOLD, 16));
		textField_4.setBounds(186, 327, 183, 27);
		textField_4.setColumns(10);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Tahoma", Font.BOLD, 16));
		textField_5.setBounds(186, 371, 183, 27);
		textField_5.setColumns(10);
		contentPane.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setFont(new Font("Tahoma", Font.BOLD, 16));
		textField_6.setBounds(186, 409, 183, 27);
		textField_6.setColumns(10);
		contentPane.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setFont(new Font("Tahoma", Font.BOLD, 16));
		textField_7.setBounds(186, 447, 183, 27);
		textField_7.setColumns(10);
		contentPane.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setFont(new Font("Tahoma", Font.BOLD, 16));
		textField_8.setBounds(186, 485, 183, 27);
		textField_8.setColumns(10);
		contentPane.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setFont(new Font("Tahoma", Font.BOLD, 16));
		textField_9.setBounds(186, 526, 183, 27);
		textField_9.setColumns(10);
		contentPane.add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setFont(new Font("Tahoma", Font.BOLD, 16));
		textField_10.setBounds(186, 564, 183, 27);
		textField_10.setColumns(10);
		contentPane.add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setFont(new Font("Tahoma", Font.BOLD, 16));
		textField_11.setBounds(561, 197, 183, 27);
		textField_11.setColumns(10);
		contentPane.add(textField_11);
		
		textField_12 = new JTextField();
		textField_12.setFont(new Font("Tahoma", Font.BOLD, 16));
		textField_12.setBounds(561, 235, 183, 27);
		textField_12.setColumns(10);
		contentPane.add(textField_12);
		
		textField_13 = new JTextField();
		textField_13.setFont(new Font("Tahoma", Font.BOLD, 16));
		textField_13.setBounds(561, 154, 183, 27);
		textField_13.setColumns(10);
		contentPane.add(textField_13);
		
		textField_14 = new JTextField();
		textField_14.setFont(new Font("Tahoma", Font.BOLD, 16));
		textField_14.setBounds(561, 276, 183, 27);
		textField_14.setColumns(10);
		contentPane.add(textField_14);
		
		textField_15 = new JTextField();
		textField_15.setFont(new Font("Tahoma", Font.BOLD, 16));
		textField_15.setBounds(561, 327, 183, 27);
		textField_15.setColumns(10);
		contentPane.add(textField_15);
		
		textField_16 = new JTextField();
		textField_16.setFont(new Font("Tahoma", Font.BOLD, 16));
		textField_16.setBounds(561, 368, 183, 27);
		textField_16.setColumns(10);
		contentPane.add(textField_16);
		
		textField_17 = new JTextField();
		textField_17.setFont(new Font("Tahoma", Font.BOLD, 16));
		textField_17.setBounds(561, 406, 183, 27);
		textField_17.setColumns(10);
		contentPane.add(textField_17);
		
		textField_18 = new JTextField();
		textField_18.setFont(new Font("Tahoma", Font.BOLD, 16));
		textField_18.setBounds(561, 444, 183, 27);
		textField_18.setColumns(10);
		contentPane.add(textField_18);
		
		textField_19 = new JTextField();
		textField_19.setFont(new Font("Tahoma", Font.BOLD, 16));
		textField_19.setBounds(561, 479, 183, 27);
		textField_19.setColumns(10);
		contentPane.add(textField_19);
		
		textField_20 = new JTextField();
		textField_20.setFont(new Font("Tahoma", Font.BOLD, 16));
		textField_20.setBounds(561, 529, 183, 27);
		textField_20.setColumns(10);
		contentPane.add(textField_20);
		
		textField_21 = new JTextField();
		textField_21.setFont(new Font("Tahoma", Font.BOLD, 16));
		textField_21.setBounds(561, 564, 183, 27);
		textField_21.setColumns(10);
		contentPane.add(textField_21);
		
		JLabel lblMachine = new JLabel("Machine:");
		lblMachine.setBounds(379, 293, 154, 27);
		lblMachine.setFont(new Font("Tahoma", Font.BOLD, 18));
		contentPane.add(lblMachine);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 696, 1147, 42);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setFont(new Font("Tahoma", Font.BOLD, 10));
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Name Of Tablets", "Refrence No.", "Dose(Mg)", "No. Of Tablet", "LOT", "Issued Data", "Exp Data", "Daily Dose", "Possible Side Effect", "Ward No.", "Further Information", "Strong Advice", "Driving and Using Machine", "How To Use Medicine", "Patient ID", "NHS number", "Patient Name", "Patient Address", "Date Of Birth"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(93);
		table.setBorder(new LineBorder(Color.ORANGE, 2));
	}
}
