package Prova3.Simulado3;

public class Principal {
    
    public static void main(String[] args) {
        
        Gerente g1 = new Gerente("Ana");
        Gerente g2 = new Gerente("Marina");
        Gerente g3 = new Gerente("Paulo");

        Cliente c1 = new Cliente("Jorge", 'p', 2022, 2500000, g1);
        Cliente c2 = new Cliente("Luís", 's', 2015, 500000, g1);
        Cliente c3 = new Cliente("Cláudio", 'e', 2017, 250000, g2);
        Cliente c4 = new Cliente("Bruna", 'p', 2005, 5500000, g3);
        Cliente c5 = new Cliente("Ana", 'e', 2023, 240000, g3);

        for (Cliente c : Cliente.listaClientes) {
            System.out.println(c.toString());
        }

        System.out.println(verificarMaiorSaldo());
        System.out.println();
        System.out.println(verificarMaisAntigo(g1));
        System.out.println();
        System.out.println(informacoesClientes(g3));
        System.out.println();
        System.out.println(somarClientes(g3));

    }

    public static String verificarMaiorSaldo() {
        double maiorSaldo = Double.MIN_VALUE;
        String clienteMaiorSaldo = "";

        for (Cliente c : Cliente.listaClientes) {
            if (c.getSaldo() > maiorSaldo) {
                maiorSaldo = c.getSaldo();
            }
        }
        
        for (Cliente c : Cliente.listaClientes) {
            if (c.getSaldo() == maiorSaldo) {
                clienteMaiorSaldo += c.toString() + "\n";
            }
        }
        return "\nO cliente com mais dinheiro no banco é \n" + clienteMaiorSaldo;
    }

    public static String verificarMaisAntigo(Gerente gerente) {
        String clienteMaisAntigo = "";
        int maisAntigo = Integer.MAX_VALUE;

        for (Cliente c : Cliente.listaClientes) {
            if (c.getUmGerente().equals(gerente)) {
                if (c.getAnoCadastro() < maisAntigo) {
                    maisAntigo = c.getAnoCadastro();
                }
            }
        }

        for (Cliente c : Cliente.listaClientes) {
            if (c.getAnoCadastro() == maisAntigo) {
                clienteMaisAntigo = c.getNomeCliente();
            }
        }
        return "O cliente mais antigo do gerente " + gerente.toString() + " é " + clienteMaisAntigo.toString();
    }

    public static String informacoesClientes(Gerente gerente) {
        String clientes = "";

        for (Cliente c : Cliente.listaClientes) {
            if (c.getUmGerente().equals(gerente)) {
                clientes += c.toString();
            }
        }
        return "--- Clientes do gerente : " + gerente.toString() + "\n" + clientes;
    }

    public static String somarClientes(Gerente gerente) {
        int cont = 0;

        for (Cliente c : Cliente.listaClientes) {
            if (c.getUmGerente().equals(gerente)) {
                cont++;
            }
        }
        return "--- A quantidade de clientes do gerente " + gerente.toString() + " é " + cont;
    }
}