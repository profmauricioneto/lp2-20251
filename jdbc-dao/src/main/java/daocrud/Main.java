package daocrud;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        try {
            System.out.println("Establishing connection");
            ConnectionDB conn = new ConnectionDB();
        } catch(SQLException e) {
            e.printStackTrace();
        }
    }
}
