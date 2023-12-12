package Lista10_Exceção.Exe11;
import java.util.ArrayList;
import java.util.List;
public class Endereco {
    
    private String logradouro, complemento;
    private int numero;
    public static List<Endereco> listaEnderecos = new ArrayList<>();

    public Endereco(String logradouro, String complemento, int numero) {
        setLogradouro(logradouro);
        setComplemento(complemento);
        setNumero(numero);
        listaEnderecos.add(this);
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) throws IllegalArgumentException {
        if (logradouro == null || logradouro.trim().isEmpty()) {
            throw new IllegalArgumentException("Logradouro inválido");
        }
        this.logradouro = logradouro;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) throws IllegalArgumentException {
        if (complemento == null || complemento.trim().isEmpty()) {
            throw new IllegalArgumentException("Complemento inválido");
        }
        this.complemento = complemento;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) throws IllegalArgumentException {
        if (numero < 0) {
            throw new IllegalArgumentException("Número inválido");
        }
        this.numero = numero;
    }

    @Override
    public String toString() {
        
        return "\tEndereço: " + getLogradouro() + ", " + getNumero() + ", " + getComplemento();

    }
}