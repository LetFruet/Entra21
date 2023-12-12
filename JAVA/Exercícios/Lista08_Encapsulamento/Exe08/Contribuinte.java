package Lista08_Encapsulamento.Exe08;
public class Contribuinte {
    
    public static void main(String[] args) {
        
        Irpf contribuinte1 = new Irpf("Letícia", "080.151.999-30", "SC", 10000);
        Irpf contribuinte2 = new Irpf("João da Silva", "123.456.789-00", "PR", 40000);
        Irpf contribuinte3 = new Irpf("Ana", "570.210.379-15", "RS", 2000);
        Irpf contribuinte4 = new Irpf("Nicolas", "243.876.901-99", "SP", 4000);
        Irpf contribuinte5 = new Irpf("Lorena", "993.667.852-40", "RS", 20000);

        Irpf vetor[] = {contribuinte1, contribuinte2, contribuinte3, contribuinte4, contribuinte5};

        System.out.println(calcularMaiorImposto(vetor));
        System.out.println(calcularMenorImposto(vetor));
        System.out.println(calcularImpostoTotal(vetor));
    }

    public static String calcularMaiorImposto(Irpf vetor[]) {
        
        double maiorImposto = Integer.MIN_VALUE;
        Irpf maiorIrpf = null;

        for (int i = 0; i < vetor.length; i++) {
            double imposto = vetor[i].calcularImposto();
            if (imposto > maiorImposto) {
                maiorImposto = imposto;
                maiorIrpf = vetor[i];
            }
        }

        return "Quem paga o maior imposto é: " + maiorIrpf;
    }

    public static String calcularMenorImposto(Irpf vetor[]) {
        
        double menorImposto = Integer.MAX_VALUE;
        Irpf menorIrpf = null;

        for (int i = 0; i < vetor.length; i++) {
            double imposto = vetor[i].calcularImposto();
            if (imposto < menorImposto) {
                menorImposto = imposto;
                menorIrpf = vetor[i];
            }
        }
        
        return "Quem paga o menor imposto é: " + menorIrpf;
    }

    public static String calcularImpostoTotal(Irpf vetor[]) {

        double totalImposto = 0;

        for (int i = 0; i < vetor.length; i++) {
            totalImposto += vetor[i].calcularImposto();
        }

        return "O total de imposto pago pelos contribuintes é: R$" + totalImposto;
    }
}