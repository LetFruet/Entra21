package Lista10_Exceção.Exe07;

public class PrincipalConta {
    
    public static void main(String[] args) {
        
        Conta c1 = new Conta("Letícia", 5000.0);
        Conta c2 = new Conta("Luana", 1000.0);
        Conta c3 = new Conta("Nicolas", 500.0);
        Conta c4 = new Conta("José", 8720.0);
        Conta c5 = new Conta("Vinicius", 6300.0);

        System.out.println(c1.depositarDinheiro(1000));
        System.out.println();
        System.out.println(c2.sacarDinheiro(240));
        System.out.println();
        System.out.println(c3.sacarDinheiro(700));
        System.out.println();
        System.out.println(c4.tranferirDinheiro(c5, 720));
        System.out.println();

        for (Conta c : Conta.listaContas) {
            System.out.println(c.toString());
        }
    }
}
