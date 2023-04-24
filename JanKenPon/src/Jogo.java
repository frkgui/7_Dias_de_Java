
public class Jogo {

	private JanKenPon usuario;
	private JanKenPon computador;
	
	public Jogo(byte jogadaUsuario) {
		
		try {
			if(jogadaUsuario < 1 || jogadaUsuario > 3) {
				throw new IllegalArgumentException("Valor inválido!, tente novamente");
			}
			this.usuario = new JanKenPon(jogadaUsuario);
			byte sorteio = (byte)(Math.random()*3+1);
			this.computador = new JanKenPon(sorteio);
			}catch(IllegalArgumentException e) {
			System.out.println("Erro: " + e.getMessage());
			}
	}
	
	public String verificarVencedor() {
		byte usuario = this.usuario.getJogada();
		byte computador = this.computador.getJogada();
		
		if(usuario == 1 && computador == 3 ||
			usuario == 2 && computador == 1 ||
			usuario == 3 && computador == 2) {
			
			return "Usuário venceu!";
			
		}else if(usuario == 1 && computador == 1 ||
				usuario == 2 && computador == 2 || 
				usuario == 3 && computador == 3) {
			
			return "Empate!"; 
				
		}else {
			return "Bot venceu!";
		}
	}

	@Override
	public String toString() {
		return "Usuario jogou: " + usuario.toString() + "\nComputador jogou: " + computador.toString();
	}
	
}
