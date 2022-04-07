package com.bl.linklist_integer;

	
	public class LinkedList {
		Node head;

		public void insertNode(int data) {
			Node node = new Node();
			node.data = data;
			node.next = null;
			if(head == null) {
				head = node;
			}else {
				Node n = head;
				while(n.next != null) {
					n = n.next;
				}
				n.next = node;
			}
		}
		
		public void insertFirst(int data) {
			Node node = new Node();
			node.data = data;
			node.next = null;
			node.next = head;
			head = node;
		}
		
		public void insertPosition(int index, int  data) {
			Node node = new Node();
			node.data = data;
			node.next = null;
			Node n = head;
			if(index== 0) {
				insertFirst(data);
			}else {
				for(int i = 0; i< index-1; i++) {
					n= n.next;
				}
				node.next = n.next;
				n.next = node;
			}
		}
		
		public void popFirst() {
			
			head = head.next;
		}
		
		public void popOut(int index) {
			Node n = head;
			//Node n1 = null;
			for(int i = 0; i< index-1; i++) {
				n = n.next;
			}
			
			n.next = n.next.next;
		}
		
		public void print() {
			Node n = head;
			while(n.next != null) {
				System.out.println(n.data);
				n = n.next;
			}
			System.out.println(n.data);
		}

		@Override
		public String toString() {
			return "LinkedList [head=" + head + "]";
		}
}

