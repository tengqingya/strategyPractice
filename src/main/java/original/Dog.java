package original;

/**
 * dog基类
 *
 * @author tengqingya
 * @create 2017-03-09 15:48
 */
public abstract class Dog {
    public abstract void say();

    public void eat(){
        System.out.println("eat by mouth");
    }

    public abstract void color();
}
