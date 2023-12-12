package Lista12_Relacionamento.Exe03;
public class Principal {
    
    public static void main(String[] args) {
        
        Pais p1 = new Pais("Brasil", 210.999);
        Pais p2 = new Pais("Argentina", 129.825);
        Pais p3 = new Pais("Chile", 85.623);
        Pais p4 = new Pais("Uruguai", 79.652);
        Pais p5 = new Pais("Paraguai", 198.220);
        Pais p6 = new Pais("Bolivia", 201.356);

        Continente c1 = new Continente();
        c1.adicionarPais(p1);
        c1.adicionarPais(p2);
        c1.adicionarPais(p3);
        c1.adicionarPais(p4);
        c1.adicionarPais(p5);
        c1.adicionarPais(p6);

        p1.adicionarFronteira(p2);
        p1.adicionarFronteira(p4);
        p1.adicionarFronteira(p5);
        
        p2.adicionarFronteira(p1);
        p2.adicionarFronteira(p4);
        p2.adicionarFronteira(p5);

        p4.adicionarFronteira(p1);
        p4.adicionarFronteira(p2);
        p4.adicionarFronteira(p5);

        p5.adicionarFronteira(p1);
        p5.adicionarFronteira(p2);
        p5.adicionarFronteira(p4);

        System.out.println(c1.toString());
        System.out.println("\nFronteiras comuns: " + p1.fronteirasIguais(p2));
    }
}
