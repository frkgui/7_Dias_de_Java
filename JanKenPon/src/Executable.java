import java.util.Scanner;

public class Executable {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("Bem Vindo ao JanKenPon!\n");
		System.out.println("Suas opções de jogada são:");
		System.out.println("1 - Pedra");
		System.out.println("2 - Papel");
		System.out.println("3 - Tesoura\n");
		
		System.out.printf("Digite a jogada desejada: ");
		byte jogadaUsuario = input.nextByte();
		
		Jogo jogo = new Jogo(jogadaUsuario);
		System.out.println("\n"+jogo.toString());
		
		String resultado = jogo.verificarVencedor();
		
		System.out.println("\nVerificando resultado...");
		
		System.out.println(resultado);
		
				
		input.close();		
	}

}
