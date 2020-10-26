package app;

@PubliusLogger
public class UserService {

    public boolean verify(String username, String pasword){
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("app.UserService.verify called");
        return false;
    }

    @NotNullArgs
    public void addUser(String username, String password, String email) {
        System.out.println("app.UserService.add called");
    }
}
