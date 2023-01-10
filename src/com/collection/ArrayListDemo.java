package com.collection;
import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
	List al= new ArrayList();
	al.add("AAA");
	al.add("BBB");
	al.add("CCC");
	
	for (Object object : al) {
	 System.out.println(object);
	}	
	}
}