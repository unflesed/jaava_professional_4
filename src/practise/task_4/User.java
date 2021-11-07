package practise.task_4;

public class User {
    private String login;
    private String phoneNumber;
    private String email;
    public User(String login, String phoneNumber, String email) {
        this.login = login;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
