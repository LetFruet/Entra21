package Lista08_Encapsulamento.Exe05;
public class PrincipalMercado {
   
    public static void main(String[] args) {
        
        Mercado unidadeDeBlumenau = new Mercado(1000, 3, 2000, 6);
        Mercado unidadeDeJoinville = new Mercado(5000, 7, 6000, 8);
        Mercado unidadeDeFlorianopolis = new Mercado(10000, 12,7800, 9);

        Mercado vetor[] = {unidadeDeBlumenau, unidadeDeFlorianopolis, unidadeDeJoinville};

        System.out.println(maiorLucroMacas(vetor));
        System.out.println(maiorLucroLaranjas(vetor));
        System.out.println(maiorLucroAno(vetor));
        System.out.println(menorLucroAno(vetor));
        System.out.println(meioTermoLucro(vetor));
        System.out.println(maiorLucroFranquia(vetor));

    }

    public static String maiorLucroMacas(Mercado[] vetor) {

        double maiorLucro = Double.MIN_VALUE;
        int indice = 0;
        String unidade = "";

        for (int i = 0; i < vetor.length; i++) {
            double lucro = vetor[i].getValorMacas() * vetor[i].getVendaMacasAno();
            if (lucro > maiorLucro) {
                maiorLucro = lucro;
                indice = i;
            }
        }
        
        if (indice == 0) {
            unidade = "Blumenau";
        } else if (indice == 1) {
            unidade = "Joinville";
        } else {
            unidade = "Florianopolis";
        }
        return "A unidade de " + unidade + " teve o maior lucro vendendo maças";
    }

    public static String maiorLucroLaranjas(Mercado[] vetor) {

        double maiorLucro = Double.MIN_VALUE;
        int indice = 0;
        String unidade = "";

        for (int i = 0; i < vetor.length; i++) {
            double lucro = vetor[i].getValorLaranjas() * vetor[i].getVendaLaranjaAno();
            if (lucro > maiorLucro) {
                maiorLucro = lucro;
                indice = i;
            }
        }
        
        if (indice == 0) {
            unidade = "Blumenau";
        } else if (indice == 1) {
            unidade = "Joinville";
        } else {
            unidade = "Florianopolis";
        }
        return "A unidade de " + unidade + " teve o maior lucro vendendo laranjas";
    }

    public static String maiorLucroAno(Mercado[] vetor) {

        double maiorLucro = Double.MIN_VALUE;
        int indice = 0;
        String unidade = "";

        for (int i = 0; i < vetor.length; i++) {
            double lucro = (vetor[i].getValorLaranjas() * vetor[i].getVendaLaranjaAno()) + (vetor[i].getValorMacas() * vetor[i].getVendaMacasAno());
            if (lucro > maiorLucro) {
                maiorLucro = lucro;
                indice = i;
            }
        }
        
        if (indice == 0) {
            unidade = "Blumenau";
        } else if (indice == 1) {
            unidade = "Joinville";
        } else {
            unidade = "Florianopolis";
        }
        return "A unidade de " + unidade + " teve o maior lucro nas vendas desse ano";
    }
    
    public static String menorLucroAno(Mercado[] vetor) {

        double menorLucro = Double.MAX_VALUE;
        int indice = 0;
        String unidade = "";

        for (int i = 0; i < vetor.length; i++) {
            double lucro = (vetor[i].getValorLaranjas() * vetor[i].getVendaLaranjaAno()) + (vetor[i].getValorMacas() * vetor[i].getVendaMacasAno());
            if (lucro < menorLucro) {
                menorLucro = lucro;
                indice = i;
            }
        }
        
        if (indice == 0) {
            unidade = "Blumenau";
        } else if (indice == 1) {
            unidade = "Joinville";
        } else {
            unidade = "Florianopolis";
        }
        return "A unidade de " + unidade + " teve o menor lucro nas vendas desse ano";
    }

    public static String meioTermoLucro(Mercado[] vetor) {

        double maiorLucro = Double.MIN_VALUE, menorLucro = Double.MAX_VALUE;
        int maiorIndice = 0, menorIndice = 0;
        String unidade = "";

        for(int i = 0; i < vetor.length; i++){
            double lucro = (vetor[i].getValorMacas() * vetor[i].getVendaMacasAno()) + (vetor[i].getValorLaranjas() * vetor[i].getVendaLaranjaAno());
                if (lucro > maiorLucro){
                    maiorLucro = lucro;
                    maiorIndice = i;
                }
                if (lucro < menorLucro){
                    menorLucro = lucro;
                    menorIndice = i;
                }
        }
       
        if ((maiorIndice == 0 && menorIndice == 1) || (maiorIndice == 1 && menorIndice == 0)){
            unidade = "Florianopolis";
        } else if ((maiorIndice == 0 && menorIndice == 2) || (maiorIndice == 2 && menorIndice == 0)){
            unidade = "Joinville";
        } else {
            unidade = "Blumenau";
        }

        return "A unidade de " + unidade + " ficou no \"meio\" termo em lucro";
    }

    public static String maiorLucroFranquia(Mercado[] vetor) {

        double lucroLaranja = 0, lucroMaca = 0;
        for (int i = 0; i < vetor.length; i++) {
            lucroLaranja += (vetor[i].getValorLaranjas() * vetor[i].getVendaLaranjaAno());
            lucroMaca += (vetor[i].getValorMacas() * vetor[i].getVendaMacasAno());
        }
            
        if (lucroLaranja > lucroMaca) {
            return "A franquia teve mais lucro vendendo laranjas";
        } else {
            return "A franquia teve mais lucro vendendo maças";
        }
        
    }
}

