/*O objetivo deste exercício é implementar a relação entre uma pessoa e seu endereço.
Para isto crie três classes: Pessoa.java, Endereco.java e Principal.java.

Na classe Pessoa faça o seguinte:
a) Crie dois atributos privados: Um do tipo String para o nome da pessoa e outro do Endereco para armazenar o endereço da Pessoa;
b) Sobrescreva o método toString() da classe Object para gerar uma String com o nome da Pessoa e os três atributos de Endereco.
c) Crie uma ArrayList que terá todos os objetos de Pessoa;

Na classe Endereco faça o seguinte:
a) Crie três atributos privados: um do tipo String para o logradouro, outro do tipo String para o complemento e um do tipo int para o número;

Na classe Principal faça o seguinte:
a) Dentro do main crie vários objetos a partir da classe Pessoa;
b) Percorra a lista de Pessoas e chame o método toString da classe Pessoa para mostrar o nome de cada pessoa e seu endereço de contato. */
package Lista10_Exceção.Exe11;
import java.util.ArrayList;
import java.util.List;
public class Pessoa {
    
    private String nome;
    public static List<Pessoa> listaPessoa = new ArrayList<>();
    private Endereco endereco;

    public Pessoa(String nome, Endereco endereco) {
        setNome(nome);
        setEndereco(endereco);
        listaPessoa.add(this);
    }

    //get: retorna a característica
    public String getNome() {
        return nome;
    }

    //set: cadastra a característica
    public void setNome(String nome) throws IllegalArgumentException {
        // verificando se o nome é nulo ou vazio 
        if (nome == null || nome.trim().isEmpty()) {
            //fazendo o tratamento de exceção
            throw new IllegalArgumentException("Nome inválido");
        }
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }
    
    public void setEndereco(Endereco endereco) throws IllegalArgumentException {
        if (endereco == null) {
            throw new IllegalArgumentException("Endereço inválido");
        }
        this.endereco = endereco;
    }
    
    @Override
    public String toString() {
        return "Nome: " + getNome() + endereco.toString();
    }
}
