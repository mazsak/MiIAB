package app;

@PublicLogger(name = "GroupServiceLogger")
public class GroupService {

    public void addGroup(){
        System.out.println("hy, i must add your group.");
        throw new NullPointerException();
    }
}
