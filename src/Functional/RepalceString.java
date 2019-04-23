package Functional;

import java.util.Scanner;

public class RepalceString {

	public static void main(String[] args) {
		String username;
		Scanner sc = new Scanner(System.in);
		username = sc.next();
		
		if(username.length() <3)
		{
			System.out.println("the length should be gerater than 3");
		}
		else
		{
			System.out.println("STRING BEFORE REPLACE");
			System.out.println("Hello,"+username+" How are you?");
			username = username.replace(username,"Pooja");
			System.out.println("STRING AFTER REPLACE");
			System.out.println("Hello,"+username+" How are you?");

		}
		

	}

}
