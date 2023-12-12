package Lista10_Exceção.Exe03;
public class PrincipalFloricultura {
    
    public static void main(String[] args) {
        
        Floricultura f1 = new Floricultura("Margarida", 10, "Letícia", false);
        Floricultura f2 = new Floricultura("Rosa", 25, "Lucas", true);
        Floricultura f3 = new Floricultura("Violeta", 19, "Ingrid", false);
        Floricultura f4 = new Floricultura("Tulipa", 21, "Mônica", true);

        for (Floricultura f : Floricultura.listaFlores) {
            System.out.println(f.toString());
        }
        
        System.out.println(verificarCompradorFlorMaisCara());
        System.out.println(verificarFlorMaisCara());
    }

    public static String verificarCompradorFlorMaisCara() {
        double maisCara = Double.MIN_VALUE; 

        String dados = "";
        for (Floricultura f : Floricultura.listaFlores) {
            if(f.getValorFlor() > maisCara) {
                maisCara = f.getValorFlor();
                dados = "\nA flor mais cara foi comprada por " + f.getNomeCliente();
            }
        }
        return dados;
    }

    public static String verificarFlorMaisCara() {
        double maisCara = Double.MIN_VALUE; 

        String dados = "";
        for (Floricultura f : Floricultura.listaFlores) {
            if(f.getValorFlor() > maisCara) {
                maisCara = f.getValorFlor();
                dados = "A flor mais cara comprada foi " + f.getNomeFlor();
            }
        }
        return dados;
    }
}
