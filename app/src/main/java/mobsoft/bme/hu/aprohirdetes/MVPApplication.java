package mobsoft.bme.hu.aprohirdetes;

import android.app.Application;

import mobsoft.bme.hu.aprohirdetes.view.ViewModule;

/**
 * Created by mobsoft on 2016. 04. 11..
 */
public class MVPApplication extends Application {

    public static MVPApplicationComponent injector;

    @Override
    public void onCreate() {
        super.onCreate();
        injector = DaggerMVPApplicationComponent.builder().viewModule(new ViewModule(this)).build();
    }
}
