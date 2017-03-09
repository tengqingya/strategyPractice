package strategyPractice.actionImpl;

import strategyPractice.action.FlyInterface;

/**
 * @author tengqingya
 * @create 2017-03-09 16:49
 */
public class FlyBlackImpl implements FlyInterface {
    public void fly() {
        System.out.println("black can not fly!!!!");
    }
}
