package Algorithm;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		
		int[] arr1 = {90,56,78,978,234,12,1,3,5};
		
		Util.BubbleSort(arr1);

		
		
		int[] arr = new int[10];
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string array");
		
		for(int i = 0; i<arr.length ;i++)
		{
			arr[i] = sc.nextInt();
		}

			Util.BubbleSort(arr);

	}

}
