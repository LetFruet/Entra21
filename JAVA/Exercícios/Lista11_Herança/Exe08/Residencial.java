package Lista11_Herança.Exe08;

public class Residencial extends Telefones {

	public Residencial(String nomeUsuario, String endereco, String numero) {
		super(nomeUsuario, endereco, numero);
	}

	@Override
	public double valorAPagar() {
		return 15;
	}

	@Override
	public String toString() {
		return super.toString() + "\nValor: " + valorAPagar();
	}
}
