/* 4) Em um projeto para a construção de um cinema, os arquitetos estão avaliando a 
 * relação entre a quantidade de fileiras e a quantidade de cadeiras em cada fileira. 
 * O projeto inicial prevê uma sala para 304 pessoas. No caso de utilizarem 19 fileiras,
 *  o número de cadeiras por fileira será
 *  a) 14.
 *  b) 15.
 *  c) 16.
 *  d) 13.
 *  e) 12.
 **/

using System;
class Exercicio_4 {
  static void Main() {
      
      // capacidade de pessoas no cinema
		int capacidade = 304;
		// numero de fileiras
		int fileiras = 19;
		//exibir no console as informações
		 Console.WriteLine("Serão necessários: \n");
		//chamo a função e exibo o resultado no console
		 Console.WriteLine(operacao(capacidade,fileiras)+" cadeiras.");
  }
  private static int operacao(int capacidade, int fileiras) {
		// crio uma variavel para receber o resultado e retorno o valor da divisão
		int resultado = capacidade / fileiras;
	    return resultado;
	}
}
