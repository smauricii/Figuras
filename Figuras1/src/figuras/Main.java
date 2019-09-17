package figuras;

import java.util.Scanner;

public class Main {
	
	private static Scanner ex;

	public static void main(String[] args) {

		figura vector[]=new figura[6];

		
		ex = new Scanner(System.in);
		
		vector[0] = new circulo ("Circulo", "rojo",15);
		vector[0].dibujar();
		vector[0].getGrosorBorde();
		
		vector[1]= new cuadrado("Cuadrado","verde",10);
		vector[1].dibujar();
		vector[1].getGrosorBorde();
		
		vector[2] = new triangulo("Triangulo","Verde",10 ,10);
		vector[2].dibujar();
		vector[2].getGrosorBorde();
		
		vector[3]= new esfera("Esfera","cian",30);
		vector[3].dibujar();
		vector[3].getGrosorBorde();
		
		vector[4]= new cubo("Cubo","Amarillo",10,20,30);
		vector[4].dibujar();
		vector[4].getGrosorBorde();
		
		vector[5]= new piramide("Piramide","Negro",10,10);
		vector[5].dibujar();
		vector[5].getGrosorBorde();
		
		System.out.println(vector[0].Exportar());
		System.out.println(((circulo) vector[0]).calcularArea());
		System.out.println(((circulo) vector[0]).calcularPerimetro());
		
		
		System.out.println(vector[1].Exportar());
		System.out.println(((cuadrado) vector[1]).calcularArea());
		System.out.println(((cuadrado) vector[1]).calcularPerimetro());
		
		System.out.println(vector[2].Exportar());
		System.out.println(((triangulo) vector[2]).calcularArea());
		System.out.println(((triangulo) vector[2]).calcularPerimetro());
		
		System.out.println(vector[3].Exportar());
		System.out.println(((esfera) vector[3]).calcularVolumen());
		
		System.out.println(vector[4].Exportar());
		System.out.println(((cubo) vector[4]).calcularVolumen());
		
		System.out.println(vector[5].Exportar());
		System.out.println(((piramide) vector[5]).calcularVolumen());

		
	}

}
