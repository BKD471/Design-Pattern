package Implementation;

import Behaviour.QuackBehavior;

public class Quack implements QuackBehavior {
    /**
     * @return String
     */
    @Override
    public void quack(String name) {
        System.out.println(name+" quacking");
    }
}
