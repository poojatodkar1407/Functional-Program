package Functional;

import java.util.Scanner;

public class FlipCoin {

	public static void main(String[] args) {
		int head = 0;
		int tail = 0;
		int counter = 1;
		int flips = 0;
		double hperc,tperc;
		System.out.println("How much times you want to flip");
		Scanner sc  = new Scanner(System.in);
		flips = sc.nextInt();
		
		if(flips < 0)
		{
			System.out.println("enter the correct count of flips");
		}
		else
		{
			while(counter<=flips)
			{
				double randNum = Math.random();
				
					if(randNum < 0.5)
					{
						head++;
						System.out.println(counter+"  "+randNum);
					}
					else
					{
						tail++;
						System.out.println(counter+"  "+randNum);
					}
					counter++;
			}
				
		}
		 
		hperc = (head*100)/flips;
		System.out.println("head percentage:"+hperc);
		tperc = (tail*100)/flips;
		System.out.println("tail percentage:"+tperc);
		
	}

}
