package Lista11_Herança.Exe04;

public class Principal {

	public static void main(String[] args) {
		
		Cachorro umCachorro = new Cachorro("Pastor Alemão", true, 15.0, "Bulldog");
		Gato umGato = new Gato("Siamês", true, 10.0, false);
		
		System.out.println(umCachorro.toString());
		System.out.println();
		System.out.println(umGato.toString());
	}
}
