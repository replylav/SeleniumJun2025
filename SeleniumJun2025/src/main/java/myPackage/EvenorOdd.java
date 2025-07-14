package myPackage;

import java.util.Scanner;

public class EvenorOdd {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
  		int num;
  		System.out.println("Enter the number: ");
  		num = scan.nextInt();
  		if(num%2==0) {
  			System.out.print("Even");
  		}
  		else {
  				System.out.println("Odd");
  			}
  	}
  		

	}


