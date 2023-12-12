package Trabalho1;
import java.util.ArrayList;
import java.util.List;
public class Pedido {

    //criando os atribustos da classe Item
    private int numPedido;
    private Cliente umCliente;
    private List<Item> listaItens = new ArrayList<Item>();

    //criando o contrutor que armazenará os dados do Pedido
    public Pedido(int numPedido, Cliente umCliente) {
        setNumPedido(numPedido);
        setUmCliente(umCliente);
    }

    //criando getters, setters e tratamento de esceção
    public int getNumPedido() {
        return numPedido;
    }

    public void setNumPedido(int numPedido) throws IllegalArgumentException {
        if (numPedido < 0) {
            throw new IllegalArgumentException("Número do pedido inválido");
        }
        this.numPedido = numPedido;
    }

    public Cliente getUmCliente() {
        return umCliente;
    }

    public void setUmCliente(Cliente umCliente) throws IllegalArgumentException {
        if (umCliente == null) {
            throw new IllegalArgumentException("Dados do cliente inválidos");
        }
        this.umCliente = umCliente;
    }

    public List<Item> getListaItens() {
        return listaItens;
    }

    public void setListaItens(List<Item> listaItens) throws IllegalArgumentException {
        if (listaItens == null) {
            throw new IllegalArgumentException("Itens inválidos");
        }
        this.listaItens = listaItens;
    }

    //chamando a idade do cliente para verificar se o mesmo é maior de idade
    //caso o cliente for maior de idade, poderá consumir bebida alcóolica, senão a mesma não poderá ser adicionada ao seu pedido
    public boolean verificarMaiorIdade() {
        
        return getUmCliente().getIdade() >= 18;
    }

    //criando um método para adicionar um item ao Pedido
    public void adicionarItemPedido(Item adicionarItem) {

        for (Item i : listaItens) {
            if (i instanceof Bebida && ((Bebida)i).isAlcoolica() && !verificarMaiorIdade()) {
                throw new IllegalArgumentException("Proibido vender bebida alcóolica para menor de idade");
            }
        }
        listaItens.add(adicionarItem);
    }

    //procurando item a atraves do numero para depois poder excluir
    private Item acharItem(int numItem){
        for(Item i: listaItens){
            if(i.getNumIdentificacao() == numItem){
                return i;
            }
        }
        return null;
    } 

    //criando um método para remover um item do Pedido
    public void removerItemPedido(int numItem) {
        listaItens.remove(acharItem(numItem));
    }

    //criando um método para imprimir um item do Pedido
    public Item imprimirItemPedido(int numItem) {
        for(Item i: listaItens){
            if(i.getNumIdentificacao() == numItem){
                return i;
            }
        }
        return null;
    }

    //criando um método para atualizar o nome de um item do Pedido
    public void atualizarNomeItemPedido(int numItem, String nomeNovo) {
        for(Item i: listaItens){
            if(i.getNumIdentificacao() == numItem){
                i.setNome(nomeNovo);
            }
        }
    }

    //percorrendo e organizando a lista de itens do Pedido, para que ela apareça de forma organizada ao úsuario 
    public String imprimirLista() {
        String str = "\n\n--- Itens do pedido ---\n\n";
        for (Item s : listaItens) {
            str += s + "\n\n";
        }
        return str;
    }

    //calculando o valor total do pedido de forma que se tiver algum desconto, seja descontado do valor original de cada item
    public double calcularValorTotal() {
        double somaValor = 0;
        
        for (Item i : listaItens) {
            double valorFinal = (i.getValor() - i.calcularDesconto());
            somaValor += valorFinal;
        }
        return somaValor;
    }

    //imprimindo os dados do Pedido e relacionando-os com o devido Cliente
    @Override
    public String toString() {
        return "Número do pedido: " + getNumPedido() + "\n" + getUmCliente() + imprimirLista() + 
                "Valor total do pedido R$ " + calcularValorTotal() + "\n\n------------------------------";
    }
}