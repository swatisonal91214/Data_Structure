package com.bl.linklistunorderlist;

	public interface UnOrderedList<K> {

		//adding new item to the first
		public void add(K item); 

		//adding new item to the last
		public void append(K item); 
		
		public void remove(K item);
		
		public boolean search(K item);
		
		public boolean isEmpty();
		
		public int size();
		
		public int index(K item);
		
		public void insert(int pos, K item);

		public K pop();
	}

