package Lista08_Encapsulamento.Exe04;
public class PrincipalCirculo {
    
    public static void main(String[] args) {
        
        Circulo c1 = new Circulo();
        c1.raio = 5;

        Circulo c2 = new Circulo();
        c2.raio = 10;

        Circulo c3 = new Circulo();
        c3.raio = 15;

        Circulo c4 = new Circulo();
        c3.raio = 20;

        Circulo c5 = new Circulo();
        c3.raio = 25;

        System.out.println("A área do circulo 1 é de " + c1.calcularArea() + " m2");
        System.out.println("A área do circulo 2 é de " + c2.calcularArea() + " m2");
        System.out.println("A área do circulo 3 é de " + c3.calcularArea() + " m2");
        System.out.println("A área do circulo 4 é de " + c4.calcularArea() + " m2");
        System.out.println("A área do circulo 5 é de " + c5.calcularArea() + " m2");

    }
}
