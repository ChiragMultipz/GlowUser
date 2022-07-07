package com.android.fade.ui.login

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.glow.user.ui.login.LoginRepository


class LoginViewModelFactory(private val loginRepository: LoginRepository) :
    ViewModelProvider.NewInstanceFactory() {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return LoginViewModel(loginRepository) as T
    }
}