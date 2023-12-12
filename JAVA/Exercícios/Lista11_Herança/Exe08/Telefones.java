package Lista11_Herança.Exe08;
import java.util.ArrayList;
import java.util.List;
public abstract class Telefones {

    private String nomeUsuario;
    private String endereco;
    private String numero;
    public static List<Telefones> listaTelefones = new ArrayList<Telefones>();

    public Telefones(String nomeUsuario, String endereco, String numero) {
        setNomeUsuario(nomeUsuario);
        setEndereco(endereco);
        setNumero(numero);
        listaTelefones.add(this);
    }

    // Cria o metodo abstrato para retornar um valor a pagar em geral
    public abstract double valorAPagar();

    // Metodo estatico para calcular o faturamento total
    // Nao sera acessado a partir de um objeto
    public static double faturamentoTotal() {
        double total = 0;
        for (Telefones l : Telefones.listaTelefones) {
            total += l.valorAPagar();
        }
        return total;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        if (nomeUsuario == null || nomeUsuario.isEmpty() || nomeUsuario.isBlank()) {
            throw new IllegalArgumentException("Nome invalido");
        }
        this.nomeUsuario = nomeUsuario;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        if (endereco == null || endereco.isEmpty() || endereco.isBlank()) {
            throw new IllegalArgumentException("Endereco invalido");
        }
        this.endereco = endereco;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        numero = numero.replace('(', ' ');
        numero = numero.replace(')', ' ');
        numero = numero.replace('-', ' ');
        numero = numero.replaceAll("\\s", "");
        // Isso foi feito para retirar os parenteses do DDD e o hifen
        if (numero == null || numero.isEmpty() || numero.isBlank() || numero.length() != 10) {
            // Strip retira os espacos em branco
            throw new IllegalArgumentException("Numero invalido");
        }
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Informacoes da Telefones:\nContratada por: " + getNomeUsuario() + "\nNumero: " + getNumero();
    }
}