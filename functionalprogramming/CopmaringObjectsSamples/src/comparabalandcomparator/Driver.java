package comparabalandcomparator;

import java.util.Arrays;

public class Driver {

	public static void main(String[] args) {
		
		Employee [] employees = new Employee[3];
		Employee obj1 = new Employee(1, "alex", 34, 500000);
		Employee obj2 = new Employee(6, "cody", 33, 400000);
		Employee obj3 = new Employee(3, "alan", 39, 300000);
		employees[0] = obj1;
		employees[1] = obj2;
		employees[2] = obj3;
		
		System.out.println(employees[1].compareTo(employees[2]));
		//Arrays.sort(null, 0, 0, null);
		//Arrays.sort(null, null);
		Arrays.sort(employees, Employee.SalaryComparator);
		System.out.println("Employees list sorted by Salary:\n" + Arrays.toString(employees));
	}

}
