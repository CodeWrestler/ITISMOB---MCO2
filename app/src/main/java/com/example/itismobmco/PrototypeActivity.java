package com.example.itismobmco;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.appbar.MaterialToolbar;

import java.util.HashMap;
import java.util.Map;

public abstract class PrototypeActivity extends AppCompatActivity {

    protected abstract int getLayoutResource();

    protected void onScreenReady() {
    }

    @Override
    protected final void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutResource());
        configureToolbarBack(R.id.toolbar);
        configureToolbarBack(R.id.toolbarPracticeList);
        configureToolbarBack(R.id.toolbarCreatePractice);
        configureToolbarBack(R.id.toolbarGenerateLineup);
        configureToolbarBack(R.id.toolbarEditLineup);
        configureToolbarBack(R.id.toolbarViewLineup);
        onScreenReady();
    }

    protected final void bindNavigation(int viewId, Class<? extends AppCompatActivity> destination) {
        View view = findViewById(viewId);
        if (view == null) {
            throw new IllegalStateException("Navigation view not found: " + getResources().getResourceEntryName(viewId));
        }
        view.setOnClickListener(ignored -> navigateTo(destination));
    }

    protected final void navigateTo(Class<? extends AppCompatActivity> destination) {
        startActivity(new Intent(this, destination));
    }

    protected final void configureMenuNavigation(int toolbarId, MenuDestination... destinations) {
        MaterialToolbar toolbar = findViewById(toolbarId);
        if (toolbar == null) {
            throw new IllegalStateException("Toolbar not found: " + getResources().getResourceEntryName(toolbarId));
        }

        Map<Integer, Class<? extends AppCompatActivity>> destinationByMenuId = new HashMap<>();
        for (MenuDestination destination : destinations) {
            int menuId = View.generateViewId();
            destinationByMenuId.put(menuId, destination.activityClass);
            toolbar.getMenu().add(Menu.NONE, menuId, Menu.NONE, destination.label)
                    .setShowAsAction(MenuItem.SHOW_AS_ACTION_NEVER);
        }
        toolbar.setOnMenuItemClickListener(item -> {
            Class<? extends AppCompatActivity> destination = destinationByMenuId.get(item.getItemId());
            if (destination == null) {
                return false;
            }
            navigateTo(destination);
            return true;
        });
    }

    private void configureToolbarBack(int toolbarId) {
        MaterialToolbar toolbar = findViewById(toolbarId);
        if (toolbar != null) {
            toolbar.setNavigationOnClickListener(ignored -> getOnBackPressedDispatcher().onBackPressed());
        }
    }

    protected static final class MenuDestination {
        private final String label;
        private final Class<? extends AppCompatActivity> activityClass;

        protected MenuDestination(String label, Class<? extends AppCompatActivity> activityClass) {
            this.label = label;
            this.activityClass = activityClass;
        }
    }
}
