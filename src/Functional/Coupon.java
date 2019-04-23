package Functional;

public class Coupon {

	public static int getCoupon(int n)
	{
		return (int) (Math.random() * n);
	}
	
	// return number of cards you collect before obtaining one of each of the n types
	public static int collect(int n)
	{
		boolean[] isCollected = new boolean[n];	// isCollected[i] = true if card type i already collected
		int count = 0;	// number of cards collected
		int distinct = 0;	// number of distinct card types collected
		
		while(distinct < n)
		{
			int value = getCoupon(n);	// pick a random card
			System.out.println(value);
			count++;
			if(!isCollected[value])	// discovered a new card type
			{
				distinct++;
				isCollected[value] = true;
			}
		}
		return count;
	}
	public static void main(String[] args) 
	{
		int n = Integer.parseInt(args[0]);
		int count = collect(n);
		System.out.println(count);
	}

}
