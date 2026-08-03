package aplication;

import java.util.Scanner;

import entities.PrintService;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		PrintService ps = new PrintService();
		
		System.out.print("How many values? ");
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			System.out.print("This " + i +"º value: ");
			int value = sc.nextInt();
			ps.addValue(value);
		}
		
		ps.print();
		System.out.println();
		System.out.println("First: " + ps.first());
		
		sc.close();
	}

}
