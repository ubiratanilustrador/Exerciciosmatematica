package exercicios_ensino_fundamental;

/* Em uma gincana de férias, 75 crianças se inscreveram para participar das atividades de recreação. 
 * De modo a organizarem os jogos e atividades, eles verificaram a faixa etária dos inscritos e 
 * constataram que 2/5 das crianças têm mais de doze anos. 
 * Quantos participantes tem menos que 12 anos? 
 **/

public class Exercicio_5 {

	public static void main(String[] args) {
	
	    //crio uma variavel que recebe o total de crianças
	    int total_criancas = 75;
	    //chamo a função e exibo o resultado no console
	    System.out.print("Crianças com mais de 12 anos, são: " +  criancas_maiores(total_criancas) + " participantes \n");
	    //crio uma variavel para receber o valor que sera usado na função
	    int comparacao = criancas_maiores(total_criancas);  
	    //chamo a função e exibo o resulado no console
	    System.out.print("Crianças com menos de 12 anos, são: " +   criancas_menores(comparacao,total_criancas) + " participantes");
	}

	//função responsável por calcular o numero de participantes maiores de idade
	private static int criancas_maiores(int total_criancas) {
		
		/* crio a variavel crianças_maiores. A mesma recebera a multiplicação e a 
		 * divisão total pela fração de 2/5
		 **/
		int criancas_maiores = ((2*total_criancas)/5);
		//retorna o resultado do calculo
		return criancas_maiores;
		
	}
	
	//função responsável por calcular o numero de participantes menores de idade
	private static int criancas_menores(int comparacao, int total_criancas) {
		
		//crio uma variavel que recebe a subtração do total de crianças de crianças maiores
		int criancas_menos_doze = total_criancas - comparacao;
		//retorno o resultado da operação
		return criancas_menos_doze;
	}

}
