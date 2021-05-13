package entity;

public class UserEntity {
    int id;
    String login;
    String password;
    String email;
    String address;

    public UserEntity() {
        this.login = login;
        this.password = password;
        this.email = "";
        this.address = "";
    }

    public UserEntity(String login, String password, String email, String address) {
        this.id = -1;
        this.login = login;
        this.password = password;
        this.email = email;
        this.address = address;
    }

    public UserEntity(int id, String login, String password, String email, String address) {
        this.id = id;
        this.login = login;
        this.password = password;
        this.email= email;
        this.address = address;
    }

    @Override
    public String toString() {
        return "UserEntity{" +
                "id=" + id +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


}
