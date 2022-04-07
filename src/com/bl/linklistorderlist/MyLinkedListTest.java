package com.bl.linklistorderlist;


import org.junit.Test;

public class MyLinkedListTest {
	
	@Test
	public void addFirstTest() {
		System.out.println("***********Adding at First************");
		MyLinkedList<Integer> addlist = new MyLinkedList<Integer>();
		INode<Integer> firstNode = new MyNode<>(10);
		INode<Integer> secondNode = new MyNode<>(20);
		INode<Integer> thirdNode = new MyNode<>(30);
		INode<Integer> fourthNode = new MyNode<>(30);
		
		
		addlist.addFirst(firstNode);
		addlist.addFirst(secondNode);
		addlist.addFirst(thirdNode);
		addlist.addFirst(fourthNode);
		
		System.out.println(addlist);
		
		int size = addlist.size();
		System.out.println("Size of the Linked List is :" + size);
		System.out.println();
		
		
	}
	
	
	
	@Test
	public void addLastTest() {
		System.out.println("************Adding At lAST**************");
		MyLinkedList<Integer> list = new MyLinkedList<Integer>();
		INode<Integer> fourthnode = new MyNode<Integer>(100);
		list.addLast(fourthnode);
		System.out.println(list);
//		MyLinkedList<String> list = new MyLinkedList<String>();
//		INode<String> fourthnode = new MyNode<String>("Ram");
//		list.addLast(fourthnode);
//		System.out.println(list);  This is one way of using Generics by passing strings.Hence we can say that the type of what generics we will use is specified in Main class or Test class
		
		int size = list.size();
		System.out.println("Size of the Linked List is :" + size);
		System.out.println();
		
	}
	
	@Test
	public void multipleTest() {
		System.out.println("**************Inserting at position*******************");
		MyLinkedList<Integer> addlist = new MyLinkedList<>();
		INode<Integer> firstNode = new MyNode<Integer>(10);
		INode<Integer> secondNode = new MyNode<Integer>(20);
		INode<Integer> fourthNode = new MyNode<Integer>(30);
		INode<Integer> fifthNode = new MyNode<Integer>(60);
		INode<Integer> sixthNode = new MyNode<Integer>(50);
		INode<Integer> seventhNode = new MyNode<Integer>(70);
		INode<Integer> eighthNode = new MyNode<Integer>(80);
		INode<Integer> ninthNode = new MyNode<Integer>(90);
		addlist.addFirst(firstNode);
		addlist.addFirst(secondNode);
		addlist.addFirst(fourthNode);
		addlist.addLast(sixthNode);
		addlist.addAtPosition(3, fifthNode);
		addlist.addLast(ninthNode);
		addlist.addLast(eighthNode);
		addlist.addLast(seventhNode);
		int size = addlist.size();
		System.out.println(addlist);
		System.out.println("Size of the Linked List is :" + size);
		System.out.println();
		System.out.println("Popping out the first element!!");
		addlist.popFirst();
		System.out.println(addlist);
		 size = addlist.size();
		System.out.println("Size of the Linked List is :" + size);
		System.out.println();
		System.out.println("Popping out the last element!!");
		addlist.popLast();
		System.out.println(addlist);
		size = addlist.size();
		System.out.println("Size of the Linked List is :" + size);
		System.out.println();
		System.out.println("Popping the node from between using remove method!!");
		addlist.remove(fifthNode);
		System.out.println(addlist);
		size = addlist.size();
		System.out.println("Size of the Linked List is :" + size);
		System.out.println();
		System.out.println("Popping the node from last using remove method!!");
		addlist.remove(eighthNode);
		System.out.println(addlist);
		size = addlist.size();
		System.out.println("Size of the Linked List is :" + size);
		System.out.println();
		System.out.println("Popping the first from last using remove method!!");
		addlist.remove(secondNode);
		System.out.println(addlist);
		size = addlist.size();
		System.out.println("Size of the Linked List is :" + size);
		System.out.println();
	}
	
	@Test
	public void searchNode() {
		System.out.println("**************Inserting at position*******************");
		MyLinkedList<Integer> addlist = new MyLinkedList<>();
		INode<Integer> firstNode = new MyNode<Integer>(10);
		INode<Integer> secondNode = new MyNode<Integer>(20);
		INode<Integer> fourthNode = new MyNode<Integer>(30);
		INode<Integer> fifthNode = new MyNode<Integer>(60);
		INode<Integer> sixthNode = new MyNode<Integer>(50);
		addlist.addFirst(firstNode);
		addlist.addFirst(secondNode);
		addlist.addFirst(fourthNode);
		addlist.addLast(sixthNode);
		addlist.addAtPosition(3, fifthNode);
		//addlist.searchNode(new MyNode<Integer>(90));-> one way
		System.out.println("Search result: "
				+ addlist.searchNode(new MyNode<Integer>(50)));
		System.out.println();
		System.out.println("Index is:" + addlist.searchIndex(new MyNode<Integer>(20)));//(new MyNode<Integer>(20))-> This means Integer type is passed in MyNode
		System.out.println();
		System.out.println("Searching with the index to get the Node");
		System.out.println(addlist.searchNode(2));
		System.out.println();
	}
	
	
}
