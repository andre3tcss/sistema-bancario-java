package br.com.andre.sistemabancario;

import java.util.ArrayList;

public class Banco {
	
	private ArrayList<ContaBancaria> contas;
	
	public Banco() {
		contas = new ArrayList<>();
	}
	
	public void adicionarConta(ContaBancaria conta) {
		contas.add(conta);
		System.out.println("Conta adicionada com sucesso.");
	}
	
	public ContaBancaria buscarContaPorTitular(String nome) {
		for (ContaBancaria conta : contas) {
			if (conta.getTitular().equalsIgnoreCase(nome)) {
				return conta;
			}
		}
		System.out.println("Conta não encontrada para o titular: " + nome);
		return null;
	}
	
	public void listarContas() {
		System.out.print("=== Contas no banco ===");
		for (ContaBancaria conta : contas) {
			conta.exibirSaldo();
		}
	}
}
