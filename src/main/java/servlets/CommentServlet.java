package servlets;


import Beans.Comment;
import connection.PostConnection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(value = "/addComment")
public class CommentServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String username=(String) request.getSession(false).getAttribute("username");

        Comment comment = new Comment();
        comment.setContent(request.getParameter("content"));
        comment.setUsername(username);
        int pId=Integer.parseInt(request.getParameter("pId"));
        comment.setpId(pId);
        int result = PostConnection.createComment(comment);

        response.sendRedirect("/post?pId="+pId);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}

