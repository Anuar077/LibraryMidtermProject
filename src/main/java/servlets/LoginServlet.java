package servlets;

import connection.UserDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out=response.getWriter();

        request.getRequestDispatcher("header.jsp").include(request, response);

        request.getRequestDispatcher("navhome.jsp").include(request, response);
        out.println("<div class='container'>");
        request.getRequestDispatcher("login.jsp").include(request, response);
        out.println("</div>");

        request.getRequestDispatcher("footer.jsp").include(request, response);
        out.close();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out=response.getWriter();

        request.getRequestDispatcher("header.jsp").include(request, response);

        String login=request.getParameter("login");
        String password=request.getParameter("password");
        if(UserDao.authenticate(login, password)){
            HttpSession session=request.getSession();
            session.setAttribute("login",login);

            request.getRequestDispatcher("navuser.jsp").include(request, response);
            request.getRequestDispatcher("loginaft.jsp").include(request, response);

        }else{
            request.getRequestDispatcher("navhome.jsp").include(request, response);
            out.println("<div class='container'>");
            out.println("<h1 class='danger'>Email or password is wrong</h1>");
            request.getRequestDispatcher("login.jsp").include(request, response);
            out.println("</div>");
        }


        request.getRequestDispatcher("footer.jsp").include(request, response);
        out.close();
    }

}
