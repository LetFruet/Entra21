package Lista11_Herança.Exe02;

public class AlunoFURB extends Aluno {
	
	private char formaIngresso;
	private String curso, atletica;
	
	public AlunoFURB(String nome, int idade, char formaIngresso, String curso, String atletica) {
		super(nome, idade);
		setFormaIngresso(formaIngresso);
		setCurso(curso);
		setAtletica(atletica);
	}

	public char getFormaIngresso() {
		return formaIngresso;
	}

	public void setFormaIngresso(char formaIngresso) throws IllegalArgumentException {
		formaIngresso = Character.toUpperCase(formaIngresso); 
		if (formaIngresso != 'V' && formaIngresso != 'S' && formaIngresso != 'T' && formaIngresso != 'I') {
			throw new IllegalArgumentException("Forma de ingresso inválida");
		}
		this.formaIngresso = formaIngresso;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) throws IllegalArgumentException {
		if (curso == null || curso.isEmpty() || curso.isBlank()) {
			throw new IllegalArgumentException("Nome do curso inválido");
		}
		this.curso = curso;
	}

	public String getAtletica() {
		return atletica;
	}

	public void setAtletica(String atletica) throws IllegalArgumentException {
		if (atletica == null || atletica.isEmpty() || atletica.isBlank()) {
			throw new IllegalArgumentException("Nome da atlética inválido");
		}
		this.atletica = atletica;
	}
	
	public void trancarCurso() {
	
		setCurso(null);
	}
	
	@Override
	public String toString() {
		return super.toString() + "\nForma de ingresso: " + getFormaIngresso() + "\nCurso: " + getCurso() + "\nAtlética: "+ getAtletica();
	}
}