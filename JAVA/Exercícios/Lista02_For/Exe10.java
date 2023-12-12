//Uma turma tem n alunos.Dado n, o nome(somente o primeiro nome) e idade de cada aluno descreva:
//a) os nomes dos alunos que tem 18 anos; 
//b) a quantidade de alunos que tem idade acima de 20 anos.
package Lista02_For;
import java.util.Scanner;
public class Exe10 {
    
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        
        System.out.println("Entre com o número de alunos: ");
        int alunos = kb.nextInt();  
        
        String nomeAlunos18 = " ";
        int idade20 = 0; 
        
        for (int i = 1; i <= alunos; i++) {
            System.out.println("Entre com o nome do aluno: ");
            String nome = kb.next();  
            System.out.println("Entre com a idade do aluno: ");
            int idade = kb.nextInt(); 

            if (idade == 18) {
            	nomeAlunos18 += nome + " "; }

            if (idade > 20) {
            	idade20++; } 
        }
    
        System.out.println("Alunos com 18 anos: " + nomeAlunos18); 
        System.out.println("Alunos acima de 20 anos: " + idade20); 

        kb.close();
    }
}
