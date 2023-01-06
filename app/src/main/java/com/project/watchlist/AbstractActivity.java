package com.project.watchlist;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import com.google.android.material.navigation.NavigationView;

abstract class AbstractActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    protected int layoutResId;

    protected DrawerLayout drawerLayout;
    protected int drawerLayoutId;

    protected NavigationView navigationView;
    protected int navigationViewId;

    protected Toolbar toolbar;
    protected int toolbarId;

    protected android.content.Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initializeClassFields();
        setContentView(this.layoutResId);

        this.drawerLayout = findViewById(this.drawerLayoutId);
        this.navigationView = findViewById(this.navigationViewId);
        this.toolbar = findViewById(this.toolbarId);

        this.navigationView.bringToFront();
        this.navigationView.setCheckedItem(R.id.nav_home);
        this.navigationView.setNavigationItemSelectedListener(this);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, this.drawerLayout,
                this.toolbar, R.string.nav_drawer_open, R.string.nav_drawer_close);
        this.drawerLayout.addDrawerListener(toggle);
        toggle.syncState();
    }

    public abstract void initializeClassFields();

    @Override
    public void onBackPressed() {

        if (this.drawerLayout.isDrawerOpen(GravityCompat.START)) {
            this.drawerLayout.closeDrawer(GravityCompat.START);
        }
        else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        int itemID = item.getItemId();
        Intent intent;

        switch (itemID) {
            case R.id.nav_home:
                if (this.layoutResId == R.layout.activity_main) {
                    break;
                }
                else {
                    intent = new Intent(this.context, MainActivity.class);
                    startActivity(intent);
                    break;
                }
            case R.id.nav_search:
                if (this.layoutResId == R.layout.activity_search) {
                    break;
                }
                else {
                    intent = new Intent(this.context, SearchActivity.class);
                    startActivity(intent);
                    break;
                }
            case R.id.new_entry:
                if (this.layoutResId == R.layout.activity_entry) {
                    break;
                }
                else {
                    intent = new Intent(this.context, EntryActivity.class);
                    startActivity(intent);
                    break;
                }
            case R.id.nav_rankings:
                if (this.layoutResId == R.layout.activity_rankings) {
                    break;
                }
                else {
                    intent = new Intent(this.context, RankingsActivity.class);
                    startActivity(intent);
                    break;
                }
            case R.id.nav_history:
                if (this.layoutResId == R.layout.activity_search) {
                    break;
                }
                else {
                    intent = new Intent(this.context, HistoryActivity.class);
                    startActivity(intent);
                    break;
                }
        }

        this.drawerLayout.closeDrawer(GravityCompat.START);

        return true;
    }

}
