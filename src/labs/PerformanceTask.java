package labs;

import java.util.Scanner;

public class PerformanceTask {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter launch velocity (m/s)");
		double vc = scan.nextDouble();
		System.out.println("Enter launch angle (degrees)");
		double dg = scan.nextDouble();
		double x = Math.cos(Math.toRadians(dg));
		double y = Math.sin(Math.toRadians(dg));
		boolean first = true;
		int rnd = 0;
		int time = 0;
		System.out.println("\nProjectile's path: \n");
		while ( y != 0 || time <= 2 ) {
			x = Math.cos(Math.toRadians(dg)) * time * vc;
			y = Math.sin(Math.toRadians(dg)) * time * vc - 0.5 * 9.8 * Math.pow(time, 2);
			if (y < 0) {
				y = 0;
			}
			System.out.print("Time: " + time + "s \n   x-pos: " + x + "m \n   y-pos: " + y + "m \n");
			time += 1;
		}
	}

}