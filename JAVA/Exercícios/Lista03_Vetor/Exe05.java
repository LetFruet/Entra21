//Faça um algoritmo que atribua valores a um vetor de 100 posições de acordo com o quadrado do seu índice.
//Ex:
//[0] = 0
//[1] = 1
//[2] = 4
//[3] = 9
package Lista03_Vetor;
public class Exe05 {
    public static void main(String[] args) {
        
        int vetor [] = new int[100];

        for(int i = 0; i < vetor.length; i++) {
            vetor[i] = i*i;
            System.out.println("Posição: " + i + "     Elemento: " + vetor[i]);
        }
    }
}
