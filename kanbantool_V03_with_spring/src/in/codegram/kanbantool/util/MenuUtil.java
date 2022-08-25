package in.codegram.kanbantool.util;
import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.codegram.kanbantool.enumeration.MenuItemEnum;
import in.codegram.kanbantool.exception.ProjectNotFoundException;
import in.codegram.kanbantool.modal.Project;
import in.codegram.kanbantool.serviceimpl.ProjectServiceImpl;

public class MenuUtil {
	
	ApplicationContext ctx = new ClassPathXmlApplicationContext("resource/beans.xml");	
	ProjectServiceImpl projectServiceImpl = ctx.getBean("projectServiceImpl",ProjectServiceImpl.class);

	public void start() {
		int menuChoice;
		String continueChoice;
		Scanner sc = new Scanner(System.in);
		do {
			showMenu();
			System.out.println("Enter your choice: (1,2,3,4,0) : ");
			menuChoice = sc.nextInt();
		
			switch(menuChoice) {
			case 1:
				Project project = new Project();
				System.out.println("Enter Project Name");
				project.setProjectName(sc.next());
				sc.nextLine();
				System.out.println("Enter project Identifier");
				project.setProjectIdentifier(sc.nextLine());
				System.out.println("Enter project Description");
				project.setDescription(sc.nextLine());
				projectServiceImpl.createProject(project);
				System.out.println("Success! Project Created..");
				break;
			case 2:
				System.out.println("-----------------List Operation------------------------");
				List<Project> projects = projectServiceImpl.showAllProjects();
				for(Project proj : projects) {
					System.out.println(proj);
				}
				break;
			case 3:
				System.out.println("Enter Project id: ");
				Integer id = sc.nextInt();
				sc.nextLine();
				System.out.println("Enter updated Description");
				String projectDescription = sc.nextLine();
				projectServiceImpl.updateProject(id, projectDescription);
				break;	
			case 4:
				System.out.println("-------------------Delete Operation-------------------------");
				System.out.println("Enter Id of Project to Delete");
				Integer id1 = sc.nextInt();
				projectServiceImpl.removeProject(id1);
				System.out.println("Sucess! Project is deleted");
				break;	
			case 0:
				System.exit(0);
				break;	
			default:
				System.out.println("Wrongg Choice");
				break;	
			}
			System.out.println("Do you want to continue : (yes/no) : ");
			continueChoice =  sc.next();
		} while (continueChoice.equals("yes"));
	}

	private void showMenu() {
		System.out.println("-------------KANBAN TOOL (PROJECT MANAGEMENT TOOL)---------------------");
//		System.out.println("1. Create Project");
//		System.out.println("2. list Project");
//		System.out.println("3. Update Project");
//		System.out.println("4. Delete Project");
//		System.out.println("0. Exit");
		MenuItemEnum[] menuItems = MenuItemEnum.values();
		for(MenuItemEnum menuItemEnum : menuItems) {
			System.out.println(menuItemEnum.getSequence()+".."+menuItemEnum.getMenuName());
		}
	}
}
