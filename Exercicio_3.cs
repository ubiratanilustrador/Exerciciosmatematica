/* 3) Elisa está a procura de uma televisão para colocar em sua sala. 
 * Ela viu um anúncio de um modelo novo com as opções de pagamento à vista e a prazo.
 * A vista = R$ 1350,00
 * A prazo = 12 x 138,00
 * Quanto Elisa pagará a mais se optar pelo pagamento a prazo?
 **/

using System;
class Exercicio_3 {
  static void Main() {
      
      //crio as variaverias que serão usadas
		int prestacao = 12; // quantidade de prestações
		int valor_prestacao = 138; // valor das prestações
		int valor_avista = 1350; // valor a vista
		
		//exibo no console as informações solicitadas
		 Console.WriteLine("Valor total das prestações foi: \n");
		//chamo a função e exibo o valor total
		 Console.WriteLine("R$ "+operacao(prestacao, valor_prestacao)+"\n");
		//exibo no console as informações solicitadas
		 Console.WriteLine("optando por essa forma de pagamento, pagara a mais: \n");
		//crio um variavel para receber o valor total que foi exibido
		int comparacao = operacao(prestacao, valor_prestacao);
		//chamo a função e exibo a diferença que será obstida ao escolher a forma de pagamento
		 Console.WriteLine("R$ "+a_mais(valor_avista,comparacao));
		
  }
  
  //função responsavel por calcular a diferença dos valores 
	private static int a_mais(int valor_avista, int comparacao) {
		//criado uma variavel que recebera o valor total menos o valor a vista
		int resultado = comparacao - valor_avista;
		//retorna o resultado da operacao
		return resultado;		
	}

	//função responsavel por calcular o valor total das prestações 
	private static int operacao(int prestacao, int valor_prestacao) {
		//cria-se uma variavel que recebe a multiplicação das prestações com o valor da prestação
		int valor_total = prestacao * valor_prestacao;
		//retorna o valor total das prestações
		return valor_total;
	}
}
