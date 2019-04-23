package Functional;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		int year;
		int counter = 0;
		Scanner sc  = new Scanner(System.in);
		year = sc.nextInt();
		int temp = year;
		while(temp!=0)
		{
			temp = temp/10;
			counter++;
		}
		
		if(counter == 4)
		{
			if((year % 400 == 0) && (year % 100 == 0) ||(year % 4 == 0))
			{
				System.out.println("Its leap year");
			}
			else
			{
				System.out.println("its not leap year");
			}
		}
	}

}
