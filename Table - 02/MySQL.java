import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class MySQL {
    public static void main(String[] args) {

        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/newdb", "root", "");
            Statement statement = connection.createStatement();
            statement.executeUpdate("CREATE TABLE student ("
                    +"student_id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,"
                    +"first_name VARCHAR(30),"
                    +"last_name VARCHAR(30)"
                    +")");
            statement.executeUpdate("INSERT into student (last_name, first_name) VALUES ('Bocce', 'Mario')");
            statement.executeUpdate("INSERT into student (last_name, first_name) VALUES ('Scacco', 'Aldo')");
            statement.executeUpdate("INSERT into student (last_name, first_name) VALUES ('Felice', 'Sara')");
            statement.executeUpdate("INSERT into student (last_name, first_name) VALUES ('Rossi', 'Andrea')");
        } catch (Exception e) {
            System.out.println(e.getMessage());

        }
    }
}
