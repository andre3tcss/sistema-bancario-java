package br.com.andre.sistemabancario;

public class ContaPoupanca extends ContaBancaria {

	private static final double TAXA_RENDIMENTO = 0.03;
	
	public ContaPoupanca(String titular) {
		super(titular);
	}
	
	public void simularRendimentoMensal() {
		double rendimento = getSaldo() * TAXA_RENDIMENTO;
		System.out.println("Rendimento simulado de R$" + rendimento + " para o mês.");
	}
}
