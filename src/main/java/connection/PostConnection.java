package connection;
import Beans.Comment;
import Beans.Post;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PostConnection{
    private static String url = "jdbc:postgresql://localhost:5432/java_ee_db";
    private static String login = "postgres";
    private static String password = "1020";
    static Connection connection;
    static Statement statement;

    public static void connect() {
        if(connection==null) {
            try {
                Class.forName("org.postgresql.Driver");
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
            try {
                connection = DriverManager.getConnection(url, login, password);
                statement = connection.createStatement();
             } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }
    }
    public static int createPost(Post post){

        String sqlString = "INSERT INTO `forum`.`posts` (`title`, `pContent`, `username`) values('"
                +post.getTitle()+"', '"
                +post.getpContent()+"', '"
                +post.getUsername()+"')";

        int result=0;
        try{
            result = statement.executeUpdate(sqlString);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return result;
    }

    public static int createComment(Comment comment){

        String sqlString = "INSERT INTO `forum`.`comments` (`content`, `pId`, `username`) values('"
                +comment.getContent()+"', "
                +comment.getpId()+", '"
                +comment.getUsername()+"')";

        int result=0;
        try{
            result = statement.executeUpdate(sqlString);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return result;
    }

    public static Post getPost(int pId){
        connect();

        String sqlString = "SELECT * FROM posts where pId="+pId;
        Post post =new Post();
        try {
            ResultSet resultSet = statement.executeQuery(sqlString);
            while (resultSet.next()) {

                post.setpId(resultSet.getInt("pId"));
                post.setTitles(resultSet.getString("title"));
                post.setpContent(resultSet.getString("pContent"));
                post.setUsername(resultSet.getString("username"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return post;
    }
    public static List<Post> getPosts(){
        connect();

        String sqlString = "SELECT * FROM posts";
        List<Post> posts = new ArrayList<Post>();
        try {
            ResultSet resultSet = statement.executeQuery(sqlString);
            while (resultSet.next()) {
                Post post =new Post();
                post.setpId(resultSet.getInt("pId"));
                post.setTitles(resultSet.getString("title"));
                post.setpContent(resultSet.getString("pContent"));
                post.setUsername(resultSet.getString("username"));
                posts.add(post);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return posts;
    }



    public static List<Comment> getComments(int pId){
        connect();
        String sqlString = "SELECT * FROM comments where pid="+pId;
        List<Comment> comments = new ArrayList<Comment>();
        try {
            ResultSet resultSet = statement.executeQuery(sqlString);
            while (resultSet.next()) {
                Comment comment =new Comment();
                comment.setcId(resultSet.getInt("cId"));
                comment.setContent(resultSet.getString("content"));
                comment.setpId(resultSet.getInt("pId"));
                comment.setUsername(resultSet.getString("username"));;
                comments.add(comment);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return comments;
    }

    public static void getPost() {
    }
}


