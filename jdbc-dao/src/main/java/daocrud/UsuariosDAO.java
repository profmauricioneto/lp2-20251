package daocrud;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UsuariosDAO {
    private Connection conn;

    public UsuariosDAO() {
        try {
            this.conn = new ConnectionDB().getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void cadastrarUsuario(Usuarios usuario) {
        String query = "INSERT INTO usuarios (nome, email, endereco, dataNascimento) VALUES (?,?,?,?);";
        try {
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, usuario.getNome());
            ps.setString(2, usuario.getEmail());
            ps.setString(3, usuario.getEndereco());
            ps.setDate(4, new Date(usuario.getDataNascimento().getTimeInMillis()));
            ps.executeUpdate();
            ps.close();
            conn.close();
        } catch(SQLException e) {
            e.printStackTrace();
        }
    }


}
