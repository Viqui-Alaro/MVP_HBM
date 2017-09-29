package hansa.com.bo.mvp_login.Interactors;

import android.os.Handler;

import hansa.com.bo.mvp_login.Interfaces.LoginInteractor;
import hansa.com.bo.mvp_login.Interfaces.OnLoginFinishListener;

/**
 * Created by VAlaro on 27/9/2017.
 */

public class LoginInteractorImpl implements LoginInteractor {



    @Override
    public void validarUser(final String user, final String pass, final OnLoginFinishListener listener) {

        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {

                if (!user.equals("")&& !pass.equals("")){
                    listener.exitoOperacion();
                }
                else{
                    if (!user.equals("")){
                        listener.usernameError();
                    }
                    if (user.equals("")){
                        listener.passwordError();
                    }
                }
            }
        },2000);
    }
}
