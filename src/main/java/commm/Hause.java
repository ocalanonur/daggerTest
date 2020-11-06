package commm;

import javax.inject.Inject;

public class Hause {

    Animal animal1;
    Animal animal2;

    @Inject
    public Hause(Animal animal1, Animal animal2) {
        this.animal1 = animal1;
        this.animal2 = animal2;
    }
}
