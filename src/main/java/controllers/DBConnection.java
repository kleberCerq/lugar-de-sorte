package controllers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    private static Connection instance;

    private static final String URL = "jdbc:mysql://localhost:3306/lugardesorte";
    private static final String USUARIO = "root";
    private static final String SENHA = "lugardesorte";

    private DBConnection() {
    }

    public static Connection getConnection() {
        try {
            if (DBConnection.instance == null) {
                DBConnection.instance = DriverManager.getConnection(URL, USUARIO, SENHA);
            }
            return DBConnection.instance;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
