import Bean.Duck;
import Bean.MallardDuck;
import Bean.ModelDuck;
import Implementation.FlyRocketPowered;

public class Main {
    public static void main(String[] args) {
        Duck mallard=new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        Duck modelDuck=new ModelDuck();
        modelDuck.performFly();
        modelDuck.setFlyBehavior(new FlyRocketPowered());
        modelDuck.performFly();

    }
}