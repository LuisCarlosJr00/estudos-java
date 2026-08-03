import java.util.Scanner;

public class For {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		
		int n;
		
		System.out.println("N: ");
		n = sc.nextInt();
		
		int soma = 0; 				//RECEBE ZERO NO COMEÇO DA EXECUÇÃO
		for ( int i=0; i<n; i++) {  //--i=0 executa no começo,
			int x = sc.nextInt();   //--ENQUANTO i<n, executa isso aqui, teremos que colocar um número para x.
			soma = soma +x; 		//--Ao colocar um numero pra x, ele desce para ser somado. 
		}							//--Vai voltar pro topo e executar o incremento até a condição
										//deixar de existir, e ele pula do i++ para fora da condição.
		
		System.out.println(soma);	// Ai sim desce pra executar aqui.
		
		sc.close();
	}

}
