let contadorBotao2 = 1;
let contadorBotao3 = 0;

function aoClicar1() {
    document.getElementById("botao1").innerHTML = "Hello world";
}
function aoClicar2() {

    document.getElementById("botao2").innerHTML = contadorBotao2;
    contadorBotao2++;
}


function aoClicar3() {
    document.getElementById("botao3").innerHTML = "Três";

    if (contadorBotao3 % 2 == 0) {
        document.getElementById("botao3").style.color = "white";
       /* document.getElementById("botao3").innerHTML = ""; */

    } else {
        document.getElementById("botao3").style.color = "darkgreen";
       /* document.getElementById("botao3").innerHTML = "Três" */
    }
    contadorBotao3++;
}




