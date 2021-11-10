package Database;

import java.sql.Connection;

public class Main {
  public static void main(String[] args) {
    Connection connection = Conector.connect();
  }
}
