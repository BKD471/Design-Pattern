package Bean;

import Implementation.FlyNoWay;
import Implementation.Quack;

public class ModelDuck extends  Duck{

    public ModelDuck(){
        this.NAME="Model Duck";
        flyBehavior=new FlyNoWay();
        quackBehavior=new Quack();
    }

    @Override
    public void display() {
        System.out.println("I am "+this.NAME);
    }
}
