package strategyPractice;

import original.BlackDog;
import original.Dog;
import original.RedDog;

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
    }
}
