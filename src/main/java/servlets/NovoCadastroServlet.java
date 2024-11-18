package servlets;

import java.io.IOException;

import controllers.ControleFacade;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import models.Cliente;
import models.Usuario;

@WebServlet("/novoCadastro")
public class NovoCadastroServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String nome = request.getParameter("nome");
        String email = request.getParameter("email");
        String senha = request.getParameter("senha");
        String cpf = request.getParameter("cpf");
        String cnpj = request.getParameter("cnpj");

        ControleFacade controle = new ControleFacade();
        Usuario usuario = controle.cadastrarUsuario(nome, email, senha, cpf, cnpj);

        if (usuario instanceof Cliente) {
            request.getRequestDispatcher("/WEB-INF/views/homeCliente.jsp").forward(request, response);
        } else {
            request.getRequestDispatcher("/WEB-INF/views/homeEmpresa.jsp").forward(request, response);
        }
    }
}
