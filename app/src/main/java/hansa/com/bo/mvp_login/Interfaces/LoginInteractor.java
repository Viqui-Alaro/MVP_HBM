package hansa.com.bo.mvp_login.Interfaces;

/**
 * Created by VAlaro on 27/9/2017.
 */

public interface LoginInteractor {

    void validarUser(String user,String pass,OnLoginFinishListener listener);
}
