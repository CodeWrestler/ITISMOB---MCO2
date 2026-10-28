package com.example.itismobmco;

public class PracticeListActivity extends PrototypeActivity {

    @Override
    protected int getLayoutResource() {
        return R.layout.activity_practice_list;
    }

    @Override
    protected void onScreenReady() {
        bindNavigation(R.id.btnViewDetails1, PracticeDetailsActivity.class);
        bindNavigation(R.id.btnViewDetails2, PracticeDetailsActivity.class);
        bindNavigation(R.id.btnViewDetails3, PracticeDetailsActivity.class);
        bindNavigation(R.id.fabCreatePractice, CreatePracticeActivity.class);
        configureMenuNavigation(R.id.toolbarPracticeList,
                new MenuDestination("Reminders", PracticeNotificationActivity.class),
                new MenuDestination("Attendance", AttendanceRecordActivity.class));
    }
}
