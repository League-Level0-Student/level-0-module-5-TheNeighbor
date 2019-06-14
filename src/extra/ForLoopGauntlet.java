package extra;

public class ForLoopGauntlet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 101; i++) {
			System.out.println(i);
		}
		System.out.println();
		for (int i = 100; i > -1; i--) {
			System.out.println(i);
		}
		System.out.println();
		for (int i = 2; i < 101; i += 2) {
			System.out.println(i);
		}
		System.out.println();
		for (int i = 1; i < 100; i += 2) {
			System.out.println(i);
		}
		System.out.println();
		for (int i = 1; i < 101; i++) {
			if (i % 2 == 0) {
				System.out.println(i + " is even");
			} else {
				System.out.println(i + " is odd");
			}
		}
		System.out.println();
		for (int i = 0; i <= 777; i += 7) {
			System.out.println(i);
		}
		System.out.println();
		for (int i = 2005; i < 2020; i++) {
			System.out.println("In " + i + ", I was " + (i - 2005) + " year(s) old.");
		}
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.println(i + " " + j);
			}
		}
		System.out.println();
		for (int i = 0; i < 3; i++) {
			for (int j = 1; j < 4 ; j++) {
				System.out.print(i + j);
			}
			System.out.println();
		}
				}	
			
		}
	


