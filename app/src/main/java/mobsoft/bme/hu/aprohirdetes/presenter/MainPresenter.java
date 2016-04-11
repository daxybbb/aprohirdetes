package mobsoft.bme.hu.aprohirdetes.presenter;

import javax.inject.Inject;

import mobsoft.bme.hu.aprohirdetes.MVPApplication;
import mobsoft.bme.hu.aprohirdetes.interactor.StringInteractor;
import mobsoft.bme.hu.aprohirdetes.view.MainView;

/**
 * Created by mobsoft on 2016. 04. 11..
 */
public class MainPresenter extends Presenter<MainView> {

    @Inject
    public StringInteractor interactor;

    public MainPresenter() {
        MVPApplication.injector.inject(this);
    }

    public void doStuff() {
        view.showString(interactor.getString());
    }
}
