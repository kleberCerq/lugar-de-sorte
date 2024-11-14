package controllers;

import java.sql.Connection;

import dao.SistemaDAO;

public class ControleSistema implements ISistema {
	@Override
	public void cadastrarUsuario(String nome, String cpf, String cnpj, String email, String senha) {
		Connection connection = DBConnection.getConnection();

		SistemaDAO dao = new SistemaDAO(connection);

		if (cpf.length() > 0) {
			dao.adicionarCliente(nome, cpf, email, senha);
		} else {
			dao.adicionarEmpresa(nome, cnpj, email, senha);
		}
	}
}
