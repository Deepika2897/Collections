package com.HomeWorkListPrograms;



import java.util.Collections;
import java.util.Iterator;
import java.util.Vector;

class Employee2
{

	int emp_id;
	String emp_name,emp_dept;
	float emp_sal;

	public Employee2(int emp_id, String emp_name, String emp_dept, float emp_sal) {
		super();
		this.emp_id = emp_id;
		this.emp_name = emp_name;
		this.emp_dept = emp_dept;
		this.emp_sal = emp_sal;
	}

	@Override
	public String toString() {
		return "Employee [emp_id=" + emp_id + ", emp_name=" + emp_name + ", emp_dept=" + emp_dept + ", emp_sal="
				+ emp_sal + "]";
	}
}

public class MainEmployeeVector {

	public static void main(String[] args) 
	{

		Employee2 emp1=new Employee2(1, "surya", "electronics", 700098.3f);
		Employee2 emp2=new Employee2(2, "vijay", "electricals", 527098.4f);
		Employee2 emp3=new Employee2(3, "ajith", "mech", 550098.9f);
		Employee2 emp4=new Employee2(4, "siva", "computer science", 497348.4f);
		Vector<Employee2> eob=new Vector<Employee2>();
		eob.add(emp1);
		eob.add(emp2);
		eob.add(emp3);
		eob.add(emp4);
System.out.println(eob);
		
		Iterator<Employee2> iob=eob.iterator();
		while(iob.hasNext())
		{
		Employee2 eob1=iob.next();
			System.out.println(eob1.emp_id+" "+eob1.emp_name+" "+eob1.emp_dept+" "+eob1.emp_sal);
		}

	}
}


