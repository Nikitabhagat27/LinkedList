package LinnkedList;



public class DoublyLinkedList {
	private Node head;
	private Node tail;
	private int size;

	public void add(int data) {
		Node node = new Node(data, null, null);
		if (head == null) {
			head = node;
			tail = head;
			size++;
		}
		else {
			tail.next = node;
			node.previous = tail;
			tail = node;
			size++;
		}
	}

	public void addFirst(int data) {
		Node node = new Node(data, null, null);
		node.next = head;
		head.previous = node;
		head = node;
		size++;
	}

	public void add(int position, int data) {
		Node node = new Node(data, null, null);
		Node temp = head;
		for (int i = 1; i < position; i++) {
			temp = temp.next;
		}
		node.next = temp;
		node.previous = temp.previous;
		temp.previous.next = node;
		temp.previous = node;
		size++;
	}

	public void addLast(int data) {
//		Node node = new Node(data, null, null);
//		tail.next = node;
//		node.previous = tail;
//		tail = node;
//		size++;
		add(data);
	}

	public int size() {
		return size;
	}

	public void print() {
		Node temp = head;
		for (int i = 0; i < size; i++) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}

	public void printReverse() {
		Node temp = tail;
		for (int i = 0; i < size; i++) {
			System.out.println(temp.data);
			temp = temp.previous;
		}
	}

	class Node {
		private int data;
		private Node previous;
		private Node next;

		public Node(int data, Node previous, Node next) {
			super();
			this.data = data;
			this.previous = previous;
			this.next = next;
		}

	}
}
