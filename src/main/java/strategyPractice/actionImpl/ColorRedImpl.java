package strategyPractice.actionImpl;

import strategyPractice.action.ColorInterface;

/**
 * @author tengqingya
 * @create 2017-03-09 16:18
 */
public class ColorRedImpl implements ColorInterface {
    public void color() {
        System.out.println("my color is red");
    }
}
