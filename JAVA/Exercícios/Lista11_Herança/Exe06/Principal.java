package Lista11_Herança.Exe06;

public class Principal {

	public static void main(String[] args) {
		
	Lancha L1 = new Lancha("081ADF", "Nova", 10, 8, 100, 80, 100);
	Transatlantico T1 = new Transatlantico("597DRT", "Passeio", 350, 31, 5000, 300, 2007, 10);

	L1.planejarViagem(250);
	T1.planejarViagem(00);

	T1.adicionarBotes(5);

	System.out.println(L1.toString());
	System.out.println(L1.verificaSeguranca());
	System.out.println();
	System.out.println(T1.toString());
	System.out.println(T1.verificaSeguranca());

	}
}
