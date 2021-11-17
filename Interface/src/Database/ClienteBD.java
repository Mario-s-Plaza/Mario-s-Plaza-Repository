/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

/**
 *
 * @author Rafael Martins
 */
import Interface.Cliente;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author rafap
 */
public class ClienteBD {

    private static Statement state;

    public static void insertCliente(Cliente c) {

        state = Conector.getConexao();
        String sql = "INSERT INTO t_usuario(nome,email,senha) VALUES"
               + "('" + c.getNome() + "','" + c.getEmail() + "','" + c.getSenha()
                + "');";

        try {
            state.executeUpdate(sql);

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir no banco de dados!", "Erro", JOptionPane.ERROR_MESSAGE);
        } finally {
            Conector.fecharConexao();
        }
    }

    public static Cliente consultaClienteBD(String sql) throws SQLException {
        Cliente c = new Cliente();
        ResultSet rs;

        state = Conector.getConexao();
        rs = state.executeQuery(sql);

        while (rs.next()) {

            c.setNome(rs.getString(1));
            c.setEmail(rs.getString(2));
            c.setSenha(rs.getString(3));
        }
        return c;
    }

    public static ResultSet consultaClientesBD(String sql) throws SQLException {
        ResultSet rs;
        state = Conector.getConexao();
        rs = state.executeQuery(sql);
        return rs;
    }


}

