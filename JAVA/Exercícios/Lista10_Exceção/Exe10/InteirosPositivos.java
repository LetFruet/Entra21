/*Um matemático está necessitando de várias funções relacionadas a um número inteiro positivo. 
Suponha a definição de uma classe Inteiro Positivo que apresenta o seguinte atributo: um número X.

a) um método setValor, que realiza a consistência necessária para garantir que X seja um inteiro positivo;
b) um método para retornar o número X multiplicado por outro objeto de InteiroPositivo (este outroo bjeto é 
   o objeto manipulado imediatamente antes deste);
c) um método para calcular o fatorial de X; 
Fatorial (X) = X * (X-1) * (X-2) * (X-3) * … * 2 * 1
d) um método para identificar os divisores inteiros de X e a quantidade de divisores. Exemplo: para o 
número 12, os divisores são 1, 2, 3, 4, 6, 12 e a quantidade de divisores é 6;
e) um método para calcular a série de Fibonacci formada por X elementos;
Fibonacci = 1, 1, 2, 3, 5, 8, 13, …*/
package Lista10_Exceção.Exe10;
import java.util.ArrayList;
import java.util.List;
public class InteirosPositivos {
 
    private int numeroX;
    public static List<InteirosPositivos> listaInteirosPositivos = new ArrayList<>();

    public InteirosPositivos(int numeroX) {
        setNumeroX(numeroX);
        listaInteirosPositivos.add(this);
    }

    public int getNumeroX() {
        return numeroX;
    }

    public void setNumeroX(int numeroX) throws IllegalArgumentException {
        if (numeroX <= 0) {
           throw new IllegalArgumentException("Número X inválido");
        }
        this.numeroX = numeroX;
    }

    public double calcularMultiplicacao (InteirosPositivos outroValor) {

        return (getNumeroX() * outroValor.getNumeroX());
    }

    public String calcularFatorial() {
        
        long fatorial = 1;
        for (int i = 1; i <= numeroX; i++) {
            fatorial *= i;
        }
        return "O fatorial de " + getNumeroX() + " é " + fatorial;
    }

    public String identificarDivisores() {
        
        List<Integer> divisores = new ArrayList<>();
        int cont = 0;
        for (int i = 1; i <= numeroX; i++) {
            if (numeroX % i == 0) {
                divisores.add(i);
                cont++;
            }
        }
        return "para o número " + getNumeroX() + " os divisores são " + divisores + ". A quantidade de divisores é " + cont;
    }

    public String calcularFibonacci() {

        List<Integer> sequencia = new ArrayList<>();
    
        if (numeroX == 1) {
            sequencia.add(1);
        } else if (numeroX >= 2) {
            sequencia.add(1);
            sequencia.add(1);
        }
    
        int a = 1, b = 1;
        for (int i = 3; i <= numeroX; i++) {
            int next = a + b;
            sequencia.add(next);
            a = b;
            b = next;
        }

        return "Sequência de Fibonacci: " + sequencia;
    }

    @Override
    public String toString() {

        return "X = " + getNumeroX();
    }
}
