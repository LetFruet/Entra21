package Lista11_Herança.Exe07;

public abstract class Pessoa {

	//um objeto Pessoa necessita de um atributo cpf para existir legalmente
	//assim como um atributo cpf necessita de um objeto Pessoa para existir
	private String nome, telefone, email, cpf;
	private Endereco endereco;
	
	public Pessoa(String nome, String telefone, String email, Endereco endereco, String cpf) {
		setNome(nome);
		setTelefone(telefone);
		setEmail(email);
		setEndereco(endereco);
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
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

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) throws IllegalArgumentException {
		if (telefone == null || telefone.isEmpty() || telefone.isBlank()) {
			throw new IllegalArgumentException("Telefone inválido");
		}
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) throws IllegalArgumentException {
		if (email == null || email.isEmpty() || email.isBlank()) {
			throw new IllegalArgumentException("E-mail inválido");
		}
		this.email = email;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco)  throws IllegalArgumentException {
		if (endereco == null) {
			throw new IllegalArgumentException("Endereço inválido");
		}
		this.endereco = endereco;
	}
	
	@Override
	public String toString() {
		return "Nome: " + getNome() + "\nTelefone: " + getTelefone() + "\nE-mail: " + getEmail() + "\nEndereço: " + endereco.toString();
	}
}
