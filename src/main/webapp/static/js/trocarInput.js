const cpfButton = document.getElementById("cpf-button");
const cnpjButton = document.getElementById("cnpj-button");

const cpf = document.getElementById("cpf");
const cnpj = document.getElementById("cnpj");

function toggleInput() {
  cpfButton.toggleAttribute("disabled");
  cnpjButton.toggleAttribute("disabled");
  cpf.classList.toggle("hidden");
  cnpj.classList.toggle("hidden");
  cpf.value = "";
  cnpj.value = "";
  cpf.toggleAttribute("required");
  cnpj.toggleAttribute("required");
}
