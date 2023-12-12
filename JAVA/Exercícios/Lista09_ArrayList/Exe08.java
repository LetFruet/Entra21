/*Faça um algoritmo que descubra se uma Array List possui o número que o usuário entrou. Imprima também o seu índice */
package Lista09_ArrayList;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exe08 {
    
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
    
        List<Double> listaNumeros = new ArrayList<>();
    
        System.out.println("Entre com valores decimais (0 para parar): ");
        double numero = kb.nextDouble();

        while (numero != 0) {
            listaNumeros.add(numero);

            numero = kb.nextInt(); 
        }

        System.out.println("Informe um número para verificar se ele já existe: ");
        double repetido = kb.nextDouble();

        if (listaNumeros.contains(repetido)) {
                System.out.println("Índice: " + listaNumeros.indexOf(repetido) + " = " + listaNumeros.get(listaNumeros.indexOf(repetido)) + " REPETIDO");
            } else {
                System.out.println("Nenhum número repetido");
            }


        kb.close();
    }
}
