package odontohealth.main;

import java.time.LocalDateTime;

public class Atendimento {
	private int idAtendimento;
	private LocalDateTime dataHora;
	private double valorAtendimento;
	private String tipoAtendimento;
	private Paciente paciente;
	
	public Atendimento(int idAtendimento, LocalDateTime dataHora, double valorAtendimento, String tipoAtendimento, Paciente paciente) {
		this.idAtendimento = idAtendimento;
		this.dataHora = dataHora;
		this.valorAtendimento = valorAtendimento; 
		this.tipoAtendimento = tipoAtendimento; 
		this.paciente = paciente;
	}

	public int getIdAtendimento() { return idAtendimento; }

	public void setIdAtendimento(int idAtendimento) {
		this.idAtendimento = idAtendimento;
	}

	public LocalDateTime getDataHora() { return dataHora; }

	public void setDataHora(LocalDateTime dataHora) { this.dataHora = dataHora; }

	public double getValorAtendimento() { return valorAtendimento; }

	public void setValorAtendimento(double valorAtendimento) {
		this.valorAtendimento = valorAtendimento;
	}

	public String getTipoAtendimento() { return tipoAtendimento; }

	public void setTipoAtendimento(String tipoAtendimento) {
		this.tipoAtendimento = tipoAtendimento;
	}
	
	public Paciente getPaciente() { return paciente; }
    public void setPaciente(Paciente paciente) { this.paciente = paciente; }
    
	public void apresentar() {
		System.out.println("____Atendimento____" );
		System.out.println("ID do Atendimento: "  + this.idAtendimento);
		System.out.println("Data e Hora: " + this.dataHora);
		System.out.println("Valor do Atendimento: " + String.format("%.2f",  this.valorAtendimento));
		System.out.println("Tipo do Atendimento: " + this.tipoAtendimento);
	}
	
	public void realizarAtendimento() {
		System.out.println("______Paciente em Atendimento_____");
		System.out.println("Atendimento: " + this.idAtendimento + " do tipo '" + this.tipoAtendimento);
		System.out.println("Registrado em: " + this.dataHora.toLocalDate() + " às " + this.dataHora.toLocalTime());
		System.out.println("__________________________________");
	}
	
	public void encerrarAtendimento() {
		System.out.println("______Atendimento Concluido_____");
		System.out.println("Atendimento: " + this.idAtendimento + " do tipo '" + this.tipoAtendimento + "' do Paciente ID: " + this.paciente.getIdPaciente());
		System.out.println("__________________________________");
	}
	
}

	
