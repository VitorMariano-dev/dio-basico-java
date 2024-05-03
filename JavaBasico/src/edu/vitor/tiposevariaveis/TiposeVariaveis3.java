package edu.vitor.tiposevariaveis;

public class TiposeVariaveis3 {
	public static void main(String[] args) {

		//A estrutura padrão para se declarar uma variável sempre é:

		//<Tipo> <nomeVariavel> <atribuicaoDeValorOpcional>
		
		int idade; //Tipo "int", nome "idade", com nenhum valor atribuído. 
		int anoFabricacao = 2021; //tipo "int", nome "anoFabricacao", com valor 2021.
		double salarioMinimo = 2.500; //tipo "double", nome "salarioMinimo", valor 2.500. (2 virula cinco e não ois mil e quinhentos
		
		
		byte idade2 = 123;
		short ano = 2021;
		int cep = 21070333; // se começar com zero, talvez tenha que ser outro tipo
		long cpf = 98765432109L; // se começar com zero, talvez tenha que ser outro tipo // Também precisa terminar com um L
		float pi = 3.14F; // precisa terminar com F para a linguagem não achar que deveria ser double
		double salario = 1275.33;

		
		//Muitas das vezes criamos uma variável, definimos um valor correspondente, manipulamos esta variável e temos consciência de seu valor na aplicação. Mas, cuidado!
		short numeroCurto = 1;
		int numeroNormal = numeroCurto;
		short numeroCurto2 = numeroNormal; // errado
		short numeroCurto3 = (short) numeroNormal; // Correto com o (cast)
		//Por mais que tenhamos ciência do valor que numeroNormal cabe em um short, o Java não permite correr o risco.
	}
}
