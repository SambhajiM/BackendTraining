package in.codegram.doctorpatient.main;

import java.util.Scanner;

import in.codegram.doctorpatient.util.DoctorMenuUtil;
import in.codegram.doctorpatient.util.PatientMenuUtil;

public class DoctorPatientApplication_Startup {

	public static void main(String[] args) {
		int menuChoice = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("-------------------Welcome to health care------------------");
		System.out.println("Enter your choice (1,2,0 :)");
		System.out.println("1. For Doctor");
		System.out.println("2. For Patient");
		System.out.println("0. For Exit");
		menuChoice =  sc.nextInt();
		switch(menuChoice) {
		case 1:
			DoctorMenuUtil doctorMenuUtil = new DoctorMenuUtil();
			doctorMenuUtil.start();
			break;
			
		case 2:
			PatientMenuUtil patientMenuUtil = new PatientMenuUtil();
			patientMenuUtil.start();
			break;	
		case 0:
			System.exit(0);
			break;	
		}

	}

}
