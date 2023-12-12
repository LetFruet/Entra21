package Trabalho1;
public class Main {

    public static void main(String[] args) {

        Endereco endereco = new Endereco("Curt Hering", 60, "Centro", " 89010-030", "SC");

        Restaurante restaurante = new Restaurante("Aikau Poke", "Havaiano", endereco, "47988457899", "Segunda a Sabado - 18h às 22h");

        Entrada entrada1 = new Entrada(1, "Croquete de Costela", 27, 15, 1);
        entrada1.adicionarIngrediente("Costela");
        entrada1.adicionarIngrediente("Aipim");
        entrada1.adicionarIngrediente("Molho Barbecue");

        Entrada entrada2 = new Entrada(2, "Salmon Tartare", 50, 10, 2);
        entrada2.adicionarIngrediente("Salmão");
        entrada2.adicionarIngrediente("Torrada");
        entrada2.adicionarIngrediente("Abacate");
        entrada2.adicionarIngrediente("Molho Havaiano");

        Entrada entrada3 = new Entrada(3, "Batata frita", 32, 20, 1);
        entrada3.adicionarIngrediente("Batata");
        entrada3.adicionarIngrediente("Bacon");
        entrada3.adicionarIngrediente("Molho Barbecue");

        PratoPrincipal pp1 = new PratoPrincipal(4, "Poke com salmão grelhado", 62, 35, 1);
        pp1.adicionarIngrediente("Salmão");
        pp1.adicionarIngrediente("Manga");
        pp1.adicionarIngrediente("Pepino");
        pp1.adicionarIngrediente("Arroz");
        pp1.adicionarIngrediente("Abacate");

        PratoPrincipal pp2 = new PratoPrincipal(5, "Chicken Katsu", 36, 35, 1);
        pp2.adicionarIngrediente("Frango");
        pp2.adicionarIngrediente("Manga");
        pp2.adicionarIngrediente("Pepino");
        pp2.adicionarIngrediente("Arroz");
        pp2.adicionarIngrediente("Repolho");

        PratoPrincipal pp3 = new PratoPrincipal(6, "Sanduiche de Porco", 46, 30, 2);
        pp3.adicionarIngrediente("Costelinha de porco");
        pp3.adicionarIngrediente("Molho barbecue");
        pp3.adicionarIngrediente("Cream Cheese");
        pp3.adicionarIngrediente("Pepino");
        pp3.adicionarIngrediente("Abacaxi");

        Bebida bebida1 = new Bebida(7, "Aperol Spritz", 29, 400, true);
        bebida1.adicionarIngrediente("Aperol Italiano");
        bebida1.adicionarIngrediente("Espumante");
        bebida1.adicionarIngrediente("Laranja");
        bebida1.adicionarIngrediente("Agua gaseificada");
        bebida1.adicionarIngrediente("Gelo");

        Bebida bebida2 = new Bebida(8, "Caipiroska de Limão", 19, 400, true);
        bebida2.adicionarIngrediente("Vodka");
        bebida2.adicionarIngrediente("Limão");
        bebida2.adicionarIngrediente("Acucar");
        bebida2.adicionarIngrediente("Gelo");

        Bebida bebida3 = new Bebida(9, "Soda italiana", 15, 500, false);
        bebida3.adicionarIngrediente("Licor de maça verde");
        bebida3.adicionarIngrediente("Agua gaseificada");
        bebida3.adicionarIngrediente("Gelo");

        restaurante.adicionarItem(entrada1);
        restaurante.adicionarItem(entrada2);
        restaurante.adicionarItem(entrada3);
        restaurante.adicionarItem(pp1);
        restaurante.adicionarItem(pp2);
        restaurante.adicionarItem(pp3);
        restaurante.adicionarItem(bebida1);
        restaurante.adicionarItem(bebida2);
        restaurante.adicionarItem(bebida3);

        Cliente cliente1 = new Cliente("Maria", 17);
        Cliente cliente2 = new Cliente("José", 25);

        Pedido pedido1 = new Pedido(1, cliente1);
        Pedido pedido2 = new Pedido(2, cliente2);

        /*   
        System.out.println(entrada1);
        System.out.println(pp1);
        System.out.println(bebida1);
        System.out.println(bebida1.calcularDesconto());
        System.out.println(restaurante);
        System.out.println(restaurante.imprimirCardapio()); 

        // Testando editarEntrada
        System.out.println(entrada1);
        entrada1.editarEntrada("Batata", "Aipim");
        System.out.println(entrada1); 
        
        // Testando adicionarAlcool
        System.out.println(bebida3);
        bebida3.adicionarAlcool(pedido2);
        System.out.println(bebida3); 

        // Testando removerIngredientes
        System.out.println(pp1);
        pp1.removerIngrediente("Pepino");
        System.out.println(pp1); 
        
        // Testando verificarMaiorIdade
        System.out.println(pedido1.verificarMaiorIdade());
        System.out.println(pedido2.verificarMaiorIdade());

        // Testando adicionarItem
        System.out.println(pedido1);
        pedido1.adicionarItemPedido(bebida3);
        pedido1.adicionarItemPedido(entrada1);
        pedido1.adicionarItemPedido(pp1);
        System.out.println(pedido1); 

        // Testando removerItem
        pedido1.adicionarItemPedido(entrada1);
        pedido1.adicionarItemPedido(pp1);
        pedido1.adicionarItemPedido(bebida3);
        System.out.println(pedido1);
        pedido1.removerItemPedido(4);
        System.out.println(pedido1); 
        
        // Testando atualizarNomeItemPedido
        pedido1.adicionarItemPedido(pp1);
        System.out.println(pedido1);
        pedido1.atualizarNomeItemPedido(4, "Poke com salmao");
        System.out.println(pedido1); 
        
        // Testando imprimirItemPedido
        pedido1.adicionarItemPedido(pp1);
        System.out.println(pedido1.imprimirItemPedido(4));
        */
    }
}