package Lista11_Herança.Exe01;

public class Cilindro extends Circulo {
	
	private double altura;

	public Cilindro(String cor, double raio, double altura) {
		super(cor, raio);
		setAltura(altura);
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) throws IllegalArgumentException {
		if (altura < 0) {
			throw new IllegalArgumentException("Altura inválida");
		}
		this.altura = altura;
	} 
	
	public double calcularVolume() {
		
		return calcularArea() * altura;
	}
	
	@Override
	public String toString() {
		return "Cor do cilindro: " + getCor() + "\nVolume do cilindro: " + calcularVolume();
	}
}
