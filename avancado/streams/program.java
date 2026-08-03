package aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import entities.Product;
import model.services.ProductServices;

public class program {

	public static void main(String[] args) {
		
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("Tv", 900.00));
		list.add(new Product("Notebook", 1200.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 200.00));
		
		ProductServices ps = new ProductServices();
		
		double sum = ps.filteredSum(list, p -> p.getName().charAt(0) == 'T');
		
		System.out.println("Sum = " + String.format("%.2f", sum));

	}

}
