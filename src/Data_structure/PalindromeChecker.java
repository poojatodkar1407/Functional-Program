package Data_structure;

import java.util.Scanner;

public class PalindromeChecker {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
			
			DequeueUtility<Character> utility=new DequeueUtility<Character>();
		
			

			//adding each character to the rear of the deque
			for(int i=0;i<s.length();i++)
			{
				char c =s.charAt(i);
				utility.addRear(c);
			}
			int flag=0;

			while(utility.size()>1)
			{
				if(utility.removeFront()!=utility.removeRear())
				{
					flag=1;
					break;
				}
			}

			if(flag==0)
			{
				System.out.println("String is palindrome");
			}
			else
			{
				System.out.println("String is not palindrome");
			}
	}

}


