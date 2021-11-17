package Database;

//import org.jetbrains.annotations.Nullable;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Conector {

    public static String status = "Não conectado...";

    private static String serverName, database, url, username, password;

    private static Connection connection = null;
    private static Statement state;

    public Conector() {
        serverName = "localhost:3306";
        database = "usuario";
        url = "jdbc:mysql://" + serverName + "/" + database;
        username = "root";
        password = "Sua senha"; // Coloque a senha do seu banco de dados
    }

    public static Statement getConexao() {

        String driverName = "com.mysql.cj.jdbc.Driver";

        try {
            Class.forName(driverName);

            connection = DriverManager.getConnection(url, username, password);
            state = connection.createStatement();
            if (connection != null) {

                status = ("STATUS: Conectado com sucesso!");

            } else {

                status = ("STATUS: Não foi possivel realizar conexão");

            }

            return state;

        } catch (ClassNotFoundException e) {

            System.out.println("O driver especificado nao foi encontrado.");

            return null;

        } catch (SQLException e) {

            System.out.println("Nao foi possivel conectar ao Banco de Dados.");

            return null;

        }

    }

    public static String statusConexao() {

        return status;

    }

    public static boolean fecharConexao() {

        try {

            Conector.getConexao().close();

            return true;

        } catch (SQLException e) {

            return false;

        }

    }

}
