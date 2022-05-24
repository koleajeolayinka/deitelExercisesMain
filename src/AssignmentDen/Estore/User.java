package AssignmentDen.Estore;

public class User {
    public String password;
    public int Age;
    private String email;
    private String HomeAddress;

    public void setAge(int Age) {
        this.Age = Age;
    }

    public int getAge() {
        return Age;
    }

    public void Password(String password) {
        this.password = password;


    }

    public String getPassword() {
        return password;
    }

    public void setEmail(String email) {
        this.email = email;

    }

    public String getEmail() {
        return email;
    }
    public void setHomeAddress(String HomeAddress) {
        this.HomeAddress = HomeAddress;
    }

    public String getHomeAddress() {
        return HomeAddress;
    }


}
