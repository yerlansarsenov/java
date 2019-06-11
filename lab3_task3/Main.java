package task3;

import java.util.Date;

public class Main {

	public static void main(String[] args) throws CloneNotSupportedException {
		Employee e = new Employee("Qwer", "4545", 12500, new Date());
		Employee q = (Employee) e.clone();
		System.out.println(q);
	}
}
