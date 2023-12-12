package Lista11_Herança.Exe08;
import java.time.LocalDate;
public class Especializada extends Telefones {

    private int qtdOccorencias;
	private LocalDate dataInstalacao;

	public Especializada(String nomeUsuario, String endereco, String numero) {
        super(nomeUsuario, endereco, numero);
    }

	@Override
	public double valorAPagar() {
		if (getQtdOccorencias() > 50000) {
			return 187.82;
		} else if (getQtdOccorencias() >= 10001) {
			return 123.9;
		} else if (getQtdOccorencias() >= 5001) {
			return 98.5;
		} else if (getQtdOccorencias() >= 1001) {
			return 67.8;
		}
		return 50;
	}

	public int getQtdOccorencias() {
		return qtdOccorencias;
	}

	public void setQtdOccorencias(int qtdOccorencias) {
		if (qtdOccorencias < 0) {
			throw new IllegalArgumentException("Quantidade de ocorrências invalido");
		}
		this.qtdOccorencias = qtdOccorencias;
	}

	public LocalDate getDataInstalacao() {
		return dataInstalacao;
	}

	public void setDataInstalacao(LocalDate dataInstalacao) {
		if (dataInstalacao.isAfter(LocalDate.now())) {
			throw new IllegalArgumentException("Data inválida");
		}
		this.dataInstalacao = dataInstalacao;
	}

	@Override
	public String toString() {
		return super.toString() + "\nQtd de ocorrencias: " + getQtdOccorencias() + "\nData da instalação: " + 
                                  getDataInstalacao() + "\nValor: " + valorAPagar();
	}
}