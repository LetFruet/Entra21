package Lista10_Exceção.Exe11;
public class Principal {
    
    public static void main(String[] args) {
        
        Pessoa p1 = new Pessoa(null, new Endereco("Rua A", "Apto", 123));
        Pessoa p2 = new Pessoa("Maria", new Endereco("Rua B", "Apto", 456));
        Pessoa p3 = new Pessoa("Pedro", new Endereco("Rua C", "Casa", 789));

        for (Pessoa p : Pessoa.listaPessoa) {
            System.out.println(p.toString());
    
        }
    }
}
