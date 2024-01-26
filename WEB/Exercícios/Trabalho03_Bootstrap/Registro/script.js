function validateForm() {
  let x = document.getElementById("email-entrar").value;

  if (x.indexOf("@") === -1 || x.indexOf("@") === 0 || x.indexOf(".") === -1) {
      Swal.fire({
          icon: 'error',
          title: 'Erro!',
          text: 'O texto digitado não condiz com um email...',
      });
      return;
  }

  Swal.fire({
      icon: 'success',
      title: 'Sucesso!',
      text: 'Cadastro realizado com sucesso!',
  });
}

function login() {
  window.location="../Entrar/entrar.html";
}

function registro() {
    window.location="../Registro/registro.html";
}

