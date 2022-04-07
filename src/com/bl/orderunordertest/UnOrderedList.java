package com.bl.orderunordertest;

public interface UnOrderedList<K> {

	public void add(K item);
	public void append(K item);
	public void remove(K item);
	public boolean search(K item);
	public boolean isEmpty();
	public int size();
	public int index(K item);
	public void insert(int pos, K item);
	public K pop();
}
