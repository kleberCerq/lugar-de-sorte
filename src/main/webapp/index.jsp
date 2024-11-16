<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="pt-BR">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <link rel="shortcut icon" href="static/img/favicon.ico" type="image/x-icon" />
    <link rel="stylesheet" href="static/css/style.css">
    <link rel="stylesheet" href="static/css/index.css" />

    <title>Lugar de Sorte</title>
  </head>
  <body>
    <main>
      <img src="static/img/logo.png" alt="Logo Lugar de Sorte" />
      <h1>lugar de sorte</h1>
      <div>
        <a href="/login">ENTRAR</a>
        <a href="/cadastro">CADASTRAR-SE</a>
      </div>
    </main>

  
    <script src="../../static/js/carrosselIndex.js" defer></script>
    <div class="carousel">
      <div class="carousel-item active">
     <h2>Sobre Nós</h2>
    <p>Conheça um pouco da nossa história e propósito. E aproveite nossa criação :)</p>
  </div>
      
  <div class="carousel-item">
    <h2>Quem Somos?</h2>
    <p>A ideia foi pensada pelo técnico em informática Marcos de Araújo e projetada e implementada pelos Graduandos em Ciência da Computação pela UFAL campus Arapiraca, sendo eles: Gabriela Cota, Lucas Medeiros e Kleber Cerqueira.</p>
  </div>
  <div class="carousel-item">
    <h2>Qual o propósito do lugar de sorte?</h2>
    <p>O lugar de sorte surge ao observar a forma que os sorteios convencionais de lojas físicas funcionam. O cliente precisa deixar alguns de seus dados pessoais, como nome, endereço, CPF em uma urna sem garantia que terá segurança de seus dados, além disso, acaba esquecendo do sorteio e facilmente perde o comprovante.</p>
  </div>
  <div class="carousel-item">
    <h2>Por que você deveria usar nosso sistema?</h2>
    <p>Porque com o lugar de sorte, você poderá ter um controle de sorteios que está participando, terá seus dados guardados de maneira segura e será avisado dos resultados de forma instantânea sem que ocorra manipulações de resultados ou perda do prêmio.</p>
  </div>
  <button class="prev" onclick="prevSlide()">&#10094;</button>
  <button class="next" onclick="nextSlide()">&#10095;</button>
</div>

  </body>
</html>