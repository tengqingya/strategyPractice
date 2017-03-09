package strategyPractice.dog;

import strategyPractice.actionImpl.ColorBlackImpl;
import strategyPractice.actionImpl.SayBlackImpl;

/**
 * @author tengqingya
 * @create 2017-03-09 16:25
 */
public class BlackDog3 extends Dog3 {

    public BlackDog3() {
        colorInterface = new ColorBlackImpl();
        sayInterface = new SayBlackImpl();
    }

    @Override
    public void eat() {
        System.out.println("eat by mouth");
    }
}
