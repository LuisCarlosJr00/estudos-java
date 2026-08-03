package entities;

public class OutsoucedEmployee extends Employee{
	
	private Double additionalCharge;
	
	//CONSTRUTORES
	public OutsoucedEmployee() {
		super();
	}
	public OutsoucedEmployee(String name, Integer hour, Double valuePerHour, Double additionalCharge) {
		super(name, hour, valuePerHour);
		this.additionalCharge = additionalCharge;
	}
	
	//GET E SETT
	public Double getAdditionalCharge() {
		return additionalCharge;
	}
	public void setAdditionalCharge(Double additionalCharge) {
		this.additionalCharge = additionalCharge;
	}
	
	@Override
	public Double payment() {
		return super.payment() + 1.1*additionalCharge;
	}

}
