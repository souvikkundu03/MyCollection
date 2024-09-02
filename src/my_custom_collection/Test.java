package my_custom_collection;
public class Test {

	public static void main(String[] args) {
		
		DoublyLinkedList list = new DoublyLinkedList();
		
		list.add(8);
		list.add(3);
		list.add(6);
		list.addFirst(9);
		list.add(0);
		list.add(2);
		list.add(4);
		list.printList();
//		list.deleteNode(6);
//		list.deleteLastNode();

		list.printList();
	}

}
