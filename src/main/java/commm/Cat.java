package commm;

import javax.inject.Inject;

public class Cat extends Animal {

    @Inject
    public Cat() {
    }

    @Override
    public void voice() {
        System.out.println("Miaaaaav");
    }

    @Override
    public void move() {
        System.out.println("Pati Pati Pati Pati");
    }
}
