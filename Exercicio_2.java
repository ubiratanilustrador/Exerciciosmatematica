package exercicios_ensino_fundamental;

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

public class Exercicio_2 {

	public static void main(String[] args) {
		
		double total = 3.265 + 4.127+ 2.987;
		System.out.println("O total foi: "+ total);
		
		double queda = 4.127-2.987;
		System.out.println("A queda foi de: "+ queda);

	}

}
