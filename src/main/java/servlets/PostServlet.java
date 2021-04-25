package servlets;

import Beans.Comment;
import Beans.Post;
import connection.PostConnection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(value = "/post")
public class PostServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = null;
        int pId = Integer.parseInt(request.getParameter("pId"));
        Post post= PostConnection.getPost(pId);
        request.setAttribute("userPost", false);
        if (username != null) {
            if (username==post.getUsername()){
                request.setAttribute("userPost", true);
            }
        }
        List<Comment> postComments = PostConnection.getComments(pId);


        request.setAttribute("post", post);
        request.setAttribute("comments", postComments);


        request.getRequestDispatcher("/posts.jsp").forward(request, response);
    }

}
