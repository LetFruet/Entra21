package Lista08_Encapsulamento.Exe07;
public class PrincipalAeronave {
 
    public static void main(String[] args) {
        
        Aeronave a1 = new Aeronave(100, 550, 10, 10000);
        Aeronave a2 = new Aeronave(250, 700, 50, 60000);
        Aeronave a3 = new Aeronave(800, 950, 90, 90000);

        Aeronave vetor[] = {a1, a2, a3};

        System.out.println(calcularTempoVoo(vetor));
        System.out.println(calcularNumeroPassageiros(vetor));
        System.out.println(calcularDistanciaVoo(vetor));
    }

    public static String calcularTempoVoo(Aeronave vetor[]) {

        double maiorTempoVoo = Double.MIN_VALUE, tempoVoo = 0;
        String resposta = "";

        for (int i = 0; i < vetor.length; i++) {
            tempoVoo = vetor[i].getCapacidadeDeCombustivel() / vetor[i].getQueimaDeCombustivel();
            if (tempoVoo > maiorTempoVoo) {
                maiorTempoVoo = i;
            }
        }
   
        if ((maiorTempoVoo == 0)) {
            resposta = "aeronave 1";
        } else if ((maiorTempoVoo == 1)) {
            resposta = "aeronave 2";
        } else {
            resposta = "aeronave 3";
        }

        return "A " + resposta + " pode ficar mais tempo no ar";
    }

    public static String calcularNumeroPassageiros(Aeronave vetor[]) {

        double numeroPassageiros = Double.MIN_VALUE;
        String resposta = "";

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i].getPassageiros() > numeroPassageiros){
                numeroPassageiros = i;
            }
        }

        if ((numeroPassageiros == 0)) {
            resposta = "aeronave 1";
        } else if ((numeroPassageiros == 1)) {
            resposta = "aeronave 2";
        } else {
            resposta = "aeronave 3";
        }

        return "A " + resposta + " leva o maior número de passageiros";
    }

    public static String calcularDistanciaVoo(Aeronave vetor[]) {

        double maiorDistanciaVoo = Double.MIN_VALUE, distanciaVoo = 0;
        String resposta = "";

        for (int i = 0; i < vetor.length; i++) {
            distanciaVoo = vetor[i].getVelocidadeMaxima() / (vetor[i].getCapacidadeDeCombustivel() / vetor[i].getQueimaDeCombustivel());
            if (distanciaVoo > maiorDistanciaVoo) {
                maiorDistanciaVoo = i;
            }
        }
   
        if ((maiorDistanciaVoo == 0)) {
            resposta = "aeronave 1";
        } else if ((maiorDistanciaVoo == 1)) {
            resposta = "aeronave 2";
        } else {
            resposta = "aeronave 3";
        }

        return "A " + resposta + " consegue voar mais longe";
    }
}