//Dados dois valores inteiros, escreva um algoritmo que informe se eles são múltiplos ou não.

function verificarMultiplos() {
    var a = parseInt(document.getElementById('a').value);
    var b = parseInt(document.getElementById('b').value);

    if (a % b == 0 || b %a == 0) {
        document.getElementById('resultado').innerHTML = a + ' e ' + b + ' são múltiplos';
    } else {
        document.getElementById('resultado').innerHTML = a + ' e ' + b + ' não são múltiplos';
    }
}