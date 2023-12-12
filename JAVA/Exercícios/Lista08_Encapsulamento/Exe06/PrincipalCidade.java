package Lista08_Encapsulamento.Exe06;
public class PrincipalCidade {
    
    public static void main(String[] args) {
        
        Cidade gaspar = new Cidade("Gaspar", "SC", 28141, 0, false);
        Cidade indaial = new Cidade("Indaial", "SC", 0, 25844, true);


        System.out.println(indaial);
        System.out.println(gaspar);
    }
}