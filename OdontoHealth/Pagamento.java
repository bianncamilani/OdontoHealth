package odontohealth.main;

public interface Pagamento {
	
	public void pagarConsulta();
	boolean confirmarPagamento();
	void cancelarPagamento();
	
}
