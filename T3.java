package javaday13;

import java.util.ArrayList;
import java.util.TreeSet;

public class T3 {
	public static void main(String[] args)
	{
		ArrayList<Integer> t = new ArrayList<>();
		t.add(20);
		t.add(5);
		t.add(50);
		t.add(10);
		t.add(30);
		t.add(20);
		t.add(5);
		System.out.println(" array list "+ t);
		// conert arraylist to treeset
		TreeSet<Integer> t1 = new TreeSet<>(t);
		System.out.println("tree set "+t1);
	}

}
