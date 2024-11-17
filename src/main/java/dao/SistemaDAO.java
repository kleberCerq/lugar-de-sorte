package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import models.Cliente;
import models.Empresa;

public class SistemaDAO implements ISistemaDAO {
    private final Connection conn;

    public SistemaDAO(Connection conn) {
        this.conn = conn;
    }

    @Override
    public void setCliente(Cliente cliente) {
        String sql = "INSERT INTO clientes (nome, email, senha, cpf) VALUES (?, ?, ?, ?);";
        try {
            PreparedStatement stmt = conn.prepareStatement(sql);

            stmt.setString(1, cliente.getNome());
            stmt.setString(2, cliente.getEmail());
            stmt.setString(3, cliente.getSenha());
            stmt.setString(4, cliente.getCpf());

            stmt.executeUpdate();
            stmt.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Cliente getCliente(String senha, String cpf) {
        Cliente cliente = null;
        String sql = "SELECT * FROM clientes WHERE senha = ? AND cpf = ?;";
        try {
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, senha);
            stmt.setString(2, cpf);

            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                String nome = rs.getString("nome");
                String email = rs.getString("email");
                cliente = new Cliente(nome, email, senha, cpf);
            }

            rs.close();
            stmt.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return cliente;
    }

    @Override
    public void setEmpresa(Empresa empresa) {
        String sql = "INSERT INTO empresas (nome, email, senha, cnpj) VALUES (?, ?, ?, ?);";
        try {
            PreparedStatement stmt = conn.prepareStatement(sql);

            stmt.setString(1, empresa.getNome());
            stmt.setString(2, empresa.getEmail());
            stmt.setString(3, empresa.getSenha());
            stmt.setString(4, empresa.getCnpj());

            stmt.executeUpdate();
            stmt.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Empresa getEmpresa(String senha, String cnpj) {
        Empresa empresa = null;
        String sql = "SELECT * FROM empresas WHERE senha = ? AND cnpj = ?;";
        try {
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, senha);
            stmt.setString(2, cnpj);

            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                String nome = rs.getString("nome");
                String email = rs.getString("email");
                empresa = new Empresa(nome, email, senha, cnpj);
            }

            rs.close();
            stmt.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return empresa;
    }
}
