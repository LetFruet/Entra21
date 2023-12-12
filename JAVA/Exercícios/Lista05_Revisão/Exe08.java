/*Faça um algoritmo que atribua valores ao vetor de acordo com o quadrado do seu índice.
[0] = 0
[1] = 1
[2] = 4
[3] = 9
[4] = 16
Faça com que a array tenha 100 elementos. */
package Lista05_Revisão;
public class Exe08 {
    
    public static void main(String[] args) {

        int vetor[] = new int[100];

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Índice [" + i + "]" + " = " + i*i);
        }
    }
}
