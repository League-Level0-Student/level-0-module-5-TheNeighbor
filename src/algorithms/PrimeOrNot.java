package algorithms;

import javax.swing.JOptionPane;

public class PrimeOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String number = JOptionPane.showInputDialog("Type in a number.");
int num = Integer.parseInt(number);
for (int i = 2; i < num; i++) {
	if (num % i==0) {
		JOptionPane.showMessageDialog(null, num + " is not prime.");
		System.exit(0);
	}
	}
JOptionPane.showMessageDialog(null, num + " is prime.");
	}

}
                        