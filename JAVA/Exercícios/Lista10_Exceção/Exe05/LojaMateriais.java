/*Crie um sistema para uma loja de materiais de construção. Os objetos terão os atributos: Nome, descrição, preço, peso e estoque

Crie um método para adicionar mais unidades da peça ao estoque.
Crie um método para a venda desse produto, podendo ser vendidos até o mesmo número de peças que tem no estoque.
Crie um método para colocar o produto em promoção, o parâmetro do método deve ser a porcentagem do desconto.

a) Qual o nome do material mais caro
b) Qual o nome do material mais leve
c) Quanto que pesa a quantidade total do produto mais caro, ou seja, a quantidade multiplicado pelo peso*/
package Lista10_Exceção.Exe05;
import java.util.ArrayList;
import java.util.List;
public class LojaMateriais {
    
    private String nome;
    private String descricao;
    private double valor;
    private double peso;
    private int estoque;
    public static List<LojaMateriais> listaMateriais = new ArrayList<>();
    
    public LojaMateriais(String nome, String descricao, double valor, double peso, int estoque) {
        setNome(nome);
        setDescricao(descricao);
        setValor(valor);
        setPeso(peso);
        setEstoque(estoque);
        listaMateriais.add(this);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) throws IllegalArgumentException {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome do produto inválido");
        }
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) throws IllegalArgumentException {
        if (descricao == null || descricao.trim().isEmpty()) {
            throw new IllegalArgumentException("Descrição do produto inválida");
        }
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) throws IllegalArgumentException {
        if (valor < 0) {
            throw new IllegalArgumentException("Valor do produto inválido");
        }
        this.valor = valor;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) throws IllegalArgumentException {
        if (peso < 0) {
            throw new IllegalArgumentException("Peso do produto inválido");
        }
        this.peso = peso;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) throws IllegalArgumentException {
        if (estoque < 0) {
            throw new IllegalArgumentException("Estoque do produto inválido");
        }
        this.estoque = estoque;
    }

    public String adicionaEstoque(int adicionarUnidade) {

        return "A atual quantidade de unidades de " + getNome() + " em estoque é de " + (getEstoque() + adicionarUnidade);
    }

    public String vendaProdutos(int venderUnidade) {

        if (venderUnidade < getEstoque()) {
            return "Restam " + (getEstoque() - venderUnidade) + " unidades de " + getNome() + " em estoque";
        } else {
            return "Quantidade de " + getNome() + " indisponível em estoque";
        }
    }

    public String calculaPromocao(double porcentagemDesconto) {

        return "O valor unitário final de " + getNome() + " é R$" + (getValor() - (porcentagemDesconto/100));
    }

    @Override
    public String toString() {
        return "- Produto: " + getNome() + "\t| Descrição: " + getDescricao() + "\t| Peso: " + getPeso() + 
               "\t| Quantidade em estoque: " + getEstoque() + "\t| Valor R$ " + getValor();
    }
}
