package entities;

public class BusinessAccount extends Account{

	private Double loanLimit;
	
	public BusinessAccount() {
		super();
	}

	public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
		super(number, holder, balance);
		this.loanLimit = loanLimit;
	}
	
	public Double getLoalLimit() {
		return loanLimit;
	}
	
	public void setLoanLimit(Double loanLimit) {
		this.loanLimit = loanLimit;
	}
	
	//PEGAR UM EMPRÉSTIMO, O VALOR DEVE SER MENOR OU IGUAL AO LIMITE (LOANLIMIT)	
	public void loan(Double amount) {
		if (amount <=loanLimit) {
			balance += amount -10.0;
		}
	}
	//SOBREPOSILÇAO DO MÉTODO WITHDRAW
		@Override
		public void withdraw(Double amount){
			super.withdraw(amount);
			balance-= 2.0;
	}
}
