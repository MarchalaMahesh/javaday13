package javaday13;

import java.util.HashMap;
import java.util.TreeMap;

public class H1 {
	public static void main(String[] args) 
	{
		HashMap<Integer,String> h = new HashMap<>();
		
		h.put(1, "raju");
		h.put(2, "laila");
		h.put(3,"fgh");
		System.out.println(h);
		
		h.remove(1);
		System.out.println(h);
		
		if(h.containsKey(2))
		{
			System.out.println(h.get(2));
		}
		System.out.println(h.size());
		
		TreeMap <Integer,String> t = new TreeMap<>(h);
		System.out.println(t);
	}

}
