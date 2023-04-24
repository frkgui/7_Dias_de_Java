
public class Funcionario {

	private String nome;
	private double salarioBruto;
	private double imposto;
	
	
	
	public  Funcionario(String nome, double salarioBruto, double imposto) {
		this.nome = nome;
		this.salarioBruto = salarioBruto;
		this.imposto = imposto;
		
	}

	public double salarioLiquido() {
		double salarioLiquido = this.salarioBruto - this.imposto;	
		return salarioLiquido;
	}
	
	public double aumentarSalario(double porcentagem) { 
		double valorAumento = (this.salarioBruto * porcentagem)/100;
		this.salarioBruto = this.salarioBruto + valorAumento;
		return this.salarioBruto;
	}

	@Override
	public String toString() {
		return "Dados do funcionário: \n\n" +
				"- Nome: " + nome +
				"\n- Salário Líquido: " + salarioLiquido();
	}
}
