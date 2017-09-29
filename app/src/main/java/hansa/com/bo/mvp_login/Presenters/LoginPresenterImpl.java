package hansa.com.bo.mvp_login.Presenters;

import hansa.com.bo.mvp_login.Interactors.LoginInteractorImpl;
import hansa.com.bo.mvp_login.Interfaces.LoginInteractor;
import hansa.com.bo.mvp_login.Interfaces.LoginPresenter;
import hansa.com.bo.mvp_login.Interfaces.LoginView;
import hansa.com.bo.mvp_login.Interfaces.OnLoginFinishListener;

/**
 * Created by VAlaro on 27/9/2017.
 */

public class LoginPresenterImpl implements LoginPresenter,OnLoginFinishListener {

    private LoginView view;
    private LoginInteractor interactor;


    public LoginPresenterImpl(LoginView view) {

        this.view = view;
        interactor = new LoginInteractorImpl();

    }

    @Override
    public void validarUsuario(String user, String pass) {
        if (view!=null) {
            view.showProgress();

        }
        interactor.validarUser(user,pass,this);

    }

    @Override
    public void usernameError() {
        if (view!=null){
            view.hideProgress();
            view.setErrorUser();
        }

    }

    @Override
    public void passwordError() {
        if (view!=null){
            view.hideProgress();
            view.setErrorPassword();
        }

    }

    @Override
    public void exitoOperacion() {
        if (view!=null){
            view.hideProgress();
            view.navigateToHome();
        }

    }
}
