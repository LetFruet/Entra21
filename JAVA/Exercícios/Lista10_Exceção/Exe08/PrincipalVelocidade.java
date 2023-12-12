package Lista10_Exceção.Exe08;
public class PrincipalVelocidade {
    
    public static void main(String[] args) {
        
        Velocidade v1 = new Velocidade(1, 100);
        Velocidade v2 = new Velocidade(2, 60);
        Velocidade v3 = new Velocidade(3, 70);
        Velocidade v4 = new Velocidade(4, 20);

        for (Velocidade v : Velocidade.listaVelocidades) {
            System.out.println(v.toString());
        }

        v1.acelerar(15);
        v2.reduzir(25);

        System.out.println("\n--- Após reduzir: \n " + v2.toString());
        System.out.println("\n--- Após acelerar: \n " + v1.toString());

    }
}