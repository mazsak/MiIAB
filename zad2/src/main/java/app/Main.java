package app;

public class Main {

    public static void main(String[] args) {
            UserService userService = new UserService();
            userService.addUser("ktos", "cos", "jakis@gmail.com");
            userService.verify("null", "null");

            GroupService groupService = new GroupService();
            groupService.addGroup();
    }
}
