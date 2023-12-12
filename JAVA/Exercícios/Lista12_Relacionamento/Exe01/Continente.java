package Lista12_Relacionamento.Exe01;
import java.util.ArrayList;
import java.util.List;
public class Continente {
 
    private List<Pais> listaPaises = new ArrayList<Pais>();

    public List<Pais> getListaPaises() {
        return listaPaises;
    }

    public void setListaPaises(List<Pais> listaPaises) {
        this.listaPaises = listaPaises;
    }
    
    public void adicionarPais(Pais umPais) {
        listaPaises.add(umPais);
    }

    public String maiorPais() {
        double maiorDimensao = Double.MIN_VALUE;
        String nomePais = "";

        for (Pais p : listaPaises) {
            if (p.getDimensao() > maiorDimensao) {
                maiorDimensao = p.getDimensao();
                nomePais = p.getNome();
            }
        }
        return nomePais;
    }

    @Override
    public String toString() {
        return "Paises: " + listaPaises;
    }
}
