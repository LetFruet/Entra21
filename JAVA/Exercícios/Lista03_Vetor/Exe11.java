//Descreva um algoritmo que leia 12 valores reais e os coloque em um vetor de 12 posições do tipo real.
//Imprima quais valores desses informados são maiores que a média dos valores.
package Lista03_Vetor;
import java.util.Scanner;
public class Exe11 {

    public static void main(String[] args) {
        
		double vetor[] = lerValor();
		double media = calcularMedia(vetor);
		imprimirAcimaMedia(vetor, media);
	}

       public static double[] lerValor() {
		Scanner kb = new Scanner(System.in);

		double vetor[] = new double[12];

        System.out.println("Entre com 12 valores reais: ");
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = kb.nextDouble();
		}

        kb.close();

		return vetor;
	}

	public static double calcularMedia(double vetor[]) {

		double soma = 0;

		for (int i = 0; i < vetor.length; i++) {
			soma += vetor[i];
		}

		double media = soma / vetor.length;

		return media;
	}

	public static void imprimirAcimaMedia(double vetor[], double media) {

		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] > media) {
				System.out.println(vetor[i]); }
		}
	}
}