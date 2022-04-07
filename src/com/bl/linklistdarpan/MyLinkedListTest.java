package com.bl.linklistdarpan;

import org.junit.Test;


public class MyLinkedListTest {

	@Test
	public void addFirstThreeNode() {
		System.out.println(
				"----------------addFirstThreeNode---------------------");
		MyLinkedList<Integer> intList = new MyLinkedList<Integer>();
		INode<Integer> firstNode = new MyNode<>(70);
		INode<Integer> secondNode = new MyNode<>(30);
		INode<Integer> thirdNode = new MyNode<>(56);

		intList.addFirst(firstNode);
		intList.addFirst(secondNode);
		intList.addFirst(thirdNode);

		System.out.println(intList);
	}

	@Test
	public void appendNodeAtLast() {
		System.out.println(
				"------------------appendNodeAtLast--------------------");
		MyLinkedList<Integer> intList = new MyLinkedList<Integer>();
		INode<Integer> firstNode = new MyNode<>(56);
		INode<Integer> secondNode = new MyNode<>(30);
		INode<Integer> thirdNode = new MyNode<>(70);

		intList.addLast(firstNode);
		intList.addLast(secondNode);
		intList.addLast(thirdNode);

		System.out.println(intList);
		System.out.println(
				"Size of LinkedList : " + intList.size());
	}

	@Test
	public void insertNodeAtIndex() {
		System.out.println(
				"-------------------insertNodeAtIndex---------------------");
		MyLinkedList<Integer> intList = new MyLinkedList<Integer>();
		INode<Integer> firstNode = new MyNode<>(56);
		INode<Integer> secondNode = new MyNode<>(70);
		INode<Integer> thirdNode = new MyNode<>(30);
		INode<Integer> fourthNode = new MyNode<>(40);

		intList.addLast(firstNode);
		intList.addLast(secondNode);

		intList.insert(1, thirdNode);

		intList.insert(2, fourthNode);

		System.out.println(intList);
	}

	@Test
	public void pop() {
		System.out.println(
				"-------------------pop---------------------");
		MyLinkedList<Integer> intList = new MyLinkedList<Integer>();
		INode<Integer> firstNode = new MyNode<>(56);
		INode<Integer> secondNode = new MyNode<>(30);
		INode<Integer> thirdNode = new MyNode<>(70);

		intList.addLast(firstNode);
		intList.addLast(secondNode);
		intList.addLast(thirdNode);

		System.out.println("Before pop : " + intList);
		System.out.println(
				"Popped out node : " + intList.pop());
		System.out.println("After pop : " + intList);
	}

	@Test
	public void popLast() {
		System.out.println(
				"-------------------popLast---------------------");
		MyLinkedList<Integer> intList = new MyLinkedList<Integer>();
		INode<Integer> firstNode = new MyNode<>(56);
		INode<Integer> secondNode = new MyNode<>(30);
		INode<Integer> thirdNode = new MyNode<>(70);

		intList.addLast(firstNode);
		intList.addLast(secondNode);
		intList.addLast(thirdNode);

		System.out.println("Before pop : " + intList);
		System.out.println(
				"Popped out node : " + intList.popLast());
		System.out.println("After pop : " + intList);
	}

	@Test
	public void remove() {
		System.out.println(
				"-------------------remove---------------------");
		MyLinkedList<Integer> intList = new MyLinkedList<Integer>();
		INode<Integer> firstNode = new MyNode<>(56);
		INode<Integer> secondNode = new MyNode<>(30);
		INode<Integer> thirdNode = new MyNode<>(40);
		INode<Integer> fourthNode = new MyNode<>(70);

		intList.addLast(firstNode);
		intList.addLast(secondNode);
		intList.addLast(thirdNode);
		intList.addLast(fourthNode);

		System.out.println("Before pop : " + intList);
		intList.remove(firstNode);
		System.out.println("After pop : " + intList);
	}

	@Test
	public void search() {
		System.out.println(
				"-------------------search---------------------");
		MyLinkedList<Integer> intList = new MyLinkedList<Integer>();
		INode<Integer> firstNode = new MyNode<>(56);
		INode<Integer> secondNode = new MyNode<>(30);
		INode<Integer> thirdNode = new MyNode<>(40);
		INode<Integer> fourthNode = new MyNode<>(70);

		intList.addLast(firstNode);
		intList.addLast(secondNode);
		intList.addLast(thirdNode);
		intList.addLast(fourthNode);

		System.out.println("Search result: "
				+ intList.search(new MyNode<Integer>(60)));
	}

	@Test
	public void size() {
		System.out.println(
				"-------------------size---------------------");
		MyLinkedList<Integer> intList = new MyLinkedList<Integer>();
		intList.addFirst(new MyNode<Integer>(56));
		
		System.out.println("Search result: "
				+ intList.size());
	}

}