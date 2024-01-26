var tamanhoSelecionado = false;

function selecionarTamanho() {
    tamanhoSelecionado = true;
    Swal.fire({
        icon: 'success',
        title: 'Sucesso!',
        text: 'Tamanho selecionado com sucesso!',
    });
}

function adicionarItemSacola() {
    if (tamanhoSelecionado) {
        Swal.fire({
            icon: 'success',
            title: 'Sucesso!',
            text: 'Item adicionado à sacola!',
        });
    } else {
        Swal.fire({
            icon: 'error',
            title: 'Erro!',
            text: 'Um tamanho precisa ser selecionado...',
        });
    }
}

function login() {
    window.location = "../Entrar/entrar.html";
}

function registro() {
    window.location = "../Registro/registro.html";
}
