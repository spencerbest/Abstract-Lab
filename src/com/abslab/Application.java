package com.abslab;

import java.util.ArrayList;
import java.util.List;

public class Application {

	public static void main(String[] args) {

		Student s1 = new Student();
		Employee e1 = new Employee();
		
		double stutelePhoneBill = s1.calculateTelePhoneBill(120.5);
		System.out.println("Student phone bill is $" + stutelePhoneBill);
		
		double emptelePhoneBill = e1.calculateTelePhoneBill(185.76);
		System.out.println("Employee phone bill is $" + String.format("%.2f", emptelePhoneBill));
		
		Person p1 = new Student();
		Person p2 = new Employee();
		p1.firstName = "Spencer";
		p1.lastName = " Best";
		p2.firstName = "Brandon";
		p2.lastName = " Owens";
		
				
		System.out.println(p1.firstName + p1.lastName + " phone bill is $" + String.format("%.2f", p1.calculateTelePhoneBill(120.5)));
		System.out.println(p2.firstName + p2.lastName + " phone bill is $" + String.format("%.2f", p2.calculateTelePhoneBill(300.32)));
		System.out.println(p1.firstName + p2.lastName + " taxes " + String.format("%.2f", p1.taxes(120.5)));
		System.out.println(p2.firstName + p2.lastName + " taxes " + String.format("%.2f", p2.taxes(186.76)));
		
		List<Student> studentArray = new ArrayList<Student>();
		List<Employee> employeeArray = new ArrayList<Employee>();
				
		studentArray.add(s1);
		employeeArray.add(e1);
		
		School schObj = new School();
		
		schObj.studentList.add(s1);
		schObj.employeeList.add(e1);
		
		
	}

}
