package com.bl.linklist_integer;

public class Node {
	int data;
	Node next;
	
	
	public int getData() {
		return data;
	}


	public void setData(int data) {
		this.data = data;
	}


	public Node getNext() {
		return next;
	}


	public void setNext(Node next) {
		this.next = next;
	}


//	@Override
//	public String toString() {
//		return "Node [data=" + data + ", next=" + next
//				+ "]";
//	}
	
	
	

	@Override
	public String toString() {
		StringBuffer strBuffer = new StringBuffer();
		strBuffer.append("Node{" + data + "}");
		if(next != null) {
			strBuffer.append("=>" + next);
		}
		return strBuffer.toString();
	}
	
	
}
