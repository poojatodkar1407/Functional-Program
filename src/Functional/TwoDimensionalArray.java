package Functional;

import java.io.PrintWriter;
import java.util.Scanner;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

				Scanner sc=new Scanner(System.in);
				System.out.println("Enter how many rows:");
				int i=sc.nextInt();
				System.out.println("Enter how many columns");
				int j=sc.nextInt();

				int[][] intArray=new int[i][j];
				double[][] dobArray=new double[i][j];
				boolean[][] boolArray=new boolean[i][j];

				PrintWriter pw=new PrintWriter(System.out,true);
				
				for(int m=0;m<i;m++)
				{
					for(int n=0;n<j;n++)
					{
						System.out.println("Enter elements in integer array:");
						intArray[m][n]=sc.nextInt();


					}
				}

				System.out.println("Elements in array are as follows");
				for(int m=0;m<i;m++)
				{
					for(int n=0;n<j;n++)
					{
						pw.print(" "+intArray[m][n]);
					}
					pw.println();
				}
				
		      //for Double data type array
				for(int m=0;m<i;m++)
				{
					for(int n=0;n<j;n++)
					{
						System.out.println("Enter elements in double array:");
						dobArray[m][n]=sc.nextDouble();


					}
				}

				System.out.println("Elements in array are as follows");
				for(int m=0;m<i;m++)
				{
					for(int n=0;n<j;n++)
					{
						pw.print(" "+dobArray[m][n]);
					}
					pw.println();
				}


				 for(int m=0;m<i;m++)
			       {
			    	   for(int n=0;n<j;n++)
			    	   {
			    		   System.out.println("Enter elements in boolean array:");
			    		   boolArray[m][n]=sc.nextBoolean();
			    		   
			    		  
			    	   }
			       }
			        
			    	System.out.println("Elements in array are as follows");
			    	for(int m=0;m<i;m++)
			        {
			     	   for(int n=0;n<j;n++)
			     	   {
			     		  pw.print(" "+boolArray[m][n]);
			     	   }
			     	   pw.println();
			        }

				pw.close();
			}
	}

