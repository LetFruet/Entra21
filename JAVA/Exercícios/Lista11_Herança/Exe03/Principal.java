package Lista11_Herança.Exe03;

public class Principal {

	public static void main(String[] args) {
		
		Gatos umGato = new Gatos("Fofucho", "Siamês", "Domestico", "Egito", 'm', "Pardo", "Pintado");
		Aves umaAve = new Aves("Lily", "Arara", "Litoral", "Brasil", 'p', "Azul", "Grãos");
		Primatas umPrimata = new Primatas("Bob", "Gorila", "Floresta","África", 'g');
		
		System.out.println(umGato.toString());
		System.out.println();
		System.out.println(umaAve.toString());
		System.out.println();
		System.out.println(umPrimata.toString());
	}
}