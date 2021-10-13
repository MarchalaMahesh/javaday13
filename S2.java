package javaday13;

import java.util.HashSet;
import java.util.Scanner;

public class S2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the data");
		
		String str =scan.nextLine();
		
		HashSet<Character> h = new HashSet<>();
		
		for(int i=0;i<str.length();i++)
		{
		h.add(str.charAt(i));
		System.out.println("character with out repetion");
		
		}
		System.out.println(h);
		for(Object o:h)
		{
			char temp = (Character)o;
			System.out.println(temp);
		}
	}

}
