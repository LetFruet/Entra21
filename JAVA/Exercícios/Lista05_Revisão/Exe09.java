/*Dada uma turma de alunos, contendo seu nome e nota de 3 provas descreva um algoritmo para informar a média de cada aluno.
Considere que a leitura dos dados deve ser finalizada quando o nome do aluno for “fim”. */
package Lista05_Revisão;
import java.util.Scanner;
public class Exe09 {
  
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
                
        System.out.print("Escreva o nome do aluno: ");
        String nome = kb.next(); 
    
        while(!nome.equals("fim")) {
            System.out.println("Escreva as duas notas do aluno: ");
            double prova01 = kb.nextDouble(); 
            double prova02 = kb.nextDouble(); 

            double media = (prova01 + prova02) / 2;

            System.out.println("Nome: " + nome + "\n" + "Média: " + media); 
    
            System.out.print("Escreva o nome do aluno: ");
            nome = kb.next(); 
        }
       
        kb.close();
    }
}