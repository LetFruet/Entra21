package Lista12_Relacionamento.Exe04;

public class Funcionario {
    
    private String nome, matricula; 
    private int depto;
    private double salario;

    public Funcionario(String nome, String matricula, int depto, double salario) {
        setNome(nome);
        setMatricula(matricula);
        setDepto(depto);
        setSalario(salario);
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

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) throws IllegalArgumentException {
        if (matricula == null || matricula.isEmpty() || matricula.isBlank()) {
            throw new IllegalArgumentException("Matrícula inválida");
        }
        this.matricula = matricula;
    }

    public int getDepto() {
        return depto;
    }

    public void setDepto(int depto) throws IllegalArgumentException {
        if (depto < 0) {
            throw new IllegalArgumentException("Departamento inválido");
        }
        this.depto = depto;
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

    @Override 
    public String toString() {
        return "Nome: " + getNome() + "\t| Matrícula: " + getMatricula() + "\t| Departamento: " + getDepto() + "\t| Salário: " + getSalario();
    }
}
