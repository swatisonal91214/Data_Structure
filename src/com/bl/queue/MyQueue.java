package com.bl.queue;

public class MyQueue<K> {

	MyLinkedList<K> list;

	public MyQueue() {
		list = new MyLinkedList<>();
	}

	public boolean enqueue(K item) {
		INode<K> itemNode = new MyNode<K>(item);
		return list.addLast(itemNode);
	}

	public K dequeue() {
		return list.pop().getKey();
	}

	public boolean isEmpty() {
		return size() == 0;
	}

	public int size() {
		return list.size();
	}
	
	@Override
	public String toString() {
		return list.toString();
	}
}


