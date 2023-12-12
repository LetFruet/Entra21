package Lista11_Herança.Exe05;

public abstract class Computador {

	private String modelo;
	private double ram, armazenamento;
	
	public Computador(String modelo, double ram, double armazenamento) {
		setModelo(modelo);
		setRam(ram);
		setArmazenamento(armazenamento);
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) throws IllegalArgumentException {
		if (modelo == null || modelo.isEmpty() || modelo.isBlank()) {
			throw new IllegalArgumentException("Modelo inválido");
		}
		this.modelo = modelo;
	}

	public double getRam() {
		return ram;
	}

	public void setRam(double ram) throws IllegalArgumentException {
		if (ram < 0) {
			throw new IllegalArgumentException("Ram inválido");
		}
		this.ram = ram;
	}

	public double getArmazenamento() {
		return armazenamento;
	}

	public void setArmazenamento(double armazenamento) throws IllegalArgumentException {
		if (armazenamento < 0) {
			throw new IllegalArgumentException("Armazenamento inválido");
		}
		this.armazenamento = armazenamento;
	}
	
	
	public String ligarOuDesligar(boolean ligar) {
		String str = "";
		
		if (ligar) {
			str = "Computador ligado";
		} else {
			str = "Desligando computador";
		}
		return str;
	}
	
	public abstract boolean rodarAplicacao();
	
	@Override
	public String toString() {
		return "Modelo: " + getModelo() + "\nRAM: " + getRam() + "\nArmazenamento: " + getArmazenamento();
	}
}
