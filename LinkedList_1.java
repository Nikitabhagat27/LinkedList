package LinnkedList;

public class LinkedList_1 {
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
	
	public void addFirst(int data) {
		//step 1= create a new node
		Node newNode =  new Node(data);
		size++;
		if(head==null) {
			head = tail = newNode;
			return;
		}
				
		//step2 = newNode next = head
		newNode.next = head;//link
		
		//step.3 head = newNode
		head = newNode;
		
		
	}
	
	public void addLast(int data) {
		Node newNode=new Node(data);
		size++;
		if(head ==null) { //tail bhi le skte hai pr head ko hi null mana jata hai 
			head= tail= newNode;
			return;
			
		}
		
		tail.next =newNode;
		tail=newNode;
		
	}
	public void print() {
		if(head== null){
			System.out.println("linked list is empty");
			return;
		}
		Node temp = head;
		while(temp!=null){
			System.out.print( temp.data +" ->");
			temp= temp.next;
			
			}
		System.out.println("null");
	}
	public void add(int index, int data) {
		//add  head 
		if(index==0) {
			addFirst(data);
			return;
		}
		Node newNode =  new Node(data);
		size++;
		Node temp =head;
		int i= 0;
		while(i<index-1){
			temp= temp.next;
			i++;
		}
		//i=index-1 ; temp -> prev node
		newNode.next=temp.next;
		temp.next=newNode;
	}
	
	public int removeFirst() {
		
		if(size==0) {
			System.out.println( "listt is empty");
			return Integer.MIN_VALUE;
			
		}else if(size==1) {
			int val=head.data;
			head=tail=null;
			size=0;
			return val;
		}
		int val =head.data;
		head= head.next;
		size--;
		return val;
	}
    public int removeLast() {
	if(size == 0) {
		System.out.println( "ll is empty");
		return Integer.MIN_VALUE;
		
	}else if(size == 1) {
		int val = head.data;
		head = tail =null;
		size=0;
		return val;
	}
	
	//prev:i = size-2 
	Node prev =head;
	for(int i =0 ; i<size-2; i++) {
		prev=prev.next;
	}
	int val = prev.next.data;
	prev.next=null;
	tail=prev;
	size--;
	return val;
	
    }
    public int itrSearch(int key) {
    	Node temp = head;
    	 int i=0;
    	 while (temp!= null) {
    		 if(temp.data ==key) {
    			 return i;
    		 }
    		 temp = temp.next;
    		 i++;
    	 }
    	 
    	 //key  not found case
    	 return -1;
    }
    public int helper(Node head, int key) {
    	if(head==null) {
    		return -1;
    	}
    	if(head.data == key) {
    		return 0;
    	}
    	int index = helper(head.next,key);
          if(index== -1) {
        	  return -1;
          }
    	return index+1;
          
    }
    public int recursiveSearch(int key) {
    	return helper(head ,key);
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
    public void deleteNthfromEnd(int n) {
    	//calculate size of linnklist
    	int size=0;
    	Node temp=head;
    	while(temp!=null) {
    		temp=temp.next;
    		size++;
    		}
    	if(n==size) {
    		head = head.next;//removeFirst
    		return;
    		
    	}
    	//size -n 
    	int i=1;
    	int indexToFind=size-n;
    	Node prev =head;
    	while(i< indexToFind) {
    		prev=prev.next;
    		i++;
    	}
    	prev.next = prev.next.next;
    	return;
    }
    public static void main(String[] args) {
	LinkedList_1  ll =new  LinkedList_1 ();//object node create krne ke liye
	//ll.print();
	ll.addFirst(2);
	//ll.print();
	ll.addFirst(1);
	//ll.print();
	ll.addLast(4);
	//ll.print();
	ll.addLast(5);
	//ll.print();
	ll.add(2, 3);
	ll.print();
	System.out.println("reverese linked list");
	ll.reverse();
	ll.print();
	//System.out.println(ll.size); 
	 System.out.println( "after first remove");
    ll.removeFirst();
    ll.print();
    System.out.println( "after last remove");
    ll.removeLast();
    ll.print();
    System.out.println( "size of linkedlist");
    System.out.println( ll.size);
    ll.print();
    //search 3  after  remove first
   // System.out.println("search 3  after  remove first");
   // System.out.println(ll.itrSearch(3));
    System.out.println("not fount elemenet/key");
   // System.out.println(ll.itrSearch(10));
   // ll.itrSearch(4);
    System.out.println(ll.recursiveSearch(4));
    System.out.println(ll.recursiveSearch(13));
    ll.print();
    ll.deleteNthfromEnd(3);
    ll.print();
    
    
    
}
}
