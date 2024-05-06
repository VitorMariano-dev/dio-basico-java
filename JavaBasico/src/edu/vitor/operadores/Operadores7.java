package edu.vitor.operadores;

public class Operadores7 {

	public static void main(String[] args) {
		// Operadores Lógicos
		// Recurso que nos permite criar expressões logicas maiores
		/*
		 * && Operador Lógico "E"
		 * 
		 * || Operador Lógico "OU"
		 */

		// expressões booleanas
		boolean condicao1 = true;
		boolean condicao2 = false;

		if (condicao1 && condicao2) { // se cond1 E con2 forem verdadeira
			System.out.println("As duas condições são verdadeiras");
		} else {
			System.out.println("Uma delas não é verdadeira");
		}

		if (condicao1 || condicao2) { // Se uma das duas forem verdadeiras
			System.out.println("Uma das conções é verdadeira");
		}

		// Expressões booleanas e relacionais

		if (condicao1 && (7 > 4)) {
			System.out.println("As duas condições são verdadeiras");
		}

		int numero1 = 1;
		int numero2 = 1;

		if (numero1 == 2 && numero2++ == 2) {
			System.out.println("As 2 condições são verdadeiras");
		}
		System.out.println("O numero 1 agora é " + numero1);
		System.out.println("O numero 2 agora é " + numero2);

	}

}
