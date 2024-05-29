package edu.vitor.doc;
/**
* <h1>Doc</h1>
* A Calculadora realiza operações matemáticas entre números inteiros
* <p>
* <b>Note:</b> Leia atentamente a documentação desta classes
* para desfrutar dos recursos oferecidos pelo autor
*
* @author  Vitor Rodrigues
* @version 1.0
* @since   01/01/2022
*/
public class Doc{
		// utilizando estas barras duplas criamos um comentario in linha
		
		/* Utilizando desta forma com barras asteristico, asteristico e barra
		 * Criamos um comentário em mult-line
		 */
		
		/**
		 * Quando criamos desta forma usando barra, dois asteristicos, asteristico e barra
		 * criamos um comentario para documentação
		 */
		public int teste(int numeroUm, int numeroDois) {
	        return  numeroUm + numeroDois;
	    }
		
		/**
		   * Este método é utilizado para somar dois números inteiros
		   * @param numeroUm este é o primeiro parâmetro do método
		   * @param numeroDois este é o segundo parâmetro do método
		   * @return int o resultado deste método é a soma dos dois números.
		   */
		    public int somar(int numeroUm, int numeroDois) {
		        return  numeroUm + numeroDois;
		    }
		    
		    
		    
		    //Exemplo de como não fazer um bloco de códico
		    
		    /*
		     * Este método foi elaborado as pressas
		     * por isso eu abrevei o nome das variáveis
		     * mas olha, ele tem a finalidade de somar ou  multiplicar
		     * dois números
		     */		    
		    public int somaMultiplica (int n, int x, String m){
		        int r = 0; // r é igual ao resultado
		        if (m == "M"){ // M= multiplicação
		            r= n * x;
		        }else{
		            // se não soma mesmo
		            r = n + x;
		        }
		        return r;
		    }
}
