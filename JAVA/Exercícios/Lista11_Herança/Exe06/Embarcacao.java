package Lista11_Herança.Exe06;

public abstract class Embarcacao {

	private String id, modelo;
	private int qtdPessoa, qtdBotesSalvaVidas;
	private double capacidadeCombustivel, queimaDeCombustivel;
	
	public Embarcacao(String id, String modelo, int qtdPessoa, int qtdBotesSalvaVidas, double capacidadeCombustivel, double queimaDeCombustivel) {
		setId(id);
		setModelo(modelo);
		setQtdPessoa(qtdPessoa);
		setQtdBotesSalvaVidas(qtdBotesSalvaVidas);
		setCapacidadeCombustivel(capacidadeCombustivel);
		setQueimaDeCombustivel(queimaDeCombustivel);
	}

	public String getId() {
		return id;
	}

	public void setId(String id) throws IllegalArgumentException {
		if (id == null || id.isEmpty() || id.isBlank()) {
			throw new IllegalArgumentException("Id inválida");
		}
		this.id = id;
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

	public int getQtdPessoa() {
		return qtdPessoa;
	}

	public void setQtdPessoa(int qtdPessoa) throws IllegalArgumentException {
		if (qtdPessoa < 0) {
			throw new IllegalArgumentException("Quantidade de pessoas inválida");
		}
		this.qtdPessoa = qtdPessoa;
	}

	public int getQtdBotesSalvaVidas() {
		return qtdBotesSalvaVidas;
	}

	public void setQtdBotesSalvaVidas(int qtdBotesSalvaVidas) throws IllegalArgumentException {
		if (qtdBotesSalvaVidas < 0) {
			throw new IllegalArgumentException("Quantidade de botes salva vidas inválida");
		}
		this.qtdBotesSalvaVidas = qtdBotesSalvaVidas;
	}

	public double getCapacidadeCombustivel() {
		return capacidadeCombustivel;
	}

	public void setCapacidadeCombustivel(double capacidadeCombustivel) throws IllegalArgumentException {
		if (capacidadeCombustivel < 0) {
			throw new IllegalArgumentException("Capacidade de combustível inválida");
		}
		this.capacidadeCombustivel = capacidadeCombustivel;
	}

	public double getQueimaDeCombustivel() {
		return queimaDeCombustivel;
	}

	public void setQueimaDeCombustivel(double queimaDeCombustivel) throws IllegalArgumentException {
		if (queimaDeCombustivel < 0) {
			throw new IllegalArgumentException("Queima de combustível inválida");
		}
		this.queimaDeCombustivel = queimaDeCombustivel;
	} 
	
	public boolean planejarViagem(double distanciaDestino) {	
		return (getCapacidadeCombustivel() / getQueimaDeCombustivel()) >= distanciaDestino;
	}
	
	public abstract String verificaSeguranca(); 
	
	@Override
	public String toString() {
		String str = "Id: " + getId() + "\nModelo: " + getModelo() + "\nQuantidade de pessoas: " + getQtdPessoa() + "\nCapacidade de combustível: " + getCapacidadeCombustivel() + "\nQueima de combustível: " + getQueimaDeCombustivel() + "\nQuantidade de botes salva vidas: " + getQtdBotesSalvaVidas();
		
		if (planejarViagem(capacidadeCombustivel)) { 
			str += "\nA embarcação terá combustível suficicente para chegar ao destino";
		} else {
			str += "\nA embarcação não terá combustível suficicente para chegar ao destino";
		}
		return str;
	}
}