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
    <script src="../../static/js/validarInput.js" defer></script>
    <title>Cadastro - Lugar de Sorte</title>
  </head>
  <body>
    <main>
      <div id="title-container">
        <h1>Conta</h1>
      </div>

      <p>cadastro</p>

      <form id="formulario" action="/novoCadastro" method="post">
        <div class="input-container">
          <input id="name" name="nome" type="text" placeholder="NOME" minlength="2" required />
          <input id="cpf" name="cpf" type="text" placeholder="CPF" maxlength="14" required />
          <input id="cnpj" class="hidden" name="cnpj" type="text" placeholder="CNPJ" maxlength="18" />
        </div>

        <div class="button-container">
          <button id="cpf-button" type="button" onclick="toggleInput()" disabled>PESSOA FÍSICA</button>
          <button id="cnpj-button" type="button" onclick="toggleInput()">PESSOA JURÍDICA</button>
        </div>

        <div class="input-container">
          <input id="email" name="email" type="email" placeholder="E-MAIL" minlength="5" required />
          <input id="password" name="senha" type="password" placeholder="SENHA" minlength="5" required />
        </div>

        <div class="button-container">
          <button type="reset">APAGAR</button>
          <button type="submit">CONFIRMAR</button>
        </div>
      </form>

      <p class="end-page">
        Já tem uma conta? <a href="/login">Fazer login</a>
      </p>
    </main>
  </body>
</html>
