package comm;

import javax.inject.Inject;

public class Dog extends Animal {

    @Inject
    public Dog() {
    }

    @Override
    public void voice() {
        System.out.println("Hav Hav Hav Hav");
    }

    @Override
    public void move() {
        System.out.println("Garp Garp Garp Garp");
    }
}
