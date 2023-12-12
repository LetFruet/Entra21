/*Uma grande loja de departamentos paga aos vendedores um salário com base nas vendas efetuadas durante o mês, que é igual a 30% de comissão 
sobre o preço de cada produto vendido. Cada vendedor, em um determinado mês, vende n produtos, onde, para cada produto tem-se o preço 
unitário e a quantidade vendida. O departamento de pessoal deseja obter um relatório com: nome, total de vendas (em R$) e salário de 
cada vendedor. Descreva um algoritmo que gere o relatório desejado. Para prosseguir com a entrada de dados o algoritmo deve apresentar a 
seguinte mensagem: “deseja digitar os dados de mais um vendedor: s (SIM) / n (NÃO)?”. O número de produtos (n) de cada vendedor deve ser 
informado.*/
package Lista05_Revisão;
import java.util.Scanner;
public class Exe11 {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        String nome = " ";
        int n = 0;
        double salario = 0;

        System.out.print("Deseja digitar os dados de um vendedor? s (SIM) / n (NÃO): ");
        String S_N = kb.next();

        while (S_N.equalsIgnoreCase("S")) {
            System.out.print("Informe o nome do vendedor: ");
            nome = kb.next();

            System.out.print("Informe o total de produtos vendidos pelo vendedor: ");
            n = kb.nextInt();

            salario = n * 0.3;
            
            System.out.println(nome + "\n" + "Total de vendas: R$ " + n + "\n" + "Salário: R$ " + salario); 
            
            System.out.print("deseja digitar os dados de mais um vendedor: s (SIM) / n (NÃO)?");
            S_N = kb.next().toUpperCase();
        }

        kb.close();
    }
}