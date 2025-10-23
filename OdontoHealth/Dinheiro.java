package odontohealth.main;

public class Dinheiro implements Pagamento {
	private int notas; 
	private boolean pago = false;
	private double valorConsulta;

	public Dinheiro(int notas, double valorConsulta) {
		this.notas = notas;
		this.valorConsulta = valorConsulta;
	}

	public int getNotas() {
		return notas;
	}

	public void setNotas(int notas) {
		this.notas = notas;
	}

	public double getValorConsulta() {
		return valorConsulta;
	}

	public void setValorConsulta(double valorConsulta) {
		this.valorConsulta = valorConsulta;
	}

	public boolean isPago() {
		return pago;
	}

	public void setPago(boolean pago) {
		this.pago = pago;
	}

	public void devolverTroco() {
		double troco = notas - valorConsulta;
		if (troco > 0) {
			System.out.printf("Troco devolvido: R$ %.2f\n", troco);
		} else if (troco == 0) {
			System.out.println("Pagamento exato. Nenhum troco necessário.");
		} else {
			System.out.printf("Valor insuficiente. Faltam R$ %.2f\n", -troco);
		}
	}

	@Override
	public void pagarConsulta() {
		if (notas >= valorConsulta) {
			pago = true;
			System.out.println("Pagamento realizado com sucesso em dinheiro.");
			devolverTroco();
		} else {
			System.out.println("Valor insuficiente.");
		}
	}

	@Override
	public boolean confirmarPagamento() {
		return pago;
	}

	@Override
	public void cancelarPagamento() {
		if (pago) {
			System.out.println("Pagamento em dinheiro cancelado.");
			pago = false;
		} else {
			System.out.println("Nenhum pagamento foi realizado.");
		}
	}
}