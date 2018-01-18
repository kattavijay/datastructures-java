package net.javamix.ds.linkedlist;

public class InsertLinkedList {

	Node head; // Head element of the node

	// Node class
	static class Node {
		int data;
		Node next;

		// Constructor to create and set the data
		Node(int inputData) {
			data = inputData;
			next = null;
		}

	}

	public static void main(String args[]) {

		InsertLinkedList illist = new InsertLinkedList();

		try {

			illist.head = new Node(1);

			Node second = new Node(2);

			Node three = new Node(3);

			illist.head.next = second;

			second.next = three;

			// Inserting the new node at front of the linkedlist
			illist.push(illist, 4);

			// Insert new node at previous element
			illist.givenAfter(second, 5);

			// Insert new node at end
			illist.appendNode(6);
			
			illist.printNode();

		} catch (Exception ex) {

		}
	}

	// Print the nodes

	public void printNode() {

		Node node = head;

		while (head != null) {
			System.out.print(node.data + " ");
			node = node.next;
		}
	}

	public void push(InsertLinkedList illist, int givenData) {

		try {

			Node frontNode = new Node(givenData); // create the new node

			frontNode.next = illist.head; // link the old head to the current head

			illist.head = frontNode; // now new node is the HEAD
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public void givenAfter(Node preNode, int givenData) {
		// Inserting the node at given position

		try {

			if (preNode == null) {

				System.out.println("Previous node can not be empty");
			} else {
				Node givenNode = new Node(givenData);

				givenNode.next = preNode.next;

				preNode.next = givenNode;

				System.out.println("Node created and updated!!");
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public void appendNode(int givenData) {
		
		try
		{
		
			Node last = head;
			
			while(last.next!=null)
			{			
				last = last.next;
			}
			
			Node lastNode = new Node(givenData);
			
			last.next = lastNode;
			
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}

	}

}
