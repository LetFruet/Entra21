package Lista11_Herança.Exe05;

public class Notebook extends Computador {

	private double peso;
	
	public Notebook(String modelo, double ram, double armazenamento, double peso) {
		super(modelo, ram, armazenamento);
		setPeso(peso);
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

	@Override
	public boolean rodarAplicacao() {
		return false;
	}
	
	@Override
	public String toString() {
		String str = super.toString() + "\nPeso: " + getPeso();
		
		if (rodarAplicacao()) {
			str += "\nRodar aplicação";
		} else { 
			str += "\nNão rodar aplicação";
		}
	return str;
	}
}