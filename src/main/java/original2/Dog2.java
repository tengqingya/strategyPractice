package original2;

/**
 * dog基类
 *
 * @author tengqingya
 * @create 2017-03-09 15:48
 */
public abstract class Dog2 {
    public abstract void say();

    public void eat(){
        System.out.println("eat by mouth");
    }

    public abstract void color();

    /**
     * 新增需求
     * 但是不是每个子类都需要这个方法
     * 所以每个子类都需要去修改代码
     * 在父类中新增方法会导致每个子类都需要修改
     * 如果只在子类中新增，辣么如果需要新增的子类也很多，修改起来也很麻烦
     */
    public abstract void dosth();
}
