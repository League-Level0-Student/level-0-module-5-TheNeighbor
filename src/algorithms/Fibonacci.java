package algorithms;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 0;
		int b = 1;
		int c;
		for (int i = 0; i < 12; i++) {
			c = a + b;
			System.out.println(c);
			a = b;
			b = c;
		}
	}

}
