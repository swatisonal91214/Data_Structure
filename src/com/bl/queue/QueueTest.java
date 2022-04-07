package com.bl.queue;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class QueueTest {

	@Test
	public void enqueueTest() {
		System.out.println("--------Equeue-----------");
		MyQueue<String> queue = new MyQueue<>();
		queue.enqueue("Jack");
		queue.enqueue("Mike");
		queue.enqueue("Sam");
		queue.enqueue("Nathalin");
		
		System.out.println(queue);
	}

	@Test
	public void dequeueTest() {
		System.out.println("--------Dequeue-----------");
		MyQueue<String> queue = new MyQueue<>();
		queue.enqueue("Jack");
		queue.enqueue("Mike");
		queue.enqueue("Sam");
		queue.enqueue("Nathalin");
		
		System.out.println(queue);
		assertEquals("Jack", queue.dequeue());
		System.out.println(queue);
	}
	
}
