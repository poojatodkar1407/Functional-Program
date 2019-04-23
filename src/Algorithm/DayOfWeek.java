package Algorithm;

public class DayOfWeek {

	public static void main(String[] args) {
		
		int day=Integer.parseInt(args[0]);
		int month=Integer.parseInt(args[1]);
		int year=Integer.parseInt(args[2]);
	
	int res=Util.dayOfWeek(day,month,year);
	System.out.println("day of week::"+res);
	
		
	}

}
