/*O índice de massa corporal (IMC) é uma medida internacional usada para calcular se um pessoa está no peso ideal.
O IMC é determinado pela divisão da massa do indivíduo pelo quadrado de sua altura, onde a massa está em quilogramas e a altura 
está em metros, de acordo com a fórmula:     IMC = Massa / Altura²
Faça um algoritmo para classificar o IMC e dizer o grau de obesidade do indivíduo, de acordo com a seguinte tabela:

< 18.5 Magreza
18.5 – 24.9 Saudável
25.0 – 29.9 Sobrepeso
30.0 – 34.9 Obesidade Grau I
35.0 – 39.9 Obesidade Grau II (severa)
> 40.0 Obesidade Grau III (morbida)*/
package Lista05_Revisão;
import java.util.Scanner;
public class Exe01 {

    public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		System.out.print("Informe a altura em metros: ");
		float altura = kb.nextFloat();
		
		System.out.println("Informe o peso em quilogramas: ");
		float peso = kb.nextFloat();
		
		float IMC = peso / (altura * altura);
		
		if ( IMC < 18.5) {
			System.out.println("Magreza");
		} else if (IMC > 18.5 && IMC < 24.9) {
			System.out.println("Saudável");
		} else if (IMC > 25 && IMC < 29.9) {
			System.out.println("Sobrepeso");
		} else if (IMC > 30 && IMC < 34.9) {
			System.out.println("Obesidade Grau I");
		} else if (IMC > 35 && IMC < 39.9) {
			System.out.println("Obesidade Grau II (severa)");
		} else if (IMC > 40) {
			System.out.println("Obesidade Grau III (morbida)");
		}

		kb.close(); 
	}
}