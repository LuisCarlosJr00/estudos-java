package aplication;


import java.util.HashMap;
import java.util.Map;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		/*
		//criando o método map
		Map<String, String> stock = new TreeMap<>();
		
		stock.put("username", "Maria");
		stock.put("email", "maria@gmail.com");
		stock.put("phone", "99778855");
		
		stock.remove("email");
		//Vai sobreescrever o de cima
		stock.put("phone", "112233");
		
		System.out.println("Contains 'phone' key: " + stock.containsKey("phone"));
		System.out.println("Phone number: " + stock.get("phone"));
		System.out.println("Email: " + stock.get("email"));
		System.out.println("Size: " + stock.size());
		
		
		
		System.out.println("ALL stock");
		for(String key : stock.keySet()) {
			System.out.println(key + " : " + stock.get(key));
		}

		 */
		
		
		Map<Product, Double> stock = new HashMap<>();
		
		Product p1 = new Product("Tv", 900.0);
		Product p2 = new Product("Notebok", 1200.0);
		Product p3 = new Product("Tablet", 400.0);
		
		stock.put(p1, 1000.0);
		stock.put(p2, 2000.0);
		stock.put(p3, 1500.0);
		
		Product ps = new Product("Tv", 900.0);
		
		System.out.println("Contains 'ps' key: " + stock.containsKey(ps) );
	}
		
}
