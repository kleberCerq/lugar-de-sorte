<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="pt-BR">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <link rel="shortcut icon" href="static/img/favicon.ico" type="image/x-icon" />
    <title>Lugar de Sorte</title>
  </head>
  <body>
    <h1>Olá</h1>
    <% if (request.getAttribute("nome") != null && request.getAttribute("email") != null) { %>
        <p style="color: green"><%= request.getAttribute("nome") %></p>
        <p style="color: green"><%= request.getAttribute("email") %></p>
        <% } %>
  </body>
</html>
