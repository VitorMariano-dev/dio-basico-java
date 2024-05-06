package edu.vitor.operadores;

public class Operadores2 {

	public static void main(String[] args) {
		// Operador de atribuição
		// Representado pelo símbolo de igualdade "=".
		
		String nome = "Vitor"; // Estamos atribuindo o texto Vitor à variável nome
		int idade = 22;
		double peso = 68.5;
		char sexo = 'M';
		boolean doadorOrgao = false;
		//Date dataNascimento = new Date();
		
		// Operadores aritméticos
		// Os operadores aritméticos são: + (adição), - (subtração), * (multiplicação) e / (divisão)
		
		double soma = 10.5 + 15.7;
		int subtracao = 113 - 25;
		int multiplicacao = 20 * 7;
		int divisao = 15 / 3;
		int modulo = 18 % 3; // para saber o "resto" desta divisão
		double resultado = (10 * 7) + (20 / 4);
		//ATENÇÃO! O operador de adição (+), quando utilizado em variáveis do tipo texto, realizará a “concatenação de textos”.
		
		String nomeCompleto = "LINGUAGEM" + " JAVA"; // Console = Lingaguem Java
		
		System.out.print(nomeCompleto);
		
		//qual o resultado das expressoes abaixo?
		String concatenacao ="?"; 

		concatenacao = 1+1+1+"1"; // Resultado "31"
		
		System.out.println(concatenacao);

		concatenacao = 1+"1"+1+1; // Resultado "1111" Depois da string ele identifica tudo como "Texto"
		
		System.out.println(concatenacao);

		concatenacao = 1+"1"+1+"1"; // Resultado "1111"
		
		System.out.println(concatenacao);

		concatenacao = "1"+1+1+1; // Resultado "1111"
		
		System.out.println(concatenacao);

		concatenacao = "1"+(1+1+1); // Resultado no console "13" pois ele primeiro realizou a soma das evidencias "( )" depois ele concatenou com a string
		
		System.out.println(concatenacao);
	}

}
