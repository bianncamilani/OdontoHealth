package odontohealth.main;

public class Funcionario extends Pessoa {
	private String registro;
	
	public Funcionario (String nome, String telefone, String endereco, String cpf, int idade, String registro) {
	super(nome, telefone, endereco, cpf, idade);
	
	this.registro = registro;
	
}

	public String getRegistro() { return registro; }

	public void setRegistro(String registro) { this.registro = registro; }
	
	@Override
	public void apresentar() {
		super.apresentar();
		
		System.out.println("____Dados do Funcionario_____");
		System.out.println("Registro: " + this.registro);
	}
}