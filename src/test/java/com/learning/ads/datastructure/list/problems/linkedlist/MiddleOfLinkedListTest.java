package com.learning.ads.datastructure.list.problems.linkedlist;

import static org.junit.Assert.*;

import org.junit.Test;

import com.learning.ads.datastructure.list.problems.linkedlist.ListNode;
import com.learning.ads.datastructure.list.problems.linkedlist.MiddleOfLinkedList;

public class MiddleOfLinkedListTest {

	private MiddleOfLinkedList rll = new MiddleOfLinkedList();
	final ListNode head;

	{
		head = new ListNode(1);
		head.attach(2).attach(3).attach(4);
	}

	@Test
	public void middleSingleElement() {
		ListNode node = new ListNode(1);
		assertEquals(1, rll.middle(node));
	}

	@Test
	public void middleTwoElements() {
		ListNode node = new ListNode(1);
		node.attach(2);
		assertEquals(2, rll.middle(node));
	}

	@Test
	public void middleEven() {
		assertEquals(3, rll.middle(head));
	}

	@Test
	public void middleOdd() {
		ListNode node = new ListNode(1);
		node.attach(2).attach(3).attach(4).attach(5);
		assertEquals(3, rll.middle(node));
	}
}
