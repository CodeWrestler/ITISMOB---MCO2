package com.example.itismobmco;

public class RegisterActivity extends PrototypeActivity {

    @Override
    protected int getLayoutResource() {
        return R.layout.activity_register;
    }

    @Override
    protected void onScreenReady() {
        bindNavigation(R.id.btnRegister, PracticeListActivity.class);
        bindNavigation(R.id.tvGoToLogin, MainActivity.class);
    }
}
