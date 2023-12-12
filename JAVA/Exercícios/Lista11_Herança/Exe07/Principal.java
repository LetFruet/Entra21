package Lista11_Herança.Exe07;

public class Principal {

	public static void main(String[] args) {
		
		Instrutor i1 = new Instrutor("Alan", "(47) 99999-9999", "alan@123.com", 
					   new Endereco("Brasil", "SC", "Blumenau", "Avenida", "123"));
		
		Aluno a1 = new Aluno("Jéssica", "(47) 11111-1111", "jessica@j.com", new Endereco("Brasil", "SC", "Blumenau", "Rua", "897"), "Mensal", false);
		Aluno a2 = new Aluno("Mateus", "(47) 1234-5678", "mateus01@01.com", new Endereco("Brasil", "SC", "Blumenau", "Rua", "897"), "Anual", true);

		i1.adicionaEspecializacao("Programação orientada a objetos");
		i1.adicionaAlunos(a1);
		i1.adicionaAlunos(a2);
		
		System.out.println(i1.toString());
		System.out.println();
		System.out.println(a1.toString());
		System.out.println();
		System.out.println(a2.toString());
	}
}
