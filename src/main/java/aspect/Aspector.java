package aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Aspector {

    @Pointcut("execution(* welcome*(..))")
    public void welcome(){}

    @Before("welcome()")
    public void line(){
        System.out.println("--------------------------------");
    }
}
