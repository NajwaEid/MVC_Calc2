 package calc;

import javax.swing.JOptionPane;

public class model {
private double result;
	private int result2;
	private String str;
	private String op;
	public double zerod;
	public double sqrneg;
	public double inputString;
	public double s;
    
	public model() {
		str = " " + result;
		op = " ";
}
	
	public void compute(double n1, double n2 , int i) {
		
		

		 if (i==0) {
			 
				result = n1+n2;
				str = " "+ result;} 
		 else if (i==1) {
				result = n1 - n2;
				str = " "+ result;}
		 else if (i==2) {
				result = n1 * n2;
				str = " "+ result;}	
		else if (i==3)
	{
			if(n2==0)
			{ str=" ";
		zerod=1.0;
			//JOptionPane.showMessageDialog(null,"Zero Divition Error","Error",JOptionPane.ERROR_MESSAGE);
			}
			else
			{
				
				result = n1 / n2;
				str = " "+ result;
			}
		}
			
	//	else if (i==4)
	//	{
			//result=n1%n2;
			//str = " "+ result;
			
	//	}
		 
	

		else if (i==6)
		{
			result =0.0 ;
			str = " "+ result;
			
		}
			

	}
	
	public void computeSqr(double n1,int i)
	{
		
			if(n1<0.0)
			{str=" ";
			sqrneg=1.0;
				//JOptionPane.showMessageDialog(null,"Negative Number  input","Error",JOptionPane.ERROR_MESSAGE);
			}
			else
			{
			result= Math.sqrt(n1);
			str = " "+ result;
			}

	}
	
	
	public void computeMod(int n1,int n2)
	{
		result2=n1%n2;
		str = " "+ result2;
	}
	
	
	
	
	
	public String getResult() {
		return str;
	}
}