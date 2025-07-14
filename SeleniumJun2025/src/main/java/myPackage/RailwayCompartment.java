package myPackage;

import java.util.Scanner;

public class RailwayCompartment {

	public static void main(String[] args) {
		int lower = 1;
		int middle = 2;
		int upper = 3;
		Scanner n = new Scanner(System.in);  //classname obj = new className(system.in);
		System.out.println("Enter the number: ");
		int num = n.nextInt();
		for(int i =1; i<=num; i++) {
			lower=lower+3;      
			middle=middle+3;   
			upper=upper+3;    
		if(lower==num) {
			System.out.println(lower +" is lower ");
		}else if(middle==num){
			System.out.println(middle+ " is Middle ");
		}
		else if(upper==num) {
			System.out.println(upper+ " is Upper ");
		}
		}

	}

}
