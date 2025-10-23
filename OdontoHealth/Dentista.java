package odontohealth.main;

public class Dentista extends Pessoa {
	private String cro;
	private String especialidade; 
	private double salario;

	public Dentista(String nome, String telefone, String endereco, String cpf, int idade, String cro, String especialidade, double salario) {
		super(nome, telefone, endereco, cpf, idade);
		
		this.cro = cro;
		this.especialidade = especialidade;
		this.salario = salario;
	}

	public String getCro() { return cro; }

	public void setCro(String cro) { this.cro = cro; }

	public String getEspecialidade() { return especialidade; }

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	public double getSalario() { return salario; }

	public void setSalario(double salario) { this.salario = salario; }

	@Override
	public void apresentar() {
		super.apresentar();
		
		System.out.println("____Dados do Dentista_____");
		System.out.println("CRO: " + this.cro);
		System.out.println("Especialidade: " + this.especialidade);
		System.out.println("Salário: " + String.format("%.2f", this.salario));
	}
}

	