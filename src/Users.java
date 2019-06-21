public class Users {
    private String userName;
    private String position;

    public Users(String username, String position) {
        setUserName(username);
        setPosition(position);
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
