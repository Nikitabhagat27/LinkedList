package LinnkedList;

public class LinkedListClient {
	public static void main(String[] args) {
		SingleyLinkedList list = new SingleyLinkedList();
		list.addLastUsingTail(10);
		list.addLastUsingTail(20);
		list.addLastUsingTail(30);
		list.addLastUsingTail(40);
		list.addLastUsingTail(50);
//		list.addFirst(70);
		//list.addLastUsingTail(50);
		list.addMid(4, 90);
		list.print();
		System.out.println();
		System.out.println(list.size());
		
	
	
	}
}
