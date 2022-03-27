package com.Array;

import java.util.ArrayList;
import java.util.Collections;
public class ArrayListMethods {
	public static void main(String[] args) {
		ArrayList<Float> floatList=new ArrayList<Float>();
		floatList.add(4.3f);
		floatList.add(5.9f);
		System.out.println("*******************");
		System.out.println(floatList);
		floatList.clear();
		System.out.println("*******************");
		System.out.println(floatList);
		ArrayList<String> stringList=new ArrayList<String>();//list1
		stringList.add("latha");
		stringList.add("deepa");
		stringList.add("thilaksha");
		stringList.add("kanishka");
		stringList.add("thisha");
		stringList.add("kowsi");
		System.out.println(stringList);
		//stringList.clear();
		ArrayList<String> stringList1=new ArrayList<String>();//list2  //contains all method
		stringList1.add("latha");
		stringList1.add("deepa");
		stringList1.add("thilaksha");
		stringList1.add("kanishka");
		stringList1.add("thisha");
		stringList1.add("kowsi");
		System.out.println("*********************************************************");
		System.out.println("contains method output"+stringList1.contains("thisha"));//searching
		System.out.println("contains all method output"+stringList1.containsAll(stringList));
		System.out.println("*********************************************************");
		System.out.println("before sorting"+stringList);
		Collections.sort(stringList);//sorting
		System.out.println("after sorting"+stringList);//shuffle
		System.out.println("*********************************************************");
		System.out.println("before shuffle"+stringList);
		Collections.shuffle(stringList);
		System.out.println("after shuffle"+stringList);
		}}
