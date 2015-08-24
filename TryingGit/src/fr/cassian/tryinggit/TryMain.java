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
		int z = 34;
		int p = 4;
		int q = z + p;

	}

	public static void myfunv() {
		System.out.println("good book");
		System.out.println("to read");
	}
}
