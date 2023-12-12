/*Crie essa matriz:

20	16	0.5
25	19	1
24	25	0.4
28	10	1.2
19	10	1.4
22	20	0.9

A primeira coluna é a idade do atleta
A segunda coluna é a quantidade de jogos que esse atleta jogou
A terceira coluna é a média de gols por partida desse atleta

Determinar:
a) Qual é a média de idade dos atletas?
b) Qual a idade do atleta que mais fez gols?
c) Crie uma segunda matriz que em vez da média de gols por partida mostre quantos gols esse atleta fez essa temporada */
package Lista05_Revisão;
public class Exe19 {
 
    public static void main(String[] args) {
         
        double matriz[][] = {{20, 16,	0.5}, {25,	19,	1}, {24,	25,	0.4}, {28,	10,	1.2}, {19,	10,	1.4}, {22,	20,	0.9}};
        double matrizSecundaria[][] = new double[6][3];
        double somaIdade = 0, mediaIdade = 0, maisGols = Double.MIN_VALUE, idadeMaisGols = 0;
        int cont = 0;


        for (int i = 0; i < matriz.length; i++) {
            somaIdade += matriz[i][0];
            cont++;
        }

        mediaIdade = somaIdade / cont;
        System.out.println("A media de idade dos atletas é: " + mediaIdade);

        for (int i = 0; i < matriz.length; i++) {
            if (maisGols < matriz[i][2]) {
                maisGols = matriz[i][2];
                idadeMaisGols = matriz[i][0];
            }
        }

        System.out.println("A idade do atleta que mais fez gols é: " + idadeMaisGols);

        for (int i = 0; i < matrizSecundaria.length; i++) {
            for (int j = 0; j < matrizSecundaria[i].length; j++) {
                matrizSecundaria[i][0] = matriz[i][0];
                matrizSecundaria[i][1] = matriz[i][1];
                matrizSecundaria[i][2] = matriz[i][1] * matriz[i][2];
                        
                System.out.println("Índice: [" + i + "] [" + j +"] = Gols feitos: " + matrizSecundaria[i][j]);
            }
        }
    }
}
