package Algorithm;

public class Util {

	//program for anagram
	
		public static boolean Anagram(String s1, String s2)
		{
			char c;
			
			if(s1.length() != s2.length())
			{
				return false;
			}
			
			for(int i = 0 ; i< s1.length(); i++)
			{
				c = s1.charAt(i);
				
				if(s2.indexOf(c) == -1)
				{
					return false;
				}
			}
			
			return true;
			
		}
		
     //program for prime from 1 to 1000
		
		public static int Prime()
		{
			
			for(int no = 2; no<=1000 ; no++)
			{
				int temp = 0;
			
						for(int i = 2 ; i< no/2 ; i++)
						{
								if(no % i == 0)
								{
										temp++;
								}
				
								
						}
						if(temp == 0)
						{
							System.out.println(no);
						}
			}
			
			return 0;
		}
		
		//program for prime with palindrome
		
		public static int primeandPalindrome()
		{
			for(int no = 2; no<=1000 ; no++)
			{
				int temp = 0;
				int rev = 0;
			
						for(int i = 2 ; i< no/2 ; i++)
						{
								if(no % i == 0)
								{
										temp++;
								}
				
								
						}
							if(temp == 0)
							{
								int temp1 = no;
							
									while ( temp1 != 0)
									{
											rev = (rev * 10) +(temp1 % 10);
											temp1 = temp1/10;
									}
							
									if(rev == no)
									{
											System.out.print(no+" ");
									}
							}
			}
			
			return 0;
			
		}
		
		
		//PROGRAM FOR PRIME WITH ANAGRAM
		
		public static int primeAnagram()
		{
			int newarray[] = new int[1000];
			for(int no = 2; no<=1000 ; no++)
			{
				int temp = 0;
				for(int i = 2 ; i< no/2 ; i++)
				{
					if(no % i == 0)
					{
							temp++;
					}
	
					
				}
					int j = 0;
					
					if(temp == 0)
					{
						newarray[j] = no;
						j++;
					}
			}
			
			for(int i = 0;i < newarray.length;i++)
			{
				System.out.println(newarray[i]);
			}
			return 0;
			
		}
		
		//program for integer array anagram
		
		public static int anagram(int no1 , int no2)
		{
			System.out.println(no1+"  "+no2);
			int[] arr = new int[10];
			int[] brr = new int[10];
			int temp1=no1;
			int temp2=no2;
			while((no1 != 0) &&(no2 != 0))
			{
				arr[no1%10]++;
				no1 = no1/10;
				brr[no2%10]++;
				no2 = no2/10;
			}
			int i;
			for(i = 0 ; i < 10 ;i++)
			{
				if(arr[i] != brr[i])
				{
					break;
				}
			}
			
			
			if(i == 10)
			{
				//System.out.println(temp1+"  "+temp2);
			}
			return 0;
		}

		
		//PROGRAM FOR BINARY SEARCH
		
		
		public static int BinarySearch(int[] arr, int number) {
		
			int low = 0,high = arr.length - 1;
			
			
			while(low<=high)
			{
				int mid = (low + high) / 2;
				if(arr[mid] == number)
				{
					return mid;
				}
				else if(arr[mid] > number)
				{
					high = mid -1;
				}
				else if(arr[mid] < number)
				{
					low = mid + 1;
				}
			}
			return 0;
		}

		//BINARY SEARCH FOR STRING
		
		public static int binarySearchString(String[] arr, String x) {
			
			int low = 0, high = arr.length - 1;
			while(low <= high)
			{
				int mid = (low +high)/2;
				int res = x.compareTo(arr[mid]);

				if(res == 0)
				{				
					return mid;
				}
				else if(res> 0)
				{	
					
					low = mid + 1;
				}
				else
				{
					
					high = mid - 1;
				}

			}
			return -1;
		
		}

		
		//PROGRAM FOR INSERTION SORT FOR INTEGER
		public static void insertionSort(int[] arr)
		{
			int n = arr.length; 
			for (int i = 1; i < n; ++i) 
			{ 
				int key = arr[i]; 
				int j = i - 1; 
  
				while (j >= 0 && arr[j] > key) 
				{ 
					arr[j + 1] = arr[j]; 
					j = j - 1; 
				} 
					arr[j + 1] = key; 
			} 
			
			for(int i = 0; i < n ; i++)
			{
				System.out.println(arr[i]);
			}
		}
		
	//PROGRAM FOR INSERTIONSORT FOR INTEGER	
		public static void insertionsortString(String str[])
		{
			String temp="";

			for(int i=0;i<str.length;i++)
			{
				for(int j=i+1;j<str.length;j++)
				{
					if(str[i].compareToIgnoreCase(str[j])>0)
					{
						temp=str[i];
						str[i]=str[j];
						str[j]=temp;
					}
				}
			}

			System.out.println("Sorted array is::");
			for(int i=0;i<str.length;i++) 
			{
				System.out.println(str[i]);
			}
		}

		public static void BubbleSort(int[] arr) 
		{
			int temp;
			int n=arr.length;
			for(int i=0;i<n-1;i++)
			{
				for(int j=0;j<n-i-1;j++)
				{
					if(arr[j]>arr[j+1])
					{
						temp=arr[j];
						arr[j]=arr[j+1];
						arr[j+1]=temp;
					}
				} 
			}
			System.out.println("Sorted array is::");
			for(int i=0;i<n;i++)
			{
				System.out.println(arr[i]);
			}
			
			
		}

		public static void BubbleSortSTring(String[] str) {
		
			String temp;
			int n=str.length;
			for(int i=0;i<n-1;i++)
			{
				for(int j=0;j<n-i-1;j++)
				{
					if(str[j].compareTo(str[j+1])>0)
					{
						temp=str[j];
						str[j]=str[j+1];
						str[j+1]=temp;
					}
				} 
			}
			System.out.println("Sorted array is::");
			for(int i=0;i<n;i++)
			{
				System.out.println(str[i]);
			}
		}
		
		public static int dayOfWeek(int d,int m,int y)
		{
			
			int y0,x,m0,d0;
			
			y0=y-(14-m)/12;
			x=y0+(y0/4)-(y0/100)+(y0/400);
	        m0=m+12*((14-m)/12)-2;		
			return d0=(d+x+31*m0/12)%7;
			
		}

		public static double ToFahrenheit(double ctemp)
		{
			return (ctemp * 9/5)+32;
		}
		
		public static double ToCelsius(double ftemp)
		{
			return (ftemp - 32 ) * 5/9 ;
		}
		

		public static double payment(double P, double Y, double R)
		{
			double n = 12 * Y;
			double r = R / ( 12 * 100 );
			double pay = P * r / ( 1 - Math.pow((1 + r), -n));
			return pay;
		}
		
		public static double Sqrt(Double c)
		{
			double epsilon= 1.0e-15;
			double t=c;
			
			while(Math.abs(t-c/t)> epsilon*t)
			{
				t=(c/t+t)/2;
			}
			return t;
		}
		
		public static void binary(int num)
		{
			int[] bin = new int[100];
			bin[0]=0;
			int i = 0;
			
			while(num>0)
			{
					bin[i++] = num%2;
					num = num/2;
			}
			
			for(int j = i-1 ;j>0;j--)
			{
				System.out.print(bin[j]);
			}
		}
		
		

		static int[] notes = {1000, 500, 100, 50, 10, 5, 2, 1};
		static int total, i;
		static void note(int value)
		{
 float no = value/notes[i];
 System.out.println(no);
			if(value/notes[i] != 0)
			{
				total += (value/notes[i]);
				System.out.println("total is "+total);
				System.out.println(notes[i]+" is notes "+value/notes[i]);
				value = value % notes[i];
				System.out.println("value is "+value);
			}
			i++;
			if(value == 0)
			{
				System.out.println("Total notes :: "+total);
				return;
			}
			note(value);
		}

		

}
