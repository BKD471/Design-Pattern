package Implementation;

import Behaviour.QuackBehavior;

public class MuteQuack implements QuackBehavior {
    /**
     * @return String
     */
    @Override
    public String quack(String name) {
        return name+" can't Quack";
    }
}
