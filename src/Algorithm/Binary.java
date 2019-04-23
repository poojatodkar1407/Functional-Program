package Algorithm;

public class Binary {
	
	public static int toBinary(int num)
	{
		return ((num & 0x0F) << 4 | (num & 0xF0) >> 4); 
	}
	
	
	public static void main(String[] args) {
	
		int result = toBinary(100);
		System.out.println(result);

	}
	

}
