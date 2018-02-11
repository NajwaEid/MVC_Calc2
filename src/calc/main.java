package calc;
import javax.swing.JFrame;


public class main {
	public static void main(String[] args) {
		
	model m = new model();
    view v = new view();
		
		controller controllerobj = new controller(m, v);
		v.addlist(controllerobj);
		
		
	}

}
