const form = document.getElementById("formulario");

form.addEventListener("submit", function (event) {
  let input = document.getElementById("cpf");
  let valor = 14;
  let msg = "CPF";

  if (input.classList.contains("hidden")) {
    input = document.getElementById("cnpj");
    valor = 18;
    msg = "CNPJ";
  }

  if (input.value.length < valor) {
    event.preventDefault();
    alert("Digite um " + msg + " válido.");
  } else {
    input.value = input.value.replace(/\D/g, "");
  }
});
