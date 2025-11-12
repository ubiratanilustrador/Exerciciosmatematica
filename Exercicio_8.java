package exercicio_8;

/*Uma livraria vendeu 125 livros de literatura por R$ 35 cada e 80 livros didáticos
por R$ 50 cada. Qual foi o total arrecadado pela livraria?*/

public class Exercicio_8 {

	public static void main(String[] args) {
		
		//quantidade de livros vendidas de literatura
		 double qt_literatura = 125;
		 //preço dos livros de literatura
		 double preco_l = 35;
		 //quantidade de livros vendidos de didatica
		 double qt_didaticos = 80;
		 //preço dos livros didaticos
		 double preco_d = 50;
		 
		 //exibe as informações no console
		 System.out.println("VENDA DO DIA DA LIVRARIA\n");
		//exibe no console o valor de subtotal de livros de literatura vendidos
		 System.out.println("Total de livros de literatura: R$"+ livros_literarios(qt_literatura, preco_l));
		//exibe no console o valor de subtotal de livros didaticos vendidos
		 System.out.println("Total de livros de didaticos: R$"+livros_didaticos(qt_didaticos,preco_d));
		//exibe no console o valor total arrecado pela livraria
		 System.out.println("Venda total: R$ "+venda_total(livros_literarios(qt_literatura, preco_l),livros_didaticos(qt_didaticos, preco_d)));
		 	 
	}
	
	public static double livros_literarios(double qt_literaratura,double preco_l) {
	    // retorno o resultado da multiplicação de livros de literatura	
		return qt_literaratura*preco_l;
	}
	
	public static double livros_didaticos(double qt_didaticos,double preco_d) {
		// retornando o valor da multiplicação de livros didaticos
		return qt_didaticos*preco_d;
	}

	public static double venda_total(double subtotal_literario, double subtotal_didatico) {
	    // retorna a soma dos dois subtotais de livros
		return subtotal_literario+ subtotal_didatico;
	}
		
}
