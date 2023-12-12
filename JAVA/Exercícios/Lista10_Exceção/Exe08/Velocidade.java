/*Deseja-se criar uma classe para controlar a velocidade do carro.

Implemente os métodos:
acelerar(double): void, que deve modificar o conteúdo do atributo velocidade para velocidade + 
parâmetro recebido (usar setVelocidade), mas desde que o valor do parâmetro seja maior ou igual a zero e menor que 20. 
Senão, imprime a mensagem “Não foi possível acelerar” e mantém o valor atual do atributo velocidade.

reduzir(double): void, quem modifica o conteúdo do atributo velocidade para velocidade - 
parâmetro recebido (usar setVelocidade), mas desde que o valor do parâmetro 
seja maior ou igual a zero e menor que 30. Senão, imprime a mensagem “Não 
foi possível reduzir” e mantém o valor atual do atributo velocidade.  */
package Lista10_Exceção.Exe08;
import java.util.ArrayList;
import java.util.List;
public class Velocidade {

    private double velocidade; 
    private int identificacao;
    public static List<Velocidade> listaVelocidades = new ArrayList<>();

    public Velocidade(int identificacao, double velocidade) {
        setIdentificacao(identificacao);
        setVelocidade(velocidade);
        listaVelocidades.add(this);
    }
    
    public int getIdentificacao() {
        return identificacao;
    }

    public void setIdentificacao(int identificacao) throws IllegalArgumentException {
        if (identificacao < 0) {
            throw new IllegalArgumentException("Número de identificação inválido");
        }
        this.identificacao = identificacao;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) throws IllegalArgumentException {
        if (velocidade < 0) {
            throw new IllegalArgumentException("Velocidade incorreta");
        }
        this.velocidade = velocidade;
    }
    
    public void acelerar(double aumentoVelocidade) {

        if (aumentoVelocidade >= 0 && aumentoVelocidade < 20) {
            setVelocidade(getVelocidade() + aumentoVelocidade);
        } else { 
            throw new IllegalArgumentException("Não foi possível acelerar");
        }
    }
    
    public void reduzir(double reduzirVelocidade) {

        if (reduzirVelocidade >= 0 && reduzirVelocidade < 30) {
            setVelocidade(getVelocidade() - reduzirVelocidade);
        } else {
            throw new IllegalArgumentException("Não foi possível reduzir");
        }
    }

    @Override
    public String toString() {
    
        return " - A velocidade do carro " + getIdentificacao() + " é de " + getVelocidade() + " Km/h";

    }
}
