/*Faça uma classe chamada Aeronave com os atributos:
Passageiros.
Velocidade máxima.
Capacidade de combustível.
Queima de combustível por minuto.

Crie 4 objetos de sua preferência.

a) Qual das aeronaves pode ficar no ar por mais tempo?
b) Qual aeronave leva o maior número de passageiros?
c) Considerando que os aviões estão em velocidade máxima, qual deles consegue voar mais longe? */

package Lista08_Encapsulamento.Exe07;
public class Aeronave {
    
    private int passageiros; 
    private double velocidadeMaxima;
    private double capacidadeDeCombustivel;
    private double queimaDeCombustivel;

    public Aeronave(int passageiros, double velocidadeMaxima, double capacidadeDeCombustivel, double queimaDeCombustivel) {
        setPassageiros(passageiros);
        setVelocidadeMaxima(velocidadeMaxima);
        setCapacidadeDeCombustivel(capacidadeDeCombustivel);
        setQueimaDeCombustivel(queimaDeCombustivel);
    }

    public int getPassageiros() {
        return passageiros;
    }

    public void setPassageiros(int passageiros) throws IllegalArgumentException {
        if (passageiros < 0) {
            System.out.println("Número de passageiros inválido");
        }
        this.passageiros = passageiros;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) throws IllegalArgumentException {
        if (velocidadeMaxima <= 0) {
            System.out.println("Velocidade máxima inválida");
        }
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public double getCapacidadeDeCombustivel() {
        return capacidadeDeCombustivel;
    }

    public void setCapacidadeDeCombustivel(double capacidadeDeCombustivel) throws IllegalArgumentException {
        if (capacidadeDeCombustivel <= 0) {
            System.out.println("Capacidade máxima de combustível inválida");
        }
        this.capacidadeDeCombustivel = capacidadeDeCombustivel;
    }

    public double getQueimaDeCombustivel() {
        return queimaDeCombustivel;
    }

    public void setQueimaDeCombustivel(double queimaDeCombustivel) throws IllegalArgumentException {
        if (queimaDeCombustivel <= 0) {
            System.out.println("Queima de combustível inválida");
        }
        this.queimaDeCombustivel = queimaDeCombustivel;
    }  
}