package comm;

import javax.inject.Inject;

public class Hause {

    Cat cat;
    Dog dog;

    @Inject
    public Hause(Cat cat, Dog dog) {
        this.cat = cat;
        this.dog = dog;
    }
}
