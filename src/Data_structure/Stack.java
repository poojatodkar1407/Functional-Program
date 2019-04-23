package Data_structure;

import Data_structure.Queue.Node;

public class Stack<T> {
	Node head;
	
	int top = -1;
	Node<T> next;
	
	static class Node<T>
	{
		T data;
		Node<T> next;
		
		Node(T data)
		{
			this.data = data;
			this.next = null;
		}		
	}
	
	public void push(T data)
	{
		Node new_node = new Node(data);
		Node temp = head;
		if(head == null)
		{
			head  = new_node;
			top++;
			return;
		}
		else
		{
			while(temp.next != null)
			{
				temp = temp.next;
			}
			temp.next = new_node;
			top++;
			new_node.next = null;
		}
	}
	
	public boolean isEmpty()
	{
		return (head == null);
	}
	
	public String pop()
	{
		Node current = head;
		head = current.next;
		top--;
		
		return (String) current.data;		
	}
	
	public int size()
	{
		return top;
	}

	public void display()
	{
		Node new_node = head;
		int size = size();
		for(int i = 0 ; i <size;i++)  //traverse till last
		{
			System.out.print(new_node.data+" ");
			new_node = new_node.next;
			
		}
		
	}
	
		public <T> T peek()
		{
			if(head == null)
			{
				System.out.println("No elements found");
				return null;
			}
			
			return (T) head.data;
		
		}
}
