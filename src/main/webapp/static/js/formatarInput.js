const cpfInput = document.getElementById("cpf");
const cnpjInput = document.getElementById("cnpj");

cpfInput.addEventListener("input", function (e) {
  let cpf = e.target.value.replace(/\D/g, "");

  if (cpf.length <= 11) {
    cpf = cpf.replace(/(\d{3})(\d)/, "$1.$2");
    cpf = cpf.replace(/(\d{3})(\d)/, "$1.$2");
    cpf = cpf.replace(/(\d{3})(\d{1,2})$/, "$1-$2");
  }

  e.target.value = cpf;
});

cnpjInput.addEventListener("input", function (e) {
  let cnpj = e.target.value.replace(/\D/g, "");

  if (cnpj.length <= 14) {
    cnpj = cnpj.replace(/(\d{2})(\d)/, "$1.$2");
    cnpj = cnpj.replace(/(\d{3})(\d)/, "$1.$2");
    cnpj = cnpj.replace(/(\d{3})(\d{4})(\d)/, "$1/$2-$3");
  }

  e.target.value = cnpj;
});
