package Trabalho1;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

//criando uma subclasse de Item
public class Bebida extends Item {

    //criando os atribustos da classe Bebida
    private int qtdeMl;
    private boolean alcoolica;
    private List<String> ingredientesBebida = new ArrayList<String>();

    //criando o contrutor que armazenará os dados da Bebida selecionada (incluindo os dados da superclasse)
    public Bebida(int numIdentificacao, String nome, double valor, int qtdeMl, boolean alcoolica) {
        super(numIdentificacao, nome, valor);
        setQtdeMl(qtdeMl);
        setAlcoolica(alcoolica);
    }

    //getters, setters e tratamento de exceção
    public int getQtdeMl() {
        return qtdeMl;
    }

    public void setQtdeMl(int qtdeMl) throws IllegalArgumentException {
        if (qtdeMl < 0) {
            throw new IllegalArgumentException("Quantidade de mls da bebida inválida");
        }
        this.qtdeMl = qtdeMl;
    }

    public boolean isAlcoolica() {
        return alcoolica;
    }

    public void setAlcoolica(boolean alcoolica) {
        this.alcoolica = alcoolica;
    }

    public List<String> getIngredientesBebida() {
        return ingredientesBebida;
    }

    public void setIngredientesBebida(List<String> ingredientesBebida) throws IllegalArgumentException {
        if (ingredientesBebida == null) {
            throw new IllegalArgumentException("Lista de ingredientes da bebida inválida");
        }
        this.ingredientesBebida = ingredientesBebida;
    } 

    //criando um método para adicionar um ingrediente em determinada bebida 
    @Override
    public void adicionarIngrediente(String umIngrediente) {
        ingredientesBebida.add(umIngrediente);
    }

    //criando um método para alterrar o valor da bebida caso o Cliente queira adicionar álcool
    public void adicionarAlcool(Pedido umPedido) {

        if (umPedido.verificarMaiorIdade()) {
            setValor(getValor() * 1.10);
        }
    }

    //calculando o desconto da bebida, caso o pedido ocorra entre os dias 1 e 7 de cada mês
    @Override
    public double calcularDesconto() {

        double desconto = 0;

        if (LocalDate.now().getDayOfMonth() <= 7) {
            desconto = getValor() * 0.05;
        }
        return desconto;
    }

    //percorrendo e organizando a lista de ingredientes da bebida, para que ela apareça de forma organizada ao cliente 
    @Override
    public String imprimirLista() {
        String str = "";
        for (String s : getIngredientesBebida()) {
            str += s + ", ";
        }
        return str;
    }

    //imprimindo os dados da bebida selecionada e utilizando if para verificar se a mesma é alcóolica ou não
    @Override
    public String toString() {
        String str = "Bebida: " + getNome() + "\nIngredientes: " + imprimirLista() + "\nValor R$ " + getValor() + 
                     "\tDesconto R$ " + calcularDesconto() + "\nQuantidade: " + getQtdeMl() + " ml";

        if (isAlcoolica()) {
            str += " (Bebida alcóolica)";
        } else {
            str += " (Bebida sem álcool)";
        }

        return str;
    }
}