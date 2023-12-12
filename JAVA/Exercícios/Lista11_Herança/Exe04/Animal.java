package Lista11_Herança.Exe04;

public abstract class Animal {
	private String especie; 
	private boolean estimacao;
	private double peso;
	
	public Animal(String especie, boolean estimacao, double peso) {
		setEspecie(especie);
		setEstimacao(estimacao);
		setPeso(peso);
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) throws IllegalArgumentException {
		if (especie == null || especie.isEmpty() || especie.isBlank()) {
			throw new IllegalArgumentException("Espécie inválida");
		}
		this.especie = especie;
	}

	public boolean isEstimacao() {
		return estimacao;
	}

	public void setEstimacao(boolean estimacao) {
		this.estimacao = estimacao;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) throws IllegalArgumentException {
		if (peso < 0) {
			throw new IllegalArgumentException("Peso inválido");
		}
		this.peso = peso;
	}
	
	public abstract String som();
	
	@Override
	public String toString() {
		String str = "Especie: " + getEspecie() + "\nPeso: " + getPeso();
		
		if (isEstimacao()) {
			str += "\nDe estimação";
		}
		
		return str;
	}
}
