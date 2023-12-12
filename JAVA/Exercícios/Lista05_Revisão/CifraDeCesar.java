package Lista05_Revisão;
import java.util.Scanner;
public class CifraDeCesar {
    
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        Scanner kb2 = new Scanner(System.in);

        System.out.println("Informe: \n1- Cifrar um texto; \n2- Decifrar um texto");
        int escolha = kb.nextInt();

        while (escolha != 1 && escolha != 2) {
                System.out.println("\nEntrada inválida. Informe: \n1- Cifrar um texto; \n2- Decifrar um texto");
                escolha = kb.nextInt();
        }
            if (escolha == 1) {
                System.out.println("Informe o texto a ser cifrado (apenas letras): ");
                String cifrar = kb2.nextLine();

                char vetorCifrar[] = cifrar.toCharArray();

                for (int i = 0; i < vetorCifrar.length; i++) {
                    if (vetorCifrar[i] == 65) {
                        vetorCifrar[i] = 88;
                    } else if (vetorCifrar[i] == 66) {
                        vetorCifrar[i] = 89;
                    } else if (vetorCifrar[i] == 67) {
                        vetorCifrar[i] = 90;
                    } else if (vetorCifrar[i] == 99) {
                        vetorCifrar[i] = 122;
                    } else if (vetorCifrar[i] == 98) {
                        vetorCifrar[i] = 121;
                    } else if (vetorCifrar[i] == 97) {
                        vetorCifrar[i] = 120;
                    } else if (vetorCifrar[i] == ' ') {
                        vetorCifrar[i] = 32;
                    } else if ((vetorCifrar[i] >= 65 && vetorCifrar[i] <= 90) || (vetorCifrar[i] >= 97 && vetorCifrar[i] <= 122)) {
                            vetorCifrar[i] -= 3;
                    }
                    System.out.print(vetorCifrar[i]);
                }
            }

            if (escolha == 2) {
                System.out.println("Informe o texto a ser decifrado (apenas letras): ");
                String decifrar = kb2.nextLine();

                char vetorDecifrar[] = decifrar.toCharArray();                
                
                for (int i = 0; i < vetorDecifrar.length; i++) {
                    if (vetorDecifrar[i] == 90) {
                            vetorDecifrar[i] = 67;
                    } else if (vetorDecifrar[i] == 89) {
                        vetorDecifrar[i] = 66;
                    } else if (vetorDecifrar[i] == 88) {
                        vetorDecifrar[i] = 65;
                    } else if (vetorDecifrar[i] == 122) {
                        vetorDecifrar[i] = 99;
                    } else if (vetorDecifrar[i] == 121) {
                        vetorDecifrar[i] = 98;
                    } else if (vetorDecifrar[i] == 120) {
                        vetorDecifrar[i] = 97;
                    } else if (vetorDecifrar[i] == ' ') {
                        vetorDecifrar[i] = 32; 
                    } else if ((vetorDecifrar[i] >= 65 && vetorDecifrar[i] <= 87) || (vetorDecifrar[i] >= 97 && vetorDecifrar[i] <= 119)) {
                        vetorDecifrar[i] += 3;
                    }
                        System.out.print(vetorDecifrar[i]);
                    }
            } 

        kb.close();
        kb2.close();
    }
}