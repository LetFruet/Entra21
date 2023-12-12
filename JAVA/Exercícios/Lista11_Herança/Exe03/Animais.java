package Lista11_Herança.Exe03;

public class Animais {

	private String nome, raca, habitat, paisDeOrigem;
	private char porte;
	
	public Animais(String nome, String raca, String habitat, String paisDeOrigem, char porte) {
		setNome(nome);
		setRaca(raca);
		setHabitat(habitat);
		setPaisDeOrigem(paisDeOrigem);
		setPorte(porte);
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

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) throws IllegalArgumentException {
		if (raca == null || raca.isEmpty() || raca.isBlank()) {
			throw new IllegalArgumentException("Raça inválida");
		}
		this.raca = raca;
	}

	public String getHabitat() {
		return habitat;
	}

	public void setHabitat(String habitat) throws IllegalArgumentException {
		if (habitat == null || habitat.isEmpty() || habitat.isBlank()) {
			throw new IllegalArgumentException("Habitat inválido");
		}
		this.habitat = habitat;
	}

	public String getPaisDeOrigem() {
		return paisDeOrigem;
	}

	public void setPaisDeOrigem(String paisDeOrigem) throws IllegalArgumentException {
		if (paisDeOrigem == null || paisDeOrigem.isEmpty() || paisDeOrigem.isBlank()) {
			throw new IllegalArgumentException("País de origem inválido");
		}
		this.paisDeOrigem = paisDeOrigem;
	}

	public char getPorte() {
		return porte;
	}

	public void setPorte(char porte) throws IllegalArgumentException {
		porte = Character.toUpperCase(porte);
		
		if (porte != 'P' && porte != 'M' && porte != 'G') {
			throw new IllegalArgumentException("Porte inválido");
		}
		this.porte = porte;
	}
	
	@Override
	public String toString() {
		return "Nome: " + getNome() + "\nRaça: " + getRaca() + "\nHabitat: " + getHabitat() + 
				"\nPaís de origem: " + getPaisDeOrigem() + "\nPorte: " + getPorte();
	}
}
