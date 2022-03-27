package com.Array;


import java.util.ArrayList;
public class ArrayListAdd {
public static void main(String[] args) {
		//array list using string values
		ArrayList<String> list=new ArrayList<String>();
		list.add("Hi");
		list.add("Everyone");
		list.add("Good");
		list.add("afternoon");
		System.out.println("first time "+list);
		list.remove(2);
		System.out.println("after remove "+list);
		list.remove("afternoon");
		System.out.println("after remove "+list);
		list.add(2, "Everyone");
		System.out.println("after add "+list);
		System.out.println("get 2 th index "+list.get(2));
ArrayList<String> list1=new ArrayList<String>();
		list1.add("Hi");
		list1.add("Everyone");
		list1.add("Good");
		list1.add("afternoon");
//array list using integer values
		ArrayList<Integer> intList=new ArrayList<Integer>();
		intList.add(17);
		intList.add(27);
		intList.add(37);
		intList.add(47);
		intList.add(57);
		System.out.println("display integer array list");
		System.out.println(intList);
//array list using float values
		ArrayList<Float> floatList=new ArrayList<Float>();
		floatList.add(4.3f);
		floatList.add(5.9f);
		floatList.add(2.45f);
		floatList.add(89.3f);
		floatList.add(40.3f);
		System.out.println("*******************");
		System.out.println(floatList);

}
}
