package com.ppenchev.linkedList.Node;

public class Node {

	private Object data;
	private Node next;

	/*
	 * 2 constructors to create a root or a node
	 */

	// root
	public Node(Object data) {
		this.data = data;
		next = null;
		
	}

	public Node(Object data, Node next) {
		this.next = next;
		this.data = data;

	}

	public Object getData() {
		return data;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	public void setData(Object data) {
		this.data = data;
	}

}
