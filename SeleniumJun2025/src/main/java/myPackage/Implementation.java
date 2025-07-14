package myPackage;

public class Implementation extends Calling {

	public static void main(String[] args) {
	
	
	}

	@Override
	public void Accept() {
		System.out.println("Accepted...");
		
	}

	@Override
	public void Decline() {
		// TODO Auto-generated method stub
		System.out.println("Declined...");
	}
	
	public void method1() {
		System.out.println("non-abstract method in implementation class");
	}
	
}



