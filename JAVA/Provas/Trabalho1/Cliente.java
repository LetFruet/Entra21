package Trabalho1;
public class Cliente {

    //criando os atribustos da classe Cliente
    private String nome;
    private int idade;

    //criando o contrutor que armazenará os dados do cliente
    public Cliente(String nome, int idade) {
        setNome(nome);
        setIdade(idade);
    }

    //criando getters, settters e tratamento de exceção
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome do cliente inválido");
        }
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if(idade < 0) {
            throw new IllegalArgumentException("Idade do cliente inválida");
        }
        this.idade = idade;
    }

    //imprimindo o nome do Cliente para que ele seja vinculado à classe Pedido
    @Override
    public String toString() {
        return "Cliente: " + getNome();
    }
}