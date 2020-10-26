package app;

public class Intercepted {

    public float a(){
        return 3.6F;
    }

    public void b(String param){
        System.out.println("Param: " + param);
    }

    public void c(int number, String word){
        System.out.println(number + ". " + word);
    }



}
