package edu.vitor.anatomiadasclasses;
public class MinhaClasse {

	public static void main (String [] args) {
		
		// PRIMEIRA AULA
		// System.out.print("Hello word"); // First Class
		// final String BR = "Brasil"; // Váriavel Maiuscula é considerada como final e não sofre mais nenhuma alteração
		
		
		// SEGUNDA AULA
		/* DECLARAÇÃO INVÁLIDA DE VARIÁVEIS
		 * 
		 * int numero&um = 1; // Os únicos símbolos permitidos são _ e $
		 * int 1numero = 1; // Uma variável não pode comecar com númerico
		 * int numero um = 1; // Não pode ter espaço no nome da variável
		 * int long = 1; //long faz parte das palavras reservadas da linguagem
		 
		
		/* DECLARAÇÃO VÁLIDA DE VARIÁVEIS
		 * 
		 * int numero$um = 1;
		 * int numero1 = 1;
		 * int numeroum = 1;
		 * int longo = 1;
		 */
		
		
		// TERCEIRA AULA
		/* Declarando variáveis e métodos
		 * Quando criamos uma variável sempre antes do nome vem o tipo da variável
		 * 
		  	exemplo de variáveis
		 	String meuNome = "Vitor";
		
			int anoFabricacao = 2024;
		
			boolean verdadeira = false; // Sim ou não / verdadeira ou false
		
			anoFabricacao = 2018; // alterando o valor da variável
			
			
			
			
		 * Métodos
		  
		  	// Estrutura

			TipoRetorno NomeObjetivoNoInfinitivo Parametro(s)

			//Exemplo

			int somar (int numeroUm, int numero2)

			String formatarCep (long cep) // parametros podem ter parametros diferentes dos tipos
		 	
		 	// Dentro da classe Main
		 	 * 
		 	 * 	String primeiroNome = "Vitor";
				String segundoNome = "Mariano";
		
				String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
				System.out.print(nomeCompleto);
				
			// Fora da classe Main
			 * 
			 *	 public static String nomeCompleto(String primeiroNome, String segundoNome){
		
				return "Resultado do método: " + primeiroNome.concat(" ").concat(segundoNome);
				}
			
		 */
		
		// QUARTA AULA
		/* Identação = forma de tabular código para melhor entendimento de código e escopo
		 * 
		 * Exemplo sem identação
		 *	int mediaFinal = 6;
			if(mediaFinal<6)	
			System.out.println("REPROVADO"); 
			else if(mediaFinal==6)
			System.out.println("PROVA MINERVA"); 
			else
			System.out.println("APROVADO");
		 *
		 *
		 * Exemplo do mesmo código mas com identação
		  	int mediaFinal = 6;
			if (mediaFinal < 6)
				System.out.println("REPROVADO");
			else if (mediaFinal == 6)
				System.out.println("PROVA MINERVA");
			else
				System.out.println("APROVADO");
		 *
		 *
		 *
		 */
		
		// QUINTA AULA
		/*	Organizando arquivos
		 * Organizar os arquivos em pacotes para deixar uma estrutura limpa do projeto e nisso temos algumas dicas para facilitar nossa organização
		 * Exemplo de nome de packages (pacottes)
		 * 
		 * com.hypertech.notification.util //(com = comercio)
		 * com.hypertech.notification.service
		 * 
		 * edu.vitor.logicaprogramacao // (edu = educação)
		 * edu.vitor.organizandoarquivo
		 * 
		 * */
		
		
		// SEXTA AULA
		/* Java Beans
		 * Iniciativa conceitual da  comunidade para que possamos ter uma estruturação de escrita, de como expressamos as nossa variaváveis, métodos, funções etc. Deixar o código mais claro e legivel possível
		 * 
		 * Aqui irei deixar sugestões de nomenclaturas
		 * 
		 * Para o Java Beans funcionar a variável precisa ser clara e evitar abreviações
		 * Sempre preferir declarar nome de variáveis no singular e deixar o plural para quando for um array
		 * 
		 * Escrever em um idioma único evitar usar varios idiomas no mesmo programa
		 * 
		 * Exemplos de variáveis não recomendadas:
		 * 
		 * double salMedio = 1500.23 // Variável abreviada, dificulta a compreensão
		 * String emails = "vitor@vitor.com" // Confuso pois eu não sei se é apenas um e-mail ou varios e-mail que serão definidos
		 * String myName = "JOSEPH" // se o idioma é pt-BR, devo manter este idioma
		 * 
		 * 
		 * Exemplos de viriáveis recomendadas
		 * 
		 * double salarioMedio = 1500.23;
		 * String email = "vitor@vitor.com";
		 * String [] emails = {"aluno@escola.com", "professor@escola"};
		 * String meuNome = "JOSEPH";
		 * 
		 * 
		 * Já os métodos o recomendado é nomear com um verbo e em camelCase
		 * 
		 * Exemplos sugeridos de métodos
		 * 
		 * somar(int n1, intn2 {}
		 * 
		 * abrirConexao(){}
		 * 
		 * concluirProcessamento(){}
		 * 
		 * findById(int id){} // não se assuste, você verá muito método em inglês em sua jornada // muitas bibliotecas definem seus metodos em inglês
		 * 
		 * calcularImprimir(){} // há algo de errado neste método, ele deveria ter uma única finalidade
		 * 
		 * */
		
	}
}