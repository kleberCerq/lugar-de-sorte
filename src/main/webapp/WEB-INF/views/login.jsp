<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="pt-BR">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <link rel="shortcut icon" href="../../static/img/favicon.ico" type="image/x-icon" />
    <link rel="stylesheet" href="../../static/css/style.css" />
    <link rel="stylesheet" href="../../static/css/autenticacao.css" />
    <script src="../../static/js/trocarInput.js" defer></script>
    <script src="../../static/js/formatarInput.js" defer></script>
    <title>Login - Lugar de Sorte</title>
  </head>
  <body>
    <main>
      <div id="title-container">
        <h1>Conta</h1>
      </div>

      <p>login</p>

      <form action="/novologin" method="post">
        <div class="input-container">
          <input id="cpf" class="input-login" name="cpf" type="text" placeholder="CPF" maxlength="14" oninput="mascaraCPF(event)" required />
          <input id="cnpj" class="hidden input-login" name="cnpj" type="text" placeholder="CNPJ" maxlength="18" oninput="mascaraCNPJ(event)" />
        </div>

        <div class="button-container">
          <button id="cpf-button" type="button" onclick="toggleInput()" disabled>PESSOA FÍSICA</button>
          <button id="cnpj-button" type="button" onclick="toggleInput()">PESSOA JURÍDICA</button>
        </div>

        <div class="input-container">
          <input id="password" class="input-login" name="password" type="password" placeholder="SENHA" />
        </div>

        <div class="button-container">
          <button type="submit">APAGAR</button>
          <button type="submit">CONFIRMAR</button>
        </div>
      </form>

      <p class="end-page">
        Ainda não tem uma conta? <a href="/cadastro">Cadastrar-se</a>
      </p>
    </main>
  </body>
</html>
