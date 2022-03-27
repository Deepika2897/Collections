package com.HomeWorkListPrograms;





import java.util.ArrayList;
import java.util.Iterator;


class Employee
{
	
	int emp_id;
	String emp_name,emp_dept;
	float emp_sal;
	
	public Employee(int emp_id, String emp_name, String emp_dept, float emp_sal) {
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

public class MainEmployeeUsingArrayList 
{

	public static void main(String[] args)
	{
	Employee emp1=new Employee(1, "DEEPI", "electronics", 700098.3f);
		Employee emp2=new Employee(2, "vijay", "electricals", 527098.4f);
		Employee emp3=new Employee(3, "SUJI", "mech", 550098.9f);
		Employee emp4=new Employee(4, "KAVI", "computer science", 497348.4f);
	    ArrayList<Employee> eob=new ArrayList<Employee>();
	    eob.add(emp1);
	    eob.add(emp2);
	    eob.add(emp3);
	    eob.add(emp4);
System.out.println(eob);
		
		Iterator<Employee> iob=eob.iterator();
		while(iob.hasNext())
		{
		Employee eob1=iob.next();
			System.out.println(eob1.emp_id+" "+eob1.emp_name+" " +eob1.emp_dept+" "+eob1.emp_sal);
		}

	}
}
