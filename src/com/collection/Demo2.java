package com.collection;
import java.util.ArrayList;
import java.util.List;

public class Demo2 {

	public static void main(String[] args) {
	List<Integer> al= new ArrayList<Integer>();
	al.add(10);
	al.add(20);
	al.add(30);
	
	for (int object : al) {
	 System.out.println(object);
	}	
	}
}