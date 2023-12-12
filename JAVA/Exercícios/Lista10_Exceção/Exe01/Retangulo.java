/*Faça uma classe chamada Retangulo, com os atributos altura e largura. Faça um método para descobrir a área e outro para descobrir o perímetro.
Crie 10 objetos de Retangulo. Imprima o toString do retângulo com a maior área e o toString do retângulo com o maior perímetro */
package Lista10_Exceção.Exe01;
import java.util.ArrayList;
import java.util.List;
public class Retangulo {
    
    private double altura; 
    private double largura;
    public static List<Retangulo> listaRetangulo = new ArrayList<>();

    public Retangulo(double altura, double largura) {
        setAltura(altura);
        setLargura(largura);
        listaRetangulo.add(this); //this: adiciona como o objeto está até o momento
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) throws IllegalArgumentException {
        if (altura < 0) {
            throw new IllegalArgumentException("Altura inválida");
        }
        this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura)  throws IllegalArgumentException {
        if (largura < 0) {
            throw new IllegalArgumentException("Largura inválida");
        }
        this.largura = largura;
    }

    public double calcularArea() {

        return (getAltura() * getLargura());

    }
    
    public double calcularPerimetro() {

        return ((getAltura() * 2) + (getLargura() * 2));

    }

    @Override
    public String toString() {

        return "\nLargura " + getLargura() + " | altura " + getAltura();
    }
}
