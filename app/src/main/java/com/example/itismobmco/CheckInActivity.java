package com.example.itismobmco;

public class CheckInActivity extends PrototypeActivity {

    @Override
    protected int getLayoutResource() {
        return R.layout.activity_check_in;
    }

    @Override
    protected void onScreenReady() {
        bindNavigation(R.id.btnCheckIn, PracticeListActivity.class);
    }
}
