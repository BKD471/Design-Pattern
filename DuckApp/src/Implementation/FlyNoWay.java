package Implementation;

import Behaviour.FlyBehavior;

public class FlyNoWay implements FlyBehavior {
    /**
     * @return string
     */
    @Override
    public void fly(String name) {
        System.out.println(name+" can't fly");
    }
}
