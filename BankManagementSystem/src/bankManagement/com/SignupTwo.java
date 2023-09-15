package bankManagement.com;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;



public class SignupTwo extends JFrame implements ActionListener{

	long random;
	JTextField religionTextField, CategoryTextField, incomeTextField, educationalTextField, qualificationTextField, panNumberTextField, aadharNumberTextField, exisitingAccTextField, seniorcitizenTextField;
	JButton next;
	JRadioButton employye, unemployee, others;
	String formno;
	
	public SignupTwo(String formno) {

		this.formno= formno;
		
		setLayout(null);
		
		setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");
		
		
		JLabel additionalDetails = new JLabel("Page 2: Additional Details");
		additionalDetails.setFont(new Font("raleway", Font.BOLD, 22));
		additionalDetails.setBounds(290, 80, 400, 30);
		add(additionalDetails);
		
		JLabel religion = new JLabel("Religion:");
		religion.setFont(new Font("raleway", Font.BOLD, 20));
		religion.setBounds(100, 140, 100, 30);
		add(religion);
	
		religionTextField =new JTextField();
		religionTextField.setFont(new Font("Raleway",Font.BOLD, 14));
		religionTextField.setBounds(300, 140,400, 30);
	    add(religionTextField);
		
		
		JLabel Category = new JLabel("Category:");
		Category.setFont(new Font("raleway", Font.BOLD, 20));
		Category.setBounds(100, 190, 200, 30);
		add(Category);
		
		CategoryTextField =new JTextField();
		CategoryTextField.setFont(new Font("Raleway",Font.BOLD, 14));
		CategoryTextField.setBounds(300, 190,400, 30);
		add(CategoryTextField);
		
		JLabel income = new JLabel("Income:");
		income.setFont(new Font("raleway", Font.BOLD, 20));
		income.setBounds(100, 240, 200, 30);
		add(income);
		
		incomeTextField =new JTextField();
		incomeTextField.setFont(new Font("Raleway",Font.BOLD, 14));
		incomeTextField.setBounds(300, 240,400, 30);
		add(incomeTextField);
		 
		
		JLabel educational = new JLabel("Educational:");
		educational.setFont(new Font("raleway", Font.BOLD, 20));
		educational.setBounds(100, 290, 200, 30);
		add(educational);
		
		educationalTextField =new JTextField();
		educationalTextField.setFont(new Font("Raleway",Font.BOLD, 14));
		educationalTextField.setBounds(300, 290,400, 30);
		add(educationalTextField); 
		
		JLabel qualification = new JLabel("Qualification:");
		qualification.setFont(new Font("raleway", Font.BOLD, 20));
		qualification.setBounds(100, 340, 200, 30);
		add(qualification);
		
		qualificationTextField =new JTextField();
		qualificationTextField.setFont(new Font("Raleway",Font.BOLD, 14));
		qualificationTextField.setBounds(300, 340,400, 30);
		add(qualificationTextField);
		
		JLabel occupation = new JLabel("Occupation:");
		occupation.setFont(new Font("raleway", Font.BOLD, 20));
		occupation.setBounds(100, 390, 200, 30);
		add(occupation);
		
		 employye =new JRadioButton("Employee");
		 employye.setBounds(300, 390, 100, 30);
		 employye.setBackground(Color.WHITE);
		add(employye);
		
		 unemployee =new JRadioButton("UnEmployee");
		 unemployee.setBounds(450, 390, 100, 30);
		 unemployee.setBackground(Color.WHITE);
		add(unemployee);
		
		 others =new JRadioButton("Others");
		others.setBounds(630, 390, 100, 30);
		others.setBackground(Color.WHITE);
		add(others);
		
		ButtonGroup maritalgroup = new ButtonGroup();
		maritalgroup.add(employye);
		maritalgroup.add(unemployee);
		maritalgroup.add(others);
		
		JLabel panNumber = new JLabel("PAN Number:");
		panNumber.setFont(new Font("raleway", Font.BOLD, 20));
		panNumber.setBounds(100, 440, 200, 30);
		add(panNumber);
		
		panNumberTextField =new JTextField();
		panNumberTextField.setFont(new Font("Raleway",Font.BOLD, 14));
		panNumberTextField.setBounds(300, 440,400, 30);
		add(panNumberTextField);
		
		JLabel aadharNumber = new JLabel("Aadhar Number:");
		aadharNumber.setFont(new Font("raleway", Font.BOLD, 20));
		aadharNumber.setBounds(100, 490, 200, 30);
		add(aadharNumber);
		
		aadharNumberTextField =new JTextField();
		aadharNumberTextField.setFont(new Font("Raleway",Font.BOLD, 14));
		aadharNumberTextField.setBounds(300, 490,400, 30);
		add(aadharNumberTextField);
		
		JLabel seniorcitizen = new JLabel("Senior citizen:");
		seniorcitizen.setFont(new Font("raleway", Font.BOLD, 20));
		seniorcitizen.setBounds(100, 540, 200, 30);
		add(seniorcitizen);
		
		seniorcitizenTextField =new JTextField();
		seniorcitizenTextField.setFont(new Font("Raleway",Font.BOLD, 14));
		seniorcitizenTextField.setBounds(300, 540,400, 30);
		add(seniorcitizenTextField);
		
		JLabel exisitingAcc = new JLabel("Exisiting Account:");
		exisitingAcc.setFont(new Font("raleway", Font.BOLD, 20));
		exisitingAcc.setBounds(100, 590, 200, 30);
		add(exisitingAcc);
		
		exisitingAccTextField =new JTextField();
		exisitingAccTextField.setFont(new Font("Raleway",Font.BOLD, 14));
		exisitingAccTextField.setBounds(300, 590,400, 30);
		add(exisitingAccTextField);
		
		 next= new JButton("Next");
		next.setBackground(Color.BLACK);
		next.setForeground(Color.WHITE);
		next.setFont(new Font("Raleway", Font.BOLD, 14));
		next.setBounds(620, 660, 80, 30);
		next.addActionListener(this);
		add(next);
		
		getContentPane().setBackground(Color.WHITE);
		
		setSize(850, 800);
		setLocation(350, 10);
		setVisible(true);
			
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {

		String formno= "" + random;
		String religion = religionTextField.getText();
		String Category= CategoryTextField.getText();
		String occupation = null;
		if(employye.isSelected()) {
			occupation = "Employee";
		}else if(unemployee.isSelected()) {
			occupation="UnEmployee";
		}
		
		String income=incomeTextField.getText();
		String educational= educationalTextField.getText();
		String qualification=qualificationTextField.getText();
		String panNumber=panNumberTextField.getText();
		String aadharNumber=aadharNumberTextField.getText();
		String seniorcitizen=seniorcitizenTextField.getText();
		String exisitingAcc=exisitingAccTextField.getText();
		
		try {
			
			Conn c=new Conn();
			String query= "insert into signuptwo values('"+formno+"', '"+religion+"', '"+Category+"', '"+income+"', '"+educational+"', '"+qualification+"', '"+occupation+"', '"+panNumber+"', '"+aadharNumber+"', '"+seniorcitizen+"', '"+exisitingAcc+"')";
			c.s.executeUpdate(query);
			
		
			setVisible(false);
			new SignupThree(formno).setVisible(true);
			
		}catch(Exception ee) {
			System.out.println(ee);
		}
		
	}
	
	public static void main(String[] args) {
		new SignupTwo("");
	}
}
