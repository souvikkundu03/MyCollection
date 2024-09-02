package my_custom_collection;

import static my_custom_collection.ConstantsFile.EMPTYSTRING;
import static my_custom_collection.ConstantsFile.INVALIDPOSITION;
import static my_custom_collection.ConstantsFile.NOTFOUND;
import static my_custom_collection.ConstantsFile.DELETEDDATA;
import static my_custom_collection.ConstantsFile.NULLSTRING;

public class LinkedListPrac {

	private Node head; 

	static class Node {

		Object data;
		Node next;

		public Node(Object data) {
			this.data = data;
			this.next = null;
		}
	}

	void addNode(Object data) {

		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			return;
		} else {
			Node current = head;
			while (current.next != null) {
				current = current.next;
			}
			current.next = newNode;
		}

	}

	void addFirst(Object data) {
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
	}

	void insertAt(Object data, int position) {

		if (head == null) {
			System.out.println(EMPTYSTRING);
			return;
		}
		Node newNode = new Node(data);
		if (position <= 0) {
			newNode.next = head;
			head = newNode;
			return;
		}
		Node current = head;
		int currentPosition = 0;
		while (current != null && currentPosition < position - 1) {
			current = current.next;
			currentPosition++;
		}
		if (current == null || currentPosition > position - 1) {
			System.out.println(INVALIDPOSITION);
			addNode(data);
		} else {
			newNode.next = current.next;
			current.next = newNode;
		}
	}

	void deleteLastNode() {

		if (head == null) {
			System.out.println(EMPTYSTRING);
			return;
		} else {
			Node current = head;
			while (current.next.next != null) {
				current = current.next;
			}
			System.out.println(DELETEDDATA + current.next.data);
			current.next = null;
		}

	}

	void deleteFirstNode() {

		if (head == null) {
			System.out.println(EMPTYSTRING);
			return;
		} else {
			System.out.println(DELETEDDATA + head.data);
			head = head.next;
		}

	}

	void deleteNode(Object data) {
		if (head == null) {
			System.out.println(EMPTYSTRING);
			return;
		}
		Node current = head;
		Node prev = null;
		if (current != null && current.data == data) {
			head = current.next;
			return;
		}
		while (current != null && current.data != data) {
			prev = current;
			current = current.next;
		}
		if (current == null) {
			System.out.println(NOTFOUND);
			return;
		}
		prev.next = current.next;
	}

	void printList() {
		Node current = head;
		if (head == null) {
			System.out.println(EMPTYSTRING);
			return;
		}
		while (current != null) {
			System.out.print(current.data + " --> ");
			current = current.next;
		}
		System.out.print(NULLSTRING);
	}
	void reverseList() {
		
	}

}
