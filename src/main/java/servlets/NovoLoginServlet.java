package servlets;
import java.io.IOException;

import controllers.ControleSistema;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import models.Cliente;
import models.Empresa;
import models.Usuario;

@WebServlet("/novoLogin")
public class NovoLoginServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String senha = request.getParameter("senha");
        String cpf = request.getParameter("cpf");
        String cnpj = request.getParameter("cnpj");

        ControleSistema controle = new ControleSistema();
        Usuario usuario = controle.logarUsuario(senha, cpf, cnpj);
        String destino = "/WEB-INF/views/login.jsp";

        if (usuario instanceof Cliente) {
            request.setAttribute("nome", usuario.getNome());
            request.setAttribute("email", usuario.getEmail());
            destino = "/WEB-INF/views/homeCliente.jsp";
        } else if (usuario instanceof Empresa) {
            request.setAttribute("nome", usuario.getNome());
            request.setAttribute("email", usuario.getEmail());
            destino = "/WEB-INF/views/homeEmpresa.jsp";
        } else {
            request.setAttribute("errorMessage", "Credenciais inválidas! Tente novamente.");
        }
        request.getRequestDispatcher(destino).forward(request, response);
    }
}
