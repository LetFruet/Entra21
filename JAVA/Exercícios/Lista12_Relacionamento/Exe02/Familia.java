package Lista12_Relacionamento.Exe02;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;
public class Familia {
    
    private List<Pessoa> listaPessoas = new ArrayList<Pessoa>();

    public List<Pessoa> getListaPessoas() {
        return listaPessoas;
    }

    public void setListaPessoas(List<Pessoa> listaPessoas) {
        this.listaPessoas = listaPessoas;
    }

    public void adicionarPessoa(Pessoa umaPessoa) {
        listaPessoas.add(umaPessoa);
    }

    public Pessoa verificarMaisVelho() {
        int maisVelho = Integer.MIN_VALUE;
        Pessoa maisVelha = null;

        for (Pessoa p : listaPessoas) {
            int idade = Period.between(p.getDataNascimento(), LocalDate.now()).getYears();
            if (idade > maisVelho) {
                maisVelho = idade;
                maisVelha = p;
            }
        }
        return maisVelha;
    }

    @Override
    public String toString() {
        return "Membros da família: " + listaPessoas;
    }
}