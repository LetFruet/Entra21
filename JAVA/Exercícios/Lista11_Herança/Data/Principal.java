package Lista11_Herança.Data;
import java.time.LocalDate;
import java.time.Period;
import java.util.List;
public class Principal {  

    public static void main(String[] args) {

        Pessoa p1 = new Pessoa("Letícia", LocalDate.of(2004,9,28));
        Pessoa p2 = new Pessoa("Lucas", LocalDate.of(2000,3,3));

        for (Pessoa p : Pessoa.listaPessoas) {
            System.out.println(p.toString());
        }

        System.out.println("\nMais velho: \n" + verificarMaisVelho(Pessoa.listaPessoas));
        System.out.println("\nMais novo: \n" + verificarMaisNovo(Pessoa.listaPessoas));
    }

    public static Pessoa verificarMaisVelho(List<Pessoa> listaPessoas) {
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

    public static Pessoa verificarMaisNovo(List<Pessoa> listaPessoas) {
        int maisNovo = Integer.MAX_VALUE;
        Pessoa maisNova = null;

        for (Pessoa p : listaPessoas) {
            int idade = Period.between(p.getDataNascimento(), LocalDate.now()).getYears();
            if (idade < maisNovo) {
                maisNovo = idade;
                maisNova = p;
            }
        }
        return maisNova;
    }
}