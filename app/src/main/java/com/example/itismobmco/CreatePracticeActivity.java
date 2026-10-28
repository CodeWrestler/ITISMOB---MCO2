package com.example.itismobmco;

public class CreatePracticeActivity extends PrototypeActivity {

    @Override
    protected int getLayoutResource() {
        return R.layout.activity_create_practice;
    }

    @Override
    protected void onScreenReady() {
        bindNavigation(R.id.btnCreatePractice, AttachTrainingPlanActivity.class);
    }
}
