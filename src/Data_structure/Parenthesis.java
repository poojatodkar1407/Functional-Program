package Data_structure;

import java.util.Scanner;
import java.util.Stack;

public class Parenthesis 
{

	public static void main(String[] args) 
	{
			Stack<Integer> stack = new Stack<Integer>();
			
			Scanner sc = new Scanner(System.in);
			
			String name = sc.next();
			
			int length = name.length();
			
			for(int i = 0; i<length ; i++)
			{
				char ch = name.charAt(i);
				
				if(ch == '(')
				{
					stack.push(i);
				}
				else if(ch == ')')
				{	
					try
					{
						int p = (stack.pop()+1);
					
						System.out.println("( at index "+p+" matched with )at index "+(i+1));	
					}				
					catch(Exception e)
					{
						System.out.println("Index not matched");
					}
					finally
					{
						while(!stack.isEmpty())
						{
							System.out.println("Index "+(stack.pop() +1)+" is unmatched");
						}
					}
				}			
			}
    	}
}