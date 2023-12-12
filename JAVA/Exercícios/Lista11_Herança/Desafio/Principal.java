package Lista11_Herança.Desafio;
import java.time.LocalDate;

public class Principal {
    
    public static void main(String[] args) {

        Gerente umGerente = new Gerente("9908", "Gabriel", LocalDate.of(1990, 3, 3), LocalDate.of(2010, 1, 1), 15000.00, 
                            new Endereco("Brasil", "Santa Catarina", "Blumenau", "Avenida Floriano Peixoto", "04"), "083");

        Empregado umEmpregado = new Empregado("1234", "Alan", LocalDate.of(1980, 5, 10), LocalDate.of(2000, 2, 20), 7000.00, 
                                new Endereco("Brasil", "Santa Catarina", "Blumenau", "Rua 7 de setembro", "387"), 
                                null, "3780", umGerente, false);

        Empregado outroEmpregado = new Empregado("4498", "Lara", LocalDate.of(2001, 11, 27), LocalDate.of(2022, 9, 20), 2500.00, 
                                new Endereco("Brasil", "Santa Catarina", "Rodeio", "Rua Barão do Rio Branco", "4498"), 
                                null, "3780", umGerente, false);

        // Assuming these methods exist in their respective classes
        umGerente.adicionarHabilidade("Liderança");
        umGerente.adicionarHabilidade("Influência");
        umEmpregado.adicionarHabilidade("Lógica");
        outroEmpregado.adicionarHabilidade("Programação");

        System.out.println(" ----- GERENTE ----- " + umGerente.toString() + "\n");
        System.out.println(" ----- EMPREGADO ----- " + umEmpregado.toString() + "\n");
        System.out.println(" ----- EMPREGADO ----- " + outroEmpregado.toString() + "\n");

        umGerente.demitirEmpregado(umEmpregado);
    }
}
.. //como mudar a data