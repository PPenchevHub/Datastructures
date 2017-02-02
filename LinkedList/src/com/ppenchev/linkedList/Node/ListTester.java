package com.ppenchev.linkedList.Node;

public class ListTester {
	
	public static void main(String[] args){
		
		LinkedListBase list =  new LinkedListBase();
		
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("34");
		
		System.out.println(list.find("34"));
	
		
	}

}
