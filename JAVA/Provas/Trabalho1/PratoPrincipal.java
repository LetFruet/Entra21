package Trabalho1;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

//criando uma subclasse de Item
public class PratoPrincipal extends Item {

    //criando os atribustos da classe Item
    private int tempoPreparoMin;
    private int qtdePessoasServe;
    private List<String> ingredientesPrincipal = new ArrayList<String>();

    //criando o contrutor que armazenará os dados do Prato principal (incluindo os dados da superclasse) 
    public PratoPrincipal(int numIdentificacao, String nome, double valor, int tempoPreparoMin, int qtdePessoasServe) {
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

    public List<String> getIngredientesPrincipal() {
        return ingredientesPrincipal;
    }

    public void setIngredientesPrincipal(List<String> ingredientesPrincipal) throws IllegalArgumentException {
        if (ingredientesPrincipal == null) {
            throw new IllegalArgumentException("Lista de ingredientes do prato princiapal inválida");
        }
        this.ingredientesPrincipal = ingredientesPrincipal;
    }
    
    //criando um método para adicionar um ingrediente em determinada entrada 
    @Override
    public void adicionarIngrediente(String umIngrediente) {
        ingredientesPrincipal.add(umIngrediente);
    }

    //criando um método para remover um ingrediente indesejado do Prato principal
    public void removerIngrediente(String umIngrediente) {
        getIngredientesPrincipal().remove(umIngrediente);
    }

    //calculando o desconto do Prato principal, caso o pedido ocorra entre os dias 1 e 7 de cada mês
    @Override
    public double calcularDesconto() {

        double desconto = 0;

        if (LocalDate.now().getDayOfMonth() <= 7) {
            desconto = getValor() * 0.1;
        }
        return desconto;
    }

    //percorrendo e organizando a lista de ingredientes do prato principal, para que ela apareça de forma organizada ao úsuario 
    @Override
    public String imprimirLista() {
        String str = "";
        for (String s : getIngredientesPrincipal()) {
            str += s + ", ";
        }
        return str;
    }

    //imprimindo os dados do Prato principal selecionado
    @Override
    public String toString() {
        return "Prato principal: " + getNome() + "\nIngredientes: " + imprimirLista() + "\nValor R$ " + getValor() + "\tDesconto R$ " + calcularDesconto() +
                "\nServe até " + getQtdePessoasServe() + " pessoa(s)" + "\nTempo de preparo: " + getTempoPreparoMin() + " minutos";
    }
}