package billingSystem;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JCheckBox;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class BillingSystem extends JFrame {

	private JPanel contentPane;
	private JTextField jtxtcustomer;
	private JTextField jtxtfirstname;
	private JTextField jtxtlastname;
	private JTextField jtxtaddress;
	private JTextField jtxtpostcode;
	private JTextField jtxtmobile;
	private JTextField jtxtemail;
	private JTextField jtxtcam_1;
	private JTextField jtxtcam_2;
	private JTextField jtxtmic_1;
	private JTextField jtxtmic_2;
	private JTextField jtxtmic_3;
	private JTextField jtxtmic_4;
	private JTextField jtxtmoniter;
	private JTextField jtxtlight;
	private JTextField jtxtheadset;
	private JTextField jtxtmouse;
	private JTextField jtxtkeyboard;
	private JTextField jtxttax;
	private JTextField jtxtsubtotal;
	private JTextField jtxttotal;
	private JFrame frame;
	String iTax, iSubtotal, iTotal;
	//array itemcost is used to store the cost of items choosen and final index has sum of costs present in all indexes
	double []itemcost = new double[12];
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BillingSystem frame = new BillingSystem();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	//Here we are generating auto reference number near customer reference
	public BillingSystem() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowActivated(WindowEvent e) {
				jtxtcustomer.setText(null);
				jtxtcustomer.setEnabled(false);
				int ref = 10000 +(int)(Math.random()*10000);
				String cref = "";
				cref += ref+ 10000;
				jtxtcustomer.setText(cref);
			}
		});
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1600, 900);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));		
		setContentPane(contentPane);
		contentPane.setLayout(null);
		//here we are creating an instance of imageicon to insert the backgorund
		ImageIcon img = new ImageIcon(this.getClass().getResource("/3.jpg"));
		
		JPanel panel = new JPanel();
		panel.setBounds(34, 142, 388, 369);
		contentPane.add(panel);
		
		jtxtcustomer = new JTextField();
		jtxtcustomer.setBounds(193, 26, 146, 28);
		jtxtcustomer.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		jtxtcustomer.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Customer Ref");
		lblNewLabel_1.setBounds(43, 29, 113, 22);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		
		JLabel lblNewLabel_1_1 = new JLabel("First Name");
		lblNewLabel_1_1.setBounds(43, 75, 113, 22);
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		
		jtxtfirstname = new JTextField();
		jtxtfirstname.setBounds(193, 72, 146, 28);
		jtxtfirstname.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		jtxtfirstname.setColumns(10);
		
		JLabel lblNewLabel_1_2 = new JLabel("Last Name");
		lblNewLabel_1_2.setBounds(43, 121, 113, 22);
		lblNewLabel_1_2.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		
		jtxtlastname = new JTextField();
		jtxtlastname.setBounds(193, 118, 146, 28);
		jtxtlastname.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		jtxtlastname.setColumns(10);
		
		JLabel lblNewLabel_1_3 = new JLabel("Address");
		lblNewLabel_1_3.setBounds(43, 167, 113, 22);
		lblNewLabel_1_3.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		
		jtxtaddress = new JTextField();
		jtxtaddress.setBounds(193, 164, 146, 28);
		jtxtaddress.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		jtxtaddress.setColumns(10);
		
		JLabel lblNewLabel_1_4 = new JLabel("Postcode");
		lblNewLabel_1_4.setBounds(43, 213, 113, 22);
		lblNewLabel_1_4.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		
		jtxtpostcode = new JTextField();
		jtxtpostcode.setBounds(193, 210, 146, 28);
		jtxtpostcode.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		jtxtpostcode.setColumns(10);
		
		JLabel lblNewLabel_1_5 = new JLabel("Mobile number");
		lblNewLabel_1_5.setBounds(43, 259, 113, 22);
		lblNewLabel_1_5.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		
		jtxtmobile = new JTextField();
		jtxtmobile.setBounds(193, 256, 146, 28);
		jtxtmobile.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		jtxtmobile.setColumns(10);
		
		JLabel lblNewLabel_1_6 = new JLabel("Email ID");
		lblNewLabel_1_6.setBounds(43, 305, 113, 22);
		lblNewLabel_1_6.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		
		jtxtemail = new JTextField();
		jtxtemail.setBounds(193, 302, 146, 28);
		jtxtemail.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		jtxtemail.setColumns(10);
		panel.setLayout(null);
		panel.add(lblNewLabel_1_3);
		panel.add(jtxtaddress);
		panel.add(lblNewLabel_1);
		panel.add(jtxtcustomer);
		panel.add(lblNewLabel_1_2);
		panel.add(jtxtlastname);
		panel.add(lblNewLabel_1_1);
		panel.add(jtxtfirstname);
		panel.add(lblNewLabel_1_5);
		panel.add(jtxtmobile);
		panel.add(lblNewLabel_1_4);
		panel.add(jtxtpostcode);
		panel.add(lblNewLabel_1_6);
		panel.add(jtxtemail);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(565, 142, 452, 662);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		//here we are using if else conditions to use textfield whenever checkbox is selected
		JCheckBox cbcam_1 = new JCheckBox("Logitech C922 Pro stream web cam");
		cbcam_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cbcam_1.isSelected()) {
					jtxtcam_1.setEnabled(true);
					jtxtcam_1.setText("");
					jtxtcam_1.requestFocus();
				}
				else {
					jtxtcam_1.setEnabled(false);
					jtxtcam_1.setText("0");					
				}
			}
		});
		cbcam_1.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		cbcam_1.setBounds(33, 30, 292, 25);
		panel_1.add(cbcam_1);
		
		jtxtcam_1 = new JTextField();
		jtxtcam_1.setHorizontalAlignment(SwingConstants.CENTER);
		jtxtcam_1.setText("0");
		jtxtcam_1.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		jtxtcam_1.setBounds(348, 30, 57, 22);
		panel_1.add(jtxtcam_1);
		jtxtcam_1.setColumns(10);
		
		jtxtcam_2 = new JTextField();
		jtxtcam_2.setHorizontalAlignment(SwingConstants.CENTER);
		jtxtcam_2.setText("0");
		jtxtcam_2.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		jtxtcam_2.setColumns(10);
		jtxtcam_2.setBounds(348, 72, 57, 22);
		panel_1.add(jtxtcam_2);
		
		JCheckBox cbcam_2 = new JCheckBox("Canon EOSR Mirrorless Camera");
		cbcam_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cbcam_2.isSelected()) {
					jtxtcam_2.setEnabled(true);
					jtxtcam_2.setText("");
					jtxtcam_2.requestFocus();
				}
				else {
					jtxtcam_2.setEnabled(false);
					jtxtcam_2.setText("0");					
				}
			}
		});
		cbcam_2.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		cbcam_2.setBounds(33, 72, 292, 25);
		panel_1.add(cbcam_2);
		
		jtxtmic_1 = new JTextField();
		jtxtmic_1.setHorizontalAlignment(SwingConstants.CENTER);
		jtxtmic_1.setText("0");
		jtxtmic_1.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		jtxtmic_1.setColumns(10);
		jtxtmic_1.setBounds(348, 115, 57, 22);
		panel_1.add(jtxtmic_1);
		
		JCheckBox cbmic_1 = new JCheckBox("Snowball ICE USB MIC");
		cbmic_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cbmic_1.isSelected()) {
					jtxtmic_1.setEnabled(true);
					jtxtmic_1.setText("");
					jtxtmic_1.requestFocus();
				}
				else {
					jtxtmic_1.setEnabled(false);
					jtxtmic_1.setText("0");					
				}
			}
		});
		cbmic_1.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		cbmic_1.setBounds(33, 115, 292, 25);
		panel_1.add(cbmic_1);
		
		JCheckBox cbmic_4 = new JCheckBox("Shure SM7B Dynamic vocal MIC");
		cbmic_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cbmic_4.isSelected()) {
					jtxtmic_4.setEnabled(true);
					jtxtmic_4.setText("");
					jtxtmic_4.requestFocus();
				}
				else {
					jtxtmic_4.setEnabled(false);
					jtxtmic_4.setText("0");					
				}

			}
		});
		cbmic_4.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		cbmic_4.setBounds(33, 244, 292, 25);
		panel_1.add(cbmic_4);
		
		JCheckBox cbmic_3 = new JCheckBox("Elgato wave MIC");
		cbmic_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cbmic_3.isSelected()) {
					jtxtmic_3.setEnabled(true);
					jtxtmic_3.setText("");
					jtxtmic_3.requestFocus();
				}
				else {
					jtxtmic_3.setEnabled(false);
					jtxtmic_3.setText("0");					
				}

			}
		});
		cbmic_3.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		cbmic_3.setBounds(33, 201, 292, 25);
		panel_1.add(cbmic_3);
		
		JCheckBox cbmic_2 = new JCheckBox("Blue Yetti USB MIC");
		cbmic_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cbmic_2.isSelected()) {
					jtxtmic_2.setEnabled(true);
					jtxtmic_2.setText("");
					jtxtmic_2.requestFocus();
				}
				else {
					jtxtmic_2.setEnabled(false);
					jtxtmic_2.setText("0");					
				}

			}
		});
		cbmic_2.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		cbmic_2.setBounds(33, 159, 292, 25);
		panel_1.add(cbmic_2);
		
		jtxtmic_2 = new JTextField();
		jtxtmic_2.setHorizontalAlignment(SwingConstants.CENTER);
		jtxtmic_2.setText("0");
		jtxtmic_2.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		jtxtmic_2.setColumns(10);
		jtxtmic_2.setBounds(348, 159, 57, 22);
		panel_1.add(jtxtmic_2);
		
		jtxtmic_3 = new JTextField();
		jtxtmic_3.setHorizontalAlignment(SwingConstants.CENTER);
		jtxtmic_3.setText("0");
		jtxtmic_3.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		jtxtmic_3.setColumns(10);
		jtxtmic_3.setBounds(348, 201, 57, 22);
		panel_1.add(jtxtmic_3);
		
		jtxtmic_4 = new JTextField();
		jtxtmic_4.setHorizontalAlignment(SwingConstants.CENTER);
		jtxtmic_4.setText("0");
		jtxtmic_4.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		jtxtmic_4.setColumns(10);
		jtxtmic_4.setBounds(348, 244, 57, 22);
		panel_1.add(jtxtmic_4);
		
		JCheckBox cbheadset = new JCheckBox("Corsair HS50 Headset");
		cbheadset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cbheadset.isSelected()) {
					jtxtheadset.setEnabled(true);
					jtxtheadset.setText("");
					jtxtheadset.requestFocus();
				}
				else {
					jtxtheadset.setEnabled(false);
					jtxtheadset.setText("0");					
				}
			}
		});
		cbheadset.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		cbheadset.setBounds(33, 377, 292, 25);
		panel_1.add(cbheadset);
		
		JCheckBox cblight = new JCheckBox("Key light");
		cblight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cblight.isSelected()) {
					jtxtlight.setEnabled(true);
					jtxtlight.setText("");
					jtxtlight.requestFocus();
				}
				else {
					jtxtlight.setEnabled(false);
					jtxtlight.setText("0");					
				}

			}
		});
		cblight.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		cblight.setBounds(33, 334, 292, 25);
		panel_1.add(cblight);
		
		JCheckBox cbmoniter = new JCheckBox("Asus 144hz, 1080 P Moniter");
		cbmoniter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cbmoniter.isSelected()) {
					jtxtmoniter.setEnabled(true);
					jtxtmoniter.setText("");
					jtxtmoniter.requestFocus();
				}
				else {
					jtxtmoniter.setEnabled(false);
					jtxtmoniter.setText("0");					
				}
			}
		});
		cbmoniter.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		cbmoniter.setBounds(33, 292, 292, 25);
		panel_1.add(cbmoniter);
		//jtxtmoniter will store data of quantity of moniters
		jtxtmoniter = new JTextField();
		jtxtmoniter.setHorizontalAlignment(SwingConstants.CENTER);
		jtxtmoniter.setText("0");
		jtxtmoniter.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		jtxtmoniter.setColumns(10);
		jtxtmoniter.setBounds(348, 292, 57, 22);
		panel_1.add(jtxtmoniter);
		//jtxtlight will store data of quantity of key lights
		jtxtlight = new JTextField();
		jtxtlight.setHorizontalAlignment(SwingConstants.CENTER);
		jtxtlight.setText("0");
		jtxtlight.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		jtxtlight.setColumns(10);
		jtxtlight.setBounds(348, 334, 57, 22);
		panel_1.add(jtxtlight);
		////jtxtheadset will store data of quantity of headsets
		jtxtheadset = new JTextField();
		jtxtheadset.setHorizontalAlignment(SwingConstants.CENTER);
		jtxtheadset.setText("0");
		jtxtheadset.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		jtxtheadset.setColumns(10);
		jtxtheadset.setBounds(348, 377, 57, 22);
		panel_1.add(jtxtheadset);
		
		JCheckBox cbkeyboard = new JCheckBox("Roccat Vulcan Keyboard");
		cbkeyboard.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cbkeyboard.isSelected()) {
					jtxtkeyboard.setEnabled(true);
					jtxtkeyboard.setText("");
					jtxtkeyboard.requestFocus();
				}
				else {
					jtxtkeyboard.setEnabled(false);
					jtxtkeyboard.setText("0");					
				}
			}
		});
		cbkeyboard.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		cbkeyboard.setBounds(33, 466, 292, 25);
		panel_1.add(cbkeyboard);
		
		JCheckBox cbmouse = new JCheckBox("Logictech G304 Mouse");
		cbmouse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cbmouse.isSelected()) {
					jtxtmouse.setEnabled(true);
					jtxtmouse.setText("");
					jtxtmouse.requestFocus();
				}
				else {
					jtxtmouse.setEnabled(false);
					jtxtmouse.setText("0");					
				}
			}
		});
		cbmouse.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		cbmouse.setBounds(33, 423, 292, 25);
		panel_1.add(cbmouse);
		//jtxtmouse will store data of quantity of mouses
		jtxtmouse = new JTextField();
		jtxtmouse.setHorizontalAlignment(SwingConstants.CENTER);
		jtxtmouse.setText("0");
		jtxtmouse.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		jtxtmouse.setColumns(10);
		jtxtmouse.setBounds(348, 423, 57, 22);
		panel_1.add(jtxtmouse);
		//jtxtkeyboard will store data of quantity of keyboard
		jtxtkeyboard = new JTextField();
		jtxtkeyboard.setHorizontalAlignment(SwingConstants.CENTER);
		jtxtkeyboard.setText("0");
		jtxtkeyboard.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		jtxtkeyboard.setColumns(10);
		jtxtkeyboard.setBounds(348, 466, 57, 22);
		panel_1.add(jtxtkeyboard);
		
		JLabel lblNewLabel_2 = new JLabel("Tax");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblNewLabel_2.setBounds(74, 540, 103, 16);
		panel_1.add(lblNewLabel_2);
		//jtxttax will display the tax of all items
		jtxttax = new JTextField();
		jtxttax.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		jtxttax.setColumns(10);
		jtxttax.setBounds(209, 537, 196, 22);
		panel_1.add(jtxttax);
		
		JLabel lblNewLabel_2_1 = new JLabel("Sub Total");
		lblNewLabel_2_1.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblNewLabel_2_1.setBounds(74, 572, 103, 16);
		panel_1.add(lblNewLabel_2_1);
		//jtxtsubtotal displays cost without tax
		jtxtsubtotal = new JTextField();
		jtxtsubtotal.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		jtxtsubtotal.setColumns(10);
		jtxtsubtotal.setBounds(209, 569, 196, 22);
		panel_1.add(jtxtsubtotal);
		
		JLabel lblNewLabel_2_2 = new JLabel("Total");
		lblNewLabel_2_2.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblNewLabel_2_2.setBounds(74, 604, 103, 16);
		panel_1.add(lblNewLabel_2_2);
		//jtxttotal displays total cost
		jtxttotal = new JTextField();
		jtxttotal.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		jtxttotal.setColumns(10);
		jtxttotal.setBounds(209, 601, 196, 22);
		panel_1.add(jtxttotal);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(1168, 142, 352, 460);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		//jtxtreceipt displays the bill
		JTextArea jtxtreceipt = new JTextArea();
		jtxtreceipt.setBounds(0, 0, 352, 460);
		panel_2.add(jtxtreceipt);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(34, 642, 388, 162);
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		//Here we are creating total button and adding the event which should be done when we click total button
		JButton btnTotal = new JButton("Total");
		btnTotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				itemcost[0]= Double.parseDouble(jtxtcam_1.getText())*8499;
				itemcost[1]= Double.parseDouble(jtxtcam_2.getText())*44784;
				itemcost[2]= Double.parseDouble(jtxtmic_1.getText())*4195;
				itemcost[3]= Double.parseDouble(jtxtmic_2.getText())*10995;
				itemcost[4]= Double.parseDouble(jtxtmic_3.getText())*15999;
				itemcost[5]= Double.parseDouble(jtxtmic_4.getText())*40518;
				itemcost[6]= Double.parseDouble(jtxtmoniter.getText())*30499;
				itemcost[7]= Double.parseDouble(jtxtlight.getText())*15228;
				itemcost[8]= Double.parseDouble(jtxtheadset.getText())*4299;
				itemcost[9]= Double.parseDouble(jtxtmouse.getText())*2495;
				itemcost[10]= Double.parseDouble(jtxtkeyboard.getText())*13794;
				itemcost[11]=itemcost[0]+itemcost[1]+itemcost[2]+itemcost[3]+itemcost[4]+itemcost[5]+itemcost[6]+itemcost[7]+itemcost[8]+itemcost[9]+itemcost[10];
				iTax =String.format("Rs. %.2f", itemcost[11]/100);
				iSubtotal =String.format("Rs. %.2f", itemcost[11]);
				iTotal =String.format("Rs. %.2f", itemcost[11] + (itemcost[11]/100));
				jtxttax.setText(iTax);
				jtxtsubtotal.setText(iSubtotal);
				jtxttotal.setText(iTotal);
				
				jtxtreceipt.setEnabled(true);
				int refs = 1234 +(int)(Math.random()*5000);
				Calendar timer = Calendar.getInstance();
				timer.getTime();
				SimpleDateFormat tTime = new SimpleDateFormat("HH:mm:ss");
				SimpleDateFormat tdate = new SimpleDateFormat("dd-mm-yyyy");
				tdate.format(timer.getTime());
				jtxtreceipt.append("\t\tBill\n" +
				"Refference:\t\t\t" + refs +
				"\n==================================================\t"+
				"\n==================================================\t"+
				"\nCustomer Ref:\t\t\t"+ jtxtcustomer.getText() +
				"\nFirst Name:\t\t\t"+ jtxtfirstname.getText() +
				"\nLast Name:\t\t\t"+ jtxtlastname.getText() +
				"\nlogitech webcam:\t\t"+ jtxtcam_1.getText() +
				"\nCanon camera:\t\t\t"+ jtxtcam_2.getText() +
				"\nSnowball MIC:\t\t\t"+ jtxtmic_1.getText() +
				"\nBlue Yeti MIC:\t\t\t"+ jtxtmic_2.getText() +
				"\nElgato MIC:\t\t\t"+ jtxtmic_3.getText() +
				"\nShure SM7B MIC:\t\t"+ jtxtmic_4.getText() +
				"\nASUS Moniter:\t\t\t"+ jtxtmoniter.getText() +
				"\nKey Light:\t\t\t"+ jtxtlight.getText() +
				"\nCorsair Headset:\t\t"+ jtxtheadset.getText() +
				"\nLogitech mouse:\t\t"+ jtxtmouse.getText() +
				"\n roccat Keyboard:\t\t"+ jtxtkeyboard.getText() +
				"\n==================================================\t"+
				"\nTax:\t\t\t"+ iTax+
				"\nSub Total:\t\t\t"+ iSubtotal+
				"\nTotal:\t\t\t"+ iTotal+
				"\n==================================================\t"+
				"\nDate: "+ tdate.format(timer.getTime()) +
				"\t\tTime: "+ tTime.format(timer.getTime()) +
				"\n\nThank you for shopping\n");
				
				
				
				
			}
		});
		btnTotal.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btnTotal.setBounds(34, 37, 140, 81);
		panel_3.add(btnTotal);
		//here we are using setText() and setEnabled() method to reset the data
		JButton btnReset = new JButton("Reset");
		btnReset.setBounds(212, 37, 140, 81);
		panel_3.add(btnReset);
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jtxtreceipt.setText(null);
				jtxtcustomer.setText(null);
				jtxtcustomer.setEnabled(false);
				int ref = 10000 +(int)(Math.random()*10000);
				String cref = "";
				cref += ref+ 10000;
				jtxtcustomer.setText(cref);
				jtxtfirstname.setText("");
				jtxtlastname.setText("");
				jtxtaddress.setText("");
				jtxtpostcode.setText("");
				jtxtmobile.setText("");
				jtxtemail.setText("");
				
				jtxtcam_1.setEnabled(false);
				jtxtcam_2.setEnabled(false);
				jtxtmic_1.setEnabled(false);
				jtxtmic_2.setEnabled(false);
				jtxtmic_3.setEnabled(false);
				jtxtmic_4.setEnabled(false);
				jtxtmoniter.setEnabled(false);
				jtxtlight.setEnabled(false);
				jtxtheadset.setEnabled(false);
				jtxtmouse.setEnabled(false);
				jtxtkeyboard.setEnabled(false);
				
				jtxtcam_1.setText("0");
				jtxtcam_2.setText("0");
				jtxtmic_1.setText("0");
				jtxtmic_2.setText("0");
				jtxtmic_3.setText("0");
				jtxtmic_4.setText("0");
				jtxtmoniter.setText("0");
				jtxtlight.setText("0");
				jtxtheadset.setText("0");
				jtxtmouse.setText("0");
				jtxtkeyboard.setText("0");
				
				cbcam_1.setSelected(false);
				cbcam_2.setSelected(false);
				cbmic_1.setSelected(false);
				cbmic_2.setSelected(false);
				cbmic_3.setSelected(false);
				cbmic_4.setSelected(false);
				cbmoniter.setSelected(false);
				cblight.setSelected(false);
				cbheadset.setSelected(false);
				cbmouse.setSelected(false);
				cbkeyboard.setSelected(false);				
			}
		});
		btnReset.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		
		JPanel panel_3_1 = new JPanel();
		panel_3_1.setBounds(1168, 629, 352, 175);
		contentPane.add(panel_3_1);
		panel_3_1.setLayout(null);
		//Here we are creating exit button and adding the event which should be done when we press exit 
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame = new JFrame();
				if(JOptionPane.showConfirmDialog(frame,"Confirm if you want to Exit","Billing System",
				JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
		});
		btnExit.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btnExit.setBounds(189, 46, 140, 81);
		panel_3_1.add(btnExit);
		//Here we are creating print button and adding the event which should be done when we press print
		JButton btnNewButton = new JButton("Print");
		btnNewButton.setBounds(23, 46, 140, 81);
		panel_3_1.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					jtxtreceipt.print();
				}
				catch(java.awt.print.PrinterException e1) {
					System.err.format("NO Printer found",e1.getMessage());
				}
			
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(0, 0, 1980, 1080);
		contentPane.add(lblNewLabel);
		lblNewLabel.setIcon(img);
			
	}
}
