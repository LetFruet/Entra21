function validateForm() {
    let x = document.getElementById("email-entrar").value;

    if (x.indexOf("@") == -1 || x.indexOf("@") == 0 || x.indexOf(".") == -1) {
      alert("O texto digitado não condiz com um email...");
      return;
    }

    alert("Cadastro realizado com sucesso!");
  }