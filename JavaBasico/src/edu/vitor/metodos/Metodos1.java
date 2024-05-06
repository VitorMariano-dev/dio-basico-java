package edu.vitor.metodos;

public class Metodos1 {

	public static void main(String[] args) {
		// Métodos
		// classes são definidas por atributos e métodos
		// e Atributos em grande maioria das vezes são variáveis de diferentes tipos e
		// valores
		// Métodos são as funções ou sub-rotinas, por exemplo acelerar, freia ou buzinar
		// (seriam conceitos de métodos)

		/*
		 * Métodos de nomeação sugeridos para ter um código limpo e entendivel
		 * 
		 * 1º Dever ser nomeado como verbo 2º Seguir o padrão camelCase
		 * (calcularImposto)
		 * 
		 */

		// Exemplos de nomenclatura sugeridos
		/*
		 * somar(int n1, int n2){}
		 * 
		 * abrirConexao(){}
		 * 
		 * concluirProcessamento() {}
		 * 
		 * findById(int id){} // não se assuste, você verá muito método em inglês em sua
		 * jornada
		 * 
		 * calcularImprimir(){} // há algo de errado neste método, ele deveria ter uma
		 * única finalidade
		 * 
		 * 
		 * ATENÇÃO! Não existe em Java o conceito de métodos globais. Todos os métodos
		 * devem SEMPRE ser definidos dentro de uma classe.
		 */

		// Definição de Métodos
		/*
		 * Principais perguntas a se fazer quando for criar um método
		 * 
		 * 1º Qual a propsta principal do método? Você deve se perguntar constantemente
		 * até compreender a real finalidade do mesmo.
		 * 
		 * 2° Qual tipo de retorno esperado após executar um método? Você deve analisar
		 * se o método será responsável por retornar algum valor ou não.
		 * 
		 * Caso o método não retorne nenhum valor, ele será representado pela
		 * palavra-chave void.
		 */

		/*
		 * 
		 * Quais os parâmetros serão necessários para execução do método? Os métodos às
		 * vezes precisarão de argumentos como critérios para a execução.
		 * 
		 * O método possui o risco de apresentar alguma exceção? Exceções são comuns na
		 * execução de métodos, as vezes é necessário prever e tratar a possível
		 * existência de uma exceção.
		 * 
		 * Qual a visibilidade do método? Avaliar se será necessário que o método seja
		 * visível a toda aplicação, somente em pacotes, através de herança ou somente a
		 * nível a própria classe.
		 */
		
		public double somar(int num1, int num2){
			//LOGICA - FINALIDADE DO MÉTODO
			return somar;
		}
		
		public void imprimir(String texto){
			//LOGICA - FINALIDADE DO MÉTODO
			//AQUI NÃO PRECISA DO RETURN
			//POIS NÃO SERÁ RETORNADO NENHUM RESULTADO
		}
		// throws Exception : indica que o método ao ser utilizado
		// poderá gerar uma exceção
		public double dividir(int dividendo, int divisor) throws Exception{}
		
		// este método não pode ser visto por outras classes no projeto
		private void metodoPrivado(){}
		
		//alguns equívocos estruturais
		public void validar(){
			//este método deveria retornar algum valor
			//no caso boolean (true ou false)
		}
		public void calcularEnviar(){
			//um método deve representar uma única responsabilidade
		}
		public void gravarCliente(String nome, String cpf, Integer telefone){
			//este método tem a finalidade de gravar
			//informações de um cliente, por que não criar
			//um objeto cliente e passar como parâmetro ?
			//veja abaixo
		}
		public void gravarCliente(Cliente cliente){}
		//ou
		public void gravar(Cliente cliente){}
		

	}

}
