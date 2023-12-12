package Prova3.LeticiaFruet;

public class LeticiaFruet_2 {
    
    public static void main(String[] args) {
        
        Carro c1 = new Carro("Gol", "VW", "MMM001", "Preta", 2009, 1, 25000);
        Carro c2 = new Carro("Fox", "VW", "LML002", "Vermelha", 2010, 2,30000);
        Carro c3 = new Carro("Uno", "Fiat", "MLM003", "Cinza", 2011, 3, 32000);
        Carro c4 = new Carro("Fiesta", "Ford", "LLL004", "Branca", 2009, 1, 29000);
        Carro c5 = new Carro("Palio", "Fiat", "KKK345", "Amarelo", 2011, 1,26000);

        System.out.println(verificarMaisCaro(2009));
        System.out.println("\n--------------------");
        System.out.println(valoresEntreXY("VW", 24000, 29000));
        System.out.println("\n--------------------");
        System.out.println(verificarLocal(1));
        System.out.println("\n--------------------");
        System.out.println(calcularDepreciacao(2023, 20000));
    }

    public static String verificarMaisCaro(int ano) {
        double maiorPreco = Double.MIN_VALUE; 
        String str = "";

        for (Carro c : Carro.listaCarros) {
            if (c.getAno() == ano) {
                if (c.getPreco() > maiorPreco) {
                    maiorPreco = c.getPreco();
                    str = "O carro mais caro de " + ano + " é: \n" + c.toString();
                } else if (c.getPreco() == maiorPreco) {
                    str += c.toString();
                }
            }
        }
        return str;
    }

    public static String valoresEntreXY(String marcaEscolhida, double menorPreco, double maiorPreco) {
        String str = "";

        for (Carro c : Carro.listaCarros) {
            if (c.getMarca() == marcaEscolhida) {
                if (c.getPreco() < maiorPreco && c.getPreco() > menorPreco) {
                    str = "Os carros da marca " + marcaEscolhida + " entre R$ " + menorPreco + " e R$ " + maiorPreco + " são: \n" +
                           c.toString();
                }
            }
        }
        return str;
    }

    public static String verificarLocal(int local) {
        double maiorPreco = Double.MIN_VALUE, menorPreco = Double.MAX_VALUE;
        String str = "";

        for (Carro c : Carro.listaCarros) {
            if (c.getLocalizacao() == local) {
                if (c.getPreco() > maiorPreco) {
                    maiorPreco = c.getPreco();
                    str = "O carro mais caro da localização " + local + " é: \n" + c.toString() + "\n";
                } else if (c.getPreco() == maiorPreco) {
                    maiorPreco = c.getPreco();
                    str += c.toString();
                } else if (c.getPreco() < menorPreco) {
                    menorPreco = c.getPreco();
                    str += "\nO carro mais barato da localização " + local + " é: \n" + c.toString();
                } else if (c.getPreco() == menorPreco) {
                    menorPreco = c.getPreco();
                    str += c.toString();
                }
            }
        }
        return str;
    }

    public static String calcularDepreciacao(int ano, double valor) {
        double depreciacao = 0;

        for (Carro c : Carro.listaCarros) {
            if (ano < 2010) {
                depreciacao = valor * 0.07;
            } else if (ano >= 2010) {
                depreciacao = valor * 0.05;
            }
        }
        return "A depreciação do carro foi de R$ " + depreciacao;
    }
}