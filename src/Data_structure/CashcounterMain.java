package Data_structure;

import java.util.Scanner;

public class CashcounterMain {


		public static void main(String[] args) {
		
			CashCounter cash = new CashCounter();
			
			int ch=0;
			do {
				System.out.println("1.deposit");
				System.out.println("2.withdrawl");
				System.out.println("3.number of people in queue");
				System.out.println("4.Exit");
				System.out.println();
				System.out.println("Enter your choice");
				Scanner sc = new Scanner(System.in);
				 ch = sc.nextInt();
	 
				//int data=sc.nextInt();
				switch(ch)
				{
				
				case 1: System.out.println("Enter amount u want to deposit:");
				        cash.insert(sc.nextInt());
				        cash.display();
				        break;
				       
				case 2:System.out.println("Enter amount to be withdrawal:");
				       sc.nextInt();
				       	
				       cash.remove();
				       System.out.println("The avilable balance is::");
				       cash.display();
				       break;
				       
				case 3:int num=cash.getSize();
	       				System.out.println("The number of people in queue:"+num); 
	       				break;
				case 4:System.exit(0);
						
				default:System.out.println("you entered wrong choice");
				        break;
				           
				}
				
			}while(ch<5);
		}

	
}
