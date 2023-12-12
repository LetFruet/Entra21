package Lista11_Herança.Exe03;

public class Gatos extends Animais {
	
	private String pelagem, manchas;
	
	public Gatos(String nome, String raca, String habitat, String paisDeOrigem, char porte, String pelagem, String manchas) {
		super(nome, raca, habitat, paisDeOrigem, porte);
		setPelagem(pelagem);
		setManchas(manchas);
	}

	public String getPelagem() {
		return pelagem;
	}

	public void setPelagem(String pelagem) throws IllegalArgumentException {
		if (pelagem.equalsIgnoreCase("Preto") && pelagem.equalsIgnoreCase("Pardo")) {
			throw new IllegalArgumentException("Pelagem inválida");
		}
		this.pelagem = pelagem;
	}

	public String getManchas() {
		return manchas;
	}

	public void setManchas(String manchas) throws IllegalArgumentException {
		
		if (manchas.equalsIgnoreCase("Ausente de machas") && manchas.equalsIgnoreCase("Listrado") && manchas.equalsIgnoreCase("Pintado")) {
			throw new IllegalArgumentException("Tipo de manchas inválido");
		}
		this.manchas = manchas;
	} 
	
	@Override
	public String toString() {
		return super.toString() + "\nCor da pelagem: " + getPelagem() + "\nManchas: " + getManchas();
	}

}
