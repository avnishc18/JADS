package com.learning.ads.element.heap;

public class BinaryHeapNode<T extends Comparable<T>> {
	public T[] array;
	public int heapSize;

	public BinaryHeapNode(T[] array) {
		this.array = array;
		this.heapSize = array.length;
	}

	public T[] getArray() {
		return array;
	}

	public int getHeapSize() {
		return heapSize;
	}

	public void setHeapSize(int heapSize) {
		this.heapSize = heapSize;
	}
}
