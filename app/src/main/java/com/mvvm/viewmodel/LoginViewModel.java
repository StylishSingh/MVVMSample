package com.mvvm.viewmodel;

import android.content.Context;
import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.mvvm.models.LoginModel;

/**
 * @author Amanpal Singh.
 */

public class LoginViewModel extends BaseObservable {

    private LoginModel loginModel;
    private Context context;

    public LoginViewModel(Context context, LoginModel loginModel) {
        this.loginModel = loginModel;
        this.context = context;

    }

    @Bindable
    public String getName() {
        return loginModel.getName();
    }

}
