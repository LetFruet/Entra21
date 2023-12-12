package Trabalho1;
import java.util.ArrayList;
import java.util.List;

public class Restaurante {

    //criando os atribustos da classe Restaurante
    private String nome;
    private String tipo;
    private Endereco endereco;
    private String telefone;
    private String horarioFuncionamento;
    private List<Item> cardapio = new ArrayList<>();

    //criando o contrutor que armazenará os dados do Restaurante
    public Restaurante(String nome, String tipo, Endereco endereco, String telefone, String horarioFuncionamento) {
        setNome(nome);
        setTipo(tipo);
        setEndereco(endereco);
        setTelefone(telefone);
        setHorarioFuncionamento(horarioFuncionamento);
    }

    //getters, setters e tratamento de exceção
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) throws IllegalArgumentException {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome do restaurante inválido");
        }
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) throws IllegalArgumentException {
        if (tipo == null || tipo.trim().isEmpty()) {
            throw new IllegalArgumentException("Tipo de restaurante inválido");
        }
        this.tipo = tipo;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) throws IllegalArgumentException {
        if (endereco == null) {
            throw new IllegalArgumentException("Endereço do restaurante inválido");
        }
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) throws IllegalArgumentException {
        if (telefone == null || telefone.trim().isEmpty()) {
            throw new IllegalArgumentException("Telefone do restaurante inválido");
        }
        this.telefone = telefone;
    }

    public String getHorarioFuncionamento() {
        return horarioFuncionamento;
    }

    public void setHorarioFuncionamento(String horarioFuncionamento) throws IllegalArgumentException {
        if (horarioFuncionamento == null || horarioFuncionamento.trim().isEmpty()) {
            throw new IllegalArgumentException("Horário de funcionamento do restaurante inválido");
        }
        this.horarioFuncionamento = horarioFuncionamento;
    }
    
    public List<Item> getCardapio() {
        return cardapio;
    }

    public void setCardapio(List<Item> cardapio) {
        if(cardapio == null){
            throw new IllegalArgumentException("Cardápio inválido.");
        }
        this.cardapio = cardapio;
    }

    public void adicionarItem(Item item){
        cardapio.add(item);
    }

    // imprimindo a lista de itens / cardapio
    public String imprimirCardapio(){
        String str = "";
        for(Item i: cardapio){
            str += i + "\n\n";
        }
        return str;
    }

    //imprimindo os dados do Restaurante
    @Override
    public String toString(){
        return "Restaurante: " + getNome() + " -" + getTipo() + 
                "\nTelefone: " + getTelefone() + 
                "\nHorário de atendimento: " + getHorarioFuncionamento() + 
                "\n--- Endereço ---\n" + getEndereco();
    }
}