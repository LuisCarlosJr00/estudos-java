package entities;

public class Account {
	 	
	private Integer number;
	private String holder;
	protected Double balance;  //protected modificador de acesso para ser acessado por uma subclasse;
	
	//CONSTRUTORES
	public Account() {
	}
	public Account(Integer number, String holder, Double balance) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
	}
	
	//GETTERS E SETTERS 
	public Integer getNumber() {
		return number;
	}
	
	public void setNumber(Integer number) {
		this.number = number;
	}
	
	public String getHolder() {
		return holder;
	}
	
	public void setHolder(String holder) {
		this.holder = holder;
	}
	
	public Double getBalance() {
		return balance;
	}
	
	public void setBalance(Double balance) {
		this.balance = balance;
	}
	
	//SACAR DINHEIRO DA CONTA 
	public void withdraw(Double amount) {
		balance-= amount +5.0;
	}
	
	//DEPOSITAR DINHEIRO NA CONTA
	public void deposit(Double amount) {
		balance += amount;
	}
}
