package com.bl.practice;

public class MyHashTable<K, V> {
	
	int bucketSize;
	MyLinkedList<K>[] myBucketList;
	
	public MyHashTable(int bucketSize) {
		this.bucketSize = bucketSize;
		this.myBucketList = new MyLinkedList[bucketSize];
	}
	
	public void add(K key,V value) {
		int bucketIndex = Math.abs(key.hashCode()%bucketSize);
		if(myBucketList[bucketIndex] == null) {
			myBucketList[bucketIndex] = new MyLinkedList<>();
		}
		MyMapNode<K, V> nodeObj = (MyMapNode<K, V>) myBucketList[bucketIndex].search(key);
		if(nodeObj == null) {
			nodeObj = new MyMapNode<K, V>(key, value);
			myBucketList[bucketIndex].addLast(nodeObj);
		}else {
			nodeObj.setValue(value);
		}
	}
	
	public V get(K key) {
		int bucketIndex = Math.abs(key.hashCode() % bucketSize);
		if(myBucketList[bucketIndex]== null) {
			myBucketList[bucketIndex] = new MyLinkedList<>();
		}
		@SuppressWarnings("unchecked")
		MyMapNode<K, V> node =(MyMapNode<K, V>) myBucketList[bucketIndex].search(key);
		return node == null ? null : node.getValue();
	}
	
	public void print() {
		for(int i = 0; i < myBucketList.length; i++ ) {
			if(myBucketList[i] != null) {
				System.out.println("BucketIndex : " + i + ":" + myBucketList[i].size() + ":" + myBucketList[i]);
			}
		}
	}

}
