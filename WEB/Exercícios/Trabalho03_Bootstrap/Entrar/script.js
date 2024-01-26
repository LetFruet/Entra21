function validateForm() {
  let x = document.getElementById("email-entrar").value;

  if (x.indexOf("@") === -1 || x.indexOf("@") === 0 || x.indexOf(".") === -1) {
      Swal.fire({
          icon: 'error', /*chama o icone*/
          title: 'Erro!', /*titulo do alerta*/
          text: 'O texto digitado não condiz com um email...',
      });
      return;
  }

  Swal.fire({
      icon: 'success', /*chama o icone*/
      title: 'Sucesso!', /*titulo do alerta*/
      text: 'Login realizado com sucesso!',
  });
}

function login() {
  window.location="../Entrar/entrar.html";
}

function registro() {
    window.location="../Registro/registro.html";
}