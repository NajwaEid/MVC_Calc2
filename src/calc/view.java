package calc;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JTextField;



import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;

public class view {

	private JFrame frame;
	private JTextField number1;
	private JTextField number2;
	private JTextField res;
	 private double n1;
     private double n2;
     public int n11;
     public int n22;
     private String op;
     public JButton [] b;
     public String[] buttonStrings;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					view window = new view();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			}
		});
	}

	/**
	 * Create the application.
	 */
	public view() {
		initialize();
		this.frame.setVisible(true);
	}
	
	public void setnumber1(String value) {
		
		number1.setText(value);
}
	public void setnumber2(String value) {
		
		number2.setText(value);
}
	public void setResult(String value) {
		
		res.setText(value);
}
	
	public double getFirstNum(){
		
		n1=Double.parseDouble(number1.getText());
		return n1;
	}
public int getFirstNum111(){
		
		return n11;
	}
public int getSecondNum222(){
	
	
	return n22;
}
    public boolean getFirstNum1(){
    	boolean amIValid = true;
		try {
		n11=Integer.parseInt(number1.getText());
		//amIValid=true;
		}
		
		catch (NumberFormatException e) {
			amIValid=false;
			   //sorry, not an integer
			   // we just move on, but you could have code here
			  }
		return amIValid;
	}
	
	public double getSecondNum(){
		n2=Double.parseDouble(number2.getText());
		return n2;
	}
	public boolean getSecondNum2(){
		boolean amIValid = true;
		try {
		n22=Integer.parseInt(number2.getText());
		//amIValid=true;
		}
		catch (NumberFormatException e) {
			amIValid=false;
			   //sorry, not an integer
			   // we just move on, but you could have code here
			  }
		return amIValid;
	}
	
	public String getOperation(){
		return op;
	}
	
	public void addlist(controller c){
		for (int i=0;i<7;i++) {
			 b[i].addActionListener(c);
			 
			}
	}
	public void displayErrorMessage(String m)
	{
		JOptionPane.showMessageDialog(null,m);
	}
	

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 218, 185));
		frame.setBounds(100, 100, 449, 254);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblFirstNumber = new JLabel("First Number");
		lblFirstNumber.setFont(new Font("Comic Sans MS", Font.BOLD, 11));
		lblFirstNumber.setBounds(10, 31, 113, 29);
		frame.getContentPane().add(lblFirstNumber);
		
		JLabel lblNewLabel = new JLabel("Second Number");
		lblNewLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 11));
		lblNewLabel.setBounds(10, 82, 113, 29);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Result");
		lblNewLabel_1.setFont(new Font("Comic Sans MS", Font.BOLD, 11));
		lblNewLabel_1.setBounds(10, 130, 113, 29);
		frame.getContentPane().add(lblNewLabel_1);
		
		number1 = new JTextField();
		number1.setBounds(111, 31, 105, 24);
		frame.getContentPane().add(number1);
		number1.setColumns(10);
		
		number2 = new JTextField();
		number2.setBounds(111, 91, 105, 24);
		frame.getContentPane().add(number2);
		number2.setColumns(10);
		
		res = new JTextField();
		res.setBounds(111, 139, 105, 24);
		frame.getContentPane().add(res);
		res.setColumns(10);
		
		
		 buttonStrings =new String[7];
		 buttonStrings[0]="+";
		 buttonStrings[1]="-";
		 buttonStrings[2]="*";
		 buttonStrings[3]="/";
		 buttonStrings[4]="%";
		 buttonStrings[5]="sqr";
		 buttonStrings[6]="CE";
		 
		 b=new JButton[7];
		 for (int i=0;i<7;i++) {
			 	
			 b[i] =(JButton) new JButton(buttonStrings[i]);	
			//p2.add(b[i]);
			 frame.getContentPane().add(b[i]);
			}
		
		//JButton add = new JButton("+");
		b[0].setBounds(274, 32, 50, 28);
		//frame.getContentPane().add(add);
		
	//	JButton mul = new JButton("*");
		b[2].setBounds(329, 32, 55, 29);
		//frame.getContentPane().add(mul);
		
	//	JButton sub = new JButton("-");
		b[1].setBounds(274, 82, 50, 29);
	//	frame.getContentPane().add(sub);
		
		//JButton div = new JButton("/");
		b[3].setBounds(329, 83, 55, 28);
	//	frame.getContentPane().add(div);
		
		//JButton mod = new JButton("%");
		b[4].setBounds(274, 133, 50, 26);
		//frame.getContentPane().add(mod);
		
	//	JButton sqr = new JButton("sqr");
		b[5].setBounds(329, 133, 55, 26);
		//frame.getContentPane().add(sqr);
		
		//JButton clear = new JButton("CE");
		b[6].setBounds(300, 175, 59, 29);
		//frame.getContentPane().add(clear);
		
		
		
		
		
	}
}
