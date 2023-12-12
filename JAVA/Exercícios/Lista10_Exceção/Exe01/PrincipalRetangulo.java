package Lista10_Exceção.Exe01;
public class PrincipalRetangulo {
    
    public static void main(String[] args) {
                
        Retangulo r1 = new Retangulo(10, 50);
        Retangulo r2 = new Retangulo(15, 10);
        Retangulo r3 = new Retangulo(55, 100);
        Retangulo r4 = new Retangulo(72, 5);
        Retangulo r5 = new Retangulo(12, 35);
        Retangulo r6 = new Retangulo(16, 22);
        Retangulo r7 = new Retangulo(12, 78);
        Retangulo r8 = new Retangulo(36, 150);
        Retangulo r9 = new Retangulo(2, 2);
        Retangulo r10 = new Retangulo(178, 193);

        Retangulo retArea = null, retPerimetro = null; 
        double maiorArea = Double.MIN_VALUE, maiorPerimetro = Double.MIN_VALUE;

        for (Retangulo r : Retangulo.listaRetangulo) { //quer percorrer a listaRetangulo da classe Retangulo
            if (r.calcularArea() > maiorArea) {
                maiorArea = r.calcularArea();
                retArea = r;
            }
            if (r.calcularPerimetro() > maiorPerimetro) {
                maiorPerimetro = r.calcularPerimetro();
                retPerimetro = r;
            }
        }
        System.out.println("Maior área: " + retArea.calcularArea() + retPerimetro.toString());
        System.out.println("\nMaior perímetro: " + retPerimetro.calcularPerimetro() + retPerimetro.toString());
    }
}