package Lista10_Exceção.Exe12;

public class PrincipalLaboratorio {
    public static void main(String[] args) {
        Laboratorio[] computadores = {
            new Laboratorio("SN001", "Intel Core i7-13700KF", 5.4, 512, 16, 500, 850),
            new Laboratorio("SN002", "AMD Ryzen 9 5950X", 4.9, 1000, 32, 500, 1000),
            new Laboratorio("SN003", "Intel Core i5-9400F", 4.1, 256, 8, 400, 600),
            new Laboratorio("SN004", "AMD Ryzen 7 3700X", 4.4, 512, 16, 450, 550)
        };

        System.out.println("Armazenamento total: " + Laboratorio.armazenamentoTotal(computadores) + " GB");
        System.out.println("Potência total necessária: " + Laboratorio.potenciaTotal(computadores) + "W");
        System.out.println("Gasto de energia elétrica diário: R$" + Laboratorio.gastoEnergiaEletrica(computadores));
    }
}