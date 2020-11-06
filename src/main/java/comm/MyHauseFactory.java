package comm;

import dagger.Component;

@Component
public interface MyHauseFactory {
    Hause getMyHause();
}
