package Lista11_Herança.Exe06;

public class Transatlantico extends Embarcacao {

	private int anoBatismo, capacidadeBoteSalvaVidas;
	
	public Transatlantico(String id, String modelo, int qtdPessoa, int qtdBotesSalvaVidas, double capacidadeCombustivel,
						  double queimaDeCombustivel, int anoBatismo, int capacidadeBoteSalvaVidas) {
		super(id, modelo, qtdPessoa, qtdBotesSalvaVidas, capacidadeCombustivel, queimaDeCombustivel);
		setAnoBatismo(anoBatismo);
		setCapacidadeBoteSalvaVidas(capacidadeBoteSalvaVidas);
	}

	public int getAnoBatismo() {
		return anoBatismo;
	}

	public void setAnoBatismo(int anoBatismo) {
		this.anoBatismo = anoBatismo;
	}

	public int getCapacidadeBoteSalvaVidas() {
		return capacidadeBoteSalvaVidas;
	}

	public void setCapacidadeBoteSalvaVidas(int capacidadeBoteSalvaVidas) {
		this.capacidadeBoteSalvaVidas = capacidadeBoteSalvaVidas;
	}

	public void adicionarBotes(int adicionarBotes) {
		setQtdBotesSalvaVidas(getQtdBotesSalvaVidas() + adicionarBotes);
	}
	
	@Override
	public String verificaSeguranca() {
		if ((getQtdBotesSalvaVidas() * getCapacidadeBoteSalvaVidas()) > getQtdPessoa()) {
			return "Botes ok";
		} else {
			return "Alerta: embarcação necessitando de mais botes!";
		}	
	}
}