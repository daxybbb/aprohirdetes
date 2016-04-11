package mobsoft.bme.hu.aprohirdetes;

import javax.inject.Singleton;

import dagger.Component;
import mobsoft.bme.hu.aprohirdetes.interactor.InteractorModule;
import mobsoft.bme.hu.aprohirdetes.interactor.StringInteractor;
import mobsoft.bme.hu.aprohirdetes.model.ModelModule;
import mobsoft.bme.hu.aprohirdetes.presenter.MainPresenter;
import mobsoft.bme.hu.aprohirdetes.view.MainActivity;
import mobsoft.bme.hu.aprohirdetes.view.ViewModule;

/**
 * Created by mobsoft on 2016. 04. 11..
 */
@Singleton
@Component(modules = {ViewModule.class, InteractorModule.class, ModelModule.class})
public interface MVPApplicationComponent {
    void inject(MainActivity mainActivity);

    void inject(MainPresenter mainPresenter);

    void inject(StringInteractor stringInteractor);
}
