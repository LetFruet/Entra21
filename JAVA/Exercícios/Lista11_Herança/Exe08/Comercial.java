package Lista11_Herança.Exe08;
import java.time.LocalDate;
public class Comercial extends Telefones {

	private boolean dataAntiga;
	private String ramoAtividades;
	private LocalDate dataInstalacao;

	public Comercial(String nomeUsuario, String endereco, String numero, String ramoAtividades, LocalDate dataInstalacao) {
		super(nomeUsuario, endereco, numero);
		setRamoAtividades(ramoAtividades);
		setDataInstalacao(dataInstalacao);

        if (getDataInstalacao().isAfter(LocalDate.of(2017, 1, 1))) {
			setDataAntiga(false);
		} else {
			setDataAntiga(true);
		}
	}

	@Override
	public double valorAPagar() {
		if (!ehDataAntiga()) {
			return 37.50;
		}
		return 25;
	}

	public boolean ehDataAntiga() {
		return dataAntiga;
	}

	public void setDataAntiga(boolean dataAntiga) {
		this.dataAntiga = dataAntiga;
	}

	public String getRamoAtividades() {
		return ramoAtividades;
	}

	public void setRamoAtividades(String ramoAtividades) {
		if (ramoAtividades == null || ramoAtividades.isEmpty() || ramoAtividades.isBlank()) {
			throw new IllegalArgumentException("Ramo invalido");
		}
		this.ramoAtividades = ramoAtividades;
	}

	public LocalDate getDataInstalacao() {
		return dataInstalacao;
	}

	public void setDataInstalacao(LocalDate dataInstalacao) {
		if (dataInstalacao.isAfter(LocalDate.now())) {
			throw new IllegalArgumentException("Data invalida");
		}
		this.dataInstalacao = dataInstalacao;
	}

	@Override
	public String toString() {
		return super.toString() + "\nRamo: " + getRamoAtividades() + "\nInstalada em: " + getDataInstalacao() + "\nValor: " + valorAPagar();
	}
}