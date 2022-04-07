package com.bl.linklistdarpan;

	public class MyLinkedList<K> {

		 INode<K> head;
		 INode<K> tail;

		public boolean addLast(INode<K> newNode) {
			if (tail == null) {
				tail = newNode;
			}
			if (head == null) {
				head = newNode;
			} else {
				tail.setNext(newNode);
				tail = newNode;
			}
			return true;
		}

		public boolean addFirst(INode<K> newNode) {
			if (tail == null) {
				tail = newNode;
			}
			if (head == null) {
				head = newNode;
			} else {
				INode<K> temp = head;
				head = newNode;
				head.setNext(temp);
			}
			return true;
		}

		public boolean insert(int pos, INode<K> newNode) {
			if (pos == 0) {
				addFirst(newNode);
			} else if (pos == size()) {
				addLast(newNode);
			} else if (pos > size()) {
				return false;
			} else {
				INode<K> temp = head;
				for (int i = 1; i < pos; i++) {
					temp = temp.getNext();
				}
				INode<K> temp1 = temp.getNext();
				temp.setNext(newNode);
				newNode.setNext(temp1);
			}
			return true;
		}

		public int size() {
			INode<K> temp = head;
			int size = 0;
			while (temp != null) {
				size++;
				temp = temp.getNext();
			}
			return size;
		}

		public INode<K> pop() {
			INode<K> temp = head;
			head = head.getNext();
			temp.setNext(null);
			return temp;
		}

		public INode<K> popLast() {
			INode<K> temp = head;
			while (temp.getNext().getNext() != null) {
				temp = temp.getNext();
			}
			tail = temp;
			INode<K> poppedNode = tail.getNext();
			tail.setNext(null);
			return poppedNode;
		}

		@Override
		public String toString() {
			return head.toString();
		}

		public void remove(INode<K> node) {
			INode<K> temp = head;
			if (head.getKey().equals(node.getKey())) {
				head = temp.getNext();
				temp.setNext(null);
			} else {
				while (!temp.getNext().getKey().equals(node.getKey())&& temp.getNext() != null) {
					temp = temp.getNext();
				}
				temp.setNext(temp.getNext().getNext());
			}
		}

		public boolean search(INode<K> node) {
			INode<K> temp = head;
			while (temp != null) {
				if (temp.getKey().equals(node.getKey())) {
					return true;
				}
				temp = temp.getNext();
			}
			return false;
		}

		public int index(INode<K> node) {
			INode<K> temp = head;
			int index = 0;
			while (temp != null) {
				if (temp.getKey().equals(node.getKey())) {
					return index;
				}
				index++;
				temp = temp.getNext();
			}
			return -1;
		}

		public INode<K> get(int index) {
			INode<K> temp = head;
			for (int i = 0; i < size(); i++) {
				if (i == index) {
					return temp;
				}
				temp = temp.getNext();
			}
			return null;
		}
	}


