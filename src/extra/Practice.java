package extra;

import java.text.BreakIterator;
import java.util.Random;

import javax.swing.JOptionPane;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String judge = JOptionPane.showInputDialog("Judge: Are you guilty of the crime?");
		if (judge.equalsIgnoreCase("yes")) {
			JOptionPane.showMessageDialog(null, "You will be sentenced to life in prison.");
			System.exit(0);
		}
		else if (judge.equalsIgnoreCase("no")) {
			jury();
		}
		String lawyer = JOptionPane.showInputDialog("Lawyer: What number is printed on the console?");
		int decision = Integer.parseInt(lawyer);
		if (decision == 0) {
			JOptionPane.showMessageDialog(null, "Judge: You are not guilty.");
		}
		else if (decision == 1) {
			JOptionPane.showMessageDialog(null, "Judge: You are guilty. You will be sentenced to life in prison.");
		}
	}
	
		// TODO Auto-generated method stub
		
	
	static void jury() {
		int jury_decision = new Random().nextInt(2);
		System.out.print("Jury: " + jury_decision);
	}
}