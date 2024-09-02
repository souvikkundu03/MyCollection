package my_custom_collection;

public class Queue {
	private int size;
	Object queue[];
	private int front;
	private int rear;

	public Queue(int size) {
		this.size = size;
		queue = new Object[size];
		front = rear = -1;
	}

	void enqueue(Object element) {
		if (rear == -1) {
			rear = rear + 1;
			queue[rear] = element;
			front = rear;
		} else if (rear == size - 1) {

		} else {
			rear = rear + 1;
			queue[rear] = element;
		}
	}
	Object dequeue(){
		Object element = null;
		if (front == -1) {
			
		} else if (rear == front) {
			element = queue[front];
			front = rear = -1;
		} else {
			element = queue[front];
			front = front + 1;
		}
		return element;
	}
	void printFrontandRear() {
		System.out.println("Front pointer is at the index: " + front);
		System.out.println("Front: " + queue[front]);
		System.out.println("Rear pointer is at the index: " + rear);
		System.out.println("Rear: " + queue[rear]);
	}
	void printQueue() {
		for(int index = front; index <= rear; index++) {
			System.out.print("| " + queue[index] + " |");
		}
	}
}
