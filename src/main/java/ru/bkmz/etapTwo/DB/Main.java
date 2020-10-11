package ru.bkmz.etapTwo.DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    static final String DB_URL = "jdbc:postgresql://127.0.0.1:5432/vertex";
    static final String USER = "root";
    static final String PASS = "root";

    public static void main(String[] argv) throws SQLException {

        System.out.println("Testing connection to PostgreSQL JDBC");

        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("PostgreSQL JDBC Driver is not found. Include it in your library path ");
            e.printStackTrace();
            return;
        }

        System.out.println("PostgreSQL JDBC Driver successfully connected");
        Connection connection = null;

        try {
            connection = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement statement = connection.createStatement();

                statement.execute("create table competition ( competition_id int, competition_name text, world_record text, set_date date );");
                statement = connection.createStatement();
                statement.execute("create table result ( \"competition_id \" int, \"sportsman_id \" int, \"result \" text, \"city \" text, \"hold_date \" text );");
                statement = connection.createStatement();
                statement.execute("create table sportsman ( sportsman_id int, \"sportsman_name \" text, \"rank \" text, \"country \" text, \"personal_record \" int, \"year_of_birth \" int );");
                statement.execute("alter table result add constraint result_competition_competition_id_fk foreign key (\"competition_id \") references competition (competition_id) on update restrict on delete restrict deferrable;");
                statement.execute("alter table result add new_column int; alter table result add constraint result_sportsman_sportsman_id_fk foreign key (\"sportsman_id \") references sportsman (sportsman_id);");

            for (int i = 0; i < 50; i++) {
                statement.execute("INSERT INTO public.competition (competition_id, competition_name, world_record, set_date) VALUES ("+i+", 'name"+i+"', '100', '2020-10-22')");
            }


        } catch (SQLException e) {
            System.out.println("Connection Failed");
            e.printStackTrace();
            return;
        }

        if (connection != null) {
            System.out.println("You successfully connected to database now");
        } else {
            System.out.println("Failed to make connection to database");
        }

    }
}
