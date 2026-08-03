package Aplication;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class program {

	public static void main(String[] args) {
		
		//OBJETO DO TIPO CONTA 
		Account acc = new Account(1001, "Alex", 0.0);
		
		/*OBJETO DO TIPO CONTA EMPRESARIAL(SUBCLASSE DE ACCOUNT, 
		 * ENTÃO NÃO DEIXA DE SER UM TIPO CONTA)*/
		BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);
		
		//UPCASTING: Pegou os obj de uma subclassse e atrbuiu para um obj da superclasse
		
		Account acc1 = bacc; //Um objeto novo acc1 pode receber os atributos da subclasse bcc
		Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
		Account acc3 = new SavingsAccount(1004,	"Ana", 0.0, 0.01);
		
		//DOOWNCASTING: Converter obj da SUBclasse para SUPERclasse
		
		BusinessAccount acc4 = (BusinessAccount)acc2;
		acc4.loan(100.0);  /*Só posso pegar o empréstimo porque converti acc2 
							* para acc4, do tipo BusinessAccount*/
		
		//BusinessAccount acc5 = (BusinessAccount)acc3;
		if (acc3 instanceof BusinessAccount) {
			BusinessAccount acc5 = (BusinessAccount)acc3;
			acc5.loan(10.0);
			System.out.println("Loan!");
		}
		
		if (acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount)acc3;
			acc5.updateBalance();
			System.out.println("Update!");
		}
		
		Account ac10 = new Account(1100, "Luis", 1000.0);
		ac10.withdraw(200.0);
		System.out.println(ac10.getBalance());
		
		Account ac20 = new SavingsAccount(1200, "Maria", 1000.0, 0.01);
		ac20.withdraw(200.0);
		System.out.println(ac20.getBalance());
		
		Account ac30 = new BusinessAccount(1300, "Julia", 1000.0, 500.0);
		ac30.withdraw(200.0);
		System.out.println(ac30.getBalance());
	}
}
