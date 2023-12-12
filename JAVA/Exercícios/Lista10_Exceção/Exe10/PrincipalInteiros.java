package Lista10_Exceção.Exe10;

public class PrincipalInteiros {
 
    public static void main(String[] args) {
        
        InteirosPositivos p1 = new InteirosPositivos(2);
        InteirosPositivos p2 = new InteirosPositivos(5);
        InteirosPositivos p3 = new InteirosPositivos(70);
        InteirosPositivos p4 = new InteirosPositivos(20);
        InteirosPositivos p5 = new InteirosPositivos(12);

        for (InteirosPositivos i : InteirosPositivos.listaInteirosPositivos) {
            System.out.println("\n ----- " + i.toString());
            System.out.println(i.identificarDivisores());
            System.out.println(i.calcularFatorial());
            System.out.println(i.calcularFibonacci());
        }  
    }
}
