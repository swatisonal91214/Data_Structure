package com.bl.orderunordertest;

public interface OrderedList<K> {

	//adding new item to the first
	public void add(K item); 
	
	public void remove(K item);
	
	public boolean search(K item);
	
	public boolean isEmpty();
	
	public int size();
	
	public int index(K item);
	
	public K pop();

	public K pop(int pos);
}
