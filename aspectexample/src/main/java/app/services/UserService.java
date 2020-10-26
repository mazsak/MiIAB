package app.services;

import app.Aspect3;

public class UserService {

    @Deprecated
    public boolean verify(String username, String pasword){
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("UserService.verify called");
        return false;
    }

    public void time(){
        System.out.println("Aspect, Time: " + ((Aspect3.Time)this).getTime() + " ms");
    }

    public void addUser(String username, String password, String email) {
        System.out.println("UserService.add called");
    }
}
