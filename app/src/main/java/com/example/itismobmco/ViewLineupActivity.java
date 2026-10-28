package com.example.itismobmco;

public class ViewLineupActivity extends PrototypeActivity {

    @Override
    protected int getLayoutResource() {
        return R.layout.activity_view_lineup;
    }

    @Override
    protected void onScreenReady() {
        bindNavigation(R.id.btnCheckInPrompt, CheckInActivity.class);
        configureMenuNavigation(R.id.toolbarViewLineup,
                new MenuDestination("Practice details", PracticeDetailsActivity.class),
                new MenuDestination("Edit lineup", EditLineupActivity.class),
                new MenuDestination("Attendance", AttendanceRecordActivity.class));
    }
}
