package exercicios_ensino_fundamental;

/*Equação do segundo Grau  é uma equação polinomial onde o termo de maior 
 * grau da variável é o quadrado. A sua forma geral é ax² + bx + c = 0, 
 * onde 'a', 'b' e 'c' são coeficientes (com 'a' ≠ 0) e 'x' é a variável. 
 * Para resolver uma equação do 2º grau, utiliza-se a fórmula de Bhaskara 
 * (fórmula resolvente) para encontrar as raízes da equação. 
*/
import java.util.Scanner;

public class Exercicio_6 {

	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in)) {
			/*crio os coefiencentes da equação do segundo grau
			 *e peço ao usuario que digite o valor dos três*/
			System.out.println("informe o coeficente de a");
			int a = sc.nextInt();	
			System.out.println("informe o coeficente de b");
			int b = sc.nextInt();
			System.out.println("informe o coeficente de c");
			int c = sc.nextInt();
			System.out.println(" ");

			//exibi o resultado do delta no console
			System.out.println("Delta = "+ delta(a,b,c));
			/*crio uma varivel raizes que recebe o resultado de delta 
			 *e servira de parametro no calculo das duas raizes*/
			double raizes = delta(a,b,c);
			
			//exibi o resultado as raizes no console
			System.out.println(" ");
			System.out.println("raiz 1 = "+ raize_um(a,b,raizes)+" raize 2 = "+ raize_dois(a,b,raizes));
			
		}	
	}
	
	//função responsavel por calcular o delta na equação segundo grau
	private static double delta(int a,int b,int c) {
	
		//crio uma variavel que recebe o resultado de delta
		double resultado = (Math.pow(b, 2)) - (4*a*c);
		
		//retorno o resultado
		return resultado;
	}
	
	//função responsavel por calcular a primeira raiz
	private static double raize_um(int a,int b,double raizes) {
		 
		//crio uma variavel que recebe o resultado da primeira raiz
		double x1 = ((-b + Math.sqrt(raizes))/2 *a);
		
		//retorno a primeira raiz
		return x1;
	}
	
	//função responsavel por calcular a segunda raiz
	private static double raize_dois(int a,int b,double raizes) {
		
		//crio uma variavel que recebe o resultado da segunda raiz
		double x2 = ((-b - Math.sqrt(raizes))/2 *a);
		
		//retorno a segunda raiz
		return x2;
	}
}
