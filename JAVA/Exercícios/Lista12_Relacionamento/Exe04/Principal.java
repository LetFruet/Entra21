package Lista12_Relacionamento.Exe04;

public class Principal {
    
    public static void main(String[] args) {
        
        Funcionario f1 = new Funcionario("Paulo", "123", 1, 5000.00);
        Funcionario f2 = new Funcionario("Ana", "234", 2, 3000.00);
        Funcionario f3 = new Funcionario("Guilherme", "456", 3, 7000.00);
        Funcionario f4 = new Funcionario("Joana", "567", 1, 10000.00);

        Setor s1 = new Setor();
        s1.adicionarFuncionario(f1);
        s1.adicionarFuncionario(f2);
        s1.adicionarFuncionario(f3);
        s1.adicionarFuncionario(f4);

        System.out.println(s1.toString());
        System.out.println("Total da folha de pagamento do setor: " + s1.totalFolhaDePagamentoSetor());
        System.out.println("Total da folha de pagamento do departamento: " + s1.totalFolhaDePagamentoDepto(1));
        System.out.println("Funcionário com maior salário: " + s1.funcionarioMaiorSalario());
        System.out.println(s1.acharFuncionario("Leticia", "123"));
        System.out.println(s1.acharFuncionario("Paulo", "123"));
    }
}
