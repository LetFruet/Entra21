package Lista11_Herança.Exe04;

public class Gato extends Animal{

	private boolean castrado;

	public Gato(String especie, boolean estimacao, double peso, boolean castrado) {
		super(especie, estimacao, peso);
		setCastrado(castrado);
	}

	public boolean isCastrado() {
		return castrado;
	}

	public void setCastrado(boolean castrado) {
		this.castrado = castrado;
	}
	
	@Override
	public String som() {
		return "Miau";
	}
	
	@Override
	public String toString() {
		
		String str = super.toString();
		
		if (isCastrado()) {
			str += "\nCastrado";
		} else {
			str += "\nNão é castrado";
		}
		return str + "\nSom: " + som();
	}
}