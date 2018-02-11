package calc;
import static org.junit.jupiter.api.Assertions.*;

import javax.swing.JOptionPane;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * 
 */

/**
 * @author Najwa
 *
 */
class TestCases {

	/**
	 * @throws java.lang.Exception
	 */
	model calc = new model();
	
	
	/**
	 * @throws java.lang.Exception
	 */
	

	/**
	 * @throws java.lang.Exception
	 */
	

	/**
	 * @throws java.lang.Exception
	 */
	

	
	  @Test
	    public void testAdd() throws Exception {
	    	double expected = 3.0 ;
	     calc.compute(2.0,1.0,0);
	     String x = calc.getResult();
	     assertEquals(expected , Double.parseDouble(x));

	    }
	  
	  @Test
	    public void testAdd2() throws Exception {
	    	double expected = -1.0 ;
	     calc.compute(-2.0,1.0,0);
	     String x = calc.getResult();
	     assertEquals(expected , Double.parseDouble(x));

	    }
	  
	   @Test
	    public void testAdd3() throws Exception {
	    	double expected = -3.0 ;
	     calc.compute(-2.0,-1.0,0);
	     String x = calc.getResult();
	     assertEquals(expected , Double.parseDouble(x));

	    }
	  
	   
	   
	   @Test
	   void testDiv0() throws Exception {
		    
		//    try {
		    	calc.compute(4.0,0.0,3);
		    	assertEquals(1.0 , calc.zerod);
		      
		    // fail("Should have thrown an exception!");
		   //   }
		   //   catch (ArithmeticException e) {
		        // Good, that's what we expect
		//      }
		    
		    }
	   
	   
	   @Test
	   void testSqur() throws Exception {
		    
		   
		        calc.computeSqr(-2.0 ,5);
		        assertEquals(1.0,calc.sqrneg);
		    //    fail("Should have thrown an exception!");
		   
		     
		    
		    }
	 
	   
	 
	   
	   
	
	 
	  
	   
	    @Test
	    public void testSub() throws Exception {
	    	double expected = -3.0 ;
	     calc.compute(-2.0,1.0,1);
	     String x = calc.getResult();
	     assertEquals(expected , Double.parseDouble(x));

	    }

}
