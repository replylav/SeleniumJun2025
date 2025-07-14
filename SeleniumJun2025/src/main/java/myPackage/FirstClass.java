package myPackage;

public class FirstClass {
	
	static public void main(String[] args) {	                              //1. Create the object of the class
	FirstClass newjersey = new FirstClass();    //Syntax: Classname obj = new ClassName();
	FirstClass obj = new FirstClass(5);
	FirstClass obj1 = new FirstClass(100);
	newjersey.addition();
	newjersey.substraction();
	System.out.println("I am inside main method");
	}
	public  void addition() {
		int a = 10;
		int b = 20;
		int c = a+b;
		System.out.println(c);
	}
	public  void substraction() {
		int x = 100;
		int y = 50;
		int z = x-y;
		System.out.println(z);
	}
	
	FirstClass(){
		System.out.println("I am inside constructor of no paramter");
	}
	FirstClass(int x){
		System.out.println("I am inside constructor with parameter x");
		System.out.println(x*10);
	}
	
}
