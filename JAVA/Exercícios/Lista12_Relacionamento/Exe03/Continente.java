package Lista12_Relacionamento.Exe03;
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

	public Pais maiorPais() {
		Pais maiorPais = null;
		double maiorDimensao = Integer.MIN_VALUE;
		for (Pais p : this.getListaPaises()) {
			if (p.getDimensao() > maiorDimensao) {
				maiorDimensao = p.getDimensao();
				maiorPais = p;
			}
		}
		return maiorPais;
	}

    @Override
    public String toString() {
		String str = "Paises pelos quais o continente é composto\n\n";
		for (Pais p : listaPaises) {
			str += p.toString() + "\n";
		}
		return str + "\nMaior país do continente " + maiorPais();
	}
}
