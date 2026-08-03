import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int x;
		int soma = 0;
		
		
		System.out.println("Digite o valor de x: ");
		x = sc.nextInt();
		while ( x != 0) { 
			soma = soma + x;
			System.out.println("Digite novamente x: ");
			x = sc.nextInt();
		}
		
		System.out.println(soma);
		
	}

}
