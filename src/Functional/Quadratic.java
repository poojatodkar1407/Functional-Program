package Functional;

import java.util.Scanner;

public class Quadratic {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of a");
		Double a = sc.nextDouble();
		System.out.println("Enter the value of b");
		Double b = sc.nextDouble();
		System.out.println("Enter the value of b");
		Double c = sc.nextDouble();
		
		Double delta = b*b-4*a*c;
		System.out.println(delta);
		if(delta>0)
		{
			Double root1=(-b+Math.sqrt(delta))/(2*a);
			Double root2=(-b-Math.sqrt(delta))/(2*a);
			
			System.out.println("roots are:"+root1+","+root2);
		}
		
	}

}
