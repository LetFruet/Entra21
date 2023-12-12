package Lista10_Exceção.Exe06;

public class PrincipalPizzaria {
   
    public static void main(String[] args) {
        
        Pizzaria p1 = new Pizzaria("4 queijos", "Gorgonzola", null, "Parmesão", true, 20, 72);
        Pizzaria p2 = new Pizzaria("Frango", "Frango", "Queijo", "Manjericão", false, 25, 85);
        Pizzaria p3 = new Pizzaria("Bacon", "Bacon", "Queijo", "Molho de tomate", true, 20, 72);
        Pizzaria p4 = new Pizzaria("Chocolate", "Queijo", "Chocolate", "Confete", true, 15, 65);
        Pizzaria p5 = new Pizzaria("Milho", "Milho", "Queijo", "Orégano", false, 15, 65);

        double maiorValor = Double.MIN_VALUE;
        String melhorCustoBeneficio = "";
        for (Pizzaria p : Pizzaria.listaPizzas) {
            if (p.valorPorArea() > maiorValor) {
                maiorValor = p.valorPorArea();
                melhorCustoBeneficio = p.getNome();
            }
        }

        System.out.println("A pizza mais barata por área é de " + melhorCustoBeneficio.toString());

        p1.modificaIngrediente("Requeijão");
        p3.modificaIngrediente("Barbecue");

        for (Pizzaria p : Pizzaria.listaPizzas) {
            System.out.println(p.toString());
        }
    }
}