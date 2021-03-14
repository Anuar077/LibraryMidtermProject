package servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

import connection.UserDao;
import entity.UserEntity;

@WebServlet(
        name = "loginServlet",
        urlPatterns = "/login"
)
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("login.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        UserDao userDao = new UserDao();
        UserEntity user = userDao.getUserByLogin(req.getParameter("login"));
        if (user != null && user.getPassword().equals(req.getParameter("password"))) {
            HttpSession session = req.getSession();
            session.setAttribute("login", user.getLogin());
            System.out.println("Successful");
            Cookie ck = new Cookie("login", user.getLogin());
            resp.addCookie(ck);
        } else {
            System.out.println("Error");
        }


        req.getRequestDispatcher("login.jsp").forward(req, resp);
    }
}