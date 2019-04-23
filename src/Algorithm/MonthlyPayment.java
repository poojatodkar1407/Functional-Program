package Algorithm;

public class MonthlyPayment {
	
	public static void main(String[] args)
	{
		double P = Double.parseDouble(args[0]);
		double Y = Double.parseDouble(args[1]);
		double R = Double.parseDouble(args[2]);
		
		double ret = Util.payment(P, Y, R);
		
		System.out.println("payment is : "+ret);
	}

}
