package Algorithm;

import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		String S1,S2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first string");
		S1 = sc.next();
		
		System.out.println("Enter the second string");
		S2 = sc.next();
		
		System.out.println(Util.Anagram(S1,S2)?"Anagram":"Not Anagram");
	}

}
