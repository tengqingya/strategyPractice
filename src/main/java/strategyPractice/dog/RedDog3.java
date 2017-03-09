package strategyPractice.dog;

import strategyPractice.actionImpl.ColorRedImpl;
import strategyPractice.actionImpl.SayRedImpl;

/**
 * @author tengqingya
 * @create 2017-03-09 16:25
 */
public class RedDog3  extends Dog3{

    public RedDog3() {
        colorInterface = new ColorRedImpl();
        sayInterface = new SayRedImpl();
    }


    @Override
    public void eat() {
        System.out.println("eat by mouth");
    }
}
