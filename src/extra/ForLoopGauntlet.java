package extra;

public class ForLoopGauntlet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
for (int i = 0; i < 101; i++) {
	System.out.println(i);
}
for (int i = 100; i > -1; i--) {
	System.out.println(i);
}
for (int i = 2; i < 101; i++) {
	if (i%2 == 0) {
		System.out.println(i);
	}
}
for (int i = 1; i < 100; i++) {
	if (i%2 == 1) {
		System.out.println(i);
	}
}
for (int i = 1; i < 101; i++) {
	if(i%2 == 0) {
		System.out.println(i + " is even");
	}
	else {
		System.out.println(i + " is odd");
	}
	
}
	}

}
