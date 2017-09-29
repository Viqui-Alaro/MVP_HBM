package hansa.com.bo.mvp_login.Views;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ProgressBar;

import hansa.com.bo.mvp_login.Interfaces.LoginPresenter;
import hansa.com.bo.mvp_login.Interfaces.LoginView;
import hansa.com.bo.mvp_login.Presenters.LoginPresenterImpl;
import hansa.com.bo.mvp_login.R;

public class Login extends AppCompatActivity implements LoginView{

    private EditText user,pass;
    private ProgressBar progressBar;
    private LoginPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        user = (EditText) findViewById(R.id.txtUsuario);
        pass = (EditText) findViewById(R.id.txtPassword);
        progressBar = (ProgressBar) findViewById(R.id.progressBar);
        presenter = new LoginPresenterImpl(this);
    }


    @Override
    public void showProgress() {
        progressBar.setVisibility(View.VISIBLE);
    }


    @Override
    public void hideProgress() {
        progressBar.setVisibility(View.GONE);
    }

    @Override
    public void setErrorUser() {
        user.setError("Campo_Obligatorio");
    }

    @Override
    public void setErrorPassword() {
        pass.setError("Campo_Obligatorio");
    }

    @Override
    public void navigateToHome() {
        startActivity(new Intent(Login.this,PrincipalMenu.class));
    }


    public void validacion (View v){
        presenter.validarUsuario(user.getText().toString(),pass.getText().toString());
    }
}
