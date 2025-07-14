package myPackage;

public class TypeCasting {

	public static void main(String[] args) {
		int myInt = 9;
	    double myDouble = myInt; // Automatic casting: int to double
	    byte b = 10;
	    short s = b;
	 System.out.println(s);
	    // Narrowing casting/Manual casting
		double d = 10.5d;
		int i = (int) d;
		System.out.println(i);
	}

}
