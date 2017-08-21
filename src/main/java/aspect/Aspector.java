package aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Aspector {

    @Pointcut("execution(public void show*(..))")
    public void pc(){}

    @After("pc()")
    public void line(){
        System.out.println("___________________");
    }
}
