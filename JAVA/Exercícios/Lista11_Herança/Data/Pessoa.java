/*Faça uma classe com os atributos nome e data de nascimento, crie esses objetos dos seus colegas. No toString() retorne:
A data de nascimento da pessoa (no formato dia/mês/ano).
O dia da semana em que nasceram.
A estação do ano em que nasceram.
Se o ano era bissexto ou não.

Imprima:
a) toString do mais velho.
b) toString do mais novo. */
package Lista11_Herança.Data;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
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

    private String verificarEstacao() {
        int mes = dataNascimento.getMonthValue();
    
        if (mes >= 3 && mes <= 5) {
            return "outono";
        } else if (mes >= 6 && mes <= 8) {
            return "inverno";
        } else if (mes >= 9 && mes <= 11) {
            return "primavera";
        } else {
            return "verão";
        }
    }

    @Override
    public String toString() {
        // Criando um formatador de data no formato "dd/MM/yyyy" em português
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy", Locale.forLanguageTag("pt-BR"));
        
        //criando um formatador para exibir o nome completo do dia da semana em português
        DateTimeFormatter dayOfWeekFormatter = DateTimeFormatter.ofPattern("EEEE", Locale.forLanguageTag("pt-BR"));
    
        return "\nNome: " + getNome() + "\nData de nascimento: " + dataNascimento.format(dateFormatter) + "\nDia da semana: " +
                dataNascimento.format(dayOfWeekFormatter) + "\nAno bissexto: " + dataNascimento.isLeapYear() + "\nEstação do ano: " + 
                verificarEstacao(); //utilizando o formatador de data e dia da semana           
    } 
}
