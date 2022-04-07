package com.bl.linklist_integer;

public class MainClass {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.insertNode(10);
		list.insertNode(30);
		list.insertNode(45);
		list.insertFirst(5);
		list.insertPosition(1, 12);
		
		list.print();
		System.out.println(list);
		list.popFirst();
		
		list.print();
		System.out.println(list);
		list.popOut(2);
		
		list.print();
		
		System.out.println(list);
		}
}
