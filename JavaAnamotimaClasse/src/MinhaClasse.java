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
		
		
		
	}
}