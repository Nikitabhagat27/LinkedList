package LinnkedList;

//import LinnkedList.LinkedList_1.Node;

public class Reverse {
	public static class Node{
		int data;
		Node next;
		public Node(int data) {
			this.data=data;
			this.next=null;
			
		}
	}
	public static Node head;//node type hai
	public static Node tail;//node type hai 
	public static int  size;
	 
		public void add(int data) {
		    Node node = new Node(data);
		    if (head == null) {
		        head = node;
		        tail = head;
		    } else {
		        tail.next = node;
		        tail = node;
		    }
		    size++;
		
	}
	 public void reverse() {
	    	Node prev = null;
	    	Node current= tail =head;
	    	Node next;
	    	
	    	while(current != null){
	    	next =current.next;
	    	current.next =prev;
	    	prev=current;
	    	current=next;
	      	}
	    	head = prev;
	    	
	    }
	 
	 public void print() {
	        Node current = head;
	        while (current != null) {
	            System.out.print(current.data + " ");
	            current = current.next; 
	        }
	        System.out.println();
	    }

	    public static void main(String[] args) {
	        Reverse ll = new Reverse();
	        System.out.println("Original linked list:");
	        ll.add(1);
	        ll.add(2);
	        ll.add(3);
	        ll.add(4);
	        ll.print();

	        ll.reverse();
	        System.out.println("Reversed linked list:");
	        ll.print();
	    }
	}


