/*Faça um método que calcule o perímetro e outro que calcule a área de um retângulo. Retornar os valores calculados */
package Lista07_Parâmetros;
import java.util.Scanner;
public class Exe04 {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.println("Informe a largura do retângulo: ");
        double largura = kb.nextDouble();

        System.out.println("Informe o comprimento do retângulo: ");
        double comprimento = kb.nextDouble();

        System.out.println("O perímetro do retângulo é: " + perimetro(largura, comprimento));
        System.out.println("A área do retânglo é: " + area(largura, comprimento));
        
        kb.close();
    }

    public static double perimetro(double largura, double comprimento) {

        double perimetro = 2 * (largura + comprimento);

        return perimetro;
    }

    public static double area(double largura, double comprimento) {
        
        double area = largura * comprimento;
        
        return area;
    }
}
