package edu.vitor.operadores;

public class Operadores5 {

	public static void main(String[] args) {
		// Operador Ternário
		// forma resumida para definir uma condição
		/*
		 * O operador ternário é representado pelos símbolos "?" e ":" utilizados na
		 * seguinte estrutura de sintaxe:
		 * 
		 * <Expressão Condicional>`` ? ``<Caso condição seja true>`` : ``<Caso condição
		 * seja false>
		 */

		int a, b;

		a = 6;
		b = 6;
		String resultado = a==b ? "verdadeira" : "falso";
		/*
		 * if(a==b) { 
		 * resultado = "verdadeiro"; 
		 * }
		 * else { resultado = "falso"; 
		 * }
		 */
		System.out.println(resultado);

		/*
		 * EXEMPLO DE CONDICIONAL UTILIZANDO UMA ESTRUTURA IF/ELSE if(a==b) resultado =
		 * "verdadeiro"; else resultado = "falso";
		 */
	}

}
