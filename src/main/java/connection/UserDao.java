package connection;

import entity.UserEntity;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserDao {
    Connection conn = UserConnection.getConnection();

    public static void addUser(UserEntity user) {
        Connection conn = UserConnection.getConnection();
        try {
            PreparedStatement stmt = conn.prepareStatement("INSERT INTO users(user_login, user_password, user_email, user_address)\n" +
                    "    VALUES (?, ?, ?, ?);");
            stmt.setString(1, user.getLogin());
            stmt.setString(2, user.getPassword());
            stmt.setString(3, user.getEmail());
            stmt.setString(4, user.getAddress());
            stmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public UserEntity getUser(int id) {
        try {
            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM users WHERE user_id = ? LIMIT 1;");

            stmt.setInt(1, id);

            ResultSet r = stmt.executeQuery();
            if (r.next()) {
                return new UserEntity(r.getInt(1), r.getString(2),
                        r.getString(3), r.getString(4),
                        r.getString(5));
            }
        } catch (SQLException e) {
            System.out.println(e);
            e.printStackTrace();
        }
        return null;
    }

    public UserEntity getUserByLogin(String login) {
        try {
            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM users WHERE user_login = ? LIMIT 1;");

            stmt.setString(1, login);

            ResultSet r = stmt.executeQuery();
            if (r.next()) {
                return new UserEntity(r.getInt(1), r.getString(2),
                        r.getString(3), r.getString(4),
                        r.getString(5));
            }
        } catch (SQLException e) {
            System.out.println(e);
        }

        return null;
    }


    public static int update(UserEntity bean){
        int status=0;
        try{
            Connection con= UserConnection.getConnection();
            PreparedStatement ps=con.prepareStatement("update \"users\" set \"user_login\"=?,\"user_password\"=?,\"user_email\"=?,\"user_address\"=? where \"ID\"=?");
            ps.setString(1,bean.getLogin());
            ps.setString(2,bean.getEmail());
            ps.setString(3,bean.getPassword());
            ps.setString(4,bean.getAddress());
            ps.setInt(5,bean.getId());
            status=ps.executeUpdate();
            con.close();

        }catch(Exception e){System.out.println(e);}

        return status;
    }
    public static List<UserEntity> view(){
        List<UserEntity> list = new ArrayList<>();
        try{
            Connection con= UserConnection.getConnection();
            PreparedStatement ps=con.prepareStatement("select * from \"users\"");
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                UserEntity bean=new UserEntity();
                bean.setId(rs.getInt(1));
                bean.setLogin(rs.getString(2));
                bean.setPassword(rs.getString(3));
                bean.setEmail(rs.getString(4));
                bean.setAddress(rs.getString(5));
                list.add(bean);
            }
            con.close();

        }catch(Exception e){System.out.println(e);}

        return list;
    }
    public static UserEntity viewById(int id){
        UserEntity bean=new UserEntity();
        try{
            Connection con= UserConnection.getConnection();
            PreparedStatement ps=con.prepareStatement("select * from \"E_LIBRARIAN\" where \"ID\"=?");
            ps.setInt(1,id);
            ResultSet rs=ps.executeQuery();
            if(rs.next()){
                bean.setId(rs.getInt(1));
                bean.setLogin(rs.getString(2));
                bean.setPassword(rs.getString(3));
                bean.setEmail(rs.getString(4));
                bean.setAddress(rs.getString(5));
            }
            con.close();

        }catch(Exception e){System.out.println(e);}

        return bean;
    }
    public static int delete(int id){
        int status=0;
        try{
            Connection con= UserConnection.getConnection();
            PreparedStatement ps=con.prepareStatement("delete from \"users\" where \"ID\"=?");
            ps.setInt(1,id);
            status=ps.executeUpdate();
            con.close();

        }catch(Exception e){System.out.println(e);}

        return status;
    }

    public static boolean authenticate(String login, String password){
        boolean status = false;
        try{
            Connection con = UserConnection.getConnection();
            PreparedStatement ps = con.prepareStatement("select * from \"users\" where \"user_login\"=? and \"user_password\"=?");
            ps.setString(1,login);
            ps.setString(2,password);
            ResultSet rs=ps.executeQuery();
            if(rs.next()){
                status=true;
            }
            con.close();

        }catch(Exception e){System.out.println(e);}

        return status;
    }
}
