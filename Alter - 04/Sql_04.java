import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Sql_04 {
    public static void main(String[] args) {
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/newdb", "root", "26199Mrg.");
            Statement statement = connection.createStatement();
            statement.executeUpdate("ALTER table student ADD country varchar(30) not null after first_name");
            statement.executeUpdate("UPDATE student SET country = 'Italy' WHERE last_name = 'Bocce'");
            statement.executeUpdate("UPDATE student SET country = 'Italy' WHERE last_name = 'Scacco'");
            statement.executeUpdate("UPDATE student SET country = 'Germany' WHERE last_name = 'Felice'");
            statement.executeUpdate("UPDATE student SET country = 'Germany' WHERE last_name = 'Rossi'");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
