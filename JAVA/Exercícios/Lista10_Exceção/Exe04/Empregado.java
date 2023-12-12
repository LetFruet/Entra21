/*Crie uma classe Empregado que terá como atributos: Identificação, Nome, Sobrenome, Salário

Crie métodos para:
Saber o salário anual do empregado
Saber o nome completo do empregado
Modificar o salário, o parâmetro do método deve ser o percentual de aumento
Imprima o toString do usuário que após o aumento ficou com o maior do salário*/
package Lista10_Exceção.Exe04;
import java.util.ArrayList;
import java.util.List;
public class Empregado {
    
    private int identificacao;
    private String nome;
    private String sobrenome; 
    private double salario;
    public static List<Empregado> listaEmpregado = new ArrayList<>();

    public Empregado(int identificacao, String nome, String sobrenome, double salario) {
        setIdentificacao(identificacao);
        setNome(nome);
        setSobrenome(sobrenome);
        setSalario(salario);
        listaEmpregado.add(this);
    }

    public int getIdentificacao() {
        return identificacao;
    }

    public void setIdentificacao(int identificacao) throws IllegalArgumentException {
        if (identificacao < 0) {
            throw new IllegalArgumentException("Número de identificação inválido");
        }
        this.identificacao = identificacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) throws IllegalArgumentException {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome inválido");
        }
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) throws IllegalArgumentException {
        if (sobrenome == null || sobrenome.trim().isEmpty()) {
            throw new IllegalArgumentException("Sobrenome inválido");
        }
        this.sobrenome = sobrenome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) throws IllegalArgumentException {
        if (salario < 0) {
            throw new IllegalArgumentException("Salário inválido");
        }
        this.salario = salario;
    }

    public double modificarSalario(double percentualAumento) {

        double salario = 0;
        if (percentualAumento > 0) {
            salario = getSalario() * (percentualAumento/100);
        }
        
        return salario;
    }

    public double calcularSalarioAnual() {
        
        return getSalario() * 12;
    }

    public String verificarNomeCompleto() {

        return getNome() + " " + getSobrenome();
    }
 
    @Override
    public String toString() {
        return "\nID: " + getIdentificacao() + "\t| Nome completo: " + verificarNomeCompleto() + "\t| Salário mensal R$ " + getSalario();
    }
}