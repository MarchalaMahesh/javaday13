package javaday13;

import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class T2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the data");
		
		String str =scan.nextLine();
		
		TreeSet<Character> h = new TreeSet<>();
		
		for(int i=0;i<str.length();i++)
		{
		h.add(str.charAt(i));
		
		
		}
		System.out.println("character with out repetion");
		System.out.println(h);
		
	}


}
