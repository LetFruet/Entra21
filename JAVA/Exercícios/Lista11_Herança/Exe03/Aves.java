package Lista11_Herança.Exe03;

public class Aves extends Animais {

	private String corPenas, tipoAlimentacao;

	public Aves(String nome, String raca, String habitat, String paisDeOrigem, char porte, String corPenas,
			String tipoAlimentacao) {
		super(nome, raca, habitat, paisDeOrigem, porte);
		setCorPenas(corPenas);
		setTipoAlimentacao(tipoAlimentacao);
	}

	public String getCorPenas() {
		return corPenas;
	}

	public void setCorPenas(String corPenas) throws IllegalArgumentException {
		if (corPenas == null || corPenas.isEmpty() || corPenas.isBlank()) {
			throw new IllegalArgumentException("Nome inválido");
		}
		this.corPenas = corPenas;
	}

	public String getTipoAlimentacao() {
		return tipoAlimentacao;
	}

	public void setTipoAlimentacao(String tipoAlimentacao) throws IllegalArgumentException {
		if (tipoAlimentacao == null || tipoAlimentacao.isEmpty() || tipoAlimentacao.isBlank()) {
			throw new IllegalArgumentException("Nome inválido");
		}
		this.tipoAlimentacao = tipoAlimentacao;
	}
	
	@Override
	public String toString() {
		return super.toString() + "\nCor das penas: " + getCorPenas() + "\nTipo de alimentação: " + getTipoAlimentacao();
	}
}
