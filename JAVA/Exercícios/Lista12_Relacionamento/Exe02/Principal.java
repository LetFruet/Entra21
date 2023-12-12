package Lista12_Relacionamento.Exe02;
import java.time.LocalDate;
public class Principal {
    
    public static void main(String[] args) {
        
        Pessoa p1 = new Pessoa("Letícia", LocalDate.of(2004, 9, 28));
        Pessoa p2 = new Pessoa("Eliani", LocalDate.of(1972, 7, 11));
        Pessoa p3 = new Pessoa("Mauro", LocalDate.of(1968, 10, 04));

        Familia f1 = new Familia();
        f1.adicionarPessoa(p1);
        f1.adicionarPessoa(p2);
        f1.adicionarPessoa(p3);

        System.out.println(f1.toString());
        
        System.out.println("\nMembro mais velho: \n - " + f1.verificarMaisVelho());
    }
}