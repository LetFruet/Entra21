//Crie uma array de 5 elementos e descubra:
//a) Qual o maior elemento
//b) Qual o menor elemento
//c) A média dos elementos
package Lista03_Vetor;
public class Exe03 {
    
    public static void main(String[] args) {
        
    int soma = 0, menorValor = Integer.MAX_VALUE, maiorValor = Integer.MIN_VALUE;

    int elemento [] = new int[5];

    elemento[0] = 1;
    elemento[1] = 2;
    elemento[2] = 3;
    elemento[3] = 4;
    elemento[4] = 5;

    for(int i = 0; i < elemento.length; i++) {
                
        soma += elemento[i];

        if (elemento[i] > maiorValor) {
            maiorValor = elemento[i];
        }
        if (elemento[i] < menorValor) {
            menorValor = elemento[i];
        }

    }

    int media = soma / 5;

    System.out.println("O maior elemento é: " + maiorValor + "\nO menor elemento é: " + menorValor + "\nA média dos elementos é: " + media);
    }
}