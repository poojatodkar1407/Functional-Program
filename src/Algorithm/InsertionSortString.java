package Algorithm;

import java.util.Scanner;

public class InsertionSortString {

	public static void main(String[] args) {
		String str[]= {"pqr","abc","mno","lko","asd","aas","bno","nik"};
		Util.insertionsortString(str);
		
		String[] arr = new String[10];
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string array");
		for(int i = 0; i<arr.length ;i++)
		{
			arr[i] = sc.next();
		}
		
		Util.insertionsortString(arr);
	}

}
