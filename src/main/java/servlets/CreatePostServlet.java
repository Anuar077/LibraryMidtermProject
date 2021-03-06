package servlets;

import Beans.Post;
import connection.PostConnection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(value = "/addpost")
public class CreatePostServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String username=(String) request.getSession(false).getAttribute("username");

        Post post = new Post();
        post.setTitle(request.getParameter("title"));
        post.setpContent(request.getParameter("content"));
        post.setUsername(username);
        int result = PostConnection.createPost(post);

        if(result!=0)
        {
            request.setAttribute("message", "Your post "+post.getTitle()+" published!");
            request.getRequestDispatcher("index.jsp").forward(request, response);
        }
        else
        {
            request.setAttribute("errMessage", "Something went wrong. Post was not published!");
            request.getRequestDispatcher("/writePost.jsp").forward(request, response);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
