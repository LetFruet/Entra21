package Trabalho1;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

//criando uma subclasse de Item
public class Entrada extends Item {

    //criando os atribustos da classe Entrada
    private int tempoPreparoMin;
    private int qtdePessoasServe;
    private List<String> ingredientesEntrada = new ArrayList<String>();

    //criando o contrutor que armazenará os dados da Entrada (incluindo os dados da superclasse)
    public Entrada(int numIdentificacao, String nome, double valor, int tempoPreparoMin, int qtdePessoasServe) {
        super(numIdentificacao, nome, valor);
        setTempoPreparoMin(tempoPreparoMin);
        setQtdePessoasServe(qtdePessoasServe);
    }

    //criando getters, setters e tratamento de exceção
    public int getTempoPreparoMin() {
        return tempoPreparoMin;
    }

    public void setTempoPreparoMin(int tempoPreparoMin) throws IllegalArgumentException {
        if (tempoPreparoMin < 0) {
            throw new IllegalArgumentException("Tempo de preparo do prato principal inválido");
        }
        this.tempoPreparoMin = tempoPreparoMin;
    }

    public int getQtdePessoasServe() {
        return qtdePessoasServe;
    }

    public void setQtdePessoasServe(int qtdePessoasServe) throws IllegalArgumentException {
        if (qtdePessoasServe < 0) {
            throw new IllegalArgumentException("Quantidade de pessoas que o prato principal serve inválida");
        }
        this.qtdePessoasServe = qtdePessoasServe;
    }

    public List<String> getIngredientesEntrada() {
        return ingredientesEntrada;
    }

    public void setIngredientesEntrada(List<String> ingredientesEntrada) throws IllegalArgumentException {
        if (ingredientesEntrada == null) {
            throw new IllegalArgumentException("Lista de ingredientes da entrada inválida");
        }
        this.ingredientesEntrada = ingredientesEntrada;
    } 

    //criando um método para adicionar um ingrediente em determinada entrada 
    @Override
    public void adicionarIngrediente(String umIngrediente) {
        ingredientesEntrada.add(umIngrediente);
    }

    //criando um método para eidtar um ingrediente indesejado da entrada
    public void editarEntrada(String ingredienteColocar, String ingredienteRemover) {

        for (String i : getIngredientesEntrada()) {
            if (i.equalsIgnoreCase(ingredienteRemover)) {
                i.replaceAll(ingredienteRemover, ingredienteColocar);
            }
        }
    }

    //calculando o desconto da entrada, caso o pedido ocorra entre os dias 1 e 7 de cada mês
    @Override
    public double calcularDesconto() {

        double desconto = 0;

        if (LocalDate.now().getDayOfMonth() <= 7) {
            desconto = getValor() * 0.15;
        }
        return desconto;
    }

    //percorrendo e organizando a lista de ingredientes da Entrada, para que ela apareça de forma organizada ao úsuario
    @Override
    public String imprimirLista() {
        String str = "";
        for (String s : getIngredientesEntrada()) {
            str += s + ", ";
        }
        return str;
    }

    //imprimindo os dados da Entrada selecionada
    @Override
    public String toString() {
        return "Entrada: " + getNome() + "\nIngredientes: " + imprimirLista() + "\nValor R$ " + getValor() + "\tDesconto R$ " + calcularDesconto() +
                "\nServe até " + getQtdePessoasServe() + " pessoa(s)" + "\nTempo de preparo: " + getTempoPreparoMin() + " minutos";
    }
}