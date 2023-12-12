package Trabalho1;
//criando uma superclasse abstrata Item
public abstract class Item {

    //criando os atribustos da classe Item
    private int numIdentificacao;
    private String nome;
    private double valor;
 
    //criando o contrutor que armazenará os dados do Item do pedido
    public Item(int numIdentificacao, String nome, double valor) {
        setNumIdentificacao(numIdentificacao);
        setNome(nome);
        setValor(valor);
    }

    //criando getters, setters e tratamento de exceção
    public int getNumIdentificacao() {
        return numIdentificacao;
    }

    public void setNumIdentificacao(int numIdentificacao) throws IllegalArgumentException { 
        if (numIdentificacao < 0) {
            throw new IllegalArgumentException("Número de identificação do item inválido");
        }
        this.numIdentificacao = numIdentificacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) throws IllegalArgumentException {
        if (nome == null || nome.isEmpty() || nome.isBlank()) {
            throw new IllegalArgumentException("Nome do item inválido");
        }
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) throws IllegalArgumentException {
        if (valor < 0) {
            throw new IllegalArgumentException("Valor do prato inválido");
        }
        this.valor = valor;
    }

    //criando métodos abstratos que passarão para as subclasse Bebida, Entrada e PratoPrincipal
    public abstract double calcularDesconto();
    public abstract String toString();
    public abstract String imprimirLista();
    public abstract void adicionarIngrediente(String umIngrediente);
}