package exercicio_9;

/*Em uma fábrica de brinquedos, 5 máquinas produzem 60 peças em 4 horas. Durante o período de Natal,
a fábrica decidiu aumentar a produção para atender à demanda, colocando 8 máquinas para funcionar.
Quantas peças serão produzidas em 4 horas com esse aumento?*/

public class Exercicio_9 {

	public static void main(String[] args) {
		// Exibi quantas peças são produzidas em 4 horas
		System.out.println("Foram produzidas: " + solucao_1() + " peças.");
		System.out.println("Foram produzidas: " + solucao_2() + " peças.");

	}

	//solução regras de três
	public static int solucao_1() {

		int maquinas = 5;
		int maquinas_ex = 8;
		int qt_pecas = 60;
		int sub_total = maquinas_ex * qt_pecas;

		return sub_total / maquinas;
	}

	//solução apresentada pelo autor
	public static int solucao_2() {
		
		int maquinas = 5;
	    int maquinas_ex = 8;
        int qt_pecas = 60;
	    int subtotal = qt_pecas / maquinas;
		return subtotal*maquinas_ex;
	}

}
