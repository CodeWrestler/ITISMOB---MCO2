package com.example.itismobmco;

public class EditLineupActivity extends PrototypeActivity {

    @Override
    protected int getLayoutResource() {
        return R.layout.activity_edit_lineup;
    }

    @Override
    protected void onScreenReady() {
        bindNavigation(R.id.btnAutoRebalance, GenerateLineupActivity.class);
        bindNavigation(R.id.btnSaveAndPublishLineup, ViewLineupActivity.class);
    }
}
