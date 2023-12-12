package Lista11_Herança.Exe05;

public class Principal {

	public static void main(String[] args) {
		
		Smartphone umSmartphone = new Smartphone("A12", 8, 128, 1, false);
		Notebook umNotebook = new Notebook("Nitro 5", 16, 512, 20);
		
		System.out.println(umSmartphone.toString());
		System.out.println();
		System.out.println(umNotebook.toString());
	}
}
