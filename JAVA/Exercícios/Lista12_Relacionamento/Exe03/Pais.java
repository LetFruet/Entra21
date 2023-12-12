package Lista12_Relacionamento.Exe03;
import java.util.ArrayList;
import java.util.List;
public class Pais {
    
    private String nome;
    private double dimensao;
    private List<Pais> paisesDeFronteira = new ArrayList<Pais>();

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

    public List<Pais> getPaisesDeFronteira() {
        return paisesDeFronteira;
    }

    public void setPaisesDeFronteira(List<Pais> paisesDeFronteira) {
        this.paisesDeFronteira = paisesDeFronteira;
    }

    public void adicionarFronteira(Pais novaFronteira) {
        if (!this.getPaisesDeFronteira().contains(novaFronteira)) {
            paisesDeFronteira.add(novaFronteira);
            novaFronteira.getPaisesDeFronteira().add(this); // this é a pessoa que chama o país de fronteira
        }
    }

    public boolean fazFronteira(Pais fronteira) {
        
        /*if (paisesDeFronteira.contains(fronteira)) {
            return true;
        }
        return false;*/

        return this.getPaisesDeFronteira().contains(fronteira); //maneira simplificada s
    }

    public List<Pais> fronteirasIguais(Pais umPais) {
        /*List<Pais> fronteirasComuns = new ArrayList<Pais>();
    
        for (Pais p : paisesDeFronteira) {
            if (umPais.getPaisesDeFronteira().contains(p)) {
                fronteirasComuns.add(p);

            }
        }
        return fronteirasComuns;*/

        List<Pais> fronteirasComuns = this.getPaisesDeFronteira();

        fronteirasComuns.retainAll(umPais.getPaisesDeFronteira());

        return fronteirasComuns;
    }

    @Override
    public String toString() {
        return getNome() + " (" + getDimensao() + " km²)";
    }
}