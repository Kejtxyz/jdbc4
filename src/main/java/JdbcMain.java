import java.sql.*;

public class JdbcMain {

    public static final String URL = "jdbc:mysql://localhost:3306/tarr4_db?serverTimezone=UTC";
    public static final String USER = "klient";
    public static final String PASSWORD = "123";

    public static void main(String[] args) {
            try {
                Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
                Statement statement = connection.createStatement();
                statement.addBatch("update zawodnicy set wzrost=180 where imie='Martin'");
                int[] ints = statement.executeBatch();
                for (int i: ints){
                    System.out.println("zmienilem " + i);
                }
                connection.close();
            }
            catch (SQLException e){
                e.printStackTrace();
            }
        }
    }



    }
}
