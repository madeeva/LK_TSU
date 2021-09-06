package com.example.lktsu.ui.login;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u0010\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0013H\u0002J\u0016\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0013J\u0016\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0013R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r\u00a8\u0006\u0019"}, d2 = {"Lcom/example/lktsu/ui/login/LoginViewModel;", "Landroidx/lifecycle/ViewModel;", "loginRepository", "Lcom/example/lktsu/data/LoginRepository;", "(Lcom/example/lktsu/data/LoginRepository;)V", "_loginForm", "Landroidx/lifecycle/MutableLiveData;", "Lcom/example/lktsu/ui/login/LoginFormState;", "_loginResult", "Lcom/example/lktsu/ui/login/LoginResult;", "loginFormState", "Landroidx/lifecycle/LiveData;", "getLoginFormState", "()Landroidx/lifecycle/LiveData;", "loginResult", "getLoginResult", "isPasswordValid", "", "password", "", "isUserNameValid", "username", "login", "", "loginDataChanged", "app_debug"})
public final class LoginViewModel extends androidx.lifecycle.ViewModel {
    private final com.example.lktsu.data.LoginRepository loginRepository = null;
    private final androidx.lifecycle.MutableLiveData<com.example.lktsu.ui.login.LoginFormState> _loginForm = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.example.lktsu.ui.login.LoginFormState> loginFormState = null;
    private final androidx.lifecycle.MutableLiveData<com.example.lktsu.ui.login.LoginResult> _loginResult = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.example.lktsu.ui.login.LoginResult> loginResult = null;
    
    public LoginViewModel(@org.jetbrains.annotations.NotNull()
    com.example.lktsu.data.LoginRepository loginRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.lktsu.ui.login.LoginFormState> getLoginFormState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.lktsu.ui.login.LoginResult> getLoginResult() {
        return null;
    }
    
    public final void login(@org.jetbrains.annotations.NotNull()
    java.lang.String username, @org.jetbrains.annotations.NotNull()
    java.lang.String password) {
    }
    
    public final void loginDataChanged(@org.jetbrains.annotations.NotNull()
    java.lang.String username, @org.jetbrains.annotations.NotNull()
    java.lang.String password) {
    }
    
    private final boolean isUserNameValid(java.lang.String username) {
        return false;
    }
    
    private final boolean isPasswordValid(java.lang.String password) {
        return false;
    }
}