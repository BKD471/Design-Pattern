package Bean;

import Behaviour.FlyBehavior;
import Behaviour.QuackBehavior;
import Implementation.FlyWithWings;
import Implementation.Quack;

public class MallardDuck extends Duck{
    public MallardDuck(){
        this.NAME="Mallard Duck";
        quackBehavior=new Quack();
        flyBehavior=new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I am a "+this.NAME);
    }
}
