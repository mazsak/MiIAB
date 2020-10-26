package app;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareError;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Aspect4 {
    @Pointcut(value = "within(@org.hibernate.annotations.Immutable *) && withincode(* set*(..))")
    void a4(){}

    @DeclareError(value = "a4()")
    static final String msg = "Napisz aspekt zgłaszający błąd kompilacji dla klas z adnotacją @Immutable, które zawierają metody set*";
}
