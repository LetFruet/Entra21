package Lista11_Herança.Exe07;

public class Aluno extends Pessoa { 
	
	private String tipoDeAssociacao;
	private boolean pagamentoEmAtraso;
	
	public Aluno(String nome, String telefone, String email, Endereco endereco, String tipoDeAssociacao, boolean pagamentoEmAtraso) {
		super(nome, telefone, email, endereco);
		setTipoDeAssociacao(tipoDeAssociacao);
		setPagamentoEmAtraso(pagamentoEmAtraso);
	}

	public String getTipoDeAssociacao() {
		return tipoDeAssociacao;
	}

	public void setTipoDeAssociacao(String tipoDeAssociacao) throws IllegalArgumentException {
		if (tipoDeAssociacao == null || tipoDeAssociacao.isEmpty() || tipoDeAssociacao.isBlank()) {
			throw new IllegalArgumentException("Tipo de associação inválido");
		}
		this.tipoDeAssociacao = tipoDeAssociacao;
	}

	public boolean isPagamentoEmAtraso() {
		return pagamentoEmAtraso;
	}

	public void setPagamentoEmAtraso(boolean pagamentoEmAtraso) {
		this.pagamentoEmAtraso = pagamentoEmAtraso;
	}
	
	public void pagar() {
		
		if (pagamentoEmAtraso) {
			pagamentoEmAtraso = false;
		}
	}
	
	@Override
	public String toString() {
		String str = super.toString() + "\nTipo de associação: " + getTipoDeAssociacao();
		
		if (pagamentoEmAtraso) {
			str += "\nPagamento em atraso!";
		} else {
			str += "\nPagamento em dia!";
		}
		
		return str;
	}
}