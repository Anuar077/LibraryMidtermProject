package servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/adduserform")
public class AddUserForm extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out=response.getWriter();

        request.getRequestDispatcher("header.jsp").include(request, response);

        request.getRequestDispatcher("navadmin.jsp").include(request, response);
        out.println("<div class='container'>");
        request.getRequestDispatcher("adduserform.jsp").include(request, response);
        out.println("</div>");



        request.getRequestDispatcher("footer.jsp").include(request, response);
        out.close();
    }

}
