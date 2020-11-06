package commmm;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

import javax.inject.Named;

@Module
public class MyCatDogHauseModule {

    @Provides
    @Named("FirstAnimal")
    Animal bindAnimal1(Cat cat) {
        return cat;
    }

    @Provides
    @Named("SecondAnimal")
    Animal bindAnimal2(Dog dog) {
        return dog;
    }

}
