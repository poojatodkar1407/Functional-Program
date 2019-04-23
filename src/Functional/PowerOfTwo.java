package Functional;

public class PowerOfTwo {

	public static void main(String[] args)
	{
		int num = Integer.parseInt(args[0]);
		int power = 1;
		int i = 0;
		if(num < 31 && num >= 0)
		{
			while(i < num)
			{
				power = power * 2;
				i++;
			}
		
			
		}
		System.out.println("power is :"+power);
	}
}
