package Data_structure;

import java.io.File;
import java.util.Scanner;

public class LinkedListAll {

		static Node head;
		
		public static class Node
		{
			String data;
			Node next;
			
			Node(String d)
			{
				data = d;
				next= null;
			}
		}
		
		public static LinkedListAll insertFirst(LinkedListAll list , String data1)
		{
			Node new_node = new Node(data1);
			
			if(list.head == null)
			{
				list.head = new_node;
			}
			else
			{
				new_node.next = list.head;
				list.head = new_node;
			}
			
			return list;
		}
		
		public static LinkedListAll insertLast(LinkedListAll list , String data1)
		{
			Node new_node = new Node(data1);
			Node temp = list.head;
			
			while(temp.next != null)
			{
				temp = temp.next;
			}
			
			temp.next = new_node;
		return list;
		}
		
		public static LinkedListAll insertAtPos(LinkedListAll list , String data1, int pos)
		{
			Node new_node = new Node(data1);
			Node temp = list.head;
			
			for(int i= 0;i<=pos-2;i++)
			{
				temp =temp.next;
			}
			
			new_node.next = temp.next;
			temp.next = new_node;
				
			return list;
		}
		public static LinkedListAll print(LinkedListAll list)
		{
			 Node currNode = list.head; 
			  
		        System.out.print("LinkedList: "); 
		  
		    
		        while (currNode != null) { 
		         
		            System.out.print(currNode.data + " "); 
		  
		        
		            currNode = currNode.next; 
		        }
				return list; 
		}
		
		public static int cnt(LinkedListAll list)
		{
			 Node currNode = list.head; 
			  int count =0;
		        System.out.print("LinkedList: "); 
		  
		    
		        while (currNode != null) { 
		         count++;

		         currNode = currNode.next; 
		        }
				return count; 
		}
		public static LinkedListAll deleteFirst(LinkedListAll list)
		{
			Node temp = list.head;
			if(temp.next == null)
			{
				LinkedListAll.head = temp.next;
				return list;
			}
			else
			{
				LinkedListAll.head = temp.next;;
			}
			return list;
		}
		
		public static LinkedListAll deleteLast(LinkedListAll list)
		{
			Node temp = list.head;
			
			while(temp.next.next!=null)
			{
				temp = temp.next;
			}
			temp.next = null;
			
			return list;
		}
		
		public static LinkedListAll deleteAtPos(LinkedListAll list,int pos)
		{
			
			Node temp = list.head;
			Node temp1 = null;
			for(int i = 0;i<pos-2;i++)
			{
				temp = temp.next;
			}
			
			temp1 = temp.next;
			temp.next = temp1.next; 
			
			return list;
		}
		
		 public static LinkedListAll search(LinkedListAll list , String x) 
		    { 
			 System.out.println(list+"   "+x);
		        Node current = head;  
		        int count = 0;//Initialize current 
		        while (current != null) 
		        { 
		        	count++;
		    
		            if (x.compareTo(current.data) == 0)
		            {
		            	System.out.println("count"+count);
		            	         
		            	if(count == 1)
		            	{
		            		
		            		list = LinkedListAll.deleteFirst(list);
		            	}
		            	else if(count == cnt(list))
		            	{
		            		list = LinkedListAll.deleteLast(list);
		            	}
		            	else
		            	{
		            		list = LinkedListAll.deleteAtPos(list, count);
		            	}
		            
		                return list;    //data found 
		                
		            }
		            current = current.next;
		        
		            if(x.compareTo(current.data) <= 0)
		            {
		            	list = LinkedListAll.insertLast(list, x);
		            	return list;
		            }
		           
		        }  				
		        
		      return list;    //data not found 
		    } 
							
		
		public static void main(String[] args) throws NullPointerException{
			
			File file = new File("/home/admin1/eclipse-workspace/bridgelabz/src/Data_structure/abc.txt");
			try
			{
				Scanner sc = new Scanner(file);
				String data = sc.nextLine();
				
				String arr[]= data.split(" ");
				
			LinkedListAll lla = new LinkedListAll();
				for(int i=0;i<arr.length;i++)
				{
					lla = insertFirst(lla, arr[i]);
				}
				print(lla);
				Scanner sc1 = new Scanner(System.in);
				System.out.println("\nEnter the key to be searched :: ");
				String key = sc1.next();
			    lla= search(lla, key);
			    print(lla);
				
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
	}
}