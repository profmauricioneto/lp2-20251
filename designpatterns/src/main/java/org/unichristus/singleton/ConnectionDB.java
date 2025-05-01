package org.unichristus.singleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDB {
    private static ConnectionDB instanceConnection = null;
    private final String username = "root";
    private final String password = "root";
    private final String url = "jdbc:mysql://localhost:3306/singleton";
    private Connection connection;

    private ConnectionDB() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            this.connection = DriverManager.getConnection(url, username, password);
            System.out.println("Conexão criada com sucesso");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    public Connection getConnection() {
        return this.connection;
    }

    public static synchronized ConnectionDB getInstance() {
        if (instanceConnection == null) {
            instanceConnection = new ConnectionDB();
        }
        return instanceConnection;
    }

    public static void main(String[] args) {
        ConnectionDB conexao = ConnectionDB.getInstance();
        System.out.println(conexao.getConnection());
    }
}
