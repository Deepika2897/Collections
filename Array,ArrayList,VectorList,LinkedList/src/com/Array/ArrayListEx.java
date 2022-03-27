package com.Array;

import java.util.ArrayList;

public class ArrayListEx {

		public static void main(String[] args) {
			ArrayList<String> list=new ArrayList<String>();
			list.add("hello");
			list.add("hi");
			list.add("rani");
	        list.add("kiran");
	        list.add("swetha");
	        list.add("ravi");
	        
	        list.add(2,"Tharani");//specified index
	        System.out.println("get value in 2nd index "+list.get(2));
	        
			System.out.println(list);//displaying list
			
			
			//integer ArrayList
			ArrayList<Integer> iob=new ArrayList<Integer>();
			//adding integer elements
			iob.add(3);
			iob.add(4);
			iob.add(5);
			iob.add(6);
			iob.add(7);
			iob.add(45);
			//display
			System.out.println(iob);
			
			
			ArrayList<Float> fob=new ArrayList<Float>();
			//add elements
			fob.add(1.2f);
			fob.add(2.3f);
			fob.add(3.23f);
			fob.add(4.5f);
			
			//display
			System.out.println(fob);
			

		}

	}

