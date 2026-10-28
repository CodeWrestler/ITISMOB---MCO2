package com.example.itismobmco;

public class PracticeDetailsActivity extends PrototypeActivity {

    @Override
    protected int getLayoutResource() {
        return R.layout.activity_practice_details;
    }

    @Override
    protected void onScreenReady() {
        bindNavigation(R.id.btnViewLineup, ViewLineupActivity.class);
        configureMenuNavigation(R.id.toolbar,
                new MenuDestination("RSVP", RsvpActivity.class),
                new MenuDestination("Training plan", AttachTrainingPlanActivity.class),
                new MenuDestination("Generate lineup", GenerateLineupActivity.class),
                new MenuDestination("Attendance", AttendanceRecordActivity.class));
    }
}
