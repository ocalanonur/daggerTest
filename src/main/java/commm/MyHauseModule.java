package commm;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class MyHauseModule {

    @Binds
    abstract Animal bindAnimal1(Cat cat);

}
