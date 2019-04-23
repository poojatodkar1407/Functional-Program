package Functional;

import java.util.Scanner;

public class Harmonic {

	public static void main(String[] args) {
		int num;
		double sum = 0;
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		
		for(int i = 1 ; i<=num ; i++)
		{
			System.out.print("1/"+i+"+");
			sum = sum + (double) 1/i;
		}
		
		System.out.println("Sum of the harmonic number is : " + sum);

	}

}
