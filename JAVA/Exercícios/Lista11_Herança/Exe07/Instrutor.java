package Lista11_Herança.Exe07;

import java.util.ArrayList;
import java.util.List;

public class Instrutor extends Pessoa {

	private List<Aluno> listaAlunos = new ArrayList<Aluno>();
	private List<String> listaEspecializacao = new ArrayList<String>();
	
	public Instrutor(String nome, String telefone, String email, Endereco endereco) {
		super(nome, telefone, email, endereco);
	}

	public List<Aluno> getListaAlunos() {
		return listaAlunos;
	}

	public void setListaAlunos(List<Aluno> listaAlunos) {
		this.listaAlunos = listaAlunos;
	}

	public List<String> getListaEspecializacao() {
		return listaEspecializacao;
	}

	public void setListaEspecializacao(List<String> listaEspecializacao) {
		this.listaEspecializacao = listaEspecializacao;
	}

	public void adicionaAlunos(Aluno novoAluno) {
		listaAlunos.add(novoAluno);
	}
	
	public void adicionaEspecializacao(String novaEspecializacao) {
		listaEspecializacao.add(novaEspecializacao);
	}
	
	@Override
	public String toString() {
		return super.toString() + "\nEspecialização: " + listaEspecializacao + "\nAlunos: " + listaAlunos;
	}
}