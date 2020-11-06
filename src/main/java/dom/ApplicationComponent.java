package dom;

import dagger.Component;

@Component(modules = MyHadiseFmrOIApplication.class)
public interface ApplicationComponent {

    Application getMyApplication();
}
