package com.Array;

import java.util.Scanner;

public class MaxMinArray {

	public static void main(String[] args) {
				
		//datatype vari_name[]=new datatype[size];
		int ar[]=new int[5];  //declaration
		/*ar[0]=34;  //ar->subscript  0->index
		ar[1]=37;
		ar[2]=56;
		ar[3]=78;
		ar[4]=12;
		*/
		/*System.out.println(ar[0]);
		System.out.println(ar[1]);
		System.out.println(ar[2]);
		System.out.println(ar[3]);
		System.out.println(ar[4]);
		*/
		
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter array elements "+ar.length);
		//input elements into array
		for(int i=0;i<ar.length;i++) {
			ar[i]=sc.nextInt();
		}
		//Displaying array elements
		System.out.println("Array elements are");
		
//find maximum of array element
		//maximum logic
		int max=ar[0];
		for(int i=1;i<ar.length;i++) {
			if(ar[i]>max) {
				max=ar[i];
			}
		}
		System.out.println("Maximum of array element is"+max);

		//find minimum of array element
		//minimum logic
				int min=ar[0];
				
				for(int i=1;i<ar.length;i++) {
					if(ar[i]<min) {
						min=ar[i];
					}
				}
				System.out.println("minimum of array element is"+min);
}}