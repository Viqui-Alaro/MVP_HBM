package hansa.com.bo.mvp_login.Interfaces;

/**
 * Created by VAlaro on 27/9/2017.
 */

public interface LoginView {

    void showProgress();
    void hideProgress();
    void setErrorUser();
    void setErrorPassword();
    void navigateToHome();




}
