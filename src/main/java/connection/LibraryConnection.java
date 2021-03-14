package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class LibraryConnection {
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
            stmt.execute("CREATE TABLE IF NOT EXISTS library (\n" +
                    "   book_id serial primary key not null ,\n" +
                    "   book_title text not null,\n" +
                    "  book_author text not null ,\n" +
                    "  book_page text,\n" +
                    "   book_year text\n" +
                    ");");


            stmt = c.createStatement();
            stmt.execute("CREATE UNIQUE INDEX IF NOT EXISTS idx_book_title ON library (book_title);");

            return c;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
}
