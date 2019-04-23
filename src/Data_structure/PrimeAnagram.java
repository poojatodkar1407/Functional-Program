package Data_structure;

public class PrimeAnagram {
	public static void main(String[] args)
	{
		Queue<Integer>queue=new Queue<Integer>();
		//calling prime Anagram method to check prime and anagram.
		int res[]=Utility.primeAnagram(1000);
		for(int i=0;i<res.length;i++)
			//add elements in queue
			queue.enque(res[i]);
		   //display queue
		    queue.display();
	}

}
