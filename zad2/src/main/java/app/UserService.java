package app;

import java.util.ArrayList;
import java.util.List;

@PublicLogger(name = "UserServiceLogger")
public class UserService {

    private List<User> users;

    public UserService() {
        this.users = new ArrayList<>();
    }

    @NotNullArgs
    public void verify(String username, String password) {
        System.out.println("app.UserService.verify called");
    }

    public void addUser(String username, String password, String email) {
        users.add(new User(username,password, email));
        System.out.println("app.UserService.add called");
    }
}
