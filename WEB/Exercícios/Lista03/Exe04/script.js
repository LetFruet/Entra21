//Faça uma pesquisa de satisfação utilizando confirm(). Pergunte ao usuário se ele está satisfeito com o serviço ou produto. 
//Com base na resposta, exiba uma mensagem de agradecimento com alert() ou peça feedback adicional com prompt()

function pesquisaSatisfacao() {

    var agradecimento = confirm("Você está satisfeito com o serviço e/ou produto?");

    if (agradecimento) {
        var feedback = prompt("Gostaria de enviar um feedback opcional?"); 
        alert("Estamos muito agradecidos com a sua satisfação!");
    } else {
        alert("Pedimos desculpa pela sua insatisfação!");
    }
}