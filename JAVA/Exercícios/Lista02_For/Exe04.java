//Descreva um algoritmo que calcule e escreva a soma dos números pares e a soma dos números ímpares entre 1 e 100.  
package Lista02_For;
public class Exe04 {

    public static void main(String[] args) {
        
        int num = 0, somaPar = 0, somaImpar = 0;

        for (num = 0; num <= 100; num++) {
            if (num % 2 == 0) {
                somaPar =+ num;
            } else {
                somaImpar =+ num;
            }
        }
        System.out.println("Soma dos pares: " + somaPar + "\nSoma dos ímpares: " + somaImpar);
    }
    
}
