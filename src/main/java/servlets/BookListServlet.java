package servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;


@WebServlet(
        name = "listbook",
        urlPatterns = "/bookservlet"
)
public class BookListServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter pw = resp.getWriter();
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            Connection conn = DriverManager.getConnection
                    ("jdbc:postgresql://localhost:5432/java_ee_db",
                            "postgres", "1020");
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT book_title from library");

            while (rs.next())
                pw.println(rs.getString("book_title"));
            stmt.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}


