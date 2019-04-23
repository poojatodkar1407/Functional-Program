package Functional;

public class Gambler {

	public static void main(String[] args) {
		int stake = Integer.parseInt(args[0]);
		int goal = Integer.parseInt(args[1]);
		int trial = Integer.parseInt(args[2]);
		
		int bets = 0;
		int wins = 0;
		for(int t = 0; t<trial ;t++)
		{
			int cash = stake;
			
			while(cash > 0 && cash < goal)
			{
				bets++;
				if(Math.random() < 0.5)
				{
					cash++;
				}
				else
				{
					cash--;
				}
			}
			wins++;
		}
		
		System.out.println(bets);
		System.out.println("wins"+wins);
		System.out.println("Average winner"+100*wins/trial);
		System.out.println("Avg bets = " + 1.0 * bets/trial);
	}

}
