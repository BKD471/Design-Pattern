package Implementation;

import Behaviour.FlyBehavior;

public class FlyRocketPowered implements FlyBehavior {

    @Override
    public void fly(String name){
        System.out.println(name+" flying with Rocket");
    }
}
