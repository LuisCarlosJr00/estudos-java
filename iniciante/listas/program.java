package aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class program {

	public static void main(String[] args) {
		

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Employee> lista = new ArrayList<>();
		
		System.out.println("How many employees will be registered? ");
		int n = sc.nextInt();
		
		for (int i=0; i<n; i++) {
			System.out.println("Employee #" + (i+1) + ":");
			System.out.println("Id: ");
			Integer id = sc.nextInt();
			System.out.println("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.println("Salário: ");
			Double salario = sc.nextDouble();
			
			Employee emp = new Employee(id, nome, salario);
			
			lista.add(emp);
		}
		
		System.out.print("Digite o id do funcionário a receber aumento:: ");
		int idsalario = sc.nextInt();
				
		//Employee emp = lista.stream().filter(x -> x.getId() == idsalario).findFirst().orElse(null);
				
		Integer pos = posicao(lista, idsalario);
		if (pos == null) {
			System.out.println("Este id não existe!");
		}
		else {
			System.out.println("Digite a porcentagem? ");
			double porcentagem = sc.nextDouble();
			lista.get(pos).increaseSalary(porcentagem);
			}
		System.out.println();
		System.out.println("Lista de funcionarios ");
		for (Employee emp : lista) {
			System.out.println(emp);
		}
		
		sc.close();
	}
		
		
		public static Integer posicao(List<Employee> lista, int id) {
			for (int i=0; i < lista.size(); i++) {
				if (lista.get(i).getId() == id) {
					return i;
				}
		}
		return null;
		

		
		
		
	}

}
