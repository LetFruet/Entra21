package Lista11_Herança.Desafio;
import java.time.LocalDate;
public class Gerente extends Funcionario {

    private String idGerente;

    public Gerente(String id, String nome, LocalDate dataNascimento, LocalDate dataIngresso, double salario,
                   Endereco endereco, String idGerente) {
        super(id, nome, dataNascimento, dataIngresso, salario, endereco);
        setIdGerente(idGerente);
    }

    public String getIdGerente() {
        return idGerente;
    }

    public void setIdGerente(String idGerente) throws IllegalArgumentException { 
        if (idGerente == null || idGerente.isEmpty() || idGerente.isBlank()) {
            throw new IllegalArgumentException("ID do gerente inválida");
        }
        this.idGerente = idGerente;
    }

    public void demitirEmpregado(Empregado umEmpregado) {
        if (umEmpregado != null && !umEmpregado.isDemitido()) {
            umEmpregado.setDemitido(true);
            System.out.println(umEmpregado.getNome() + ": DEMITIDO!");
        } else {
            System.out.println(": Operação inválida. O empregado não existe ou já foi demitido.");
        }
    }

    @Override
	public String toString() {
		return "\n" + super.toString() + "\nID do gerente: " + getIdGerente();
	}
}