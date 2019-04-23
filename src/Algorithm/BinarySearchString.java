package Algorithm;

import java.util.Scanner;

public class BinarySearchString {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		String[] arr = {"abc", "def", "ghi", "jkl", "mno", "pqr", "stu", "xyz"};
		String x = "xyz";

		int result = Util.binarySearchString(arr, x);
		
		if(result == -1)
			System.out.println("Element not found");
		else
			System.out.println("Element fount at psition "+result);
	}
		

		
}
		


