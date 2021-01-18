package br.senai.sp.jandira;

import br.senai.sp.jandira.model.Conta;

public class App {

	public static void main(String[] args) {

		Conta contaDaAna = new Conta();

		Conta contaDoJoao;
		contaDoJoao = new Conta();

		// Determinar os dados da conta da Ana
		contaDaAna.titular = "Ana Gomes";
		contaDaAna.numero = "111-98";
		contaDaAna.tipo = "Corrente";
		contaDaAna.ativa = true;
		contaDaAna.limite = 200;
		contaDaAna.depoisitar(100);
		contaDaAna.mostrarSaldoDaConta();
		contaDaAna.depoisitar(30);
		contaDaAna.mostrarSaldoDaConta();
		contaDaAna.sacar(50);
		contaDaAna.mostrarSaldoDaConta();
		contaDaAna.sacar(500);
		contaDaAna.mostrarSaldoDaConta();
		contaDaAna.sacar(50);
		contaDaAna.mostrarSaldoDaConta();
		contaDaAna.sacar(80);
		contaDaAna.mostrarSaldoDaConta();
		contaDaAna.depoisitar(100);
		contaDaAna.mostrarSaldoDaConta();
		contaDaAna.getSaldo();
		
		somar(10, 5);

	}
	
	public static int somar(int valor1, int valor2) {
		int resultado = valor1 + valor2;
		return resultado;
	}
	
}