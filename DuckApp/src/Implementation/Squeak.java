package Implementation;

import Behaviour.QuackBehavior;

public class Squeak implements QuackBehavior {
    /**
     * @return String
     */
    @Override
    public void quack(String name) {
        System.out.println(name+" Rubber duck Squeak");
    }
}
