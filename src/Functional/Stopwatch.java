package Functional;

import java.util.Scanner;

public class Stopwatch {
	   private final long start;

	  
	    public Stopwatch() {
	        start = System.currentTimeMillis();
	    } 


	    public double elapsedTime() {
	        long now = System.currentTimeMillis();
	        return (now - start) / 1000.0;
	    }

	    public static void main(String[] args) {
	        
	    	int n;
	    	Scanner sc = new Scanner(System.in);
	    	n = sc.nextInt();

	        // sum of square roots of integers from 1 to n using Math.sqrt(x).
	        Stopwatch timer1 = new Stopwatch();
	        double sum1 = 0.0;
	        for (int i = 1; i <= n; i++) {
	            sum1 += Math.sqrt(i);
	        }
	        double time1 = timer1.elapsedTime();
	      System.out.println(sum1+"    "+time1);
	    }

	}

