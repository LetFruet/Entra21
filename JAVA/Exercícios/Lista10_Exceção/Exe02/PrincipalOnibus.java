package Lista10_Exceção.Exe02;

public class PrincipalOnibus {
    
    public static void main(String[] args) {
        
        OnibusEscolar onibus01 = new OnibusEscolar(48, 2);
        OnibusEscolar onibus02 = new OnibusEscolar(30, 0);
        OnibusEscolar onibus03 = new OnibusEscolar(50, 1);

        System.out.println(onibus01.removerEstudantes(50));
        System.out.println(onibus01.toString());
        System.out.println();
        System.out.println(onibus02.toString());
        System.out.println();
        System.out.println(onibus03.removerEstudantes(10));
        System.out.println(onibus03.toString());
    }
}