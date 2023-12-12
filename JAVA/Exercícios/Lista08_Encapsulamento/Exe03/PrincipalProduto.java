package Lista08_Encapsulamento.Exe03;

public class PrincipalProduto {
    
    public static void main(String[] args) {
        
        Produto produto1 = new Produto();
        produto1.nome = "Caderno";
        produto1.descricao = "Caderno em espiral tamanho médio";
        produto1.precoUn = 4.5;
        produto1.desconto = 15;

        Produto produto2 = new Produto();
        produto2.nome = "Caneta ESF";
        produto2.descricao = "Caneta esferográfica 5mm";
        produto2.precoUn = 1.2;
        produto2.desconto = 2;
        
        Produto produto3 = new Produto();
        produto3.nome = "Esquadro";
        produto3.descricao = "Esquadro de acrílico 20 cm";
        produto3.precoUn = 2.35;
        produto3.desconto = 10;


        System.out.println("Produto 1: \nNome: " + produto1.nome + "\nDescrição: " + produto1.descricao + "\nValor unitário: " + 
                            produto1.precoUn + "\nDesconto: " + produto1.desconto);
        System.out.println();
        System.out.println("Produto 2: \nNome: " + produto2.nome + "\nDescrição: " + produto2.descricao + "\nValor unitário: " + 
                            produto2.precoUn + "\nDesconto: " + produto2.desconto);
        System.out.println();
        System.out.println("Produto 3: \nNome: " + produto3.nome + "\nDescrição: " + produto3.descricao + "\nValor unitário: " + 
                            produto3.precoUn + "\nDesconto: " + produto3.desconto);
    }
}
