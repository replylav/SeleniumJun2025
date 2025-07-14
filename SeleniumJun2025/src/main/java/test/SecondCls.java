package test;

import myPackage.Demo;

public class SecondCls extends Demo {

	public static void main(String[] args) {
		Demo d = new Demo();
		d.method1();  // Public, inside and outside: Everywhere
		d.method4();
	}
}
