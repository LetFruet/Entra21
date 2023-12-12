package Lista11_Herança.Desafio;
import java.util.List;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
public abstract class Funcionario {
	
	private String id, nome;
	private LocalDate dataNascimento, dataIngresso;
	private double salario;
	private Endereco endereco;
	private List<String> habilidades = new ArrayList<>();

	public Funcionario(String id, String nome, LocalDate dataNascimento, LocalDate dataIngresso, double salario, Endereco endereco) {
		setId(id);
		setNome(nome);
		setDataNascimento(dataNascimento);
		setDataIngresso(dataIngresso);
		setSalario(salario);
		setEndereco(endereco);
	}

	public String getId() {
		return id;
	}

	public void setId(String id) throws IllegalArgumentException {
		if (id == null || id.isEmpty() || id.isBlank()) {
			throw new IllegalArgumentException("ID inválida");
		}
		this.id = id;
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
		if (dataNascimento.isAfter(LocalDate.now())) { 
			throw new IllegalArgumentException("Data de nascimento inválida");
		}
		this.dataNascimento = dataNascimento;
	}

	public LocalDate getDataIngresso() {
		return dataIngresso;
	}

	public void setDataIngresso(LocalDate dataIngresso) {
		this.dataIngresso = dataIngresso;
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

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public int getIdade() {
		return Period.between(dataNascimento, LocalDate.now()).getYears(); //retorna a idade do Funcionario
	}

	public double calcularSalarioAnual() {
		return getSalario() * 12;
	}

	public void adicionarHabilidade(String habilidade) {
		habilidades.add(habilidade);
	}

	public int calcularAnosDeEmpresa() {
		return Period.between(dataIngresso, LocalDate.now()).getYears(); 
	}

	@Override
	public String toString() {
		return "Nome: " + getNome() + "\nID: " + getId() + "\nData de nascimento: " + getDataNascimento() + 
			   "\nData de ingressoa na empresa: " + getDataIngresso() + "\nSalário: " + getSalario() + "\nEndereço: " + 
			    endereco.toString() + "\nHabilidades: " + habilidades + "\nIdade: " + getIdade() + "\nSalário anual: " + 
				calcularSalarioAnual() + "\nCalcular anos de empresa: " + calcularAnosDeEmpresa();
	}
}
