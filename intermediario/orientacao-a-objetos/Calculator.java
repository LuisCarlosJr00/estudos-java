package Util;

public class Calculator {

	public static final double PI = 3.14159;	  //Declaração da constante PI, sempre feita em letra maiuscula
	
	public static double circumference(double radius) {
	return 2.0 * PI * radius;
	}
	
	public static double volume(double radius) {
	return 4.0 * PI * radius * radius * radius / 3.0;
	}
}
	/* Com o STATIC, torna eles em membros estaticos, e posso usar independente da classe,
	como se fosse uma formula que vamos aplicar lá, e só muda os valores que vou atribuir entre parenteses*/