package Implementation;

import Behaviour.QuackBehavior;

public class Quack implements QuackBehavior {
    /**
     * @return String
     */
    @Override
    public String quack(String name) {
        return name+" quacking";
    }
}
