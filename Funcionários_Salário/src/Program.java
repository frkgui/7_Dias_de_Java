import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner lerDados = new Scanner(System.in);
		
		int aux = 1;
		
		while(aux == 1) {
		
		
		System.out.printf("Digite o nome do funcionário: ");
		String nome = lerDados.next();
		
		System.out.printf("Digite o valor do salário bruto: ");
		double salarioBruto = lerDados.nextDouble();
		
		System.out.printf("Digite o valor do imposto: ");
		double imposto = lerDados.nextDouble();
		
		Funcionario f1 = new Funcionario(nome, salarioBruto, imposto);
		
		System.out.println("\n"+ f1.toString()); 
		
		System.out.printf("\nDigite o valor do aumento a ser dado (%): ");
		f1.aumentarSalario(lerDados.nextDouble());
		
		System.out.println("\n"+ f1.toString()); 
		
		System.out.printf("\n Digite (1) para continuar ou (0) para sair: ");
		aux = lerDados.nextInt();
		
		}
		
		lerDados.close();
	}

}
