package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SistemaDAO implements ISistemaDAO {
    private final Connection connection;

    public SistemaDAO(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void adicionarCliente(String nome, String cpf, String email, String senha) {
        try {
            String sql = "INSERT INTO clientes (nome, cpf, email, senha) VALUES (?, ?, ?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setString(1, nome);
            preparedStatement.setString(2, cpf);
            preparedStatement.setString(3, email);
            preparedStatement.setString(4, senha);

            preparedStatement.executeUpdate();
            preparedStatement.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void adicionarEmpresa(String nome, String cnpj, String email, String senha) {
        try {
            String sql = "INSERT INTO empresas (nome, cnpj, email, senha) VALUES (?, ?, ?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setString(1, nome);
            preparedStatement.setString(2, cnpj);
            preparedStatement.setString(3, email);
            preparedStatement.setString(4, senha);

            preparedStatement.executeUpdate();
            preparedStatement.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
