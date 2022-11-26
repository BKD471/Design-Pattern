package Implementation;
import Behaviour.FlyBehavior;

public class FlyWithWings implements FlyBehavior {
    /**
     * @return string
     */
    @Override
    public void fly(String name) {
        System.out.println(name+" Flying with Wings");
    }
}
