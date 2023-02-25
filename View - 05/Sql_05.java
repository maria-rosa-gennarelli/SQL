package Sql_05;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class Sql_05 {
    public static void main(String[] args) {

        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/newdb", "root", "");
            Statement statement = connection.createStatement();

            int executeUpdate = statement.executeUpdate("CREATE VIEW italian_students AS SELECT first_name, last_name FROM newdb.student WHERE country = 'Italy'");
            int executeUpdate1 = statement.executeUpdate("CREATE VIEW german_students AS SELECT first_name, last_name FROM newdb.student WHERE country = 'Germany'");

            ArrayList<Student> italian_students = new ArrayList<>();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM italian_students");
            while (resultSet.next()) {
                italian_students.add(new Student(resultSet.getString("first_name"), resultSet.getString("last_name")));
            }

            ArrayList<Student> german_students = new ArrayList<>();
            ResultSet resultSet1 = statement.executeQuery("SELECT * FROM german_students");
            while (resultSet1.next()) {
                german_students.add(new Student(resultSet1.getString("first_name"), resultSet1.getString("last_name")));
            }

            for (Student italian_student : italian_students) {
                System.out.println(italian_student.getName()+" "+italian_student.getSurname());
            }
            for (Student german_student : german_students) {
                System.out.println(german_student.getName()+" "+german_student.getSurname());
            }


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
