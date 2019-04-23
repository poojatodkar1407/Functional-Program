package Data_structure;

import java.util.Arrays;
import java.util.Deque;
import java.util.Scanner;

public class Utility {
	
	Scanner sc = new Scanner(System.in);
	
	public static boolean palindrome(String input)
	{
		input = input.toLowerCase();
		DequeueUtility <Character> deque = new DequeueUtility<>();
		boolean result = false;
		
		for(int i = 0;i<input.length();i++)
		{
			char c = input.charAt(i);
			deque.addRear(c);
		}
		
		int flag = 0;
		while(deque.size() > 1)
		{
			char first = deque.removeFront();
			char last = deque.removeRear();
			
			if(first == last)
			{
				flag = 0;
			}
			else
			{
				flag = 1;
				break;
			}
		}
		
		if(flag == 0)
		{
			result = true; //palindrome
		}
		else
		{
			result = false;//not palindrome
		}
		
		return result;
	}
	
	public static int[] primeAnagram(int range)
	{
		
		int index  = 0;
		String[] array = new String[200];
		 int[] anagram = new int[158]; 
		int count = 0;
		
		for(int i = 2; i<range ;i++)
		{
			if(isPrime(i))
			{
				array[index] = String.valueOf(i);
				index++;
			}
		}
		
		for(int i = 0; i< index ;i++)
		{
			for(int j = i+1 ; j<index ;j++)
			{
				if(isAnagram(array[j],array[i]))
				{
					anagram[count] = Integer.parseInt(array[i]);
					count++;
					anagram[count] = Integer.parseInt(array[j]);
					count++;
				}
			}
		}
		return anagram;
	}


	public static boolean isAnagram(String str1, String str2)
	{
		boolean status = true;
		
		if(str1.length() != str2.length())
		{
			status = false;
		}
		else
		{
			char[] array1 = str1.toCharArray();
			char[] array2 = str2.toCharArray();
			
			Arrays.sort(array1);
			Arrays.sort(array2);
			
			status = Arrays.equals(array1,array2);
		}
		
		if(status)
		{
			return true;
		}
		else
		{
			return false;
		}
	}


	private static boolean isPrime(int no) {
	
		for(int i = 2; i<no/2 ;i++)
		{
			if(no%i == 0)
			{
				return false;
			}
				
		}
		return true;
	}
}
 