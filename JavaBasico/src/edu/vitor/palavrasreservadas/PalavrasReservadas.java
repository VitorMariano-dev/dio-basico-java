package edu.vitor.palavrasreservadas;

public class PalavrasReservadas {

	public static void main(String[] args) {
		// Palavras Reservadas
		// 52 Palavras reservadas
		/*
		 * Tipos Primitivos 
		 * Classicações 
		 * Escopo de uso 
		 * Palavras "opostas"
		 */

		/*
		 * CONTROLE DE PACOTES
		 * 
		 * import: importa pacotes ou classes para dentro do código ;
		 * package: especifica a que pacote, todas as classes de um arquivo pertencem;
		 */

		/*
		 * MODIFICADORES DE ACESSO
		 * 
		 * public: acesso de qualquer classe;
		 * private: acesso apenas dentro da classe;
		 * protected: acesso por classes no mesmo pacote e subclasses;
		 */
		
		/*
		 * PRIMITIVOS
		 * 
		 * boolean: um valor indicado verdadeiro ou falso;
		 * byte: um inteiro de 8 bits (signed);
		 * char: um character unicode (16-bit unsigned);
		 * double: um número de ponto flutuante de 64 bits (signed);
		 * float: um número de ponto flutuante de 32 bits (signed);
		 * int: um número inteiro de 32 bits (signed);
		 * long: um inteiro de 64 bits (signed);
		 * short: um inteiro de 32 bits (signed);
		 * void: indica que o método não tem retorno de VALOR;
		 */
		
		/*
		 * MODIFICADORES DE CLASSES, VARIÁVEIS OU MÉTODOS
		 * 
		 * abstract:classe que não pode ser instanciada ou método que precisa ser implementado, por uma subclasse não abstrata;
		 * class: especifica uma classe;
		 * extends: indica a superclasse que a subclasse está estendendo;
		 * final: impossibilita que uma classe seja estendida, que um método seja sobrescrito ou que uma variável seja reinicializada;
		 * implements: indica as interfaces que uma classe irá implementar;
		 * interface: especifica uma interface;
		 * **native**: indica que um método está escrito com uma linguagem independente da plataforma, como o C;
		 * new: instancia um novo objeto, chamando seu construtor;
		 * static: faz um método ou variável pertencer à classe ao invés de às intâncias;
		 *  **strictpf**: usado em frente a um método ou classe para indicar que os números de ponto flutuante seguirão as regra de ponto flutuante, em todas as expressões;
		 *  synchronized: indica que um método só pode ser acessado por uma thread de cada vez;
		 *  transient: impede a serialização de campos;
		 *  **volatile**: indica que uma variável pode ser alterada durante o uso de threads;
		 */
		
		/*
		 * CONTROLE DE FLUCO DENTRO DE UM BLOCO DE CÓDIGO
		 * 
		 * break: sai do bloco de códifo em que ele está;
		 * case: executa um bloco de código dependendo do teste do switch;
		 * continue: pula a execução do código que viria, após essa linha e vai para a próxima passagem do loop;
		 * default: executa esse bloco de código caso nenhum dos testes de switch-case seja verdadeiro;
		 * do: executa um vloco de código uma vez, e então realiza um teste em conjunto com o while para determinar se o bloco deverá ser executado novamente;
		 * else: executa um bloco de código alternativo caso o teste "if" seja falso;
		 * for: usado para realizar um loop condicional de um bloco de código;
		 * if: usado para realizar um teste lógico de verdadeiro ou falso;
		 * intanceof? determina se um objeto é uma instância de determinada classe, superclasse ou interface;
		 * return: retorna um método sem executar qualquer código que venha depois desta linha (também pode retornar uma variável);
		 * switch: indica a variável a ser comparada nas expressões case;
		 * while: executa um bloco de código repetidamente enquanto a condição for verdadeira;
		 */
		
		/*
		 * TRATAMENTO DE ERROS
		 * 
		 * **assert**: testa uma expressão condicional, para verificar uma suposição do programador;
		 * catch: declara o blocl de código usado para tratar uma execução;
		 * finally: bloco de código, após um try-catch, que é executado independente do fluxo do programa seguido ao lidar com uma execução;
		 * throw: usadado para passar uma execução para o método que o chamou;
		 * throws: indica que um método pode passar uma execução para o método que o chamou;
		 * try: bloco de código que tentará ser executado, mas que pode causar uma exceção;
		 */
		
		/*
		 * VARIÁVEIS DE REFERÊNCIA
		 * 
		 * super: refere-se a superclasse imediata;
		 * this: refere-se a instância atual do objeto;
		 */

		/*
		 * PALAVRAS RESERVADAS NÃO UTILIZADAS
		 * 
		 * const: Não utilize para declarar constantes; use public static final;
		 * goto: não implementada na linguagem Java, por ser considerada prejudicial;
		 */
		
		/* LITERAIS RESERVADOS
		 * 
		 * De acordo com a Java Language Specification (JLS) **null**, **true** e **false** são técnicamente 
		 * chamados de valores literais, e não keywords. Se você tentar criar algum identificador
		 * com estes valores, você também terá um erro de compilaçãoo
		 */
		
		
	}

}
