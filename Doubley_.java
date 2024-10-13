package LinnkedList;


	public class Doubley_ {
		  Node head;

		  static class Node {
		    int data;
		    Node prev;
		    Node next;

		    Node(int data) {
		      this.data = data;
		      this.prev = null;
		      this.next = null;
		    }
		  }

		  public void deleteNodeAtPosition(int position) {
		    if (head == null) {
		      System.out.println("List is empty");
		      return;
		    }

		    Node temp = head;
		    int count = 0;

		    // Traverse to the node before the node to be deleted
		    while (temp != null && count < position - 1) {
		      temp = temp.next;
		      count++;
		    }

		    if (temp == null || temp.next == null) {
		      System.out.println("Position out of bounds");
		      return;
		    }

		    Node nodeToDelete = temp.next;
		    Node prevNode = temp;
		    Node nextNode = nodeToDelete.next;

		    // Copy references of previous and next nodes from the node to be deleted
		    prevNode.next = nextNode;
		    if (nextNode != null) {
		      nextNode.prev = prevNode;
		    }

		    // Remove the node to be deleted
		    nodeToDelete = null;

		    System.out.println("Node deleted at position " + position);
		  }

		  public void printList() {
		    Node temp = head;
		    while (temp != null) {
		      System.out.print(temp.data + " ");
		      temp = temp.next;
		    }
		    System.out.println();
		  }

		  public static void main(String[] args) {
			  Doubley_ dll = new Doubley_();
		    dll.head = new Node(1);
		    dll.head.next = new Node(2);
		    dll.head.next.prev = dll.head;
		    dll.head.next.next = new Node(3);
		    dll.head.next.next.prev = dll.head.next;

		    dll.printList(); // prints: 1 2 3

		    dll.deleteNodeAtPosition(2);
		    dll.printList(); // prints: 1 3
		  }
		}


