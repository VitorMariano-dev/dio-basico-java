package edu.vitor.operadores;

public class Operadores6 {

	public static void main(String[] args) {
		// Operadores relacionais
		// Avaliar relações entre duas variáveis ou expressões
		/*
		 * == Quando desejamos verificar se uma variável é IGUAL A outra.
		 * 
		 * != Quando desejamos verificar se uma variável é DIFERENTE da outra.
		 * 
		 * > Quando desejamos verificar se uma variável é MAIOR QUE a outra.
		 * 
		 * >= Quando desejamos verificar se uma variável é MAIOR OU IGUAL a outra.
		 * 
		 * < Quando desejamos verificar se uma variável é MENOR QUE outra.
		 * 
		 * <= Quando desejamos verificar se uma variável é MENOR OU IGUAL a outra.
		 */

		int numero1 = 1;
		int numero2 = 2;

		boolean simNao = numero1 == numero2;
		
		String nomeUm = "Vitor";
		String nomeDois = "Vitor";
		
		System.out.println(nomeUm == nomeDois);
		
		String nomeTres = "Vitor";
		String nomeQuatro = new String("Vitor");
		
		System.out.println(nomeTres.equals(nomeQuatro)); // Para comparar se o conteudo dos objetos são iguais
		
		
		if(numero1 < numero2) { // true
			System.out.println("A nossa condição é verdadeira");
		}

		System.out.println("numeroUm é igual a numeroDois? " + simNao); // false

		simNao = numero1 != numero2;

		System.out.println("numeroUm é diferente a numeroDois? " + simNao); // true

		simNao = numero1 > numero2;

		System.out.println("numeroUm é maior a numeroDois? " + simNao); // false
		
		simNao = numero1 >= numero2;

		System.out.println("numeroUm é maior ou igual a numeroDois? " + simNao); // false

	}

}
