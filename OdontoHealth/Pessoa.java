package odontohealth.main;

public abstract class Pessoa {
	private String nome;
	private String telefone;
	private String endereco;
	private String cpf;
	private int idade;
	
	public Pessoa (String nome, String telefone, String endereco, String cpf, int idade) {
		this.nome = nome;
		this.telefone = telefone;
		this.endereco = endereco;
		this.cpf = cpf;
		this.idade = idade;
	}


	public String getNome() { return nome; }




	public void setNome(String nome) { this.nome = nome; }




	public String getTelefone() { return telefone; }




	public void setTelefone(String telefone) { this.telefone = telefone; }




	public String getEndereco() { return endereco; }




	public void setEndereco(String endereco) { this.endereco = endereco; }




	public String getCpf() { return cpf; }




	public void setCpf(String cpf) { this.cpf = cpf; }




	public int getIdade() { return idade; }




	public void setIdade(int idade) { this.idade = idade; }




	public void apresentar() {
		System.out.println("____Dados da Pessoa____" );
		System.out.println("Nome: " + this.nome);
		System.out.println("Telefone: " + this.telefone);
		System.out.println("Endereco: " + this.endereco);
		System.out.println("CPF: " + this.cpf);
		System.out.println("Idade: " + this.idade);
	}
	
	public void atualizarTelefone(String novoTelefone) {
		this.setTelefone(novoTelefone);
		System.out.println("Telefone de " + this.nome + " atualizado para: " + novoTelefone);
	}
	
	public void atualizarIdade(int novaIdade) {
		this.setIdade(novaIdade);
		System.out.println("Idade de " + this.nome + " atualizada para: " + novaIdade);
	}
}
