package Bean;

import Behaviour.FlyBehavior;
import Behaviour.QuackBehavior;
import Implementation.FlyWithWings;
import Implementation.Quack;

public class MallardDuck extends Duck{
    private static final String NAME="mallard duck";

    public MallardDuck(){
        quackBehavior=new Quack();
        flyBehavior=new FlyWithWings();
    }

    @Override
    public void performQuack(){
        System.out.println(quackBehavior.quack(NAME));
    }

    @Override
    public void performFly(){
        System.out.println(flyBehavior.fly(NAME));
    }
}
