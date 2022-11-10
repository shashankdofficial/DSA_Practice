package interview;

public class LL {
	Node head;
	private int size;
	
	LL(){
		this.size = 0;
	}
	
	class Node{
		String data;
		Node next;
		
		Node(String data){
			this.data = data;
			this.next = null;
			size++;
		}
	}
	
	//Add first
	public void addFirst(String data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
			return;
		}
		
		newNode.next = head;
		head = newNode;
	}
	
	//Add Last position
	public void addLast(String data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
			return;
		}
		
		Node currNode = head;
		while(currNode.next != null) {
			currNode = currNode.next;
		}
		
		currNode.next = newNode;
	}
	
	//Print List
	public void printList() {
		if(head == null) {
			System.out.println("List is empty!");
			return;
		}
		
		Node currNode = head;
		while(currNode != null) {
			System.out.print(currNode.data+" -> ");
			currNode = currNode.next;
		}
		
		System.out.println("NULL!");
	}
	
	//Delete First
	public void deleteFirst() {
		if(head == null) {
			System.out.println("List is empty!");
			return;
		}
		size--;
		head = head.next;
	}
	
	//Delete Last
	public void deleteLast() {
		if(head == null) {
			System.out.println("List is empty!");
			return;
		}
		size--;
		if(head.next == null) {
			head = null;
			return;
		}
		
		Node secondLast = head;
		Node lastNode = head.next;
		while(lastNode.next != null) {
			lastNode = lastNode.next;
			secondLast = secondLast.next;
		}
		secondLast.next = null;
	}
	
	//Size
	public int getSize() {
		return size;
	}
	public static void main(String[] args) {
		LL list = new LL();
		
		list.addFirst("a");
		list.addFirst("is");
		list.printList();
		
		list.addFirst("This");
		
		list.addLast("List");
		list.printList();
		
		list.deleteFirst();
		list.printList();
		
		list.deleteLast();
		list.printList();
		
		System.out.println(list.getSize());
	}

}
