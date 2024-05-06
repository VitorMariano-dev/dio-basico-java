package edu.vitor.operadores;

public class Operadores4 {

	public static void main(String[] args) {
		// Incrementando, decrementando e negando variáveis

		int numero = 5;
		// x repetição
		// numero = numero + 1 // Posso abreviar para ficar desta forma numero++
		// numero = numero - 1 // Posso abreviar para ficar desta forma numero--
		numero--;
		
		System.out.println(numero);
		
		boolean variavel = true;
		
		System.out.println(!variavel);
		System.out.println(variavel); // Na memoria a variavel continua sendo "true" para alterar na memória podemos fazer dessa fforma
		
		variavel =! variavel;
		
		System.out.println(variavel);
	}

}
