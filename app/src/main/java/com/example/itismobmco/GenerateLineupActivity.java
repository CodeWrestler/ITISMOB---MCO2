package com.example.itismobmco;

public class GenerateLineupActivity extends PrototypeActivity {

    @Override
    protected int getLayoutResource() {
        return R.layout.activity_generate_lineup;
    }

    @Override
    protected void onScreenReady() {
        bindNavigation(R.id.btnGenerateLineup, EditLineupActivity.class);
        bindNavigation(R.id.btnProceedToEdit, EditLineupActivity.class);
        bindNavigation(R.id.btnPublishGeneratedLineup, ViewLineupActivity.class);
    }
}
