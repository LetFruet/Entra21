package Lista11_Herança.Exe08;
import java.time.LocalDate;

public class Principal {

	public static void main(String[] args) {

		Residencial r1 = new Residencial("Henrique", "furb", "(47) 8408-0148");
		Comercial c1 = new Comercial("FURB", "furb", "4787654321", "destruir sonhos", LocalDate.of(2000, 5, 24));
		Comercial c2 = new Comercial("Blusoft", "Blusoft", "47 1234-1234", "ENTRA 21", LocalDate.of(2021, 1, 15));
		Especializada e1 = new Especializada("Call center", "Sla", "4745674567");
		
		System.out.println("Total arrecadado " + Telefones.faturamentoTotal());            

        for (Telefones t : Telefones.listaTelefones) {
            System.out.println("\n" + t.toString());
        }
	}
}