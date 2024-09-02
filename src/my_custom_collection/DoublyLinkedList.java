package my_custom_collection;

public class DoublyLinkedList {
	private Node head;

	static class Node {
		Object data;
		Node next;
		Node prev;

		public Node(Object data) {
			this.data = data;
			this.next = null;
			this.prev = null;
		}
	}

	void add(Object data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			return;
		} else {
			Node current = head;
			while (current.next != null) {
				current = current.next;}
			current.next = newNode;
			newNode.prev = current;}

	}

	void addFirst(Object data) {
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
	}

	void insertAt(Object data, int position) {
		if (position <= 0) {
			addFirst(data);
			return;}
		Node newNode = new Node(data);
		Node current = head;
		int currentPosition = 0;
		while (current != null && currentPosition < position - 1) {
			current = current.next;
			currentPosition++;}
		if (current == null || currentPosition > position - 1) {
			System.out.println("Invalid position. Inserting at the end.");
			add(data);
		} else {
			newNode.next = current.next;
			newNode.prev = current;
			current.next = newNode;}
	}

	void deleteLastNode() {

		if (head == null) {
			System.out.println("List is Empty.");
			return;
		} else {
			Node current = head;
			while (current.next.next != null) { current = current.next;}
			System.out.println("Deleted data : " + current.next.data);
			current.next.prev = null;
			current.next = null;
			}

	}

	void deleteFirstNode() {

		if (head == null) {
			System.out.println("List is Empty.");
			return;
		} else {
			System.out.println("Deleted data : " + head.data);
			head = head.next;
			head.prev = null;}

	}

	void deleteNode(Object data) {

		Node current = head;
		Node temp = null;
		if (current != null && current.data == data) {
			head = current.next;
			head.prev = null;
			return;}
		while (current != null && current.data != data) {
			temp = current;
			current = current.next;}
		if (current == null) {
			System.out.println("Node with key " + data + " not found.");
			return;}
		if (current.next == null) {
			deleteLastNode();
			return;}
		temp.next = current.next;
		current.next.prev = temp;
		current.next = null;
		current.prev = null;
	}

	void printList() {
		Node current = head;
		if (head == null) {
			System.out.println("List is Empty.");
			return;}
		while (current != null) {
			System.out.print(current.data + " <--> ");
			current = current.next;}
		System.out.print("NULL\n");
	}
}
