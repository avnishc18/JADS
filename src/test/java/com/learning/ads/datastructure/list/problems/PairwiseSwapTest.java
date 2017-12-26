package com.learning.ads.datastructure.list.problems;

import org.junit.Test;

public class PairwiseSwapTest {

	PairwiseSwap rll = new PairwiseSwap();

	@Test
	public void swapWithOddNoOfNodes() {
		ListNode head = new ListNode(1);
		head.attach(2).attach(3).attach(4).attach(5).attach(6).attach(7);
		ListNode expected = new ListNode(2);
		expected.attach(1).attach(4).attach(3).attach(6).attach(5).attach(7);
		Util.assertListEqual(expected, rll.swap(head));
	}

	@Test
	public void swapWithEvenNoOfNodes() {
		ListNode head = new ListNode(1);
		head.attach(2).attach(3).attach(4).attach(5).attach(6);
		ListNode expected = new ListNode(2);
		expected.attach(1).attach(4).attach(3).attach(6).attach(5);
		Util.assertListEqual(expected, rll.swap(head));
	}

}