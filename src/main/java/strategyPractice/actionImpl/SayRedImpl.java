package strategyPractice.actionImpl;

import strategyPractice.action.SayInterface;

/**
 * @author tengqingya
 * @create 2017-03-09 16:18
 */
public class SayRedImpl implements SayInterface {
    public void say() {
        System.out.println("i am red dog");
    }
}
