/*Crie um programa para encontrar o maior número que pode ser criado reordenando um vetor de 6 posições. Por exemplo: 
{1, 2, 3, 0, 4, 6} 
Deverá ter a saída: 643210 */
package Prova2;
public class LeticiaFruet_1 {
 
    public static void main(String[] args) {

        int vetor[] = {1, 2, 3, 0, 4, 6};
        int vetorInvertido[] = new int[vetor.length];
        int cont = 0, i = 0;

        //ordenando o vetor
        while (i < vetor.length - 1) {
            if (vetor[i] > vetor[i+1]) {
                int bolha = vetor[i];
                vetor[i] = vetor[i+1];
                vetor[i+1] = bolha;
                i = 0;
            }
            else {
                i = i + 1;
            }
        }

        System.out.println();

        //invertendo o vetor
        for (i = vetor.length - 1; i >= 0; i--) {
            vetorInvertido[cont] = vetor[i];
            System.out.print(vetorInvertido[cont]);
            cont++;
        }
    }
}
