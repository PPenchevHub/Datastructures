package com.ppenchev.linkedList.Node;

public class ListTester {
	
	public static void main(String[] args){
		
		LinkedListBase list =  new LinkedListBase();
		
		list.add("2");
		list.add("3");
		list.add("33");
		list.add("16");
		list.add("4");
		list.add("13");
		list.add("55");
	
		
		System.out.println(list.toString());
		list.removeNode("3");
		System.out.println(list.toString());
		
	}

}
