package javaday13;

import java.util.HashSet;

public class S1 {
public static void main(String[] args) 
{
	HashSet h = new HashSet();
	h.add(18);
	h.add(18);
	h.add(45);
	h.add(49);
	System.out.println(h);
	for(Object o:h)
	{
		int temp = (Integer)o;
		System.out.println(temp);
	}
	
}
}
