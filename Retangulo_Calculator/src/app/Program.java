package app;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Calculadora de Retângulo");
		
		System.out.printf("\nDigite o valor da Largura do retângulo(cm): ");
		double Width = input.nextDouble();
		
		System.out.printf("\nDigite o valor da Altura do retângulo(cm): ");
		double Heigth = input.nextDouble();
		
		
		Rectangle retangulo = new Rectangle(Width, Heigth);
		
		System.out.println(retangulo.toString());
		
		input.close();
	}

}
