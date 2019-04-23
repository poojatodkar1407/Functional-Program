package Data_structure;

import java.io.File;
import java.util.LinkedList;
import java.util.Scanner;

public class UnorederedListUsingGenerics {
	
	public static void main(String[] args) {
	
		
		try
		{
			File file = new File("/home/admin1/eclipse-workspace/bridgelabz/src/Data_structure/abc.txt");
			
			Scanner sc = new Scanner(file);
			
			String string = sc.nextLine();
			String[] arr = string.split(",");
			
			LinkedList<String> ll = new LinkedList<String>();
			
			for(int i = 0; i< arr.length ;i++)
			{
				ll.addLast(arr[i]);
			}
			
			System.out.println("Content of the linked list : "+ll);
			System.out.println("size of the linked list"+ll.size());
			
			System.out.println();
			
			Scanner sc1 = new Scanner(System.in);
			System.out.println("Enter the string to be searched");
			
			String word = sc1.next();
			
			boolean status = ll.contains(word);
			if(status)
			{
				ll.remove(word);
				System.out.println("Content of the linked list : "+ll);				
			}
			else
			{
				ll.push(word);
				System.out.println("Content of the linked list : "+ll);
			}
					
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
