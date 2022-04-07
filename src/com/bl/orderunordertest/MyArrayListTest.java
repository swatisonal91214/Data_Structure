package com.bl.orderunordertest;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class MyArrayListTest {

	@Test
	public void searchWithValue() {

		System.out.println(
				"----------------searchWithValue-----------------");
		UnOrderedList<Integer> list = new ArrayList<>();

		list.append(56);
		list.append(30);
		list.append(40);
		list.append(70);

		System.out.println(list);

		assertTrue(list.search(30));
		assertFalse(list.search(60));
	}

	@Test
	public void addAfterKey() {
		System.out.println(
				"-----------------------addAfterKey---------------------");
		UnOrderedList<Integer> list = new ArrayList<>();

		list.append(56);
		list.append(30);
		list.append(70);

		System.out.println(list);

		int pos = list.index(30) + 1;
		list.insert(pos, 40);

		System.out.println(list);
	}

	@Test
	public void removeKeyAndSize() {
		System.out.println(
				"-----------------------removeKeyAndSize---------------------");
		UnOrderedList<Integer> list = new ArrayList<>();

		list.append(56);
		list.append(30);
		list.append(40);
		list.append(70);

		System.out.println(
				"Before removing element size is : "
						+ list.size());
		System.out.println(list);
		if (list.search(40)) {
			list.remove(40);
		}
		System.out
				.println("After removing element size is : "
						+ list.size());
		System.out.println(list);
	}

	@Test
	public void sortedList() {
		System.out.println(
				"-----------------------sortedList---------------------");
		OrderedList<Integer> list = new SortedLinkedList<>();

		list.add(56);
		list.add(30);
		list.add(40);
		list.add(70);

		System.out.println(list);
	}

}
