package Algorithm;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
			int n, size;
		
			Scanner sc = new Scanner(System.in);
			size  = sc.nextInt();
		
			int[] arr = new int[size];
			
			for(int i = 0; i < size ;i++)
			{
				arr[i] = sc.nextInt();
			}
	
			System.out.println("Enter the number to be searched");
			int number = sc.nextInt();
			
			int ret = Util.BinarySearch(arr,number);
			
			if(ret == -1)
			{
				System.out.println("number not found");
			}
			else
			{ 
				System.out.println("number found at"+ret+1);
			}
			
	}

}
