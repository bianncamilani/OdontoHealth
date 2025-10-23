package odontohealth.main;

public class Paciente extends Pessoa {
	private int idPaciente;
	
	public Paciente (String nome, String telefone, String endereco, String cpf, int idade, int idPaciente) {
		
		super(nome, telefone, endereco, cpf, idade);
		
		this.idPaciente = idPaciente;
	}

	public int getIdPaciente() { return idPaciente; }

	public void setIdPaciente(int idPaciente) { this.idPaciente = idPaciente; }
	
	@Override
	public void apresentar() {
		super.apresentar();
		
		System.out.println("____Dados do Paciente_____");
		System.out.println("ID do Paciente: " + this.idPaciente);
	}
}	
	