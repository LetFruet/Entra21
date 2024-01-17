function clicarBotaoUm() {
    document.getElementById('texto01').innerHTML = 'Olá mundo';
}

let contador02 = 0;
function clicarBotaoDois() {
    document.getElementById('texto02').innerHTML = ++contador02;
}

let contador03 = 0;
function clicarBotaoTres() {
    document.getElementById('texto03').innerHTML = 'Três';

    if (contador03 % 2 == 0) {
        document.getElementById('texto03').style.color = 'black';
    } else {
        document.getElementById('texto03').style.color = 'grey';
    }
    contador03++;

}