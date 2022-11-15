package Implementation;

import Behaviour.QuackBehavior;

public class Squeak implements QuackBehavior {
    /**
     * @return String
     */
    @Override
    public String quack(String name) {
        return name+" Rubber duck Squeak";
    }
}
