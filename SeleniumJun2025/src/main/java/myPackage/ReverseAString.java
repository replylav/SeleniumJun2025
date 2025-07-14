package myPackage;

public class ReverseAString {

	public static void main(String[] args) {
	
		String s = "How are you!";
		for(int i=s.length()-1; i>=0; i--) {
			System.out.print(s.charAt(i));
		}
		

	}

}
