package com.ppenchev.linkedList.Node;

import java.security.GeneralSecurityException;

public class LinkedListBase {

	private static int counter;
	private Node head;

	// default constructor
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

			Node current = head;
			while (current.getNext() != null) {
				if (current.getNext().getData() == data) {
					return true;
				} else {
					current = current.getNext();

				}

			}

		}

		return false;
	}

	public boolean removeNode(Object data) {

		if (head != null) {

			// check if its in the list at all;
			if (find(data)) {

				Node current = head;
				Node temp;

				//loop trough the list
				while (current.getNext() != null) {
					//if the node is found replace it with the temporary
					if (current.getData() == data) {
						temp = current.getNext();
						current.setNext(temp.getNext());
						counter--;
						
						System.out.println(data + " removed from the list!");
						return true;

					} else {
						current = current.getNext();
					}

				}

			} else
				System.out.println("No such data in the list!");
			return false;

		}
		return false;

	}

	public String toString() {

		String print = "";

		if (head != null) {

			Node current = head;
			while (current.getNext() != null) {
				print += current.getNext().getData().toString() + " ";
				current = current.getNext();

			}
		}

		return print;
	}

	public int getCounter() {
		return counter;
	}

}
