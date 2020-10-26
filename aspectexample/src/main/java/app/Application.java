package app;

import app.model.Person;
import app.services.UserService;

public class Application {
    public static void main(String[] args) {
        Person person = new Person();
        person.set();
        System.out.println("App started");
        Intercepted intercepted = new Intercepted();
        System.out.println(intercepted.a());
        intercepted.b("JAVA");
        intercepted.c(1, "Word");
        UserService userService = new UserService();
        userService.addUser("Jakub", "JSON", "Conor@gmail.com");
        userService.time();
        userService.verify("Jakub", "JSON");
        userService.time();
        Person person1 = new Person();
        person1.set();
    }
}
