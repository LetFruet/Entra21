package Lista12_Relacionamento.Exe02;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;
public class Pessoa {
    
    private String nome;
    private LocalDate dataNascimento;
    public static List<Pessoa> listaPessoas = new ArrayList<Pessoa>();

    public Pessoa(String nome, LocalDate dataNascimento) {
        setNome(nome);
        setDataNascimento(dataNascimento);
        listaPessoas.add(this);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) throws IllegalArgumentException {
        if (nome == null || nome.isEmpty() || nome.isBlank()) {
            throw new IllegalArgumentException("Nome inválido");
        }
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) throws IllegalArgumentException {
        if (dataNascimento == null || dataNascimento.isAfter(LocalDate.now())) {
            throw new IllegalArgumentException("Data de nascimento inválida");
        }
        this.dataNascimento = dataNascimento;
    }    

    public int verificarIdade() {
        return (Period.between(LocalDate.now(), dataNascimento).getYears());
    }

    @Override
    public String toString() {
        return getNome() + ", Nascido em: " + getDataNascimento();
    }
}