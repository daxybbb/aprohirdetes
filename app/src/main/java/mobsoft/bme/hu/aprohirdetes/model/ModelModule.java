package mobsoft.bme.hu.aprohirdetes.model;

import dagger.Module;
import dagger.Provides;

/**
 * Created by mobsoft on 2016. 04. 11..
 */
@Module
public class ModelModule {
    @Provides
    public StringModel getStringModel() {
        return new StringModel();
    }
}
