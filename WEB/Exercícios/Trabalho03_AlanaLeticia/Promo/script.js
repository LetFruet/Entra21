var tamanhoSelecionado = false;

function selecionarTamanho() {
    tamanhoSelecionado = true;
    alert("Tamanho selecionado com sucesso!");
}

function adicionarItemSacola() {
    if (tamanhoSelecionado) {
        alert("Item adicionado à sacola!");
    } else {
        alert("Um tamanho precisa ser selecionado...");
    }
}
