package labs;

import java.util.Scanner;

public class Lab01 {

	public static void main(String[] args) {
		
		problem01();
		problem02();
		problem03();
		problem04();
		
	}
	

	
	public static void problem01() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a positive integer");
		int num1 = scan.nextInt();
		System.out.println("Enter another positive integer");
		int num2 = scan.nextInt();
		System.out.println(num1 + "^" + num2 + " = " + Math.pow(num1, num2));
	}
	
	
	
	
	public static void problem02() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a positive integer");
		int num = scan.nextInt();
		System.out.println("The square root of " + num + " is " + Math.sqrt(num));
		
		
	}

	
	

	public static void problem03() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Length of side A");
		double num1 = scan.nextDouble();
		System.out.println("Length of side B");
		double num2 = scan.nextDouble();
		double abc = 0;
		abc = Math.sqrt(Math.pow(num1, 2) + (Math.pow(num2, 2)));
		System.out.println("Hypotenuse = " + abc);

	}


	
	
	public static void problem04() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an integer");
		int num = scan.nextInt();
		int big = Integer.MIN_VALUE;
		int small = Integer.MAX_VALUE;
		while (num != 0) {
			System.out.println("Enter an integer");
			num = scan.nextInt();
			big = Math.max(big, num);
			small = Math.min(small, num);
		}
		System.out.println("Max = " + big);
		System.out.println("Min = " + small);
	}
	
	
	
	
	
	
	
}
