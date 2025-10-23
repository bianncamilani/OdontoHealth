package odontohealth.main;

public class Prontuario {
	
	private int idProntuario;
	private String historico;
	private String exame;
	private String anamnese;
    private Paciente paciente; 

	public Prontuario(int idProntuario, Paciente paciente, String historico, String exame, String anamnese) {
		this.idProntuario = idProntuario;
        this.paciente = paciente;
		this.historico = historico;
		this.exame = exame;
		this.anamnese = anamnese;	
	}

	public int getIdProntuario() { return idProntuario; }

	public void setIdProntuario(int idProntuario) {
		this.idProntuario = idProntuario;
	}

	public String getHistorico() { return historico; }

	public void setHistorico(String historico) { this.historico = historico; }

	public String getExame() { return exame; }

	public void setExame(String exame) { this.exame = exame; }

	public String getAnamnese() { return anamnese; }

	public void setAnamnese(String anamnese) { this.anamnese = anamnese; }

	public Paciente getPaciente() { return paciente; }

	public void setPaciente(Paciente paciente) { this.paciente = paciente; }
		
	public void apresentarDetalhes() {
        System.out.println("____PRONTUÁRIO MÉDICO____");
        System.out.println("ID Prontuário: " + this.idProntuario);
        if (this.paciente != null) {
            System.out.println("Paciente: " + this.paciente.getNome() + " (CPF: " + this.paciente.getCpf() + ")");
        }
        System.out.println("Histórico: " + this.historico);
        System.out.println("Exame: " + this.exame);
        System.out.println("Anamnese: " + this.anamnese);
    }
}


	