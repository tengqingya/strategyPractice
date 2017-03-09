package original;

/**
 * 红色狗
 *
 * @author tengqingya
 * @create 2017-03-09 15:50
 */
public class RedDog extends Dog {
    @Override
    public void say() {
        System.out.println("i am red dog");
    }

    @Override
    public void color() {
        System.out.println("my color is red");
    }
}
