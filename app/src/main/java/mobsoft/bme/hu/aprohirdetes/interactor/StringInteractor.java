package mobsoft.bme.hu.aprohirdetes.interactor;

import javax.inject.Inject;

import mobsoft.bme.hu.aprohirdetes.MVPApplication;
import mobsoft.bme.hu.aprohirdetes.model.StringModel;

/**
 * Created by mobsoft on 2016. 04. 11..
 */
public class StringInteractor {
        @Inject
        StringModel model;

        public StringInteractor() {
            MVPApplication.injector.inject(this);
        }

        public String getString() {
            return model.getNextString();
        }
    }

