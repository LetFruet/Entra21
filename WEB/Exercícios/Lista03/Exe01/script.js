//Leia quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto de A e B pelo produto de C e D.

function calcularDiferenca() {
    var a = parseInt(document.getElementById('a').value); //RECEBENDO OS VALORES
    var b = parseInt(document.getElementById('b').value);
    var c = parseInt(document.getElementById('c').value);
    var d = parseInt(document.getElementById('d').value);

    var resultado = (a * b) - (c * d);
    
    //exibindo o resultado no HTML
    //utilizando o id criando no html 
    document.getElementById('resultado').innerHTML = 'Diferença: ' + resultado;
}