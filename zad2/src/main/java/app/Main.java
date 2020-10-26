package app;

public class Main {

    public static void main(String[] args) {
        UserService userService = new UserService();
        userService.addUser("ktos", "ktos", "jakis@gmail.com");
        userService.verify(null, null);
    }
}
