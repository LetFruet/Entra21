/*Uma pizzaria tem 5 pizzas em seu cardápio. Cada pizza tem um nome, 3 ingredientes, um boolean referente à borda, diâmetro e preço.
Crie 5 objetos de pizza e os coloque em uma Array List. Crie um método para mudar algum dos ingredientes da pizza, caso alguns dos 
ingredientes da pizza tenha sido iniciado como null, substitua esse ingrediente pelo novo, caso contrário, mude o terceiro ingrediente.
Qual é a pizza mais barata por área? */
package Lista10_Exceção.Exe06;
import java.util.ArrayList;
import java.util.List;
public class Pizzaria {
    
    private String nome;
    private String ingrediente1, ingrediente2, ingrediente3;
    private boolean borda;
    private double diametro;
    private double valor;
    public static List<Pizzaria> listaPizzas = new ArrayList<>();

    public Pizzaria(String nome, String ingrediente1, String ingrediente2, String ingrediente3, boolean borda, double diametro, double valor) {
        setNome(nome);
        setIngrediente1(ingrediente1);
        setIngrediente2(ingrediente2);
        setIngrediente3(ingrediente3);
        setBorda(borda);
        setDiametro(diametro);
        setValor(valor);
        listaPizzas.add(this);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) throws IllegalArgumentException {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome inválido");
        }
        this.nome = nome;
    }

    public String getIngrediente1() {
        return ingrediente1;
    }

    public void setIngrediente1(String ingrediente1) throws IllegalArgumentException {
        if (ingrediente1 != null) { //caso o ingrediente não for null, mas estiver vazio
            if (ingrediente1.trim().isEmpty()) {
                throw new IllegalArgumentException("Ingrediente 1 inválido");
            }
        }
        this.ingrediente1 = ingrediente1;
    }

    public String getIngrediente2() {
        return ingrediente2;
    }

    public void setIngrediente2(String ingrediente2) throws IllegalArgumentException {
        if (ingrediente2 != null) {
            if (ingrediente2.trim().isEmpty()) {
                throw new IllegalArgumentException("Ingrediente 2 inválido");
            }
        }
        this.ingrediente2 = ingrediente2;
    }

    public String getIngrediente3() {
        return ingrediente3;
    }

    public void setIngrediente3(String ingrediente3) throws IllegalArgumentException {
        if (ingrediente3 != null) {
            if (ingrediente3.trim().isEmpty()) {
                throw new IllegalArgumentException("Ingrediente 3 inválido");
            }
        }
        this.ingrediente3 = ingrediente3;
    }

    public boolean isBorda() {
        return borda;
    }

    public void setBorda(boolean borda) {
        this.borda = borda;
    }

    public double getDiametro() {
        return diametro;
    }

    public void setDiametro(double diametro)  throws IllegalArgumentException {
        if (diametro < 0) {
            throw new IllegalArgumentException("Diâmetro inválido"); 
        }
        this.diametro = diametro;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor)  throws IllegalArgumentException {
        if (valor < 0) {
            throw new IllegalArgumentException("Valor inválido");
        }
        this.valor = valor;
    }

    //método onde atribui-se o novoIngrediente a um dos ingredientes de acordo com a condição
    public void modificaIngrediente(String novoIngrediente) {

        if (ingrediente1 == null) {
            setIngrediente1(novoIngrediente);
        } else if (ingrediente2 == null) {
            setIngrediente2(novoIngrediente);
        } else if (ingrediente3 == null) {
            setIngrediente3(novoIngrediente);
        } else {
            setIngrediente3(novoIngrediente);
        }
    }
    
    public double valorPorArea() {

        double area = Math.PI * ((getDiametro()/2) * (getDiametro()/2));

        return (getValor() / area);
    }

    @Override
    public String toString() {

        String dados = "Sabor " + getNome();
        if (borda) {
            dados += "\t|   com borda ";
        } else {
            dados += "\t|   sem borda ";
        }
        dados += "\t| R$ " + getValor();

        return dados;
    }
}
