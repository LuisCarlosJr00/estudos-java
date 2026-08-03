package aplication;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import model.entities.Reservation;
import model.exceptions.DomainExceptions;

public class Program1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy");
		
		
		try {
			System.out.println("Room number: ");
			int number = sc.nextInt();
			System.out.println("Check-in date (dd/MM/yyyy): ");
			Date checkIn = sdf.parse(sc.next());
			System.out.println("Check-out date (dd/MM/yyyy): ");
			Date checkOut = sdf.parse(sc.next());
			
			Reservation reservation = new Reservation(number, checkIn, checkOut);
			System.out.println("Reservation: " + reservation);
			
			System.out.println();
			System.out.println("Enter data to update the reservation: ");
			System.out.println("Check-in date (dd/MM/yyyy): ");
			checkIn = sdf.parse(sc.next());
			System.out.println("Check-out date (dd/MM/yyyy): ");
			checkOut = sdf.parse(sc.next());
			
			reservation.uodateDates(checkIn, checkOut);
			System.out.println("Reservation: " + reservation);
		}
		catch (ParseException e) {				//tratando essa exceção que pode ocorrer
			System.out.println("Invalid date format!");
		}
		catch (DomainExceptions e ) {			//tratando uma exceção personalizada 
			System.out.println("Error in reservation " + e.getMessage());
		}
		catch (RuntimeException e) { 			// tratando qualquer exeção que possa ocorrer (genérica), e jogar para o runtime por upcasting
			System.out.println("Unexpected error");
		}
		
		
		
		sc.close();
	}

}
