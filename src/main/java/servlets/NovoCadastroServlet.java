package servlets;

import java.io.IOException;

import controllers.ControleSistema;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/novoCadastro")
public class NovoCadastroServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String nome = request.getParameter("name");
        String cpf = request.getParameter("cpf");
        String cnpj = request.getParameter("cnpj");
        String email = request.getParameter("email");
        String senha = request.getParameter("password");

        ControleSistema controle = new ControleSistema();
        controle.cadastrarUsuario(nome, cpf, cnpj, email, senha);
    }
}
