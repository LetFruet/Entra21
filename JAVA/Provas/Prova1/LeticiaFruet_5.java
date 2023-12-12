//Uma grande loja de departamentos paga aos vendedores um salário base com base nas vendas efetuadas durante o mês, que é igual a 
//30% de comissão sobre o preço de cada produto vendido. Cada vendedor, em um determinado mês, vende n produtos, onde para cada produto 
//tem-se o preço unitário e a quantidade vendida. O departamento de pessoal deseja obter um relatório com: nome, total de vendas (em R$ e 
//somente duas casas decimais após a vírgula) e salário de cada vendedor. Descreva um algoritmo que gere o relatório desejado. Para prosseguir 
//com a entrada de dados o algoritmo deve apresentar a seguinte mensagem: “deseja digitar os dados de mais um vendedor: s (SIM) / n (NÃO)”.
package Prova1;
import java.text.DecimalFormat;
import java.util.Scanner;
public class LeticiaFruet_5 {
      public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
        DecimalFormat df_2 = new DecimalFormat("0.00");

        char escolha = 'S';

        while (escolha == 'S') {
            System.out.print("Informe o nome do vendedor: ");
            String nome = kb.next();
            System.out.println("Informe o salario do vendedor: ");
            float salario = kb.nextFloat(); 
            System.out.println("Informe a quantidade de produtos vendidos: ");
            int qtdProduto = kb.nextInt();     
            System.out.println("Informe o preço unitário do produto: ");
            float valorUnitario = kb.nextFloat(); 
            
            float comissao = (valorUnitario * qtdProduto) * 0.30f;
            float salariofinal = salario + comissao;
            float valorVendas = qtdProduto * valorUnitario;

            System.out.println("Nome do vendedor: " + nome + "\nValor das vendas: " +  df_2.format(valorVendas) + "\nSalário final: R$ " + df_2.format(salariofinal));
            
            System.out.println("Deseja digitar os dados de mais um vendedor: s (SIM) / n (NÃO)");
            escolha = kb.next().toUpperCase().charAt(0);
        }

		kb.close(); 
	}
}