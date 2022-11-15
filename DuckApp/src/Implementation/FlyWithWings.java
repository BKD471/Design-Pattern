package Implementation;
import Behaviour.FlyBehavior;

public class FlyWithWings implements FlyBehavior {
    /**
     * @return string
     */
    @Override
    public String fly(String name) {
        return name+" Flying with Wings";
    }
}
