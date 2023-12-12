/*Em um sistema de uma floricultura deve se guardar o nome da flor, o preço, nome do cliente que comprou a flor e se a flor é para presente ou não.
Crie 5 objetos de flor e as coloque em uma Array List

a) Quem comprou a flor mais cara?
b) Qual o nome da flor mais cara? */
package Lista10_Exceção.Exe03;
import java.util.List;
import java.util.ArrayList;
public class Floricultura {
    
    private String nomeFlor; 
    private double valorFlor;
    private String nomeCliente;
    private boolean presente; 
    public static List<Floricultura> listaFlores = new ArrayList<>();

    public Floricultura(String nomeFlor, double valorFlor, String nomeCliente, boolean presente) {
        setNomeFlor(nomeFlor);
        setValorFlor(valorFlor);
        setNomeCliente(nomeCliente);
        setPresente(presente);
        listaFlores.add(this);
    }

    public String getNomeFlor() {
        return nomeFlor;
    }

    public void setNomeFlor(String nomeFlor) throws IllegalArgumentException {
        if (nomeFlor == null || nomeFlor.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome da flor inválido"); 
        }
        this.nomeFlor = nomeFlor;
    }

    public double getValorFlor() {
        return valorFlor;
    }

    public void setValorFlor(double valorFlor) throws IllegalArgumentException {
        if (valorFlor < 0) {
            throw new IllegalArgumentException("Valor da flor inválido"); 
        }
        this.valorFlor = valorFlor;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) throws IllegalArgumentException {
        if (nomeCliente == null || nomeCliente.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome do cliente inválido"); 
        }
        this.nomeCliente = nomeCliente;
    }

    public boolean isPresente() {
        return presente;
    }

    public void setPresente(boolean presente) {
        this.presente = presente;
    }

    @Override
    public String toString() {
        String dados = "O cliente " + getNomeCliente() + " comprou a flor " + getNomeFlor() + " pelo valor de R$ " + getValorFlor();

        if (presente) {
            dados += ", para presnete";
        } 
        
        return dados;
    }
}
