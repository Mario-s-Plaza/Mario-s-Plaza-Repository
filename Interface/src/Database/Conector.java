package Database;

import org.jetbrains.annotations.Nullable;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conector {

  private static String urlConnection = "jdbc:mysql://localhost:3306/db_test"; //este
  private static String username = "root"; //teste
  private static String password = "123456"; //teste

  public static @Nullable
  Connection connect(){
    try {
      return DriverManager.getConnection(Conector.urlConnection, Conector.username, Conector.password);
    }catch (Exception e){
      System.out.println(e.getMessage());
      return null;
    }
  }
}
