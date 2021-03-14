package servlets;

import connection.UserDao;
import entity.UserEntity;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(
        name = "registerServlet",
        urlPatterns = "/register"
)
public class RegisterServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("register.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        UserDao userDao = new UserDao();

        userDao.addUser(new UserEntity(
                        req.getParameter("login"),
                        req.getParameter("password"),
                        req.getParameter("email"),
                        req.getParameter("address")
                )
        );

        req.getRequestDispatcher("register.jsp").forward(req, resp);
    }
}

