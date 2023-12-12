package Lista11_Herança.Exe06;

public class Lancha extends Embarcacao {

	private double velMax;

	public Lancha(String id, String modelo, int qtdPessoa, int qtdBotesSalvaVidas, double capacidadeCombustivel,
				  double queimaDeCombustivel, double velMax) {
		super(id, modelo, qtdPessoa, qtdBotesSalvaVidas, capacidadeCombustivel, queimaDeCombustivel);
		setVelMax(velMax);
	}

	public double getVelMax() {
		return velMax;
	}

	public void setVelMax(double velMax) throws IllegalArgumentException {
		if (velMax < 0) {
			throw new IllegalArgumentException();
		}
		this.velMax = velMax;
	}

	public double tempoViagem(double distanciaDestino) {
		return distanciaDestino / getVelMax();
	}
	
	@Override
	public String verificaSeguranca() {
		if (getQtdBotesSalvaVidas() > getQtdPessoa()) {
			return "Botes ok";
		} else {
			return "Alerta: embarcação necessitando de mais botes!";
		}	
	}
}