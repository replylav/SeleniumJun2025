package myPackage;

public class Demo {

	public static void main(String[] args) {
		Demo d = new Demo();
		d.method2();  // Private 
		d.method1();  // Public 
		d.method3();  // Default
	}
	
	
	public void method1() {  //Public modifier
		System.out.println("Method1 of Demo Class");
	}
	
	private void method2() {  //Private modifier: Outside the class not allowed
		System.out.println("Method2 of Demo class");
	}
	
	void method3() {    //default modifier  
		System.out.println("Method3 of Demo Class");
	}
	
	protected static void method4() {
		System.out.println("Method4 of demo class");
	}
	
	
	
}
