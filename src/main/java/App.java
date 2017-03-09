import original.BlackDog;
import original.Dog;
import original.RedDog;
import original2.BlackDog2;
import original2.Dog2;
import original2.RedDog2;
import strategyPractice.actionImpl.ColorRedImpl;
import strategyPractice.actionImpl.FlyBlackImpl;
import strategyPractice.actionImpl.FlyRedImpl;
import strategyPractice.dog.BlackDog3;
import strategyPractice.dog.Dog3;
import strategyPractice.dog.RedDog3;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Dog red = new RedDog();
        Dog black =  new BlackDog();
        red.color();
        red.eat();
        red.say();


        black.color();
        black.eat();
        black.say();

        System.out.println("-------------------------------------------");

        Dog2 red2 = new RedDog2();
        Dog2 black2 =  new BlackDog2();
        red2.color();
        red2.eat();
        red2.say();
        red2.dosth();


        black2.color();
        black2.eat();
        black2.say();
        black2.dosth();

        System.out.println("-------------------------------------------");
        Dog3 red3 =new RedDog3();
        Dog3 black3 =new BlackDog3();
        red3.color();
        red3.say();
        red3.eat();

        black3.color();
        black3.say();
        black3.eat();
        System.out.println("-------------------------------------------改需求拉------------------");
        black3.setColorInterface(new ColorRedImpl());
        black3.color();

        System.out.println("-------------------------------------------新增需求拉------------------");
        black3.setFlyInterface(new FlyBlackImpl());
        red3.setFlyInterface(new FlyRedImpl());
        black3.fly();
        red3.fly();
    }
}
