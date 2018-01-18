package net.javamix.ds.linkedlist;

public class DoubleLinkedList {

	Node head; // Head node

	static class Node {

		int data;
		Node next;
		Node previous;

		Node(int givenData) {
			data = givenData;
		}
	}// end of node creation method

	public void printNode() {

		Node node = head;

		while (node != null) {
			System.out.print(node.data + " ");
			node = node.next;
		}
	}// end of printnode method

	public static void main(String args[]) {

		DoubleLinkedList dllist = new DoubleLinkedList();
		
		try {
			
			dllist.head = new Node(1);
			
			Node second = new Node(2);
			
			Node three = new Node(3);
			
			Node four = new Node(4);
			
			dllist.head.next = second;
			
			second.previous = dllist.head;
			
			second.next = three;
			
			three.previous = second;
			
			three.next = four;
			
			four.previous = three;
			
			dllist.printNode();
			
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		
	}// end of main method
}// End of class
