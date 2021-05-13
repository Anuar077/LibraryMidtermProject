package servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.security.Principal;

public class SecureServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if(req.getAttribute("javax.servlet..request_key_size")==null){
            resp.sendRedirect("https://localhost:8443/secureServlet");
        }
        if(req.isUserInRole("secureServlet")){
            String remoteUser = req.getRemoteUser();
            Principal userPrincipal= req.getUserPrincipal();
            System.out.println(userPrincipal.getName());
        }
    }
}
