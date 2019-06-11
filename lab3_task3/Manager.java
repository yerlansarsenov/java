package task3;

import java.util.Date;

public class Manager extends Employee implements Comparable, Cloneable{
	public int bonus;
	public Date hireDate;
	public Employee[] emps;
	public Manager(String name, String id, double salary, int bonus, Employee[] emps, Date hireDate) {
		super(name, id, salary, hireDate);
		this.bonus = bonus;
		this.emps = emps;
	}
	@Override
	public boolean equals(Person p){
		Manager m = (Manager) p;
		return super.equals(m) && m.bonus==bonus && m.emps==emps;
	}
	@Override
	public String toString(){
		return super.toString() + "; bonus: " + bonus + "; employees: " + '\n' + employees();
	}
	
	@Override
	public int compareTo(Object a){
		Manager m = (Manager) a;
		if(salary > m.salary){
			return 1;
		}else if(salary < m.salary){
			return -1;
		}else if(bonus > m.bonus){
			return 1;
		} else if(bonus < m.bonus){
			return -1;
		} else return 0;
	}
	public String employees(){
		String s = new String();
		for(int i = 0;i < this.emps.length; i++){
			s+=this.emps[i] + "\n";
		}
		return s;
	}
	@Override
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
		
	}
}
