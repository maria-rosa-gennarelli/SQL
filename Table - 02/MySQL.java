import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


public class MySQL{
    public static void main(String[] args) {

        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/newdb", "root", "26199Mrg.");
            Statement statement = connection.createStatement();
            //statement.executeUpdate("create table if not exists students(student_id int(10) auto_increment primary key not null)");
            //statement.executeUpdate("alter table students add last_name varchar(30) not null after student_id");
            //statement.executeUpdate("alter table students add first_name varchar(30) not null after last_name");
            //statement.executeUpdate("insert into students (last_name, first_name) values ('Bocce', 'Mario')");
            //statement.executeUpdate("insert into students (last_name, first_name) values ('Scacco', 'Aldo')");
            //statement.executeUpdate("insert into students (last_name, first_name) values ('Felice', 'Sara')");
            //statement.executeUpdate("insert into students (last_name, first_name) values ('Rossi', 'Andrea')");
        } catch (Exception e) {
            System.out.println(e.getMessage());

        }


    }
}
