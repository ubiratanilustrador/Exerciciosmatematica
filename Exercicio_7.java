package exercicios_ensino_fundamental;

/*Se o capital de R$ 1 000,00 rende mensalmente 
 *R$ 25,00, qual é a taxa anual de juros no 
 *sistema de juros simples?*/

public class Exercicio_7 {

	public static void main(String[] args) {
		
		// Crio as variaveis dos problemas
		float capital = 1000;
		float juros = 25;
		
		//divido o juros pelo capital, para obter a taxa
		float resposta = juros / capital;
		//exibo no console a taxa
		System.out.println("taxa de juros: "+ resposta+" ou "+ resposta*100+"% ao mês");
		System.out.println("");
		
		//Como é juros simples, basta multiplicar a taxa mensal por 12:
        float taxa_anual = (resposta*100)*12;
        //exibo resultado no console
        System.out.println("taxa de juros anunal: "+ taxa_anual+"%");
	}
}
