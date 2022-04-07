package com.bl.linklistdarpan;

public class MyNode<K> implements INode<K> {

	K key;
	INode<K> next;

	public MyNode(K key) {
		this.key = key;
	}

	public K getKey() {
		return key;
	}

	public void setKey(K key) {
		this.key = key;
	}

	public INode<K> getNext() {
		return next;
	}

	public void setNext(INode<K> next) {
		this.next = next;
	}

	@Override
	public String toString() {
		StringBuffer strBuffer = new StringBuffer();
		strBuffer.append("MyNode{" + key + "}");
		if (next != null) {
			strBuffer.append("=>" + next);
		}
		return strBuffer.toString();
	}
}
