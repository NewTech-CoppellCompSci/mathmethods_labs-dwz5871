package labs;

import java.util.Scanner;

public class Lab02 {

	public static void main(String[] args) {
		
		//problem01();
		//problem02();
		//problem03();
		problem04();
		
	}
	

	
	public static void problem01() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a positive integer");
		int num1 = scan.nextInt();
		System.out.println("Enter another positive integer");
		int num2 = scan.nextInt();
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		max = Math.max(num1, num2);
		min = Math.min(num1, num2);
		for (int i = 0; i < 10; i++ ) {
			System.out.print(Math.round(Math.random() * (max - min) + min) + " ");
		}
	}
	
	
	
	
	public static void problem02() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the radius");
		double num1 = scan.nextDouble();
		System.out.println("Enter the hight");
		double num2 = scan.nextDouble();
		double volume = Math.PI * Math.pow(num1, 2) * num2;
		System.out.print(Math.round(volume*100)/100.0);
		
	}

	
	

	public static void problem03() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter x1");
		double x1 = scan.nextDouble();
		System.out.println("Enter y1");
		double y1 = scan.nextDouble();
		System.out.println("Enter x2");
		double x2 = scan.nextDouble();
		System.out.println("Enter y2");
		double y2 = scan.nextDouble();
		System.out.print(Math.round(Math.sqrt(Math.abs(Math.pow(x1 - x2, 2)) + Math.abs(Math.pow(y1 - y2, 2)))*1000)/1000.0);
		
	}


	
	
	public static void problem04() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a-value");
		double a = scan.nextDouble();
		System.out.println("Enter b-value");
		double b = scan.nextDouble();
		System.out.println("Enter c-value");
		double c = scan.nextDouble();
		double rt = Math.sqrt(Math.pow(b, 2) - 4 * a * c);
		System.out.println("x1 = " + (-1*b + rt) / (2 * a));
		System.out.println("x2 = " + (-1*b - rt) / (2 * a));
		
	}
	
	

	
}
