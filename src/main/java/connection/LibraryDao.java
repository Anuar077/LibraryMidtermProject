package connection;

import entity.LibraryEntity;
import entity.UserEntity;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LibraryDao {
    Connection conn = LibraryConnection.getConnection();

    public void addBook(LibraryEntity library) {
        try {
            PreparedStatement stmt = conn.prepareStatement("INSERT INTO library(book_title, book_author, book_page,book_year) VALUES (?, ?, ?,?)");
            stmt.setString(1, library.getTitle());
            stmt.setString(2, library.getAuthor());
            stmt.setString(3, library.getPage());
            stmt.setString(4, library.getYear());
            stmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public LibraryEntity getBook(int bookid) {
        try {
            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM library WHERE book_id = ? LIMIT 1;");

            stmt.setInt(1, bookid);

            ResultSet r = stmt.executeQuery();
            if (r.next()) {
                return new LibraryEntity(r.getInt(1), r.getString(2),
                        r.getString(3), r.getString(4), r.getString(5));
            }
        } catch (SQLException e) {
            System.out.println(e);
            e.printStackTrace();
        }
        return null;
    }

    public LibraryEntity getBookByTitle(String title) {
        try {
            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM library WHERE title = ? LIMIT 1;");

            stmt.setString(1, title);

            ResultSet r = stmt.executeQuery();
            if (r.next()) {
                return new LibraryEntity(r.getInt(1), r.getString(2),
                        r.getString(3), r.getString(4), r.getString(5));
            }
        } catch (SQLException e) {
            System.out.println(e);
        }

        return null;
    }

}