package Bean;

import Behaviour.FlyBehavior;
import Behaviour.QuackBehavior;

public class Duck {
    public String NAME ;

    public FlyBehavior flyBehavior;
    public QuackBehavior quackBehavior;

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }


    public void display() {
        System.out.println("I am a kind of Duck");
    }

    public void swim() {
        System.out.println("I am Swimming");
    }

    public void performQuack() {
        quackBehavior.quack(NAME);
    }

    public void performFly() {
        flyBehavior.fly(NAME);
    }
}
