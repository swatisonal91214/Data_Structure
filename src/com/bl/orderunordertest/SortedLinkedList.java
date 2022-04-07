package com.bl.orderunordertest;

	public class SortedLinkedList<K extends Comparable<K>>
			implements OrderedList<K> {

		MyLinkedList<K> list;
		
		public SortedLinkedList() {
			list = new MyLinkedList<>();
		}

		@Override
		public void add(K item) {
			INode<K> itemNode = new MyNode<K>(item);
			int pos = 0;
			for (int i = 0; i < list.size(); i++) {
				if (list.searchNode(i).getKey().compareTo(item) > 0) {
					pos = i;
				} else {
					pos = i + 1;
				}
			}
			list.addAtPosition(pos, itemNode);
		}

		@Override
		public void remove(K item) {
			INode<K> itemNode = new MyNode<K>(item);
			list.remove(itemNode);
		}

		@Override
		public boolean search(K item) {
			INode<K> itemNode = new MyNode<K>(item);
			return list.searchNode(itemNode);
		}

		@Override
		public boolean isEmpty() {
			return size() == 0;
		}

		@Override
		public int size() {
			return list.size();
		}

		@Override
		public int index(K item) {
			INode<K> itemNode = new MyNode<K>(item);
			return list.searchIndex(itemNode);
		}

		@Override
		public K pop() {
			INode<K> popNode = list.pop();
			return popNode.getKey();
		}

		@Override
		public K pop(int pos) {
			INode<K> popNode = list.popNode(pos);
			return popNode.getKey();
			//return null;
		}
		
		@Override
		public String toString() {
			return list.toString();
		}
	}

