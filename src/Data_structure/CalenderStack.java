package Data_structure;

import java.util.Scanner;

public class CalenderStack {

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		
		System.out.println("Enter the month");
		int month = sc.nextInt();
		
		System.out.println("Enter the year");
		int year = sc.nextInt();
		CalenderStack.calenderstack(month,year);
	}

	public static void calenderstack(int month, int year) {
		
		String months[] = { "January", "Februry", "March", "April", "May", "June", "July", "August", "September", "October",
				"November", "December" };
		
		Stack<String> stack = new Stack<>();
		
		  int d = 1, y = year, m = month;
			
	      int y0 = y - (14 - m) / 12;
			int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
			int m0 = m + 12 * ((14 - m) / 12) - 2;
			int d0 = (d + x + 31 * m0 / 12) % 7;
			System.out.println("d0 is :"+d0);
			int start = d0;
			int totalDaysOfMonth = 0, count = 1;//days starts from 1,2,3
			
			if(month == 2)
			{
				 if (CalenderStack.isLeapYear(year))
				 {
					 totalDaysOfMonth = 29;
				 }
				 else
				 {
					 totalDaysOfMonth = 28;
				 }
			}
			
			 else if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
			 {
				 totalDaysOfMonth = 31;
			 }
			 else
			 {
				 totalDaysOfMonth = 30;
			 }
			
			while(start != 0)
			{
				stack.push("  ");
				start--;
			}
			
			while(count<=totalDaysOfMonth)
			{
				stack.push(String.valueOf(count)+" ");
				count++;
			}
			
			System.out.println(months[month-1]+"  "+year);
			System.out.println("Sun\tMon\tTue\tWed\tThu\tFri\tSat");
			count = 1;
			while(!stack.isEmpty())
			{
				String result = stack.pop();
				System.out.print(result+"\t");
				
				if(count %7 == 0)
				{
					System.out.println();
				}
				count++;
			}
	}

	private static boolean isLeapYear(int year) {
		if  ((year % 4 == 0) && (year % 100 != 0)) return true;
		   if  (year % 400 == 0) return true;
		   return true;
	}

}
