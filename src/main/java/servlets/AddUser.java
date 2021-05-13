package servlets;

import connection.UserDao;
import entity.UserEntity;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/AddUser")
public class AddUser extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out=response.getWriter();

        request.getRequestDispatcher("header.jsp").include(request, response);

        request.getRequestDispatcher("navadmin.jsp").include(request, response);
        out.println("<div class='container'>");

        int id=Integer.parseInt(request.getParameter("id"));
        String name=request.getParameter("name");
        String email=request.getParameter("email");
        String password=request.getParameter("password");
        String address=request.getParameter("address");
        UserEntity bean=new UserEntity(name, email, password, address);
        UserDao.addUser(bean);
        out.print("<h4>User added successfully</h4>");
        request.getRequestDispatcher("adduserform.jsp").include(request, response);


        out.println("</div>");
        request.getRequestDispatcher("footer.jsp").include(request, response);
        out.close();
    }

}
