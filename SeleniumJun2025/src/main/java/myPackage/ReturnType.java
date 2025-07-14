package myPackage;

public class ReturnType {

	public static void main(String[] args) {
		ReturnType obj = new ReturnType();   //4531.45
		String q = obj.Vanilla();  //30
		System.out.println(obj.button());
		System.out.println(q);
	//	int x = obj.strawberry();  //void 
	}

	public String Vanilla() {
		
		String s1 = "Naren";
		String s2 = "Chandran";
		return s1+" "+s2; 
		
	}
	
	public void strawberry() {
		int a =10;
		int b =30;
		int c = a+b;
	}
	
	public boolean button() {
		return true;
	}
	
	
	
}
