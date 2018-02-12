 package calc;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;




public class controller implements ActionListener {

	private model m;
	private view v;
	private boolean num1;
	private boolean num2;
	public controller(model modeel, view vieew) {
		this.m = modeel;
		this.v= vieew;
	}
	
	public void actionPerformed(ActionEvent e) {
		
		
		String opr="+";
		int index=0;
		JButton b=(JButton) e.getSource();
		for(int i=0;i<7;i++){
			if(b.equals(v.b[i])){
				opr=v.buttonStrings[i];
				index=i;
			}
			
		}
		
		
		
		if(index==6)
		{
			v.setnumber1(" ");
			v.setnumber2(" ");
			v.setResult(" ");
		}
	
		else
		{
		if(index==5)
		{
			try {
			double n1=v.getFirstNum();
		//	double n2=v.getSecondNum();
			m.computeSqr(n1,index);
			v.setResult(m.getResult());
			}
			catch(NumberFormatException ex)
			{
				m.inputString=1.0;
				String num1=" ";
				v.setnumber1(num1);
				String num2=" ";
				v.setnumber2(num2);
				String rees=" ";
				v.setResult(rees);
				System.out.println(ex);
				//v.displayErrorMessage("You Must Enter number");
			}
		}
		else if(index==4)
		{
			num1=v.getFirstNum1();
			num2=v.getSecondNum2();
			if((num1==false)|| (num2==false))
			{
				
				v.setResult("NON");
				//JOptionPane.showMessageDialog(null,"You should enter integer number to evaluate mod!");
			}
			else
			{
				int nu1=v.getFirstNum111();
				int nu2=v.getSecondNum222();
				m.computeMod(nu1,nu2);
				v.setResult(m.getResult());
			}
			
		}
		else 
		{
			try {
			double n1=v.getFirstNum();
			double n2=v.getSecondNum();
		m.compute(n1,n2,index);
		v.setResult(m.getResult());
			}
			catch(NumberFormatException ex)
			{
				m.inputString=1.0;
			String num1=" ";
			v.setnumber1(num1);
			String num2=" ";
			v.setnumber2(num2);
			String rees=" ";
			v.setResult(rees);
			
				System.out.println(ex);
				//v.displayErrorMessage("You Must Enter 2 numbers");
			}
			
		}
		}	  
	}

}
