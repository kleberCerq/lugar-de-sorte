<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Criar ou Editar Sorteio</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
    <link rel="stylesheet" href="../../static/css/criarSorteio.css">
    <style>
        body {
            background-color: #f5ffcb;
        }
        .container {
            background-color: #ffffff;
            padding: 30px;
            border-radius: 8px;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
        }
        h2 {
            color: #11562a;
            margin-bottom: 20px;
        }
        table th, td {
            text-align: center;
        }
        .btn-group {
            margin-bottom: 20px;
        }

        /* Estilo para o botão de salvar e criar, cor verde */
        .btn-success {
            background-color: #c9e265;
            border-color: #c9e265;
        }
        .btn-success:hover {
            background-color: #0e4a22;
            border-color: #ffff0;
        }

        /* Estilo para o campo de descrição */
        .form-group textarea {
            border-color: #ffff0;
        }
    </style>
</head>
<body>
    <div class="container" style="margin-top: 20px;">
        <h2>Criar ou Editar Sorteio</h2>

        <!-- Botões para alternar entre criação e edição -->
        <div class="btn-group" role="group">
            <button id="btnCriar" class="btn btn-success" onclick="showCreateForm()">Criar Sorteio</button>
            <button id="btnEditar" class="btn btn-warning" onclick="showEditForm()">Editar Sorteio</button>
        </div>

        <!-- Formulário de Criação e Edição -->
        <form id="formSorteio" action="/criarNovoSorteio" method="POST">
            <input type="hidden" id="editId" name="id">
            <div class="form-group">
                <label for="nome_sorteio">Nome do Sorteio</label>
                <input type="text" class="form-control" id="nome_sorteio" name="nome" required>
            </div>
            <div class="form-group">
                <label for="data_sorteio">Data do Sorteio</label>
                <input type="datetime-local" class="form-control" id="data_sorteio" name="data" required>
            </div>
            <div class="form-group">
                <label for="quantidade_bilhetes">Quantidade de Bilhetes</label>
                <input type="number" class="form-control" id="quantidade_bilhetes" name="bilhetes" required>
            </div>
            <div class="form-group">
                <label for="descricao_sorteio">Descrição do Sorteio</label>
                <textarea class="form-control" id="descricao_sorteio" name="descricao" rows="4" placeholder="Forneça uma breve descrição do sorteio..." required></textarea>
            </div>
            <button type="submit" class="btn btn-success">Salvar Sorteio</button>
        </form>

        <h3>Lista de Sorteios</h3>
        <table class="table table-bordered" id="sorteiosTabela">
            <thead>
                <tr>
                    <th>ID</th>
                    <th>Nome</th>
                    <th>Data</th>
                    <th>Quantidade de Bilhetes</th>
                    <th>Descrição</th>
                    <th>Ações</th>
                </tr>
            </thead>
            <tbody>
                <!-- Sorteios são listados aqui -->
                <tr>
                    <td>1</td>
                    <td>Sorteio de Natal</td>
                    <td>2024-12-25</td>
                    <td>100</td>
                    <td>Prêmio: 1 carro zero km</td>
                    <td>
                        <button class="btn btn-warning editarBtn" data-id="1" data-nome="Sorteio de Natal" data-data="2024-12-25" data-bilhetes="100" data-descricao="Prêmio: 1 carro zero km">Editar</button>
                    </td>
                </tr>
                <tr>
                    <td>2</td>
                    <td>Sorteio de Ano Novo</td>
                    <td>2024-12-31</td>
                    <td>200</td>
                    <td>Prêmio: 1 viagem internacional</td>
                    <td>
                        <button class="btn btn-warning editarBtn" data-id="2" data-nome="Sorteio de Ano Novo" data-data="2024-12-31" data-bilhetes="200" data-descricao="Prêmio: 1 viagem internacional">Editar</button>
                    </td>
                </tr>
            </tbody>
        </table>
    </div>

    <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>

    <script>
        // Exibir o formulário de criação
        function showCreateForm() {
            document.getElementById('formSorteio').reset();
            document.getElementById('editId').value = '';
            $('#formSorteio button').text('Criar Sorteio');
        }

        // Exibir o formulário de edição
        function showEditForm() {
            $('#formSorteio button').text('Salvar Alterações');
        }

        // Função para preencher os campos de edição com os dados do sorteio
        $('.editarBtn').click(function() {
            var id = $(this).data('id');
            var nome = $(this).data('nome');
            var data = $(this).data('data');
            var bilhetes = $(this).data('bilhetes');
            var descricao = $(this).data('descricao');

            // Preencher os campos de edição com os valores selecionados
            $('#editId').val(id);
            $('#nome_sorteio').val(nome);
            $('#data_sorteio').val(data);
            $('#quantidade_bilhetes').val(bilhetes);
            $('#descricao_sorteio').val(descricao);

            // Exibir o formulário de edição
            showEditForm();
        });

        // Submeter o formulário de criação/edição
        $('#formSorteio').submit(function(event) {
            event.preventDefault();

            // Coletar os dados do formulário
            var id = $('#editId').val();
            var nome = $('#nome_sorteio').val();
            var data = $('#data_sorteio').val();
            var bilhetes = $('#quantidade_bilhetes').val();
            var descricao = $('#descricao_sorteio').val();

            // Se o ID não estiver vazio, estamos editando um sorteio
            if (id) {
                // Atualizar a tabela com os novos dados
                var linha = $('#sorteiosTabela tbody tr').filter(function() {
                    return $(this).find('td').eq(0).text() == id;
                });

                linha.find('td').eq(1).text(nome);
                linha.find('td').eq(2).text(data);
                linha.find('td').eq(3).text(bilhetes);
                linha.find('td').eq(4).text(descricao);
            } else {
                // Se não, estamos criando um novo sorteio
                var novoId = $('#sorteiosTabela tbody tr').length + 1;
                $('#sorteiosTabela tbody').append(
                    `<tr>
                        <td>${novoId}</td>
                        <td>${nome}</td>
                        <td>${data}</td>
                        <td>${bilhetes}</td>
                        <td>${descricao}</td>
                        <td><button class="btn btn-warning editarBtn" data-id="${novoId}" data-nome="${nome}" data-data="${data}" data-bilhetes="${bilhetes}" data-descricao="${descricao}">Editar</button></td>
                    </tr>`
                );
            }

            // Limpar o formulário
            $('#formSorteio')[0].reset();
            $('#editId').val('');
            $('#formSorteio button').text('Criar Sorteio');
        });
    </script>
</body>
</html>
