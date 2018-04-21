package guru.springframework.examplebeans;

public class FakeJmsBroker {

    private String user;
    private String password;
    private String dburl;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDburl() {
        return dburl;
    }

    public void setDburl(String dburl) {
        this.dburl = dburl;
    }

    public String getUser() {

        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }
}
