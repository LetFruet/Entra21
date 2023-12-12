package Lista11_Herança.Exe01;

public class Circulo {

	private String cor; 
	private double raio;
	
	public Circulo(String cor, double raio) {
		setCor(cor);
		setRaio(raio);
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) throws IllegalArgumentException {
		if (cor == null || cor.isEmpty() || cor.isBlank()) {
			throw new IllegalArgumentException("Cor inválida");
		}
		this.cor = cor;
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) throws IllegalArgumentException {
		if (raio < 0) {
			throw new IllegalArgumentException("Raio inválido");
		}
		this.raio = raio;
	}
	
	public double calcularArea() {
		 
		return Math.PI * (raio * raio);
		
	}
	
	@Override
	public String toString() {
		return "Cor: " + getCor() + "\nÁrea do circulo: " + calcularArea();
	}
}