package Functional;

import java.util.Scanner;

public class primeFact {

	public static void main(String[] args) {

		int num;
		
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		
		for(int i = 2 ; (i*i) <= num ;i++)
		{
			while(num%i==0)
			{
				System.out.println("facrtor"+i);
				num = num / i;
				
			}
			
		}
		if(num>1)
		{
			System.out.println(num);
		}
		else
		{
			System.out.println("");
		}

	}

}
