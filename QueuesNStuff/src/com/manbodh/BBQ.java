package com.manbodh;

import java.util.LinkedList;
import java.util.Queue;

public class BBQ {

	public static void main(String[] args) {
		
		Queue<String> bbqLine = new LinkedList<String>();
		
		bbqLine.add("Jackson");
		bbqLine.add("Tyreek");
		bbqLine.add("Susan");
		
		//Poll and Peek are the two more well known methods used with Queue
		
System.out.println(bbqLine);		
System.out.println(bbqLine.peek());
System.out.println(bbqLine.size());
bbqLine.poll();
System.out.println(bbqLine.size());
System.out.println(bbqLine.contains("the Rock")); //False
System.out.println(bbqLine.toArray()[1]); //Susan
//	bbqLine.poll();
//System.out.println(bbqLine);		
//		bbqLine.peek();
//System.out.println(bbqLine);		
//		bbqLine.poll();
//System.out.println(bbqLine);		
//		bbqLine.poll();

		//=================================================================================
		
		Queue<String> q = new LinkedList<String>();
		

//		q.add("A");
//		q.add("B");
//		q.add("C");
//		
//		System.out.println(q);
		
	}
}
		
		
		
		
		
		
		
		
		
		
		

