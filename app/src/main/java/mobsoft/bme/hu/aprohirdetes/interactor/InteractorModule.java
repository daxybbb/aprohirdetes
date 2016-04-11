package mobsoft.bme.hu.aprohirdetes.interactor;

import dagger.Module;
import dagger.Provides;

/**
 * Created by mobsoft on 2016. 04. 11..
 */
@Module
public class InteractorModule {
    @Provides
    public StringInteractor getStringInteractor() {
        return new StringInteractor();
    }
}
