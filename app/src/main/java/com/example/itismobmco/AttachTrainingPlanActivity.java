package com.example.itismobmco;

public class AttachTrainingPlanActivity extends PrototypeActivity {

    @Override
    protected int getLayoutResource() {
        return R.layout.activity_attach_training_plan;
    }

    @Override
    protected void onScreenReady() {
        bindNavigation(R.id.btnSaveTrainingPlan, PracticeListActivity.class);
    }
}
