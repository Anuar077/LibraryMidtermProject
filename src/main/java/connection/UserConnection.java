package connection;

import java.sql.*;


public class UserConnection {
    private final static Connection conn = getConn();

    public static Connection getConnection() {
        return conn;
    }

    private static Connection getConn() {
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            Connection c = DriverManager.getConnection
                    ("jdbc:postgresql://localhost:5432/java_ee_db",
                            "postgres", "1020");
            Statement stmt;


            stmt = c.createStatement();
            stmt.execute("CREATE TABLE IF NOT EXISTS users (\n" +
                    "   user_id serial primary key not null ,\n" +
                    "   user_login text not null,\n" +
                    "   user_password text not null ,\n" +
                    "   user_email text,\n" +
                    "   user_address text\n" +
                    ");");


            stmt = c.createStatement();
            stmt.execute("CREATE UNIQUE INDEX IF NOT EXISTS ii_user_login ON users (user_login);");

            return c;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
}
