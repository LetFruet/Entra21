package Lista10_Exceção.Exe04;

public class PrincipalEmpregado {
    
    public static void main(String[] args) {
        
        Empregado e1 = new Empregado(123, "Letícia", "Fruet", 1500);
        Empregado e2 = new Empregado(234, "Eliani", "Fruet", 7000);
        Empregado e3 = new Empregado(345, "Mauro", "Fruet", 5000);
        Empregado e4 = new Empregado(567, "Nathan", "Vahldieck", 2600);
        Empregado maiorSalario = verificarMaiorSalario();

        for (Empregado e : Empregado.listaEmpregado) {
            System.out.println("Funcionário: " + e.verificarNomeCompleto() + "\t| Salario anual: " + e.calcularSalarioAnual() +
                               "\t| Aumento mensal: " + e.modificarSalario(50));
        }

        System.out.print("\n\n-- Funcionário com maior salário:" + maiorSalario.toString());
    }

    public static Empregado verificarMaiorSalario() {
        double maiorSalario = Double.MIN_VALUE; 

        Empregado empregadoComMaiorSalario = null;

        for (Empregado e : Empregado.listaEmpregado) {
            if (e.getSalario() > maiorSalario) {
                maiorSalario = e.getSalario();
                empregadoComMaiorSalario = e;
            }
        }
        return empregadoComMaiorSalario;
    }
}
