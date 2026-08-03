package Aplication;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import Entities.Client;
import Entities.OrdemItem;
import Entities.Order;
import Entities.Product;
import entidade.enums.OrderStatus;



public class program {

	public static void main(String[] args) throws ParseException {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		
		System.out.println("Enter client data: ");
		System.out.print("name: ");
		String name = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.nextLine();
		System.out.print("Birth date (DD/MM/YYYY): ");
		Date birthDate = sdf.parse(sc.next());
		
		Client client = new Client(name, email, birthDate);
		
		System.out.println("Enter order data:");
		System.out.print("status: ");
		OrderStatus status = OrderStatus.valueOf(sc.next());
		
		Order order = new Order(new Date(), status, client);
		
		System.out.print("How many items to this order? ");
		int n = sc.nextInt();
		
		for (int i=0; i<n; i++) {
			System.out.println("Enter #" + i + " item data: ");
			System.out.print("Product name: ");
			sc.nextLine();
			String prodctName = sc.nextLine();	
			System.out.print("Product price: ");
			Double productPrice = sc.nextDouble();
			
			Product product = new Product(prodctName, productPrice);
			
			System.out.println("Quantity: ");
			int quantity = sc.nextInt();
			
			OrdemItem orderItem = new OrdemItem(quantity, productPrice, product);
			
			order.addItem(orderItem);
			
		}
		
		System.out.println();
		System.out.println("ORDER SUMARY: ");
		System.out.println(order);
		
		sc.close();

	}

}
