import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class Sql_03 {
    public static void main(String[] args) {
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/newdb", "root", "26199Mrg.");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT last_name, first_name FROM newdb.student");
            ArrayList<String> surname = new ArrayList<>();
            while (resultSet.next()){
                System.out.println(resultSet.getString("first_name"));
                surname.add(resultSet.getString("last_name"));
            }
            System.out.println(surname);

        } catch (Exception e) {
            System.out.println(e.getMessage());

        }
    }
}

