package Lista08_Encapsulamento.Exe02;
public class PrincipalMercado {

    public static void main(String[] args) {

        Mercado unidadeDeBlumenau = new Mercado();
        unidadeDeBlumenau.macasAno = 1000;
        unidadeDeBlumenau.valorMacas = 10000;
        unidadeDeBlumenau.laranjaAno = 2000;
        unidadeDeBlumenau.valorLaranjas = 6000;

        Mercado unidadeDeJoinville = new Mercado();
        unidadeDeJoinville.macasAno = 5000;
        unidadeDeJoinville.valorMacas = 7000;
        unidadeDeJoinville.laranjaAno = 6000;
        unidadeDeJoinville.valorLaranjas = 8000;

        Mercado unidadeDeFlorianopolis = new Mercado();
        unidadeDeFlorianopolis.macasAno = 10000;
        unidadeDeFlorianopolis.valorMacas = 12000;
        unidadeDeFlorianopolis.laranjaAno = 7800;
        unidadeDeFlorianopolis.valorLaranjas = 9000;

        System.out.println("\nQuantidade de maças vendidas por ano na unidade de Blumenau: " + unidadeDeBlumenau.macasAno +
                           "\nValor das vendas de maças no ano: R$ " + unidadeDeBlumenau.valorMacas +
                           "\nQuantidade de laranjas vendidas por ano na unidade de Blumenau: " + unidadeDeBlumenau.laranjaAno +
                           "\nValor das vendas de laranjas no ano: R$ " + unidadeDeBlumenau.valorLaranjas);
        System.out.println("\nQuantidade de maças vendidas por ano na unidade de Joinville: " + unidadeDeJoinville.macasAno +
                           "\nValor das vendas de maças no ano: R$ " + unidadeDeJoinville.valorMacas +
                           "\nQuantidade de laranjas vendidas por ano na unidade de Joinville: " + unidadeDeJoinville.laranjaAno +
                           "\nValor das vendas de laranjas no ano: R$ " + unidadeDeJoinville.valorLaranjas);
        System.out.println("\nQuantidade de maças vendidas por ano na unidade de Florianópolis: " + unidadeDeFlorianopolis.macasAno +
                           "\nValor das vendas de maças no ano: R$ " + unidadeDeFlorianopolis.valorMacas +
                           "\nQuantidade de laranjas vendidas por ano na unidade de Florianópolis: " + unidadeDeFlorianopolis.laranjaAno +
                           "\nValor das vendas de laranjas no ano: R$ " + unidadeDeFlorianopolis.valorLaranjas);
    }
}