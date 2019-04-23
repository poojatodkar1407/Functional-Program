package Algorithm;

import java.util.Scanner;

public class VendingMachine {

	public static void main(String[] args) {
		try
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the amount :: ");
			int value = sc.nextInt();
			Util.note(value);
			sc.close();
		}
		catch(Exception e)
		{
			System.out.println("please enter integer value");
		
		}

	}

}
