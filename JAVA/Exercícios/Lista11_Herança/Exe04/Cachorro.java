package Lista11_Herança.Exe04;

public class Cachorro extends Animal{

	private String raca;

	public Cachorro(String especie, boolean estimacao, double peso, String raca) {
		super(especie, estimacao, peso);
		setRaca(raca);
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) throws IllegalArgumentException {
		if (raca == null || raca.isEmpty() || raca.isBlank()) {
			throw new IllegalArgumentException("Raça inválida");
		}
		this.raca = raca;
	} 

	@Override
	public String som() {
		return "Au-Au";
	}
	
	@Override
	public String toString() {
		
		return super.toString() + "\nRaça: " + getRaca() + "\nSom: " + som();
	}
}