package Lista11_Herança.Exe02;

public class Principal {

	public static void main(String[] args) {
		
		AlunoEtevi umAlunoEtevi = new AlunoEtevi("Ana", 16, 2);
		AlunoFURB umAlunoFURB = new AlunoFURB("Igor", 23, 'i', "BCC", "AAASC");

		System.out.println();
		System.out.println(umAlunoEtevi);
		System.out.println();
		System.out.println(umAlunoFURB);
		
		umAlunoFURB.trancarCurso();
	}
}
