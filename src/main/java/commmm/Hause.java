package commmm;

import javax.inject.Inject;
import javax.inject.Named;

public class Hause {

    Animal animal1;
    Animal animal2;

    @Inject
    public Hause(@Named("FirstAnimal") Animal animal1, @Named("SecondAnimal") Animal animal2) {
        this.animal1 = animal1;
        this.animal2 = animal2;
    }
}
