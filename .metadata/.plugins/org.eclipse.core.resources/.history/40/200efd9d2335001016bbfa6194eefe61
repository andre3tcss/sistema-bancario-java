package br.com.andre.sistemabancario;

public class ContaCorrente extends ContaBancaria{

	private static final double TAXA_SAQUE = 2.5;
	
	public ContaCorrente(String titular) {
		super(titular);
	}
	
	@Override
	public void sacar(double valor) {
		double valorComTaxa = valor + TAXA_SAQUE;
		if (valorComTaxa <= getSaldo()) {
			super.sacar(valorComTaxa);
			System.out.println("Taxa de R$" + TAXA_SAQUE + " aplicada no saque.");
		}
		else {
			System.out.println("Saldo insuficiente para saque com taxa.");
		}
	}
}
