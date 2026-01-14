package AirlineReservationSystem;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Login  extends JFrame implements ActionListener{
	JButton submit,reset,cancel;
	JTextField tfuser;
	JPasswordField tfpass;
	public Login() {
	
		getContentPane().setBackground(Color.WHITE);
		setLayout(null);
		
		JLabel lblusername=new JLabel("Username");
		lblusername.setBounds(20,20,100,30);
		add(lblusername);
		 tfuser=new JTextField();
		tfuser.setBounds(100,20,150,20);
		add(tfuser);
		
		JLabel lblpassword =new JLabel("Password");
		lblpassword.setBounds(20,60,100,40);
		add(lblpassword);
		tfpass=new JPasswordField();
		tfpass.setBounds(100,70,150,20);
		add(tfpass);
		
		reset=new JButton("Reset");
		reset.setBounds(30,130,100,20);
		reset.addActionListener(this);
		add(reset);
		
		cancel= new JButton("Cancel");
		cancel.setBounds(250,130,100,20);
		cancel.addActionListener(this);
		add(cancel);
		
		submit=new JButton("Submit");
		submit.setBounds(140,180,100,20);
		submit.addActionListener(this);
		add(submit);
		
		setSize(400,300);
		setLocation(700,250);
		setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent ae) {
		// TODO Auto-generated method stub
		if(ae.getSource()==submit) {
			
		}else if(ae.getSource()==reset) {
			tfuser.setText("");
			tfpass.setText("");
		}else if(ae.getSource()==cancel) {
			setVisible(false);
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
new Login();
	}
	

}
