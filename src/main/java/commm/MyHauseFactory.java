package commm;

import dagger.Component;

@Component(modules = MyHauseModule.class)
public interface MyHauseFactory {
    Hause getMyHause();
}
