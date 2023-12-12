package Lista10_Exceção.Exe05;

public class PrincipalLoja {
   
    public static void main(String[] args) {
       
        LojaMateriais p1 = new LojaMateriais("Tijolo", "Laranja", 2.5, 300, 5000);
        LojaMateriais p2 = new LojaMateriais("Argamassa", "Branca", 60, 1500, 600);
        LojaMateriais p3 = new LojaMateriais("Lâmpada", "Amarela", 12.75, 150, 2230);

        System.out.println(p1.adicionaEstoque(100));
        System.out.println();
        System.out.println(p2.vendaProdutos(650));
        System.out.println();
        for (LojaMateriais m : LojaMateriais.listaMateriais) {
            System.out.println(m.toString());
        }
        System.out.println();
        System.out.println(p1.calculaPromocao(50));
    }

    public String verificaProdutoMaisCaro() {
        double maisCaro = Double.MIN_VALUE;
        String dados = "" ;
        for (LojaMateriais m : LojaMateriais.listaMateriais) {
            if (m.getValor() > maisCaro) {
                maisCaro = m.getValor();
                dados = "O material mais caro é " + m.getNome() + "A quantidade total do material mais caro pesa " 
                        + (maisCaro * m.getPeso()) + " gramas";
            }
        }
        return dados;
    }
        
    public String verificaProdutoMaisCaroLeve() {
        double maisLeve = Double.MAX_VALUE;
        String dados = "" ;
        for (LojaMateriais m : LojaMateriais.listaMateriais) {
            if (m.getPeso() < maisLeve) {
                maisLeve = m.getValor();
                dados = "O material mais leve é " + m.getNome();
            }
        }
        return dados;
    }
}
