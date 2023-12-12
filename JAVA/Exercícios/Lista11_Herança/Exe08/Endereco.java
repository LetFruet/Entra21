package Lista11_Herança.Exe08;

public  class Endereco {

	private String pais, estado, cidade, logradouro, numero;

	public Endereco(String pais, String estado, String cidade, String logradouro, String numero) {
		setPais(pais);
		setEstado(estado);
		setCidade(cidade);
		setLogradouro(logradouro);
		setNumero(numero);
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) throws IllegalArgumentException {
		if (pais == null || pais.isEmpty() || pais.isBlank()) {
			throw new IllegalArgumentException("País inválido");
		}
		this.pais = pais;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) throws IllegalArgumentException {
		if (estado == null || estado.isEmpty() || estado.isBlank()) {
			throw new IllegalArgumentException("Estado inválido");
		}
		this.estado = estado;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) throws IllegalArgumentException {
		if (cidade == null || cidade.isEmpty() || cidade.isBlank()) {
			throw new IllegalArgumentException("Cidade inválida");
		}
		this.cidade = cidade;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) throws IllegalArgumentException {
		if (logradouro == null || logradouro.isEmpty() || logradouro.isBlank()) {
			throw new IllegalArgumentException("Logradouro inválido");
		}
		this.logradouro = logradouro;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) throws IllegalArgumentException {
		if (numero == null || numero.isEmpty() || numero.isBlank()) {
			throw new IllegalArgumentException("Número inválido");
		}
		this.numero = numero;
	}
	
	@Override
	public String toString() {
		return "País: " + getPais() + "\nEstado: " + getEstado() + "\nCidade: " + getCidade() + "\nLogradouro: " + getLogradouro() + "\nNúmero: " + getNumero();
	}
}
