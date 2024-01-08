//Dados dois números inteiros distintos descreva um algoritmo para informar o maior valor entre eles.

function verificarMaiorNumero() {
    var a = parseInt(document.getElementById('a').value);
    var b = parseInt(document.getElementById('b').value);

    if (a > b) {
        document.getElementById('resultado').innerHTML = 'O maior número é ' + a;
    } else {
        document.getElementById('resultado').innerHTML = 'O maior número é ' + b;
    }
}