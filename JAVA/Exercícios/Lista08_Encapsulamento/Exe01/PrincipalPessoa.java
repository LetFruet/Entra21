package Lista08_Encapsulamento.Exe01;
public class PrincipalPessoa {
   
    public static void main(String[] args) {
        
        //criando os objetos do tipo Pessoa 
        Pessoa p1 = new Pessoa();
        p1.nome = "Letícia";
        p1.sexo = 'F';
        p1.dataNascimento = "28/09/2004";
        p1.estadoCivil = "Solteira";

        Pessoa p2 = new Pessoa();
        p2.nome = "Lucas";
        p2.sexo = 'M';
        p2.dataNascimento = "02/11/1994";
        p2.estadoCivil = "Casado";

        //printando os objetos
        //chamando p1 para identificar a pessoa 1 e p2 para identificar a pessoa 2
        System.out.println("Nome: " + p1.nome + "\nSexo: " + p1.sexo + "\nData de nascimento: " + p1.dataNascimento + "Estado civil: " + p1.estadoCivil);
        System.out.println();
        System.out.println("Nome: " + p2.nome + "\nSexo: " + p2.sexo + "\nData de nascimento: " + p2.dataNascimento + "Estado civil: " + p2.estadoCivil);

    }
}
