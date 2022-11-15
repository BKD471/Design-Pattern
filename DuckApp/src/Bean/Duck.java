package Bean;

import Behaviour.FlyBehavior;
import Behaviour.QuackBehavior;

public class Duck {
   private static final String NAME="Duck";

    public FlyBehavior flyBehavior;
    public QuackBehavior quackBehavior;


    public void display(){
        System.out.println("I am the Duck Class");
    }

    public void swim(){
        System.out.println("I am Swimming");
    }

    public void performQuack(){
        System.out.println(quackBehavior.quack(NAME));

    }

    public void performFly(){
        System.out.println(flyBehavior.fly(NAME));
    }
}
