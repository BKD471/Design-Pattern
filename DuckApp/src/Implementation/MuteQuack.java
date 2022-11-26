package Implementation;

import Behaviour.QuackBehavior;

public class MuteQuack implements QuackBehavior {
    /**
     * @return String
     */
    @Override
    public void quack(String name) {
        System.out.println(name+" can't Quack");
    }
}
