package strategyPractice;

import original.BlackDog;
import original.Dog;
import original.RedDog;
import original2.BlackDog2;
import original2.Dog2;
import original2.RedDog2;

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
    }
}
