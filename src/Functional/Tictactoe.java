package Functional;

import java.util.Scanner;

public class Tictactoe {

	public static void main(String[] args) {
		
		TictactoeLogic tl = new TictactoeLogic();
		
		Scanner sc = new Scanner(System.in);
		int x=0,y=0;
		
		do {
			System.out.println(tl.player == tl.x ? "now x turn":"now o turn");
			System.out.println("Place x and o");
			x = sc.nextInt();
			y = sc.nextInt();
			
			tl.putsign(x,y);
			System.out.println(tl.toString());
			System.out.println("_______________");
			tl.displayWinner();
			}while(tl.isEmpty);
		

	}

}
