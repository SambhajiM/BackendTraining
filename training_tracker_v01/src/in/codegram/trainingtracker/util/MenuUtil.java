package in.codegram.trainingtracker.util;

import java.util.List;
import java.util.Scanner;

import in.codegram.trainingtracker.modal.Employee;
import in.codegram.trainingtracker.service.EmployeeService;
import in.codegram.trainingtracker.serviceimpl.EmployeeServiceImpl;

public class MenuUtil {
	
	private EmployeeService employeeService;
	public MenuUtil() {
		employeeService = new EmployeeServiceImpl();
	}
	
	public void start() {
		int menuChoice;
		String continueChoice;
		Scanner sc = new Scanner(System.in);
		do {
			showMenu();
			System.out.println("Enter your choice : (1,2,3,4,5,6,0 : )");
			menuChoice =  sc.nextInt();
			
			switch(menuChoice) {
			case 1:
				Employee employee = new Employee();
				System.out.println("Enter Employee Name");
				employee.setEmployeeName(sc.next());
				sc.nextLine().toLowerCase();
				System.out.println("Enter Employee Type");
				employee.setEmployeeType(sc.next());
				sc.nextLine();
				System.out.println("Enter Employee Department");
				employee.setEmployeeDepartment(sc.nextLine());
				employeeService.createEmployee(employee);
				System.out.println("Success! Employee Created..");
				break;
			case 2:
				System.out.println("-----------------List Operation------------------------");
				List<Employee> employees = employeeService.showAllEmployees();
				for(Employee emp : employees) {
					System.out.println(emp);
				}
				break;
			case 3:
				System.out.println("Enter Employee id: ");
				Integer id = sc.nextInt();
				System.out.println("Enter updated Employee Name");
				String employeeName = sc.next();
				
				employeeService.updateEmployee(id, employeeName);
				break;	
			case 4:
				System.out.println("-------------------Delete Operation-------------------------");
				System.out.println("Enter Id of Employee to Delete");
				Integer id1 = sc.nextInt();
				employeeService.removeEmployee(id1);
				System.out.println("Sucess! Employee is deleted");
			case 5:
				System.out.println("--------------------Search Employee By Name ---------------------");
				System.out.println("Enter Name of Employee to Search");		
				String searchEmpName = sc.next();
				List<Employee> empList = employeeService.searchEmpByName(searchEmpName);
				if(empList.size() == 0 || empList == null) {
					System.out.println("No Records found");
				}else {
					for(Employee emp : empList) {
						System.out.println(emp);
					}
				}
				break;
			case 6:
				System.out.println("--------------------Search Employee By Name ---------------------");
				System.out.println("Enter field name of Employee to Search like employeeNamd and emplyeeDepartment");		
				String filedName = sc.next();
				System.out.println("Enter value of Employee to Search");	
				String  value = sc.next().toLowerCase();
				List<Employee> searchEmpList = employeeService.fressTextSearch(filedName, value);
				if(searchEmpList.size() == 0 || searchEmpList == null) {
					System.out.println("No Records found");
				}else {
					for(Employee emp : searchEmpList) {
						System.out.println(emp);
					}
				}
				break;
			case 0:
				System.exit(0);
				break;	
			default:
				System.out.println("Wrong Choice");
				break;	
			}
			System.out.println("Do you want to continue : (yes/no) : ");
			continueChoice =  sc.next();
		}while (continueChoice.equals("yes"));
	}
	
	private void showMenu() {
		System.out.println("-------------Training Tracker (TRAINING TRACKER MANAGEMENT TOOL)---------------------");
		System.out.println("1. Create Employee");
		System.out.println("2. list Employee");
		System.out.println("3. Update Employee");
		System.out.println("4. Delete Employee");
		System.out.println("5. Search Employee by Name");
		System.out.println("6. Advance Serch of  Employee");
		System.out.println("0. Exit");
//		MenuItemEnum[] menuItems = MenuItemEnum.values();
//		for(MenuItemEnum menuItemEnum : menuItems) {
//			System.out.println(menuItemEnum.getSequence()+".."+menuItemEnum.getMenuName());
//		}
	}
}
