package com.example.itismobmco;

public class RsvpActivity extends PrototypeActivity {

    @Override
    protected int getLayoutResource() {
        return R.layout.activity_rsvp;
    }

    @Override
    protected void onScreenReady() {
        bindNavigation(R.id.btnSubmitRsvp, PracticeDetailsActivity.class);
    }
}
