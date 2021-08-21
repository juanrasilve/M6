package com.jobs.view;

import java.util.List;

import com.jobs.application.JobsController;
import com.jobs.domain.AbsStaffMember;
import com.jobs.domain.Employee;

public class Main {

	
	
	private static JobsController controller=new JobsController();
	
	public static void main(String[] args) throws Exception {
		
		controller.createBossEmployee("Pepe Boss", "Dirección molona", "666666666", 100.0);
		controller.createEmployee("Pedro Employee", "Dirección molona 2", "665266666", 40.0);
		controller.createEmployee("Laura Employee", "Dirección molona 3", "625266666", 45.0);
		controller.createVolunteer("Juan Volunteer", "Dirección molona 4", "614266666");
		controller.createManagerEmployee("Pedro Manager", "Dirección molona 2", "665226666", 80.0);
		
		
		controller.payAllEmployeers();
		
		System.out.println("EMPLOYEES: " + "\n");
		
		List<AbsStaffMember> allEmployees=controller.getAllEmployees();
		for(int x=0;x<allEmployees.size();x++) {
			Employee emp = (Employee) allEmployees.get(x);
			System.out.println("[name="+ emp.getName()+",adress="+emp.getAddress()+",phone="+emp.getPhone()+",salaryPerMonth="+emp.getSalaryPerMonth()+",totalP="+emp.getPaymentRate().pay(emp.getSalaryPerMonth()));
		}
		
	}

}
