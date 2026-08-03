package aplication;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Program {
	
	 public static void main(String[] args) {
		
		 String path = "f://temp//in.txt";
		 FileReader fr = null;
		 BufferedReader br = null;
		 
		 try {
			 ;		//FileReader fica dentro do Br, pode ser colocado junto
			 br = new BufferedReader(new FileReader(path));  // br = new BufferedReader(new FileReader(path));
			 
			 //Strinf para ler uma linha dentro do arquivo.
			 //Se não tiver o que er, ele retorna null.
			 String line = br.readLine();
			 
			 //Enquanto linha do arquivo tiver o que ler, escreva o que leu e repita.
			 while (line != null) {
				 System.out.println(line);
				 line = br.readLine();
				
			}
		 }
		 catch (IOException e) {
			System.out.println("Error " + e.getMessage());
		}
	}

}
