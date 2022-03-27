package com.Array;



import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;


public class IteratorMethod {
public static void main(String[] args)
	{
	ArrayList<Integer> itlist=new ArrayList<Integer>();
		//using normal for loop
		for(int i=1;i<=10;i++)
		{
			itlist.add(i);
		}
       System.out.println(itlist);
       
     //using for each loop
     		for(Integer i:itlist) {
     			System.out.println(i);
     			
     		}
       
     //individual elements to display
   		Iterator<Integer> it=itlist.iterator();
   		while(it.hasNext()) {
   			System.out.println(it.next());
 
 }

		//Using ListIterator
		ListIterator<Integer> lob=itlist.listIterator();
		//forward direction
		System.out.println("ListIterator forward direction");
		while(lob.hasNext()) {
			System.out.println(lob.next());
		}
		
		System.out.println("ListIterator reverse direction");
		while(lob.hasPrevious()) {
			System.out.println(lob.previous());
		}
	}
}
