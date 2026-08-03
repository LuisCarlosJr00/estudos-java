package entities;

import entities.enums.Color;

public abstract class Shape {
	
	private Color color;
	
	public abstract Double area();

	//CONSTRUTORES
	public Shape() {
	}
	
	public Shape(Color color) {
		super();
		this.color = color;
	}

	//GET E SETT
	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
	}
	
	
	
	

}
