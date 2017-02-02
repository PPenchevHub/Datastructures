package com.ppenchev.linkedList.Node;

public class LinkedListBase {

	private static int counter;
	private Node head;

	public LinkedListBase() {

	}

	public void add(Object data) {

		// check if the list is empty
		// create a start/head node
		if (head == null) {
			head = new Node(data);
		}

		Node temp = new Node(data);
		Node current = head;

		if (current != null) {

			// crawl trough the nodes and assign new ones
			while (current.getNext() != null) {

				current = current.getNext();

			}

			current.setNext(temp);

		}
		counter++;
	}
	 
	/*
	 * check if a given data is in the list
	 * 
	 * @param data
	 */
	public boolean find(Object data) {

		if (head != null) {

			Node current = head.getNext();
			while (current.getNext() != null) {
				if (current.getData() == data)
					return true;
				else {
					current = current.getNext();

				}

			}

		}

		return false;
	}
	

	public String toString() {

		String print = "";

		if (head != null) {

			Node current = head.getNext();
			while (current != null) {
				print += current.getData().toString() + " ";
				current = current.getNext();

			}
		}

		return print;
	}

	public int getCounter() {
		return counter;
	}

}
