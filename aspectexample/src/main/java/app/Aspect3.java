package app;

import app.model.Person;
import app.services.UserService;
import org.aspectj.lang.annotation.*;

@Aspect
public class Aspect3 {
    public interface Time{
        void setTime();
        long getTime();
    };
    public static class TimeImpl implements Time {
        private long time = 0;

        public void setTime() {
            time = System.currentTimeMillis();
        }

        public long getTime() {
            return time;
        }
    }

    @DeclareParents(value="*.*.*Service", defaultImpl = TimeImpl.class)
    private Time time;

    @After(value = "execution(* *.*Service.*(..)) && this(time)")
    public void set(Time time) {
        time.setTime();
    }

}
