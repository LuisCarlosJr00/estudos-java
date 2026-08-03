package entities;

public final class SavingsAccount extends Account{
	
	private Double interestRate; //TAXA DE JUROS
	
	
	// CONSTRUTORES COM A SUPER CLASSE ACCOUNT
	public SavingsAccount() {
		super();
	}

	public SavingsAccount(Integer number, String holder, Double balance, double interestRate) {
		super(number, holder, balance);
		this.interestRate = interestRate;
	}
	
	//	GETTERS E SETTERS 
	public Double getInterestRate() {
		return interestRate;
	}
	
	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}
	
	//ATUALIZAÇÃO DA CONTA
	
	public void updateBalance() {
		balance+= balance * interestRate;
	}
	
	//SOBREPOSIÇÃO DO WITHDRAW
	@Override
	public void withdraw(Double amount) {
		balance-= amount;
	}
}
