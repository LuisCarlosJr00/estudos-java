package aplication;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Locale;
import java.util.Scanner;

import model.entities.CarRental;
import model.entities.Vehicle;
import model.services.BrasilTaxService;
import model.services.RentalService;

public class Program {

	public static void main(String[] args) {


		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyy HH:mm");
		
		System.out.println("Entre com os dados do aluguel");
		System.out.print("Modelo do carro:");
		String carModel = sc.nextLine();
		System.out.print("Retirada (dd/MM/yyyy hh:mm): ");
		LocalDateTime start = LocalDateTime.parse(sc.nextLine(), fmt); //start recebe uma data que vai ser lida no formato fmt, e convertida no LocalDate
		System.out.print("Retorno (dd/MM/yyyy hh:mm): ");
		LocalDateTime finish = LocalDateTime.parse(sc.nextLine(), fmt);
		
		
		//instanciar isso nos dados do aluguel do carro carRental 
		CarRental cr = new CarRental(start, finish, new Vehicle(carModel)); //instanciar o obj veiculo para receber a string carModel
		
		
		//solicitar o preço por hora e por dia e instanciar no serviço de renda RentalService, junto da taxa de imposto BrazilianTaxService
		System.out.print("Entre com o preço por hora: ");
		Double pricePerHour = sc.nextDouble();
		System.out.print("Entre com o preço por dia: ");
		Double pricePerDay= sc.nextDouble();
		
		RentalService rentalService = new  RentalService(pricePerHour, pricePerDay, new BrasilTaxService());
		
		rentalService.processInvoice(cr); 
		
		
		System.out.println("FATURA: ");
		System.out.println("Pagamento básico: " + cr.getInvoice().getBasicPayment()); //instanciando o pagamento basico 
		System.out.println("Imposto: " + cr.getInvoice().getTax());
		System.out.println("Pagamento total: " + cr.getInvoice().getTotalPayment());
		
		
		
		sc.close();
	}

}
