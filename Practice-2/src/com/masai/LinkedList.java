package com.masai;

public class LinkedList {
	Node head;
	private int size;
	
	LinkedList(){
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
	
	//Add First Position
	public void addFirst(String data) {
		Node newNode = new Node(data);
		
		if(head == null) {
			head = newNode;
			return;
		}
		
		newNode.next = head;
		head = newNode;
	}
	
	//Add Last Position
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
			System.out.println("List is Empty");
			return;
		}
		Node currNode = head;
		while(currNode != null) {
			System.out.print(currNode.data+" -> ");
			currNode = currNode.next;
		}
		System.out.println("NULL");
	}
	
	//Delete First Node
	public void deleteFirst() {
		if(head == null) {
			System.out.println("The list is null");
			return;
		}
		size--;
		
		head = head.next;
	}
	
	//Delete Last Node
	public void deleteLast() {
		if(head == null) {
			System.out.println("The list is Empty");
			return;
		}
		
		size--;
		
		//if head's next is null;
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
	
	public int getSize() {
		return size;
	}
	
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		
		list.addFirst("a");
		list.addFirst("is");
		list.printList();
		
		list.addLast("List");
		list.printList();
		
		list.addFirst("This");
		list.printList();
		
		list.deleteFirst();
		list.printList();
		
		list.deleteLast();
		list.printList();
		
		System.out.println(list.getSize());
		
		list.addFirst("This");
		System.out.println(list.getSize());
	}
}
