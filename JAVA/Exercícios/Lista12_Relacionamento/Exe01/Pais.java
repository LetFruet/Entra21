package Lista12_Relacionamento.Exe01;
public class Pais {
    
    private String nome;
    private double dimensao;
    
    public Pais(String nome, double dimensao) {
        setNome(nome);
        setDimensao(dimensao);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) throws IllegalArgumentException {
        if (nome == null || nome.isEmpty() || nome.isBlank()) {
            throw new IllegalArgumentException("Nome inválido");
        }
        this.nome = nome;
    }

    public double getDimensao() {
        return dimensao;
    }

    public void setDimensao(double dimensao) throws IllegalArgumentException {
        if (dimensao < 0) {
            throw new IllegalArgumentException("Dimensão inválida");
        }
        this.dimensao = dimensao;
    }

    @Override
    public String toString() {
        return getNome() + " - Dimensão: " + getDimensao() + " km²";
    }
}
