/*A Câmara Municipal de Vereadores de Blumenau pretende realizar uma estatística sobre o desempenho dos seus parlamentares.
Para cada um dos 15 vereadores, ela possui o nome, partido, quantidade de projetos apresentados, quantidade de projetos aprovados. 
O desempenho é calculado da seguinte forma: 
(projetos aprovados / projetos apresentados) * índice de trabalho. 
Se não apresentou nenhum projeto, o desempenho é 0 (zero).

O índice de trabalho é definido pela seguinte tabela:
Projetos apresentados 		Índice de trabalho
01 – 05 			0,80
06 – 10 			1,00
11 – 17 			1,08
acima de 17 			1,22

Escreva um programa Java que leia os dados disponíveis pela Câmara e imprima o nome, partido e desempenho do vereador.
Imprima:
a) o total de projetos apresentados e de aprovados na câmara;
b) o nome, partido e desempenho do vereador com mais projetos aprovados;
c) o nome, partido e desempenho do vereador com menor desempenho;
d) o nome, partido e desempenho dos vereadores cujo desempenho seja maior que o desempenho médio de toda a câmara;*/
package Lista10_Exceção.Exe09;
import java.util.ArrayList;
import java.util.List;
public class Parlamentares {
    
    private String nome, partido;
    private int projetosApresentados, projetosAprovados;
    public static List<Parlamentares> listaParlamentares = new ArrayList<>();

    public Parlamentares(String nome, String partido, int projetosApresentados, int projetosAprovados) {
        setNome(nome);
        setPartido(partido);
        setProjetosApresentados(projetosApresentados);
        setProjetosAprovados(projetosAprovados);
        listaParlamentares.add(this);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) throws IllegalArgumentException {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome do parlamentar inválido");
        }
        this.nome = nome;
    }

    public String getPartido() {
        return partido;
    }

    public void setPartido(String partido) throws IllegalArgumentException {
        if (partido == null || partido.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome do partido inválido");
        }
        this.partido = partido;
    }

    public int getProjetosApresentados() {
        return projetosApresentados;
    }

    public void setProjetosApresentados(int projetosApresentados) throws IllegalArgumentException {
        if (projetosApresentados < 0) {
            throw new IllegalArgumentException("Número de projetos apresentados inválido");
        }
        this.projetosApresentados = projetosApresentados;
    }

    public int getProjetosAprovados() {
        return projetosAprovados;
    }

    public void setProjetosAprovados(int projetosAprovados)  throws IllegalArgumentException {
        if (projetosAprovados < 0) {
            throw new IllegalArgumentException("Número de projetos aprovados inválido");
        }
        this.projetosAprovados = projetosAprovados;
    }

    public double calcularDesempenho() { //verificar desempenho

        double indiceDeTrabalho = 0;

        if (getProjetosApresentados() >= 1 && getProjetosApresentados() <= 5) {
            indiceDeTrabalho = 0.8;
        } else if (getProjetosApresentados() >=6 && getProjetosApresentados() <= 10) {
            indiceDeTrabalho = 1;
        } else if (getProjetosApresentados() >= 11 && getProjetosApresentados() <= 17) {
            indiceDeTrabalho = 1.08;
        } else {
            indiceDeTrabalho = 1.22;
        }
        
        if(getProjetosApresentados() == 0) {
            return 0;  
        }
        //forçando uma das variáveis a ser um double para obter um resultado decimal, caso getProjetosAprovados() 
        //for menor que getProjetosApresentados() para que a divisão não resulte em zero
        return ((double)getProjetosAprovados() / getProjetosApresentados()) * indiceDeTrabalho;
    }
    
    public String calcularProjetosAprovados() {
        int somaProjetos = 0;
        somaProjetos += getProjetosApresentados() + getProjetosAprovados();

        return "Total de projetos apresentados e aprovados na câmara pelo vereador " + getNome() + " é " + somaProjetos;
    }

    @Override
    public String toString() {

        return " - Vereador: " + getNome() + "\t|  Partido: " + getPartido() + "  \t|  Desemprenho: " + calcularDesempenho();
    }
}
