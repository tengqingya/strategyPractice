package strategyPractice.dog;

import strategyPractice.action.ColorInterface;
import strategyPractice.action.FlyInterface;
import strategyPractice.action.SayInterface;

/**
 * @author tengqingya
 * @create 2017-03-09 16:21
 */
public abstract class Dog3 {
    protected ColorInterface colorInterface;
    protected SayInterface sayInterface;
    protected FlyInterface flyInterface;

    public FlyInterface getFlyInterface() {
        return flyInterface;
    }

    public void setFlyInterface( FlyInterface flyInterface ) {
        this.flyInterface = flyInterface;
    }

    public abstract void eat();

    public void say(){
        sayInterface.say();
    }

    public void color(){
        colorInterface.color();
    }

    public ColorInterface getColorInterface() {
        return colorInterface;
    }

    public void setColorInterface( ColorInterface colorInterface ) {
        this.colorInterface = colorInterface;
    }

    public SayInterface getSayInterface() {
        return sayInterface;
    }

    public void setSayInterface( SayInterface sayInterface ) {
        this.sayInterface = sayInterface;
    }

    public void fly(){
        flyInterface.fly();
    }
}
