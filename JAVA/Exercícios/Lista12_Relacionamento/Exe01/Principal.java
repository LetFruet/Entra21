package Lista12_Relacionamento.Exe01;
public class Principal {
    
    public static void main(String[] args) {
        
        Pais p1 = new Pais("Brasil", 210.999);
        Pais p2 = new Pais("Argentina", 129.825);
        Pais p3 = new Pais("Chile", 85.623);

        Continente c1 = new Continente();
        c1.adicionarPais(p1);
        c1.adicionarPais(p2);
        c1.adicionarPais(p3);

        System.out.println(c1.toString());

        System.out.println("\nMaior país: " + c1.maiorPais());
    }
}
