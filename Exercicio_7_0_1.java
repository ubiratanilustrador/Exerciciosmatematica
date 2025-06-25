package melhorias;

/*Se o capital de R$ 1 000,00 rende mensalmente 
 *R$ 25,00, qual é a taxa anual de juros no 
 *sistema de juros simples?*/

public class Exercicio_7_0_1 {

	public static void main(String[] args) {

		// Crio as variaveis dos problemas
		float capital = 1000;
		float juros = 25;
	
		//exibo o valor da taxa mensal e anual de juros
		System.out.println("taxa de juros: "+caculo_juros_mensal(capital,juros)+"% ao mês");
		System.out.println("");
		System.out.println("taxa de juros: "+calculo_juros_anual(caculo_juros_mensal(capital,juros))+"% ao ano");
			
	}

	//função responsavel por dividir os juros pelo capital, para obter a taxa
	private static float caculo_juros_mensal(float capital, float juros) {
		return (juros / capital)*100;
		
	}
	
	//função responsvel por converter a taxa mensal em anual
	private static float calculo_juros_anual(float f) {
		return f*12;
	}
}
