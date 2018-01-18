package net.javamix.ds.linkedlist;

public class BasicLinkedList {

	Node head; // Head of list

	/* Linked list node */
	static class Node {
		int data;
		Node next;

		//Constructor to create a new node
		//next is created default with null
		Node(int inputData) {
			data = inputData;
		}

	}
	
	public static void main(String args[])
	{
		
		/* create an empty list */
		BasicLinkedList blist = new BasicLinkedList();
		
		blist.head = new Node(1);
		
		Node second = new Node(2);
		
		Node third = new Node(3);
		
		blist.head.next = second ;
		
		second.next = third;
		
		System.out.println("Printing the Node elements :");
		
		
		blist.printList();
		
	}
	
	public void printList()
	{
		Node node = head;
		
		while(node!=null)
		{
			
			System.out.print(node.data+" ");
			node=node.next;
			
		}
		
		
	}

}
