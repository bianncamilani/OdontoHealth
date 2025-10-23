package odontohealth.main;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Agenda {
	private LocalDateTime dataHora;
	private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
	
	public Agenda(LocalDateTime dataHora) {
		this.dataHora = dataHora;
	}

	public LocalDateTime getDataHora() { return dataHora; }

	public void setDataHora(LocalDateTime dataHora) { this.dataHora = dataHora; }
	
	public void agendarConsulta(LocalDateTime novaDataHora) {
		this.setDataHora(novaDataHora);
		System.out.println("Consulta agendada com sucesso para: " + novaDataHora.format(FORMATTER));
	}

	public void cancelarConsulta() {
		if (this.dataHora != null) {
            String dataAntiga = this.dataHora.format(FORMATTER);
            this.setDataHora(null);
            System.out.println("Consulta de " + dataAntiga + " foi cancelada.");
        } else {
            System.out.println("Não há consulta agendada para cancelar.");
        }
	}
	
	public void reagendarConsulta(LocalDateTime novaDataHora) {
		if (this.dataHora != null) {
            String dataAntiga = this.dataHora.format(FORMATTER);
            this.setDataHora(novaDataHora);
            System.out.println("Consulta de " + dataAntiga + " reagendada para: " + novaDataHora.format(FORMATTER));
        } else {
            this.agendarConsulta(novaDataHora);
            System.out.println("Não havia consulta anterior. Novo agendamento realizado.");
        }
	}
}

