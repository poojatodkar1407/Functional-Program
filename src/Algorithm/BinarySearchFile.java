package Algorithm;

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchFile {

	public static void main(String[] args) {
		File file = new File("/home/admin1/eclipse-workspace/bridgelabz/src/Algorithm/abc.txt");
		
		try
		{
			Scanner sc = new Scanner(file);
			String name = sc.nextLine();
			
			String[] arr = name.split(" ");
			  
			Arrays.sort(arr);
			
			Scanner sc1 = new Scanner(System.in);
			System.out.println("Enter the word to be searched:");
			String word = sc1.next();
			
			int iret = Util.binarySearchString(arr,word);
			
			if(iret == -1)
			{
				System.out.println("Not found");
			}
			else
			{
				System.out.println("Found at position :"+iret);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
