package Implementation;

import Behaviour.FlyBehavior;

public class FlyNoWay implements FlyBehavior {
    /**
     * @return string
     */
    @Override
    public String fly(String name) {
        return name+" can't fly";
    }
}
