//Crie essa matriz:

//2104	3	399900 -
//1600	3	329900 -
//2400	3	369000 -
//1416	2	232000 -
//3000	4	539900 -
//1985	4	299900 -
//1534	3	314900 -
//1427	3	199000 -
//1380	3	212000 -
//1494	3	242500 -
//1940	4	240000 -
//2000	3	347000 -
//1890	3	330000 -
//4478	5	699900 -
//1268	3	259900 -
//A primeira coluna é o tamanho da casa. A segunda coluna é a quantidade de quartos. A terceira coluna é o preço
//Determinar:
//a) Qual é a média dos preços das casas?
//b) Quanto custa a menor casa? E quantos quartos tem a casa mais cara?
//c) Qual a diferença de tamanho da casa com o maior número de quartos para a casa com o menor número de quartos?
//d) Qual a média do tamanho das casas que custam mais de 300.000 mil? 
package Lista04_Matriz;
import java.text.DecimalFormat;
public class Exe05 {
    
    public static void main(String[] args) {
        DecimalFormat df_2 = new DecimalFormat();

        double somaValores = 0, casasAcima300 = 0;
        int contcasasAcima300 = 0, menorCasa = 0, casaMaisCara = 0, maisQuartos = 0, menosQuartos = 0;

        int matriz[][] = {{2104, 3, 399900}, {1600, 3, 329900}, {2400,	3,	369000}, {1416,	2, 232000}, {3000,	4,	539900},
                          {1985,	4,	299900}, {1534,	3,	314900}, {1427,	3,	199000}, {1380,	3,	212000}, {1494,	3,	242500}, 
                          {1940,	4,	240000}, {2000,	3,	347000}, {1890,	3,	330000}, {4478,	5,	699900}, {1268,	3,	259900}};
                          
        /*int matriz[][] = new int[15][3];*/
        /*matriz[0][0] = 2104;
        matriz[0][1] = 3;
        matriz[0][2] = 399900;
        matriz[1][0] = 1600;
        matriz[1][1] = 3;
        matriz[1][2] = 329900;
        matriz[2][0] = 2400;
        matriz[2][1] = 3;
        matriz[2][2] = 369000;
        matriz[3][0] = 1416;
        matriz[3][1] = 2;
        matriz[3][2] = 232000;
        matriz[4][0] = 3000;
        matriz[4][1] = 4;
        matriz[4][2] = 539900;
        matriz[5][0] = 1985; 
        matriz[5][1] = 4;
        matriz[5][2] = 299900;
        matriz[6][0] = 1534;
        matriz[6][1] = 3;
        matriz[6][2] = 314900; 
        matriz[7][0] = 1427;
        matriz[7][1] = 3;
        matriz[7][2] = 199000; 
        matriz[8][0] = 1380;
        matriz[8][1] = 3;
        matriz[8][2] = 212000;
        matriz[9][0] = 1494;
        matriz[9][1] = 3;
        matriz[9][2] = 242500;
        matriz[10][0] = 1940;
        matriz[10][1] = 4;
        matriz[10][2] = 240000;
        matriz[11][0] = 2000;
        matriz[11][1] = 3;
        matriz[11][2] = 347000;
        matriz[12][0] = 1890;
        matriz[12][1] = 3;
        matriz[12][2] = 330000;
        matriz[13][0] = 4478;
        matriz[13][1] = 5;
        matriz[13][2] = 699900;
        matriz[14][0] = 1268;
        matriz[14][1] = 3;
        matriz[14][2] = 259900;*/



       for (int i = 0; i < matriz.length; i++) {
            somaValores += matriz[i][2];
            
            if (matriz[i][0] < matriz[menorCasa][0]) {
                menorCasa = i;
            }
            if (matriz[i][2] > matriz[casaMaisCara][2]) {
                casaMaisCara = i;
            }
            if (matriz[i][1] > matriz[maisQuartos][1]) {
                maisQuartos = i;
            }
            if (matriz[i][1] < matriz[menosQuartos][1]) {
                menosQuartos = i;
            }
            if (matriz[i][2] > 300000) {
                casasAcima300 += matriz[i][0];
                contcasasAcima300++;
            }
        }

        System.out.println("A média dos preços das casas é: R$" + df_2.format(somaValores / matriz.length));
        System.out.println("A menor casa custa: R$ " + df_2.format(matriz[menorCasa][2]) + ". A casa mais cara possui " + df_2.format(matriz[casaMaisCara][1]) + " quartos.");
        System.out.println("A diferença de tamanho entre a casa com mais quartos e a casa com menos quartos é: " + df_2.format(matriz[maisQuartos][0] - matriz[menosQuartos][0]) + " m².");
        System.out.println("A média do tamanho das casas que custam mais de R$300.000 é: " + df_2.format(casasAcima300 / contcasasAcima300) + " m².");
    }
}





