package task3;

import java.util.Date;

public class Employee extends Person implements Comparable, Cloneable{
	public double salary;
	public Date hireDate;
	public Employee(String name,String id,double salary,Date hireDate){
		super(name,id);
		this.salary = salary;
		this.hireDate = hireDate;
	}
	
	public boolean equals(Employee p){ 
		
		return super.equals(p) && p.salary==salary && p.hireDate==hireDate;
	}
	@Override
	public String toString(){
		return super.toString() + "; sal: " + salary + "; year: " + hireDate;
	}

	@Override
	public int compareTo(Object arg0) {
		Employee e = (Employee) arg0;
		if(salary > e.salary){
			return 1;
		}else if(salary < e.salary){
			return -1;
		}else {
			return 0;
		}
	}
	@Override
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
		
	}
}
