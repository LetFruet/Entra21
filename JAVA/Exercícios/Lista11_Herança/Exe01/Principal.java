package Lista11_Herança.Exe01;

public class Principal {

	public static void main(String[] args) {
		
		Circulo umCirculo = new Circulo("Verde", 10);
		Cilindro umCilindro = new Cilindro("Azul", 20, 10);
		
		System.out.println(umCirculo.toString());
		System.out.println();
		System.out.println(umCilindro.toString());
	}
}