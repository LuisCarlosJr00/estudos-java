package aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutsoucedEmployee;

public class program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	
		
		List<Employee> list = new ArrayList<>(); 
		
		System.out.print("Enter the number of employee: ");
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			System.out.print("Employee #" + i + " data: ");
			System.out.print("Outsouced(y/n): ");
			char out = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Hours: ");
			int hour = sc.nextInt();
			System.out.print("Value per Hour: ");
			double valuePerHour = sc.nextDouble();
			
			if (out == 'y') {
				System.out.print("Additional charge: ");
				Double additionalCharge = sc.nextDouble();
				list.add(new OutsoucedEmployee(name, hour, valuePerHour, additionalCharge));
			}
			else { 
				list.add(new Employee(name, hour, valuePerHour));
			}
		}
		System.out.println();
		System.out.println("PAYMENTS: ");
		for (Employee emp :list) {
			System.out.printf(emp.getName() + " - $ " + "%.2f\n", emp.payment());
			
		}
		

	}

}
