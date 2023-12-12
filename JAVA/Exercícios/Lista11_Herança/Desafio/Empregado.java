package Lista11_Herança.Desafio;
import java.time.LocalDate;
import java.util.List;
public class Empregado extends Funcionario {

    private String idSindicato; 
    private Gerente gerente;
    private boolean isDemitido;

    public Empregado(String id, String nome, LocalDate dataNascimento, LocalDate dataIngresso, double salario,
                     Endereco endereco, List<Funcionario> habilidades, String idSindicato, Gerente gerente, boolean isDemitido) {
        super(id, nome, dataNascimento, dataIngresso, salario, endereco);
        setIdSindicato(idSindicato);
        setGerente(gerente);
        setDemitido(isDemitido);
    }

    public String getIdSindicato() {
        return idSindicato;
    }

    public void setIdSindicato(String idSindicato) throws IllegalArgumentException {
        if (idSindicato == null ||idSindicato.isEmpty() || idSindicato.isBlank()) {
            throw new IllegalArgumentException("ID do sindicato inválida");
        }
        this.idSindicato = idSindicato;
    }

    public Gerente getGerente() {
        return gerente;
    }

    public void setGerente(Gerente gerente) {
        this.gerente = gerente;
    } 

    public void sairDoSindicato() {
        idSindicato = null;
    }

    public void comissao(double valorComissao) {
        setSalario(getSalario() + valorComissao);
    }

    public boolean isDemitido() {
        return isDemitido;
    }

    public void setDemitido(boolean isDemitido) {
        this.isDemitido = isDemitido;
    }

    @Override
	public String toString() {
		return "\n" + super.toString() + "\nID do sindicato: " + getIdSindicato() + "\n\nGerente: " + getGerente() + 
        "\nSalário final com comissão: " + getSalario();
	}
}