//Crie um programa que pergunte ao usuário se ele deseja pedir uma pizza usando confirm(). Se o usuário confirmar, 
//solicite seu sabor de pizza favorito através de prompt() e, em seguida, exiba uma mensagem de confirmação com alert().

function pedirPizza() {

    var querPedirPizza = confirm("Você deseja pedir uma pizza?");

    if (querPedirPizza) {
        var saborPizza = prompt("Qual é o seu sabor de pizza favorito?");
        alert("Pedido confirmado!\nVocê pediu uma pizza de " + saborPizza + ".");
    } else {
        alert("Pedido cancelado. Se tiver fome mais tarde, sinta-se à vontade para pedir!");
    }
}