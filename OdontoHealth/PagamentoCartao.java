package odontohealth.main;

public class PagamentoCartao implements Pagamento {
	private double numeroCartao;
	private String titular;
	private int ccv;
	private boolean pago = false;
	
	public PagamentoCartao (double numeroCartao, String titular, int ccv) {
		this.numeroCartao = numeroCartao;
		this.titular = titular;
		this.ccv = ccv;
	}

	public double getNumeroCartao() { return numeroCartao; }

	public void setNumeroCartao(double numeroCartao) {
		this.numeroCartao = numeroCartao;
	}

	public String getTitular() { return titular; }

	public void setTitular(String titular) { this.titular = titular; }

	public int getCcv() { return ccv; }

	public void setCcv(int ccv) { this.ccv = ccv; }

	public boolean isPago() { return pago; }

	public void setPago(boolean pago) { this.pago = pago; }
	
	public void escolherCredito () {
		System.out.println("Opção crédito escolhido com sucesso.");
	}
	
	public void escolherDebito() {
		System.out.println("Opção debito escolhido com sucesso.");
	}
	
	@Override
	public void pagarConsulta() {
		System.out.println("Pagamanto realizado com sucesso.");
	}
	
	@Override
	public boolean confirmarPagamento() {
		return pago;
	}
	
	@Override
	public void cancelarPagamento() {
		if(pago) {
			System.out.println("Pagamento com cartão cancelado.");
			pago = false;
		} else {
			System.out.println("Nenhum pagamento foi realizado.");
		}
	}
}
