package odontohealth.main;

import java.time.LocalDate;

public class Pix implements Pagamento {
	private String nome;
	private LocalDate dataNascimento;
	private String cpf;
	private boolean pago = false;
	
	public Pix(String nome, LocalDate dataNascimento, String cpf) {
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.cpf = cpf;
	}

	public String getNome() { return nome; }

	public void setNome(String nome) { this.nome = nome; }

	public LocalDate getDataNascimento() { return dataNascimento; }

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getCpf() { return cpf; }

	public void setCpf(String cpf) { this.cpf = cpf; }

	public boolean isPago() { return pago; }

	public void setPago(boolean pago) { this.pago = pago; }
	
	@Override
	public void pagarConsulta() {
		System.out.println("Pagamento via Pix realizado com sucesso.");
	}
	
	@Override
	public boolean confirmarPagamento() {
		return pago;
	}
	
	@Override
	public void cancelarPagamento() {
		if (pago) {
			System.out.println("Pagamento via Pix cancelado.");
			pago = false;
		} else {
			System.out.println("Nenhum pagamento foi realizado.");
		}
	}
}
