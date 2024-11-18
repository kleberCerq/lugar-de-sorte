<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="pt-br">

<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Tela da Empresa</title>

  <!-- Incluindo bibliotecas externas -->
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta3/css/all.min.css">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <link rel="stylesheet" href="../../static/css/homeEmpresa.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>

  <style>
    /* Estilo para o breadcrumb */
    .breadcrumb {
      display: flex;
      align-items: center;
      background-color: #11562a;
      padding: 10px;
      color: #f5ffcb;
      font-size: 14px;
      border-radius: 5px;
      margin-bottom: 20px;
    }

    .breadcrumb-item {
      margin-right: 15px;
      display: flex;
      align-items: center;
    }

    .breadcrumb-item i {
      margin-right: 5px;
      color: #c9e265;
    }

    /* Estilo para o carrossel */
    #UtilizandoCarousel {
      max-width: 100%;
      /* Garante que o carrossel não ultrapasse a largura */
      margin: auto;
      border-radius: 5px;
      overflow: hidden;
    }

    #UtilizandoCarousel .carousel-inner {
      width: 100%;
    }

    #UtilizandoCarousel img {
      width: 100%;
      height: 300px;
      /* Definindo uma altura fixa para o carrossel */
      object-fit: contain;
      /* Garante que as imagens cobrem toda a área sem distorcer */
      border-radius: 5px;
    }

    .carousel-indicators li {
      background-color: gray;
    }

    .carousel-control .glyphicon {
      color: #11562a;
    }

    /* Estilos de card e seção */
    .card {
      border-radius: 10px;
      padding: 20px;
      margin-bottom: 20px;
      background-color: #c9e265;
    }

    .footer {
      background-color: #11562a;
      color: white;
      text-align: center;
      padding: 15px;
      margin-top: 30px;
    }

    .footer p {
      margin: 0;
    }

    /* Responsividade */
    @media (max-width: 768px) {
      .breadcrumb {
        font-size: 12px;
      }

      #UtilizandoCarousel img {
        height: 200px;
        /* Ajusta a altura para telas menores */
      }
    }

    .section {
      margin-bottom: 30px;
    }

    .section h2 {
      font-size: 1.8rem;
      margin-bottom: 10px;
      color: #11562a;
    }

    .section p {
      font-size: 14px;
      margin: 10px 0;
    }

    .card {
      background: #f9f9f9;
      border: 1px solid #ddd;
      border-radius: 8px;
      padding: 15px;
      margin: 10px 0;
    }

    .card h3 {
      margin-bottom: 5px;
      font-size: 16px;
      color: #11562a;
    }

    .code-box {
      background: #e9ecef;
      padding: 10px;
      font-family: 14px;
      border-radius: 5px;
      margin-top: 10px;
      overflow-x: auto;
    }
  </style>
</head>

<body>
  <!-- Breadcrumb com links -->
  <div class="breadcrumb">
    <div class="breadcrumb-item">
      <a href="adicionar_endereco.html" style="color: #f5ffcb;">
        <i class="fas fa-map-marker-alt" aria-label="Adicionar endereço"></i> Adicionar endereço
      </a>
    </div>
    <div class="breadcrumb-item">
      <a href="index.html" style="color: #f5ffcb;">
        <i class="fas fa-home" aria-label="Página Inicial"></i> Home
      </a>
    </div>
    <div class="breadcrumb-item">
      <a href="/criarSorteio" style="color: #f5ffcb;">
        <i class="fas fa-lightbulb" aria-label="Lampada"></i> Criar
      </a>
    </div>
    <div class="breadcrumb-item">
      <a href="meus_sorteios.html" style="color: #f5ffcb;">
        <i class="fas fa-clover" aria-label="Meus Sorteios"></i> Meus Sorteios
      </a>
    </div>
    <div class="breadcrumb-item">
      <a href="usuario.html" style="color: #f5ffcb;">
        <i class="fas fa-user" aria-label="Usuário"></i> Usuário
      </a>
    </div>
  </div>

  <!-- Carrossel -->
  <div class="container" style="margin-top: 20px;">
    <div id="UtilizandoCarousel" class="carousel slide" data-ride="carousel">
      <!-- Indicadores -->
      <ol class="carousel-indicators">
        <li data-target="#UtilizandoCarousel" data-slide-to="0" class="active"></li>
        <li data-target="#UtilizandoCarousel" data-slide-to="1"></li>
        <li data-target="#UtilizandoCarousel" data-slide-to="2"></li>
        <li data-target="#UtilizandoCarousel" data-slide-to="3"></li>
      </ol>

      <!-- Itens do Carrossel -->
      <div class="carousel-inner">
        <div class="item active">
          <img src="https://i.ibb.co/4Fzs47X/crianca-Segurando-Presente.png" alt="Criança com presente">
        </div>
        <div class="item">
          <img src="https://i.ibb.co/BzGcFqv/maospresente.png" alt="Mãos segurando presente">
        </div>
        <div class="item">
          <img src="https://i.ibb.co/F0x3nVw/Moca-Segurando-Presente.png" alt="Moça segurando presente">
        </div>
        <div class="item">
          <img src="https://i.ibb.co/sjnTYWb/idosa-Presente.png" alt="Idosa com presente">
        </div>
      </div>

      <!-- Controles -->
      <a class="left carousel-control" href="#UtilizandoCarousel" data-slide="prev">
        <span class="glyphicon glyphicon-chevron-left"></span>
        <span class="sr-only">Anterior</span>
      </a>
      <a class="right carousel-control" href="#UtilizandoCarousel" data-slide="next">
        <span class="glyphicon glyphicon-chevron-right"></span>
        <span class="sr-only">Próximo</span>
      </a>
    </div>
  </div>

  <div class="container">

    <h2>Criar Sorteio</h2>
    <p>Configure seu sorteio com facilidade. Controle dos resultados, participantes e muito mais à disposição.</p>
    </section>

    <!-- Adicionando um botão verde para Criar Sorteio -->
    <a href="/criarSorteio" class="btn" style="background-color: #c9e265; color: white; padding: 10px 20px; border-radius: 5px; text-decoration: none;">
      Criar Sorteio</a>
    </a>

    <section class="section">
      <h2>Seus Sorteios em Destaque</h2>
      <div class="card">
        <h3>Sorteio de uma cesta rústica</h3>
        <p>Oferecido por: <strong>Mercado Bom Preço</strong></p>
        <p><strong>Data:</strong> 19/11/2024</p>
        <!-- Link para edição -->
        <a href="/criarSorteio" class="btn" style="background-color: #c9e265; color: white;">Editar Sorteio</a>

      </div>
      <div class="card">
        <h3>Sorteio de Produtos de Limpeza</h3>
        <p>Oferecido por: <strong>Mercado Bom Preço</strong></p>
        <p><strong>Data:</strong> 20/11/2024</p>
        <!-- Link para edição -->
        <a href="/criarSorteio" class="btn" style="background-color: #c9e265; color: white;">Editar Sorteio</a>

      </div>
    </section>

    <footer class="footer">
      <p>&copy; 2024 - Lugar de Sorte</p>