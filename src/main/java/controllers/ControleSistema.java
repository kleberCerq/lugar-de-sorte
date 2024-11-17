package controllers;

import java.sql.Connection;

import dao.SistemaDAO;
import models.Cliente;
import models.Empresa;
import models.Usuario;

public class ControleSistema implements ISistema {
    public Connection conn;
    public SistemaDAO dao;

    public ControleSistema() {
        this.conn = DBConnection.getConnection();
        this.dao = new SistemaDAO(conn);
    }

    @Override
    public Usuario cadastrarUsuario(String nome, String email, String senha, String cpf, String cnpj) {
        if (cpf.length() > 0) {
			Cliente novoCliente = new Cliente(nome, email, senha, cpf);
			dao.setCliente(novoCliente);
            return novoCliente;
		} else {
			Empresa novaEmpresa = new Empresa(nome, email, senha, cnpj);
			dao.setEmpresa(novaEmpresa);
            return novaEmpresa;
		}
    }

    @Override
    public Usuario logarUsuario(String senha, String cpf, String cnpj) {
        if (cpf.length() > 0) {
            Cliente resultado = dao.getCliente(senha, cpf);
            return resultado;
        } else {
            Empresa resultado = dao.getEmpresa(senha, cnpj);
            return resultado;
        }
    }
}
