package melhorias;

/*2) Na fazenda Morro Alto são produzidas laranjas. Assim que começou o período da colheita, 
 *uma grande produção já foi contabilizada. 
 *A tabela abaixo mostra a produção nos três primeiros dias.
 *
 * SEGUNDA = 3.265 LARANJAS 
 * TERÇA   = 4.127 LARANJAS
 * QUARTA  = 2.987 LARANJAS
 * 
 * a) Qual a produção total nos três primeiros dias?
 * b) De quanto foi a queda na produção entre o dia de maior e menor produção?
 * 
 **/

public class Exercicio_2_0_1 {

	public static void main(String[] args) {

		//crio três variaveis para cada semana
		double segunda = 3265;
		double terca = 4127;
		double quarta = 2987;

		System.out.println("O total foi de:");
		//chamo a função e exibo resultado do total
		System.out.println(Total(segunda,terca,quarta));
	
		System.out.println("A queda foi de:");
		//chamo a função e exibo resultado da queda
		System.out.println(Queda(terca,quarta));

	}

	//função responsavel pela soma do total
	public static double Total(double segunda, double terca, double quarta) {
		
		//Variavel responsavel por rececer o total
		double montante = segunda + terca + quarta;

		//retorna o resultado
		return montante;
	}
	
	//função responsavel por informar o valor de queda
	public static double Queda (double terca, double quarta) {
		
		//variavel resposavel por receber o valor queda
		double reducao = terca - quarta;
		
		//retorna o resultado
		return reducao;
	}

}
