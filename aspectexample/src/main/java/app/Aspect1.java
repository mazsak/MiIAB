/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Aspect1 {
    
    @Pointcut(value = "execution(float *(..))")
    public void a() {}
    
    @Before(value = "a()")
    public void actionA() {
        System.out.println("metody zwracające liczbę typu float");
    }

    @Pointcut(value = "execution(void *(String))")
    public void b() {}

    @Before(value = "b()")
    public void actionB() {
        System.out.println("metody z jednym parametrem typu String");
    }

    @Pointcut(value = "execution(* *(*,*))")
    public void c() {}

    @Before(value = "c()")
    public void actionC() {
        System.out.println("metody z dwoma parametrami dowolnych typów");
    }

    @Pointcut(value = "execution(public * *.services.*Service.*(..))")
    public void d() {}

    @Before(value = "d()")
    public void actionD() {
        System.out.println("metody publicznie w klasach *Service w pakiecie services");
    }

    @Pointcut(value = "execution(!public * *.model.*.set*(..))")
    public void e() {}

    @Before(value = "e()")
    public void actionE() {
        System.out.println("metody set* w klasach z pakietu model, które nie są publiczne");
    }

    @Pointcut(value = "execution(@Deprecated * *(..))")
    public void f() {}

    @Before(value = "f()")
    public void actionF() {
        System.out.println("metody z adnotacją @Depreciated");
    }

    @Pointcut(value = "execution(public * *.services.*Service.*(..)) && !execution(* *(*,*))")
    public void g() {}

    @Before(value = "g()")
    public void actionG() {
        System.out.println("metody typu d, które nie są typu c  - wykorzystaj łączenie przecięć za pomocą operatorów logicznych");
    }

}
