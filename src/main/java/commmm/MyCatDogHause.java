package commmm;

import dagger.Component;

@Component(modules = MyCatDogHauseModule.class)
public interface MyCatDogHause {
    Hause getMyHause();
}
