package Data_structure;

public class PrimeAnagramStack {
	
		public static void main(String[] args)
		{
			Stack<Integer> stack = new Stack<Integer>();
			
			int res[] = Utility.primeAnagram(1000);
			
			for (int i = res.length-1 ;i>=0;i--)
			{
				stack.push(res[i]);
			}
			stack.display();
		}
}
 