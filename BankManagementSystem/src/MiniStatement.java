package bankManagement.com;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MiniStatement extends JFrame implements ActionListener{

	public MiniStatement(String pinnumber) {
		
		setTitle("Mini Statement");
		
		setLayout(null);
		
		JLabel mini =new JLabel();
		add(mini);
		
		JLabel bank =new JLabel("BHARAT BANK");
		bank.setBounds(150, 20, 100, 20);
		add(bank);
		
		JLabel card =new JLabel();
		card.setBounds(20, 80, 300, 20);
		add(card);
		
		JLabel balance=new JLabel();
		balance.setBounds(20, 400, 300, 20);
		add(balance);
		
		try {
			Conn conn=new Conn();
			ResultSet rs = conn.s.executeQuery("select * from loginn where pin = '"+pinnumber+"'");
			while(rs.next()) {
				card.setText("Card Number: " + rs.getString("cardnumber").substring(0,4)+ "XXXXXXXX" + rs.getString("cardnumber").substring(12));
				
			}
		} catch (Exception ee5) {
			System.out.println(ee5);
		}
		
		try {
			Conn con=new Conn();
			int bal=0;
			ResultSet rs1=con.s.executeQuery("select * from bank where pin = '"+pinnumber+"' ");
			while(rs1.next()) {
				mini.setText(mini.getText() + "<html>"+rs1.getString("date") + "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" + rs1.getString("type") + "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" + rs1.getString("amount")+ "<br><br><html>");
				if(rs1.getString("type").equals("Deposit")) {
					bal +=Integer.parseInt(rs1.getString("amount"));
				}else {
					bal -=Integer.parseInt(rs1.getString("amount"));
				}
			}
			balance.setText("Your Current Account Balance is Rs " + bal);
			
		} catch (Exception ee6) {
			System.out.println(ee6);
		}
		
		mini.setBounds(20, 140, 400, 200);
		
		
		setSize(400, 600);
		setLocation(20, 20);
		getContentPane().setBackground(Color.WHITE);
		setVisible(true);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent ae) {
		
	}
	
	public static void main(String[] args) {
		new MiniStatement("");
	}
}
