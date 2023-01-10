package com.collection;
import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
	List<String> al= new ArrayList<String>();
	al.add("AAA");
	al.add("BBB");
	al.add("CCC");
	
	for (String object : al) {
	 System.out.println(object);
	}	
	}
}