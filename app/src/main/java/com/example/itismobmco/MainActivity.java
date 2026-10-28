package com.example.itismobmco;

public class MainActivity extends PrototypeActivity {

    @Override
    protected int getLayoutResource() {
        return R.layout.activity_login;
    }

    @Override
    protected void onScreenReady() {
        bindNavigation(R.id.btnLogin, PracticeListActivity.class);
        bindNavigation(R.id.tvGoToRegister, RegisterActivity.class);
    }
}
