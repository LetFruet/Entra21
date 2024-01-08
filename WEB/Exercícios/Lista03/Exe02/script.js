//Uma pessoa foi até uma casa de câmbio trocar dólares por reais. Para isto ela entregou um valor em dólares para o atendente. 
//Calcule quantos reais o atendente deve devolver para a pessoa.

function calcularCambio() {
    var a = parseInt(document.getElementById('a').value); //RECEBENDO OS VALORES
    var b = parseInt(document.getElementById('b').value);

    var resultado = (a * b);

    //exibindo o resultado no HTML
    document.getElementById('resultado').innerHTML = 'Valor a ser devolvido em reais: ' + resultado;
}