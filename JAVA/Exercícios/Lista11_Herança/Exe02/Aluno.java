package Lista11_Herança.Exe02;

public class Aluno {

	private String nome;
	private int idade;
	
	public Aluno(String nome, int idade) {
		setNome(nome);
		setIdade(idade);
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

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) throws IllegalArgumentException {
		if (idade < 0) {
			throw new IllegalArgumentException("Idade inválida");
		}
		this.idade = idade;
	}
	
	@Override
	public String toString() {
		return "Nome: " + getNome() + "\nIdade: " + getIdade();
	}
	
}
