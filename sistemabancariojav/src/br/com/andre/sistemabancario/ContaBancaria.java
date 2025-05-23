package br.com.andre.sistemabancario;

public class ContaBancaria {

	private String titular;
	private double saldo;
	
	public ContaBancaria(String titular) {
		this.titular = titular;
		this.saldo = 0.0;
	}

	public String getTitular() {
		return titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void depositar(double valor) {
		if (valor > 0) {
			saldo += valor;
			System.out.println("Dep�sito de R$" + valor + " realizado com sucesso.");
		}
		else {
			System.out.println("Valor inv�lido para dep�sito.");
		}
	}
	
	public void sacar(double valor) {
		if (valor > 0 && valor <= saldo) {
			saldo -= valor;
			System.out.println("Saque de R$" + valor + " realizado com sucesso.");
		}
		else {
			System.out.println("Saldo insuficiente ou valor inv�lido.");
		}
	}
	
	public void exibirSaldo() {
		System.out.println("Titular: " + titular + " | Saldo: R$" + saldo);
	}
	
	
	
}
