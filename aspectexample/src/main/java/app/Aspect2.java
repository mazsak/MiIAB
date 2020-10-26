package app;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Aspect2 {

    private long timeMethod = 0;

    @Pointcut(value = "execution(* *(..)) && !(execution(* *.set*(..)) || execution(* *.get*(..)))")
    public void time(){}

    @Before(value = "time()")
    public void timeBefore(){
        timeMethod = System.currentTimeMillis();
    }

    @After(value = "time()")
    public void timeAfter(){
        System.out.println("Time: " + ((float)(System.currentTimeMillis() - timeMethod)) + " ms");
        timeMethod = 0;
    }

}
