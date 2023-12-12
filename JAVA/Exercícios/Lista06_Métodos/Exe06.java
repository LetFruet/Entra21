/*George Lucas utiliza  uma  fórmula  para  criar  os  nomes dos  personagens  em  suas  histórias  (Jar  Jar  Binks, ObiWan Kenobi, etc).
A fórmula, supostamente, é:

Seu primeiro nome na série Star Wars:
i.Pegue as três primeiras letras de seu sobrenome
ii.Adicione a ele as duas primeiras letras de seu nome

Seu sobrenome na série Star Wars:
i.Pegue as duas primeiras letras do sobrenome de solteira de sua mãe
ii.Adicione a ele as três primeiras letras do nome da cidade onde você nasceu

Crie um  método chamado generateStarWarsName que  gera  um  nome  completo  Star  Wars  conforme  descrito. Imprima o seu nome Star Wars

As entradas serão os nomes completos. Para separar, por exemplo as três primeiras letras do seu sobrenome, use o  atributo .charAt() das Strings) */
package Lista06_Métodos;
import java.util.Scanner;
public class Exe06 {
    
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.println("Informe o seu nome: ");
        String nome = kb.next();

        System.out.println("Informe o seu sobrenome: ");
        String sobrenome = kb.next();

        System.out.println("Informe o sobrenome de solteira de sua mãe: ");
        String sobrenomeMae = kb.next();

        System.out.println("Informe o nome da cidade em que você nasceu: ");
        String cidade = kb.next();

        generateStarWarsName(nome, sobrenome, sobrenomeMae, cidade);

        kb.close();
    }

    public static void generateStarWarsName(String nome, String sobrenome, String sobrenomeMae, String cidade) {

        System.out.println("Nome: " + sobrenome.charAt(0) + sobrenome.charAt(1) + sobrenome.charAt(2) + nome.charAt(0) + 
                           nome.charAt(1) + "   Sobrenome: " + sobrenomeMae.charAt(0) + sobrenomeMae.charAt(1) + 
                           cidade.charAt(0) + cidade.charAt(1) + cidade.charAt(2)); 
    }
}
