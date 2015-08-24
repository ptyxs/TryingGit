package fr.cassian.tryinggit;

public class TryMain {
	static int x ;
	public static void main(String[] args) {
		System.out.println("début");
		AClass A = new AClass();
		A.printule();
		x += 23;
		System.out.println("x = " + x);

		myfunv();

		int y = 34;
		int p = 4;
		int q = y + p;
		int w = ++q;


	}

	public static void myfunv() {
		System.out.println("good book");
		System.out.println("to read");
		int x = 13;
	}
}
