/*Crie uma classe chamada Circulo que tenha o atributo raio. Calcule a área de 5 objetos diferentes de Circulo. 
Para obter o valor de PI, use a função Math.PI do Java */
package Lista08_Encapsulamento.Exe04;
public class Circulo {
    
    double raio;

    public double calcularArea() {
        double area = Math.PI * raio;

        return area;
    }
}
