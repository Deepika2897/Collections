package com.Array;

import java.util.ArrayList;
import java.util.Iterator;
//user defined data type
//taking the class as a datatype

class Student
{
	int stu_id;
	String stu_name;
	float stu_fees;
	
	//constructor
	public Student(int stu_id, String stu_name, float stu_fees) {
		super();
		this.stu_id = stu_id;
		this.stu_name = stu_name;
		this.stu_fees = stu_fees;
 }
	@Override
	public String toString() {
		return "Student [stu_id=" + stu_id + ", stu_name=" + stu_name + ", stu_fees=" + stu_fees + "]";
	}}
public class UserDefinedArrayList {
public static void main(String[] args)
	{
		Student stu1=new Student(1, "thilak", 89776.9f);
		Student stu2=new Student(1, "kani",5466.9f);
		Student stu3=new Student(1, "thisha", 6738.9f);
		ArrayList<Student> studentList=new ArrayList<Student>();
		studentList.add(stu1);
		studentList.add(stu2);
		studentList.add(stu3);
		System.out.println(studentList);
		
		Iterator<Student> iob=studentList.iterator();
		while(iob.hasNext())
		{
			Student stuList=iob.next();
			System.out.println(stuList.stu_id+" "+stuList.stu_name+" "+stuList.stu_fees);
		}}}



