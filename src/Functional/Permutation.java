package Functional;

public class Permutation {

		public static void perm1(String s)
		{
			perm1("",s);
			
		}
		
		private static void perm1(String prefix,String s)
		{
			int len=s.length();
			if(len==0)
				System.out.println(prefix);
			else
			{
				for(int i=0;i<len;i++)
					perm1(prefix + s.charAt(i),s.substring(0, i) + s.substring(i+1, len));
				
					
			}
			
				
		}
		
		public static void perm2(String s)
		{
			int n = s.length();
			char[] a = new char[n];
			for(int i = 0; i < n; i++)
				a[i] = s.charAt(i);
			perm2(a, n);
		}
		
		private static void perm2(char[] a, int n) 
		{
			if(n == 1)
			{
				System.out.println(new String(a));
				return;
			}
			for(int i = 0; i < n; i++)
			{
				swap(a, i, n-1);
				perm2(a, n-1);
				swap(a, i, n-1);
			}
		}

		private static void swap(char[] a, int i, int j) 
		{
			char c = a[i];
			a[i] = a[j];
			a[j] = c;
		}

		public static void main(String[] args) {
			int n=Integer.parseInt(args[0]);
			String s1="abcdef";
			String s2=s1.substring(0, n);
			perm1(s2);
			System.out.println();
			perm2(s2);
		}

}