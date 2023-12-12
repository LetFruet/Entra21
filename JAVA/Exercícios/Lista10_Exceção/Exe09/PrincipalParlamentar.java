package Lista10_Exceção.Exe09;

public class PrincipalParlamentar {
    
    public static void main(String[] args) {
        
        Parlamentares p1 = new Parlamentares("Letícia", "PL", 10,9);
        Parlamentares p2 = new Parlamentares("Paula", "Novo", 23,17);
        Parlamentares p3 = new Parlamentares("Heitor", "PL",6,5);
        Parlamentares p4 = new Parlamentares("Guilherme", "Novo", 36,21);
        Parlamentares p5 = new Parlamentares("Ana", "PL", 15,3);

        System.out.println("O desempenho do candidato " + p1.getNome() + " é de: " + p1.calcularDesempenho());
        System.out.println(p2.calcularProjetosAprovados());

        for (Parlamentares p : Parlamentares.listaParlamentares) {
            System.out.println(p.toString());
        }
    
    }

    public String verificarMaisProjetosAprovados() {
        int maisProjetosAprovados = Integer.MIN_VALUE;
        String vereadorMaisAprovados = "";

        for (Parlamentares p : Parlamentares.listaParlamentares) {
            if (p.getProjetosAprovados() > maisProjetosAprovados) {
                maisProjetosAprovados = p.getProjetosApresentados();
                vereadorMaisAprovados = p.getNome();
            }
        }

        return "Vareador com maior número de projetos aprovados: \n" + vereadorMaisAprovados;
    } 

    public String verificarMenorDesempenho() {
        int menorDesempenho = Integer.MAX_VALUE;
        String vereadorMenorDesempenho = "";

        for (Parlamentares p : Parlamentares.listaParlamentares) {
            if (p.calcularDesempenho() < menorDesempenho) {
                menorDesempenho = p.getProjetosApresentados();
                vereadorMenorDesempenho = p.getNome();
            }
        }

        return "Vareador com menor desempenho: \n" + vereadorMenorDesempenho;
    } 

    public String calcularMediaDesepenho() {

        double somaDesempenho = 0;

        for (Parlamentares p : Parlamentares.listaParlamentares) {
            somaDesempenho += p.calcularDesempenho();
        }
        
        return "A média de desempenho dos vereadores é: " + (somaDesempenho / Parlamentares.listaParlamentares.size());
    }
}